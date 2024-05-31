plugins {
    //java
    id ("io.spring.dependency-management") version "1.1.5" //"1.0.11.RELEASE"
    application
    //id ("java-
    checkstyle
}

application {
    mainClass="hexlet.code.App"
}

checkstyle {
    toolVersion = "10.12.4"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
	mavenBom ("org.springframework.boot:spring-boot-dependencies:3.1.1")  //2.5.4")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    //implementation("org.springframework.integration:spring-integration-core")
    //
    checkstyle ("com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
    //checkstyle "group:artifact:version"

}


tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


//Groovy
/*
tasks managedVersions {
    doLast {
	dependencyManagement.managedVersions.each {
	    println it
	}
    }
}
*/

task("managedVersions") {
    group = "Custom"
    description = "Prints all compatible versions of libraries"

    doLast {
        dependencyManagement.managedVersions.forEach {
            println(it)
        }
    }
}

tasks.register("hello") {
    group = "Custom"
    description = "A lovely greeting task."

    doLast {
	println("Hello, world!")
    }
}
