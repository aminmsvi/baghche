@file:Suppress("UnstableApiUsage")

import com.aminmsvi.gradle.dependency.DependenciesPlugin

plugins {
    id("com.android.application")
    kotlin("android")
    id("com.aminmsvi.baghche.dependencies")
    id("com.aminmsvi.baghche.dependency.compose")
    id("com.aminmsvi.baghche.configure.application")
}

android {
    namespace = "com.aminmsvi.baghche"

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(DependenciesPlugin.Libs.CORE_KTX)
    implementation(DependenciesPlugin.Libs.LIFECYCLE_RUNTIME_KTX)
    implementation(DependenciesPlugin.Libs.COMPOSE_ACTIVITY)
    implementation(DependenciesPlugin.Libs.COMPOSE_MATERIAL3)
}