object Versions {
    // Material and androidX
    const val material = "1.5.0"
    const val appCompat = "1.4.1"
    const val constraintLayout = "2.1.3"


    //NetWorking

    const val okhttp = "4.3.1"
    const val httpInterceptor = "4.3.1"
    const val apolloVersion = "2.4.6"
    const val gson = "2.7.0"

    //Loggings
    const val Timber = "4.7.1"



    //Extensions
    const val extensionVersion = "1.3.0"

    //Room
    const val RoomVersion = "2.3.0-alpha02"

    //Hilt
    const val HiltVersion = "2.37"

    //coroutines
    const val Coroutines = "1.3.9"
    const val HiltPlugin ="2.38.1"


    //lifecycle
    const val lifecycleVersion = "2.3.1"
    const val lifecycleRunTime = "1.0.0-alpha06"
    const val runTime = "1.0.0-alpha06"


    //Gradle Versions
    const val gradleVersionsPlugin = "0.29.0"

    //Kotlin
    const val kotlinVersion = "1.7.0"
    const val coreKtx = "1.6.0"


    //Room
    const val room = "2.3.0-alpha02"


    //Test
    const val junit = "4.13"
    const val espresso = "3.4.0"
    const val androidXJunit = "1.1.3"


    const val buildToolsVersion = "4.1.0"
    const val  androidLib =  "4.0.1"
    const val kotlin = "1.4.32"

    const val ktlint = "9.3.0"
    const val detekt = "1.12.0"
    const val dokka = "1.4.0-rc-24"


}


object BuildPlugins {


    const val kapt = "kotlin-kapt"
    const val apollo = "com.apollographql.apollo"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val hilt = "dagger.hilt.android.plugin"


    const val hiltPlugin ="dagger.hilt.android.plugin"

    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinAndroidExtensions = "org.jetbrains.kotlin.android.extensions"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val gradleVersionsPlugin = "com.github.ben-manes.versions"
}


object Libraries {

    // androidX and Material

    const val material = "com.google.android.material:material:${Versions.material}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val corektx = "androidx.core:core-ktx:${Versions.coreKtx}"

    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRunTime}"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runTime}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Coroutines}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.HiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.HiltVersion}"


    const val apollo = "com.apollographql.apollo:apollo-runtime:${Versions.apolloVersion}"
    const val apolloCoroutines =
        "com.apollographql.apollo:apollo-coroutines-support:${Versions.apolloVersion}"


    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.httpInterceptor}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"


    const val timber = "com.jakewharton.timber:timber:${Versions.Timber}"


    const val activity = "androidx.activity:activity-ktx:${Versions.extensionVersion}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.extensionVersion}"


    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val room = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"


}

object BuildModules {
    const val App = ":app"
    const val coreModule = ":core"
}

object AndroidSdk {
    const val minSdkVersion = 22
    const val compileSdkVersion = 30
    const val targetSdkVersion = compileSdkVersion
    const val versionCode = 1
    const val versionName = "1.0"
}

object TestLibraries {

    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val androidXJUnit = "androidx.test.ext:junit:${Versions.androidXJunit}"
    const val jUnit = "junit:junit:${Versions.junit}"

}
