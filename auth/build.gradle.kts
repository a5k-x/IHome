plugins {
    //id("com.android.application")
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdk = 32

    defaultConfig {
      /* applicationId = "com.a5k.auth"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"*/
    }
    buildFeatures{
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (Dependences.RECYCLER_VIEW_DEP)
    implementation (Dependences.RETROFIT_CONVERT_JSON_DEP)
    implementation (Dependences.KOTLIN_COROUTINES_CORE_DEP)
    implementation (Dependences.KOTLIN_COROUTINES_ANDROID_DEP)
    implementation (Dependences.NAVIGATION_FRAGMENT_KTX_DEP)
    implementation (Dependences.NAVIGATION_UI_KTX_DEP)
    implementation (Dependences.CORE_KTX_DEP)
    implementation (Dependences.APPCOMPAT_DEP)
    implementation (Dependences.MATERIAL_DEP)
    implementation (Dependences.CONSTRAINT_LAYOUT_DEP)
    testImplementation (Dependences.JUNIT_DEP)
    androidTestImplementation(Dependences.TEST_ETX_DEP)
    androidTestImplementation (Dependences.TEST_ESPRESSO_DEP)
}