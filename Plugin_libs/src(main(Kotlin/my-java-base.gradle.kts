plugins {

id ("java")
id("checkstyle")
    
    
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))

}



tasks.test {  useJUnitPlatform() 
testLogging.showStandardStreams=true
}

val mytasks="my displayed tasks"
tasks.named<TaskReportTask>("tasks")
{displayGroup=mytasks}

tasks.build{group=mytasks}
tasks.check{
         group=mytasks
          description="run checks including tasks"}
   

tasks.register("checkQuality"){
         group=mytasks
          description="run checks excluding tasks"
          dependsOn(tasks.classes,tasks.checkstyleMain)
          dependsOn(tasks.testClasses,tasks.checkstyleTest)      
        }
dependencies {
  testImplementation ("org.junit.jupiter:junit-jupiter:5.7.2")
}