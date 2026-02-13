#!/usr/bin/env bash
cd "$(dirname "$0")" || exit
BASE_PATH=$(pwd)
BUILD_PATH=../all/build

# Make Repository
cd "$BASE_PATH" || exit
mkdir -p $BUILD_PATH/cocoapods/repository/debug
mkdir -p $BUILD_PATH/cocoapods/repository/release

# Copy Podspec
cd "$BASE_PATH" || exit
cd $BUILD_PATH/cocoapods/publish/debug || exit
cp kslack.podspec ../../repository/kslack-debug.podspec
cd ../../repository/ || exit
sed -i -e "s|'kslack'|'kslack-debug'|g" kslack-debug.podspec
sed -i -e "s|'kslack.xcframework'|'debug/kslack.xcframework'|g" kslack-debug.podspec
rm *.podspec-e
cd "$BASE_PATH" || exit
cd $BUILD_PATH/cocoapods/publish/release || exit
cp kslack.podspec ../../repository/kslack-release.podspec
cd ../../repository/ || exit
sed -i -e "s|'kslack'|'kslack-release'|g" kslack-release.podspec
sed -i -e "s|'kslack.xcframework'|'release/kslack.xcframework'|g" kslack-release.podspec
rm *.podspec-e

# Copy Framework
cd "$BASE_PATH" || exit
cd $BUILD_PATH/cocoapods/publish/debug || exit
cp -r kslack.xcframework ../../repository/debug/kslack.xcframework
cd "$BASE_PATH" || exit
cd $BUILD_PATH/cocoapods/publish/release || exit
cp -r kslack.xcframework ../../repository/release/kslack.xcframework

# Copy README
cd "$BASE_PATH" || exit
cd ../ || exit
cp ./LICENSE ./all/build/cocoapods/repository/LICENSE
cp ./docs/pods/README.md ./all/build/cocoapods/repository/README.md
cp ./docs/pods/README_ja.md ./all/build/cocoapods/repository/README_ja.md
