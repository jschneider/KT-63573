plugins {
  kotlin("multiplatform") version "1.9.20"
}

repositories {
  mavenCentral()
}

kotlin {
  jvm()
  js {
    nodejs {
    }
  }

  sourceSets {
    commonMain {
      dependencies {
        api("com.benasher44:uuid:0.8.1")
      }
    }

    commonTest {
      dependencies {
      }
    }

    jsMain {
      dependencies {
      }
    }

    jsTest {
      dependencies {
      }
    }

    jvmMain {
      dependencies {
      }
    }

    jvmTest {
      dependencies {
      }
    }
  }

  sourceSets.all {
    languageSettings {
      progressiveMode = true
      //languageVersion = "1.9"
      //apiVersion = "1.9"
      languageVersion = "2.0"
      apiVersion = "2.0"
    }
  }
}
