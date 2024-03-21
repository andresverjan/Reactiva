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
    compileOnly ("org.projectlombok:lombok:1.18.32")
    annotationProcessor ("org.projectlombok:lombok:1.18.32")
    implementation ("io.reactivex.rxjava2:rxjava:2.2.21")

    testCompileOnly ("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.32")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}