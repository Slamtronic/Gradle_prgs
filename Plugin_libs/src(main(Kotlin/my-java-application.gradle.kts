plugins{
 id ("my-java-base")
  }

tasks.register<Zip>("packageApp"){
    from( layout.projectDirectory.file("run.hsr"))
    from(tasks.jar) { into("libs") }

destinationDirectory.set(layout.buildDirectory.dir("dist"))     //
archiveFileName.set("myApplication.zip")  
   }
