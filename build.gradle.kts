// Top-level build file where you can add configuration options common to all sub-projects/modules.



plugins {
    id(BuildPlugins.androidApplication) apply false
    id(BuildPlugins.kotlinAndroid) apply false
    id(BuildPlugins.kotlinAndroidExtensions) apply false
    id(BuildPlugins.androidLibrary) apply false
   // id(BuildPlugins.hiltPlugin)
}


allprojects {

    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }


}
buildscript {
    val kotlinVersion by extra("1.4.32")
    val kotlin_version by extra("1.4.32")

    dependencies {
        //classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath(BuildPlugins.hiltPlugin)
        //classpath("com.google.gms:google-services:4.3.8")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files

    }
}

//allprojects {
//    repositories {
//        google()
//        jcenter()
//        mavenCentral()
//        maven(url = "https://jitpack.io")
//    }
//}
//
