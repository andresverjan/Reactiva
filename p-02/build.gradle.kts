plugins {
    id("java")
}

group = "com.bancolombia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral();
    maven {
        url = uri("https://artifactory.apps.bancolombia.com/maven-bancolombia")
    }
}

dependencies {
    implementation ("io.reactivex.rxjava2:rxjava:2.2.21")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}