# PlayStoreLauncher

[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Download APK](https://img.shields.io/badge/Download-APK-blue.svg)](https://github.com/mahmutaunal/Play-Store-Launcher/releases/latest)

A minimal Android TV launcher that simply shows up in the TV app drawer and launches **Google Play Store**.  
Especially useful for devices like **Mi Box S (2nd Gen)** where the Play Store is preinstalled but hidden.

---

## 🎯 Features
- Displays **Play Store** icon in the Android TV app list (Leanback launcher)
- Launches `com.android.vending` directly
- No ads, no permissions, no tracking
- 100% offline and open source (MIT License)
- Lightweight (~30 KB APK)

---

## 📦 Installation
### Option 1 — Download Ready APK
- Go to the [Releases page](https://github.com/mahmutaunal/Play-Store-Launcher/releases/latest)
- Download the latest `.apk` file
- Install it on your Android TV (via USB, ADB, or cloud)

### Option 2 — Build from Source
```bash
git clone https://github.com/<kullanici-adin>/PlayStoreLauncherTV.git
cd PlayStoreLauncherTV
./gradlew assembleRelease
adb install app/build/outputs/apk/release/app-release.apk
```

## 🧠 How It Works

This app doesn’t include any Play Store code.
It just calls:
```
val intent = packageManager.getLaunchIntentForPackage("com.android.vending")
startActivity(intent)
```
and then finishes immediately.
It’s basically a “shortcut” for users who can’t access the Play Store icon on Android TV launchers.

## 🌍 Localization
- 🇬🇧 English (default)
- 🇹🇷 Turkish

The app automatically switches language based on the device’s system locale.

## 🖼️ Banner

The project includes an original 320×180 TV banner (ic_banner.png) inspired by Material Design — no Google trademarks used.

🛠️ Build Info
- Language: Kotlin
- Min SDK: 21
- Target SDK: 35
- Architecture: Android TV (Leanback Launcher)
- Dependencies: AppCompat, Core-KTX

## ⚠️ Notes
- Ensure that Google Play Store app is enabled in TV Settings → Apps. 
- If parental controls or restricted profiles are active, launching may fail.
- Works on Android TV devices that include the Play Store package (com.android.vending).

## 🧾 License

This project is licensed under the MIT License.
Feel free to use, modify, and distribute it.