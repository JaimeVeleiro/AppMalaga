import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.politecnicomalaga.appmalaga"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.politecnicomalaga.appmalaga"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    //implementation(com.google.code.gson:gson:2.11.0)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.gson)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}