@file:Suppress("unused")

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
                dependencyNotation = DependenciesPlugin.Libs.COMPOSE_UI
            )
            add(
                configurationName = "implementation",
                dependencyNotation = DependenciesPlugin.Libs.COMPOSE_UI_TOOLING_PREVIEW
            )
            add(
                configurationName = "debugImplementation",
                dependencyNotation = DependenciesPlugin.Libs.COMPOSE_UI_TOOLING
            )
            add(
                configurationName = "debugImplementation",
                dependencyNotation = DependenciesPlugin.Libs.COMPOSE_UI_TEST_MANIFEST
            )
            add(
                configurationName = "androidTestImplementation",
                dependencyNotation = DependenciesPlugin.Libs.COMPOSE_UI_TEST_JUNIT4
            )
        }
    }
}