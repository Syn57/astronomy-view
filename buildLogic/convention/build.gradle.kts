import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "com.zachnr.aview.buildLogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.firebase.crashlytics.gradlePlugin)
    compileOnly(libs.firebase.performance.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
    implementation(libs.truth)
}

gradlePlugin {
    plugins {
        register("androidApplicationCompose") {
            id = "aview.android.application.compose"
            implementationClass = "plugins.AndroidApplicationComposeConventionPlugin"
        }
        register("androidApplication") {
            id = "aview.android.application"
            implementationClass = "plugins.AndroidApplicationConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "aview.android.library.compose"
            implementationClass = "plugins.AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "aview.android.library"
            implementationClass = "plugins.AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "aview.android.feature"
            implementationClass = "plugins.AndroidFeatureConventionPlugin"
        }
        register("hilt") {
            id = "aview.hilt"
            implementationClass = "plugins.HiltConventionPlugin"
        }
        register("androidRoom") {
            id = "aview.android.room"
            implementationClass = "plugins.AndroidRoomConventionPlugin"
        }
        register("jvmLibrary") {
            id = "aview.jvm.library"
            implementationClass = "plugins.JvmLibraryConventionPlugin"
        }
    }
}