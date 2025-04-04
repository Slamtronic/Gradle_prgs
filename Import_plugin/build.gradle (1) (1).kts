val gloublBuild="my global build group"
val ciBuild="my Ci build group"
tasks.named<TaskReportTask>("tasks"){
  displayGroup=gloublBuild
}
tasks.register("qualityCheckAll"){
      group=gloublBuild
      dependsOn(subprojects.map { ":${ it.name} : checkQuality"}  )       
}
tasks.register("CheckAll"){
     group=ciBuild
     dependsOn(subprojects.map { ":${ it.name} : check"} )  
     dependsOn(gradle.includedBuilds.map { it.task  (":checkAll")})
}
