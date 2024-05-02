# kslack.js

本レポジトリは、[kslack] の npm レポジトリです。[kslack] は Kotlin Multiplatform を用いて作成された Mastodon クライアントライブラリです。
そのため、Web アプリケーション等でも使用していただくことができます。
また、このレポジトリは [kslack] の GitHub Actions によって自動コミットされています。issue や pull request は [kslack] にお願いします。

## 使用方法

### 追加方法

npm で管理している場合、以下のコマンドでアプリケーションに追加することができます。
本レポジトリにはバージョンは存在せず、[kslack] のバージョンと一致するブランチが存在します。
どのバージョンの [kslack] を使用するかは、本レポジトリのブランチを指定することで決定します。
[ブランチ一覧](https://github.com/uakihir0/kslack-cocoapods/branches) からバージョンに対応するブランチを確認してください。

```shell
npm add uakihir0/kslack.js
or
npm add uakihir0/kslack.js#{{BRANCH_NAME}}
```

### リクエスト方法

TypeScript の型情報も含まれており、TypeScript での記述をオススメします。
詳しい使い方については、[kslack] の README も合わせて確認してください。

```typescript
WIP
```

## ライセンス

MIT License

## 作者

[Akihiro Urushihara](https://github.com/uakihir0)

[kslack]: https://github.com/uakihir0/kslack