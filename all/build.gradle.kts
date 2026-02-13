import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kotlin.cocoapods)
    alias(libs.plugins.swiftpackage)
    id("module.publications")
}

kotlin {
    jvmToolchain(11)
    jvm()

    js(IR) {
        nodejs()
        browser()
        binaries.library()
        compilerOptions {
            generateTypeScriptDefinitions()
        }
    }

    val xcf = XCFramework("kslack")
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
        macosX64(),
        macosArm64(),
    ).forEach {
        it.binaries.framework {
            export(project(":core"))
            export(project(":stream"))
            baseName = "kslack"
            xcf.add(this)
        }
    }

    cocoapods {
        name = "kslack"
        version = "0.0.1"
        summary = "kslack is Slack library for Kotlin Multiplatform."
        homepage = "https://github.com/uakihir0/kslack"
        authors = "Akihiro Urushihara"
        license = "MIT"
        framework { baseName = "kslack" }
    }

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }
        commonMain.dependencies {
            api(project(":core"))
            api(project(":stream"))
        }
    }
}

multiplatformSwiftPackage {
    swiftToolsVersion("5.7")
    targetPlatforms {
        // baseline 2020
        iOS { v("15") }
        macOS { v("12.0") }
    }
}

tasks.configureEach {
    // Fix implicit dependency between XCFramework and FatFramework tasks
    if (name.contains("assembleKslack") && name.contains("XCFramework")) {
        mustRunAfter(tasks.matching { it.name.contains("FatFramework") })
    }
}

tasks.podPublishXCFramework {
    doLast {
        providers.exec {
            executable = "sh"
            args = listOf(project.projectDir.path + "/../tool/rename_podfile.sh")
        }.standardOutput.asText.get()
    }
}
