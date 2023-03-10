@file:Suppress("UnstableApiUsage")

import com.aminmsvi.gradle.dependency.DependenciesPlugin

plugins {
    id("com.android.application")
    kotlin("android")
    id("com.aminmsvi.gardener.dependencies")
    id("com.aminmsvi.gardener.dependency.compose")
    id("com.aminmsvi.gardener.configure.application")
}

android {
    namespace = "com.aminmsvi.gardener"

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(DependenciesPlugin.Libs.CORE_KTX)
    implementation(DependenciesPlugin.Libs.LIFECYCLE_RUNTIME_KTX)
    implementation(DependenciesPlugin.Libs.COMPOSE_ACTIVITY)
    implementation(DependenciesPlugin.Libs.COMPOSE_MATERIAL3)
    testImplementation(DependenciesPlugin.Libs.JUNIT)
    androidTestImplementation(DependenciesPlugin.Libs.ANDROID_TEST_EXT_JUNIT)
    androidTestImplementation(DependenciesPlugin.Libs.ESPRESSO_CORE)
}