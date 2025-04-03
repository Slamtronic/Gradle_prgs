plugins {

id ("java-library")
    
    id("org.jetbrains.kotlin.jvm") //version "1.9.21"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))

}


    tasks.test {  useJUnitPlatform() }
kotlin{
}