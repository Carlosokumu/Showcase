plugins {

    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kapt)
    id(BuildPlugins.Hilt)
    id(BuildPlugins.apollo).version(Versions.apolloVersion)
}

android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
    buildToolsVersion("30.0.2")


    defaultConfig {
        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.targetSdkVersion)
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }


    buildTypes {

        getByName("release") {
            isMinifyEnabled = true

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility  = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
apollo {
    // instruct the compiler to generate Kotlin models
    generateKotlinModels.set(true)
}

dependencies {




    implementation(Libraries.apollo)
    implementation(Libraries.apolloCoroutines)



    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)
    //implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    //implementation 'androidx.core:core-ktx:1.7.0'
    //implementation 'androidx.appcompat:appcompat:1.4.1'
    //implementation 'com.google.android.material:material:1.5.0'
   // testImplementation 'junit:junit:4.+'
   // androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    //androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}