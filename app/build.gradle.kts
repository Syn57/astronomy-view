plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

apply(from = "../shared_dependencies.gradle")

android {
    namespace = "com.nodz.aview"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nodz.aview"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation(project(":core"))

    //Coil
    implementation("io.coil-kt:coil-compose:2.5.0")

    //lottie
    implementation("com.airbnb.android:lottie:6.3.0")
    implementation ("com.airbnb.android:lottie-compose:6.3.0")

    //shimmer
    implementation("com.facebook.shimmer:shimmer:0.5.0")

    //livedata
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.compose.compiler:compiler:1.5.8")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    //splash screen
    implementation("androidx.core:core-splashscreen:1.0.1")

    //Animated like button
    implementation("com.github.jd-alexander:LikeButton:0.2.3")

    //Navigation
    implementation ("androidx.navigation:navigation-compose:2.7.6")

    //Pager
    implementation("com.google.accompanist:accompanist-pager:0.22.0-rc")

    //Constraint Layout
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    //System UI
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.27.0")

    //Material
    implementation("androidx.compose.material:material:1.5.4")

    //Glassmorphism
    implementation("com.github.prime-zs.toolkit:core-ktx:2.0.2-alpha")

}