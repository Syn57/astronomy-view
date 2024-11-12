plugins {
    alias(libs.plugins.aview.android.library)
    alias(libs.plugins.aview.android.library.compose)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.zachnr.aview.navigation"
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.androidx.navigation.compose)
}