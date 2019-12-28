import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {

    java
    kotlin("jvm") version "1.3.61"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

version = "1.2.1"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile (group = "org.apache.opennlp", name = "opennlp-tools", version= "1.9.1")
    testImplementation(group = "junit", name = "junit", version = "4.12")

}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}