rootProject.name = "aws-opentelemetry-xray-udp-span-exporter"

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()

    maven {
      setUrl("https://oss.sonatype.org/content/repositories/snapshots")
    }
  }
}