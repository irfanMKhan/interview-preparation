plugins {
    id("java")
    id("org.springframework.boot") version ("3.5.4")
    id("io.spring.dependency-management") version ("1.1.7")
}

group = "com"
version = "0.0.1"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

/* Applies to all tasks of type Test in your build */
tasks.withType<Test> {
/* Applies only to the default test task */
//tasks.test {
    useJUnitPlatform()
}
