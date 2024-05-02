> [日本語](./README_ja.md)

# kslack cocoapods

This repository is the Cocoapods repository for [kslack]. [kslack] is a Mastodon client library created using Kotlin Multiplatform.
Therefore, it can be built and used on Apple devices such as iOS. Here, we distribute the built XCFramework via Cocoapods.
Additionally, this repository is automatically committed by GitHub Actions for [kslack]. Please submit issues or pull requests to [kslack].

## Usage

### Podfile

Please add the following lines to your Podfile.
There are no versions in this repository, and there are branches that match the versions of [kslack].
You can determine which version of [kslack] to use by specifying the branch of this repository.
Please check the [branch list](https://github.com/uakihir0/kslack-cocoapods/branches) to find the branch corresponding to the version.
Additionally, different versions are used for Debug and Release builds.

```ruby
target '{{PROJECT_NAME}}' do
  use_frameworks!

  # Pods for kslack
  pod 'kslack-debug', 
    :configuration => ['Debug'], 
    :git => 'https://github.com/uakihir0/kslack-cocoapods/', 
    :branch => '{{BRANCH_NAME}}'
  pod 'kslack-release', 
    :configuration => ['Release'], 
    :git => 'https://github.com/uakihir0/kslack-cocoapods/', 
    :branch => '{{BRANCH_NAME}}'
  ...
end
```

### Requesting

It is also possible to use in Objective-C, but the following is the usage in Swift.
Please also check the README of [kslack] for detailed usage.

```swift
WIP
```

## License

MIT License

## Author

[Akihiro Urushihara](https://github.com/uakihir0)


[kslack]: https://github.com/uakihir0/kslack