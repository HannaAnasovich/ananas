plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.8.1")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.8.1")
    implementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    implementation("org.seleniumhq.selenium:selenium-firefox-driver:4.8.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")

}

tasks.test {"Test"
    useJUnitPlatform()
}
