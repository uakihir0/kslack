# Design: Update Test Secrets Loading to Match New Format

## Architecture Overview

kslack のテストは `AbstractTest` 基底クラスの `@BeforeTest` で クレデンシャルを読み込み、各テストクラスがこれを継承する。kbsky プロジェクトと同じカスケーディング読み込みパターンを採用する。

### 読み込み優先順位

```
1. System.getenv("SLACK_CLIENT_ID") etc.    ← CI/CD 環境
2. System.getProperty("SLACK_CLIENT_ID") etc. ← JVM プロパティ
3. ../secrets.json → "slack" → "SLACK_CLIENT_ID" etc.  ← ローカル開発
4. IllegalStateException (案内メッセージ)      ← 設定なし
```

対象クレデンシャル: `SLACK_CLIENT_ID`, `SLACK_CLIENT_SECRET`, `SLACK_REDIRECT_URI` (必須), `SLACK_USER_TOKEN` (任意、認証付き API テスト用)

### 参照パターン (kbsky)

**File**: `../kbsky/core/src/jvmTest/kotlin/work/socialhub/kbsky/AbstractTest.kt`

kbsky では `System.getenv()` → `System.getProperty()` → `readTestProps()` → エラーの順で読み込む。`readTestProps()` は `kotlinx.serialization.json.Json` で `Map<String, Map<String, String>>` にデコードし、`"bluesky"` キーから値を取得する。

---

## Step 1: AbstractTest.kt の書き換え

**File**: `core/src/jvmTest/kotlin/work/socialhub/kslack/AbstractTest.kt`

### 1.1 Import の変更

```kotlin
// 削除
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson

// 追加
import kotlinx.serialization.json.Json
```

### 1.2 クラスプロパティの変更

```kotlin
// 旧: lateinit で強制初期化
protected lateinit var clientId: String
protected lateinit var clientSecret: String
protected lateinit var redirectUri: String
protected var userToken: String? = null

// 新: nullable に変更 + Json インスタンス追加
protected val json = Json {
    ignoreUnknownKeys = true
}

protected var clientId: String? = null
protected var clientSecret: String? = null
protected var redirectUri: String? = null
protected var userToken: String? = null
```

### 1.3 setupTest() の書き換え

```kotlin
@BeforeTest
fun setupTest() {
    // Step 1: 環境変数から読み込み
    try {
        clientId = System.getenv("SLACK_CLIENT_ID")
            ?: System.getProperty("SLACK_CLIENT_ID")
        clientSecret = System.getenv("SLACK_CLIENT_SECRET")
            ?: System.getProperty("SLACK_CLIENT_SECRET")
        redirectUri = System.getenv("SLACK_REDIRECT_URI")
            ?: System.getProperty("SLACK_REDIRECT_URI")
        userToken = System.getenv("SLACK_USER_TOKEN")
            ?: System.getProperty("SLACK_USER_TOKEN")
    } catch (_: Exception) {
    }

    // Step 2: secrets.json から読み込み (フォールバック)
    if (clientId == null || clientSecret == null || redirectUri == null) {
        try {
            readTestProps()?.get("slack")?.let {
                clientId = checkNotNull(it["SLACK_CLIENT_ID"])
                clientSecret = checkNotNull(it["SLACK_CLIENT_SECRET"])
                redirectUri = checkNotNull(it["SLACK_REDIRECT_URI"])
                userToken = it["SLACK_USER_TOKEN"]
            }
        } catch (_: Exception) {
        }
    }

    // Step 3: 取得失敗時はエラー
    if (clientId == null || clientSecret == null || redirectUri == null) {
        throw IllegalStateException(
            """!!!
            No credentials exist for testing.
            Set the environment variables SLACK_CLIENT_ID, SLACK_CLIENT_SECRET and SLACK_REDIRECT_URI
            or copy the following file and describe its contents.
            `cp secrets.json.default secrets.json`
            !!!""".trimIndent()
        )
    }
}
```

### 1.4 readTestProps() の追加

`readFile()` メソッドを `readTestProps()` に置き換え。kbsky と同じパターン。

```kotlin
private fun readTestProps(): Map<String, Map<String, String>>? {
    return try {
        val jsonStr = File("../secrets.json").readText()
        json.decodeFromString<Map<String, Map<String, String>>>(jsonStr)
    } catch (e: Exception) {
        null
    }
}
```

### 1.5 不要メソッドの削除

- `readFile()` — `readTestProps()` に置き換えられるため削除
- `saveFile()` — 現在どこからも呼ばれていないため削除

---

## 変更ファイル一覧

| Action | File |
|--------|------|
| Edit | `core/src/jvmTest/kotlin/work/socialhub/kslack/AbstractTest.kt` |

新規ファイルの作成は不要。既存の1ファイルのみ変更。

---

## Verification

1. `./gradlew :core:jvmTest --dry-run` — コンパイルが通ることを確認
2. `secrets.json` が新フォーマットの状態でテストが正しく読み込めることを確認
3. `secrets.json` を削除し、環境変数 `SLACK_CLIENT_ID` 等を設定した状態でテストが動作することを確認
4. どちらも未設定の場合、`IllegalStateException` が適切なメッセージで throw されることを確認
