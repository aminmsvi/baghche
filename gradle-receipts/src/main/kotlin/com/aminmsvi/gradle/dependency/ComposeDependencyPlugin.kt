package com.aminmsvi.gradle.dependency

import com.aminmsvi.gradle.androidComponentExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

@Suppress("UnstableApiUsage")
class ComposeDependencyPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target.androidComponentExtension) {
            finalizeDsl { extension ->
                extension.composeOptions.kotlinCompilerExtensionVersion = "1.4.3"
                extension.buildFeatures {
                    compose = true
                }
            }
        }

        target.dependencies {
            add(
                configurationName = "implementation",
                dependencyNotation = "androidx.compose.ui:ui:$COMPOSE_VERSION"
            )
            add(
                configurationName = "implementation",
                dependencyNotation = "androidx.compose.ui:ui-tooling-preview:$COMPOSE_VERSION"
            )
            add(
                configurationName = "debugImplementation",
                dependencyNotation = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
            )
            add(
                configurationName = "debugImplementation",
                dependencyNotation = "androidx.compose.ui:ui-test-manifest:$COMPOSE_VERSION"
            )
            add(
                configurationName = "androidTestImplementation",
                dependencyNotation = "androidx.compose.ui:ui-test-junit4:$COMPOSE_VERSION"
            )
        }
    }

    companion object {
        private const val COMPOSE_VERSION = "1.3.3"
    }
}