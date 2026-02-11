# kslack SPM

本レポジトリは、[kslack] の Swift Package レポジトリです。
[kslack] は Kotlin Multiplatform を用いて作成された Slack クライアントライブラリです。
そのため、iOS 等の Apple Device でもビルドして使用することができます。
ここでは、XCFramework としてビルドしたものを Swift Package 経由で配布しています。
また、このレポジトリは [kslack] の GitHub Actions によって自動コミットされています。
issue や pull request は [kslack] にお願いします。

## 使用方法

本レポジトリにはバージョンは存在せず、[kslack] のバージョンと一致するブランチが存在します。
どのバージョンの [kslack] を使用するかは、本レポジトリのブランチを指定することで決定します。
[ブランチ一覧](https://github.com/uakihir0/kslack-spm/branches) からバージョンに対応するブランチを確認してください。

### リクエスト方法

Objective-C でも使用可能ですが、以下に Swift での使用方法を記載します。
詳しい使い方については、[kslack] の README も合わせて確認してください。

```swift
import kslack

let slack = KslackFactory.shared.instance()
```

## ライセンス

MIT License

## 作者

[Akihiro Urushihara](https://github.com/uakihir0)

[kslack]: https://github.com/uakihir0/kslack
