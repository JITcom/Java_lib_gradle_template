
plugins {
    `java-library`
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.12")
}
java {
    withSourcesJar()
    withJavadocJar()
}

group = "TEMPLATE_GROUP"
version = "0.0.1"
sourceSets["main"].java {
    srcDir("src/main")
}

sourceSets["test"].java {
    srcDir("src/test")
}