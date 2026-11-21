plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "cm.visioneconomics.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "cm.visioneconomics.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
