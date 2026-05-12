# kslack

![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepo.repsy.io%2Fmvn%2Fuakihir0%2Fpublic%2Fwork%2Fsocialhub%2Fkslack%2Fcore%2Fmaven-metadata.xml)

![badge][badge-js]
![badge][badge-jvm]
![badge][badge-ios]
![badge][badge-mac]

**このライブラリは [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) に対応した Slack クライアントライブラリです。**
[khttpclient] を依存関係に持っており、内部で Ktor Client を使用しています。
そのため、本ライブラリは、Kotlin Multiplatform かつ Ktor Client がサポートしているプラットフォームであれば利用可能です。
各プラットフォームでどのような挙動をするのかについては、[khttpclient] に依存します。

## 使い方

以下は対応するプラットフォームにおいて Gradle を用いて Kotlin で使用する際の使い方になります。
**Apple プラットフォームで使用する場合は、 [kslack-spm](https://github.com/uakihir0/kslack-spm) または [kslack-cocoapods](https://github.com/uakihir0/kslack-cocoapods) を参照してください。**
**また、JavaScript で使用する場合は、[kslack.js](https://github.com/uakihir0/kslack.js) を参照してください。**
各 API の叩き方については、テストコードを参照してください。

```kotlin:build.gradle.kts
repositories {
    mavenCentral()
+   maven { url = uri("https://repo.repsy.io/mvn/uakihir0/public") }
}

dependencies {
+   implementation("work.socialhub.kslack:core:0.0.1-SNAPSHOT")
+   implementation("work.socialhub.kslack:stream:0.0.1-SNAPSHOT")
}
```

### 通常のJavaプロジェクトでの使用

上記の依存関係は、通常のJavaプロジェクトでも追加して使用することができます。依存関係を追加する際に `-jvm` サフィックスを使用するだけです。

以下はMavenの設定例です：

```xml
<dependency>
    <groupId>work.socialhub.kslack</groupId>
    <artifactId>core-jvm</artifactId>
    <version>[VERSION]</version>
</dependency>
```

### 認証

Slack OAuthアクセストークン（`xoxp-...` はユーザートークン、`xapp-...` はアプリトークン）を指定してクライアントインスタンスを作成します。
トークンなしでインスタンスを作成し、リクエストごとにトークンを指定することもできます。

```kotlin
val slack = SlackFactory.instance("xoxp-your-access-token")

val response = slack.auth().authTestBlocking(AuthTestRequest(token = null))
println("ok: ${response.isOk}")
println("team: ${response.team}")
println("userId: ${response.userId}")
```

OAuth 2.0 認証URLの生成の場合：

```kotlin
val slack = SlackFactory.instance()

val url = slack.auth().authorizationURL(
    clientId = "YOUR_CLIENT_ID",
    redirectUri = "https://your-app.com/callback",
    scope = "chat:write,channels:read,channels:history",
    userScope = "users:read",
)

println("Auth URL: $url")
```

### チャットメッセージの送信

```kotlin
val slack = SlackFactory.instance("xoxp-your-access-token")

slack.chat().chatPostMessageBlocking(
    ChatPostMessageRequest(
        channel = "#general",
        text = "Hello from kslack!"
    )
)
```

### チャンネル一覧の取得

```kotlin
val slack = SlackFactory.instance("xoxp-your-access-token")

val response = slack.conversations().conversationsListBlocking(
    ConversationsListRequest(isExcludeArchived = true)
)

for (channel in response.channels!!) {
    println("found channel: id=${channel.id} name=${channel.name}")
}
```

### ストリーミング（Socket Mode）

ストリーミングモジュールは Socket Mode を使用して Slack からのリアルタイムイベントを受信します。
Slack インスタンスを作成する際にトークンの指定が必要です。

```kotlin
val slack = SlackFactory.instance("xapp-your-app-token")

val stream = slack.stream()

stream.addEventListener(object : SlackStreamListener {
    override fun onMessage(event: MessageEvent) {
        println("Received message: ${event.text}")
    }

    override fun onOpen() {
        println("Stream connected")
    }

    override fun onClose() {
        println("Stream closed")
    }

    override fun onError(error: Exception) {
        println("Stream error: ${error.message}")
    }
})

// ストリーミング接続を開始
stream.start()

// ... 後で、接続を停止
stream.stop()
```

## ライセンス

MIT License

## 作者

[Akihiro Urushihara](https://github.com/uakihir0)

[khttpclient]: https://github.com/uakihir0/khttpclient
[badge-android]: http://img.shields.io/badge/-android-6EDB8D.svg
[badge-android-native]: http://img.shields.io/badge/support-[AndroidNative]-6EDB8D.svg
[badge-wearos]: http://img.shields.io/badge/-wearos-8ECDA0.svg
[badge-jvm]: http://img.shields.io/badge/-jvm-DB413D.svg
[badge-js]: http://img.shields.io/badge/-js-F8DB5D.svg
[badge-js-ir]: https://img.shields.io/badge/support-[IR]-AAC4E0.svg
[badge-nodejs]: https://img.shields.io/badge/-nodejs-68a063.svg
[badge-linux]: http://img.shields.io/badge/-linux-2D3F6C.svg
[badge-windows]: http://img.shields.io/badge/-windows-4D76CD.svg
[badge-wasm]: https://img.shields.io/badge/-wasm-624FE8.svg
[badge-apple-silicon]: http://img.shields.io/badge/support-[AppleSilicon]-43BBFF.svg
[badge-ios]: http://img.shields.io/badge/-ios-CDCDCD.svg
[badge-mac]: http://img.shields.io/badge/-macos-111111.svg
[badge-watchos]: http://img.shields.io/badge/-watchos-C0C0C0.svg
[badge-tvos]: http://img.shields.io/badge/-tvos-808080.svg
