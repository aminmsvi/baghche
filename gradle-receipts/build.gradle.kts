plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle-api:7.4.2")
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    gradleApi()
}

gradlePlugin {
    plugins {
        create("dependencies") {
            id = "com.aminmsvi.baghche.dependencies"
            implementationClass = "com.aminmsvi.gradle.dependency.DependenciesPlugin"
        }
        create("dependencies-compose") {
            id = "com.aminmsvi.baghche.dependency.compose"
            implementationClass = "com.aminmsvi.gradle.dependency.ComposeDependencyPlugin"
        }
        create("configure-application") {
            id = "com.aminmsvi.baghche.configure.application"
            implementationClass = "com.aminmsvi.gradle.configure.ApplicationConfigurationPlugin"
        }
        create("configure-library") {
            id = "com.aminmsvi.baghche.configure.library"
            implementationClass = "com.aminmsvi.gradle.configure.LibraryConfigurationPlugin"
        }
    }
}