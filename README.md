<h1 align="center">💡To Do📝</h1>

<p align="center">
  <a href="https://android-arsenal.com/api?level=26"><img alt="API" src="https://img.shields.io/badge/API-26%2B-brightgreen.svg?style=flat"/>
    <a href="https://github.com/normss/MovieCatalogApp/releases"><img src="https://img.shields.io/badge/APK-Universal-044d29.svg?logo=android"/>
</p>

<p align="center">
  <a href = "https://normno.ru/"><img src="https://github.com/user-attachments/assets/2228bb35-bfe6-45dd-a767-7d13808dee37">
</p>

## Download
Go to the [Releases](https://github.com/normss/MovieCatalogApp/releases) to download the latest APK.

## This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
