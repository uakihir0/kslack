# Requirements: Update Test Secrets Loading to Match New Format

## Background

kslack のテスト用クレデンシャルファイル `secrets.json` のフォーマットが変更された。旧フォーマットはフラットな `Map<String, String>` だったが、新フォーマットは kbsky プロジェクトと同様にネストされた `Map<String, Map<String, String>>` 構造で、キー名も `SCREAMING_SNAKE_CASE` に統一された。

### 旧フォーマット

```json
{
  "client_id": "...",
  "client_secret": "...",
  "redirect_uri": "...",
  "user_token": "..."
}
```

### 新フォーマット (`secrets.json.default`)

```json
{
  "slack": {
    "SLACK_CLIENT_ID": "",
    "SLACK_CLIENT_SECRET": "",
    "SLACK_REDIRECT_URI": "",
    "SLACK_USER_TOKEN": ""
  }
}
```

テスト基底クラス `AbstractTest` は旧フォーマットを前提としており、新フォーマットに対応させる必要がある。同時に、kbsky プロジェクトと同様に環境変数からの読み込みにも対応する。

## Goals

- テストのクレデンシャル読み込みを新しい `secrets.json` フォーマットに対応させる
- 環境変数による設定を最優先にし、ファイルをフォールバックとする kbsky パターンに統一する
- CI/CD 環境（環境変数）とローカル開発（ファイル）の両方をシームレスにサポートする

## Functional Requirements

### FR-1: 環境変数からの読み込み（最優先）

テスト実行時に以下の環境変数を最優先で読み込む。`System.getenv()` を先に確認し、なければ `System.getProperty()` を確認する。

| 環境変数名 | 用途 |
|-----------|------|
| `SLACK_CLIENT_ID` | Slack OAuth クライアント ID |
| `SLACK_CLIENT_SECRET` | Slack OAuth クライアントシークレット |
| `SLACK_REDIRECT_URI` | OAuth リダイレクト URI |
| `SLACK_USER_TOKEN` | 認証済みユーザートークン（`xoxp-...`、認証付き API テスト用） |

### FR-2: secrets.json からのフォールバック読み込み

環境変数で全てのクレデンシャルが取得できなかった場合、`../secrets.json` ファイルから新フォーマットで読み込む。

- JSON を `Map<String, Map<String, String>>` としてデコードする
- `"slack"` キーの中から `SLACK_CLIENT_ID`, `SLACK_CLIENT_SECRET`, `SLACK_REDIRECT_URI` を取得する
- `SLACK_USER_TOKEN` が存在すればそれも取得する（任意項目）

### FR-3: 取得失敗時のエラーメッセージ

環境変数・ファイルのどちらからもクレデンシャルを取得できなかった場合、`IllegalStateException` を throw し、以下を案内する:
- 環境変数の設定方法
- `cp secrets.json.default secrets.json` によるファイル作成方法

### FR-4: kbsky との一貫性

kbsky プロジェクト (`../kbsky/core/src/jvmTest/kotlin/work/socialhub/kbsky/AbstractTest.kt`) と同じクレデンシャル読み込みパターンを採用する:
1. 環境変数 → 2. System property → 3. secrets.json ファイル → 4. エラー

## Non-Functional Requirements

### NFR-1: 後方互換性

既存のテストクラス (`AuthTest` 等) が `AbstractTest` を継承するパターンは変更しない。

### NFR-2: コンパイル検証

変更後、`./gradlew :core:jvmTest` でコンパイルが通ること。
