import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    dependencies {

    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.android.library") version "8.1.2" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}
//tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile).configureEach {
//    kotlinOptions {
//        jvmTarget = "1.8"
//        freeCompilerArgs += ["-Xskip-prerelease-check"]
//    }
//}