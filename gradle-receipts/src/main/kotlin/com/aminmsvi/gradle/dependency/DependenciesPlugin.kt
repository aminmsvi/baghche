@file:Suppress("unused")

package com.aminmsvi.gradle.dependency

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesPlugin : Plugin<Project> {

    override fun apply(target: Project) {
    }

    object Libs {
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val COMPOSE_UI_TOOLING_PREVIEW =
            "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val COMPOSE_UI_TEST_MANIFEST =
            "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}"
        const val COMPOSE_UI_TEST_JUNIT4 =
            "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
        const val COMPOSE_ACTIVITY =
            "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
        const val COMPOSE_MATERIAL3 =
            "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL3}"

        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"

        const val LIFECYCLE_RUNTIME_KTX =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME_KTX}"

        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROID_TEST_EXT_JUNIT =
            "androidx.test.ext:junit:${Versions.ANDROID_TEST_EXT_JUNIT}"
        const val ESPRESSO_CORE =
            "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    }

    object Versions {
        const val COMPOSE = "1.3.3"
        const val COMPOSE_ACTIVITY = "1.6.1"
        const val COMPOSE_MATERIAL3 = "1.0.1"
        const val CORE_KTX = "1.9.0"
        const val LIFECYCLE_RUNTIME_KTX = "2.5.1"
        const val JUNIT = "4.13.2"
        const val ANDROID_TEST_EXT_JUNIT = "1.1.5"
        const val ESPRESSO_CORE = "3.5.1"
    }
}