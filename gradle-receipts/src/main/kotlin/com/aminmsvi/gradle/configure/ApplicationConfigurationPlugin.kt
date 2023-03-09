package com.aminmsvi.gradle.configure

import com.aminmsvi.gradle.SdkVersions
import com.aminmsvi.gradle.applicationExtension
import com.android.build.api.dsl.BaseFlavor
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Action
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("UnstableApiUsage")
class ApplicationConfigurationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target.applicationExtension) {
            defaultConfig {
                compileSdk = SdkVersions.COMPILE_SDK
                minSdk = SdkVersions.MIN_SDK
                targetSdk = SdkVersions.TARGET_SDK

                versionCode = 1
                versionName = "1.0"

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                vectorDrawables {
                    useSupportLibrary = true
                }

                buildTypes {
                    release {
                        isDebuggable = false
                        isMinifyEnabled = true
                        isShrinkResources = true
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