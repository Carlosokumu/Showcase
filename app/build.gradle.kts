plugins {


    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
}

android {
    compileSdkVersion(AndroidSdk.minSdkVersion)
    buildToolsVersion ("30.0.3")

    defaultConfig {
        applicationId ("com.example.showcase")

        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.targetSdkVersion)
        versionCode =  AndroidSdk.versionCode
        versionName = AndroidSdk.versionName

        testInstrumentationRunner ("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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

   // implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
   // implementation 'androidx.core:core-ktx:1.7.0'
    //implementation 'androidx.appcompat:appcompat:1.4.1'
    //implementation 'com.google.android.material:material:1.5.0'
    //implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    //testImplementation 'junit:junit:4.+'
   // androidTestImplementation 'androidx.test.ext:junit:1.1.3'
   // androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.kotlinStandardLibrary)
    implementation(Libraries.appCompat)
    implementation (Libraries.corektx)
    implementation (Libraries.constraintLayout)
    implementation (Libraries.material)
    testImplementation (TestLibraries.jUnit)
    //androidTestImplementation (TestLibraries.testRunner)
    androidTestImplementation (TestLibraries.espresso)
    //androidTestImplementation (TestLibraries.annotation)
}