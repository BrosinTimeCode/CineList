plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.brosintime"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:sprint-boot-starter-security")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5")
	implementation("org.springframework.boot:spring-boot-starter-web")
	runtimeOnly("org.webjars:webjars-locator-core")
	runtimeOnly("org.webjars.npm:htmx.org:1.9.10")
	runtimeOnly("org.webjars.npm:stylus:0.62.0")
	runtimeOnly("org.webjars.npm:hyperscript.org:0.9.12")
	runtimeOnly("org.hsqldb:hsqldb")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
