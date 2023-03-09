@file:Suppress("UnstableApiUsage")

package com.aminmsvi.gradle

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.variant.AndroidComponentsExtension
import org.gradle.api.Project

val Project.androidComponentExtension: AndroidComponentsExtension<*, *, *>
    get() = extensions.getByType(AndroidComponentsExtension::class.java)

val Project.applicationExtension: ApplicationExtension
    get() = extensions.getByType(ApplicationExtension::class.java)

val Project.libraryExtension: LibraryExtension
    get() = extensions.getByType(LibraryExtension::class.java)