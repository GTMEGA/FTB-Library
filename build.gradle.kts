plugins {
    id("fpgradle-minecraft") version ("0.10.0")
}

group = "mega"

minecraft_fp {
    mod {
        modid = "FTBL"
        name = "FTBLib"
        rootPkg = "ftb.lib"
    }

    tokens {
        tokenClass = "mod.Tags"
    }

    api {
        packages = listOf("ftb.lib.api", "latmod.lib")
        packagesNoRecurse = listOf("ftb.lib")
        ignoreRootPkg = true
    }

    publish {
        changelog = "https://github.com/GTMEGA/FTB-Library/releases/tag/$version"
        maven {
            repoUrl = "https://mvn.falsepattern.com/gtmega_releases"
            repoName = "mega"
        }
    }
}

repositories {
    exclusive(horizon(), "com.github.GTNewHorizons")
}

dependencies {
    compileOnly("com.github.GTNewHorizons:waila:1.8.2:dev")
}