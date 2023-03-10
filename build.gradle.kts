import io.gitlab.arturbosch.detekt.Detekt

plugins {
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jmailen.kotlinter") version "3.13.0" apply false
    id("com.github.ben-manes.versions") version "0.46.0"
}

// configure detekt
subprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")

    detekt {
        debug = false
        parallel = true
        config = files("${rootDir}/detekt-config.yml")
        basePath = projectDir.absolutePath
    }

    tasks.named<Detekt>("detekt").configure {
        reports {
            html.required.set(false)
            xml.required.set(false)
            txt.required.set(false)
            sarif.required.set(false)
            md.required.set(false)
        }
    }
}

// configure kotlinter
subprojects {
    apply(plugin = "org.jmailen.kotlinter")
}