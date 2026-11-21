# VISION ECONOMICS — Android starter project

**Developer:** BIME GODFREY

This starter project contains a sample Economics learning interface packaged in an Android WebView. The sample lessons are illustrative and should be checked and expanded against the official Cameroon Anglophone/GCE syllabus before classroom use.

## Build from an Android phone using GitHub Actions

You do not need Android Studio or a computer for this cloud-build route. You do need a GitHub account and an internet connection.

1. Create a new repository on GitHub, for example `vision-economics`.
2. In the repository, use **Add file → Upload files** and upload the contents of this project (the files and folders inside this ZIP, not the ZIP itself). Make sure the `.github/workflows/android-apk.yml` workflow file is included.
3. Commit the uploaded files to the `main` branch.
4. Open the repository's **Actions** tab. Select **Build VISION ECONOMICS APK** and tap **Run workflow** if it has not started automatically.
5. Wait for the workflow to finish successfully.
6. Open the completed workflow run, scroll to **Artifacts**, and download `vision-economics-debug-apk`.
7. Extract the downloaded artifact ZIP on your phone. It contains `app-debug.apk`. Tap that APK to install it. Android may ask you to permit installation from your browser or file manager; only allow this for the APK you built yourself.

If GitHub's mobile layout hides **Actions**, open the browser menu and request the desktop site.

## Local build (computer)

Open this folder in Android Studio with JDK 17. The Android Gradle Plugin is 8.7.3 and the workflow uses Gradle 8.9. Build with `gradle assembleDebug`, or use Android Studio's Build APK menu.

## Current limitations

- This is a prototype with sample content, not a complete or officially validated syllabus.
- The sample lesson interface is bundled locally and its core screens work offline.
- Online accounts, cloud synchronisation, full syllabus coverage, teacher-created lesson persistence, and production release signing are not implemented.
- The workflow creates a **debug APK** for testing, not a Play Store release.
