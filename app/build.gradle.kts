plugins {


    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kapt)
    id(BuildPlugins.Hilt)
}

android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
    buildToolsVersion("30.0.2")

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


    implementation (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.kotlinStandardLibrary)
    implementation (Libraries.corektx)


    implementation (Libraries.constraintLayout)
    implementation(Libraries.appCompat)
    implementation (Libraries.material)
    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)



    implementation(Libraries.support)
    implementation(Libraries.timber)
    testImplementation (TestLibraries.jUnit)

}
