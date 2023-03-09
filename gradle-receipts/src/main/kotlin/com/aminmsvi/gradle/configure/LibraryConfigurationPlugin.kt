package com.aminmsvi.gradle.configure

import com.aminmsvi.gradle.SdkVersions
import com.aminmsvi.gradle.libraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("UnstableApiUsage")
class LibraryConfigurationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target.libraryExtension) {
            defaultConfig {
                compileSdk = SdkVersions.COMPILE_SDK
                minSdk = SdkVersions.MIN_SDK
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                consumerProguardFiles("proguard-rules.pro")

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
                packagingOptions {
                    resources {
                        excludes.add("/META-INF/{AL2.0,LGPL2.1}")
                    }
                }
            }
        }
    }
}