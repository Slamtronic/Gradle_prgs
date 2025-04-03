rootProject.name = "Import_plgin"

pluginManagement  {          
   repositories {       
       gradlePluginPortal()
       google()
        }
    includeBuild("../Plugin_lib")
}
dependencyResolutionManagement {
    repositories {
   mavenCentral()
   google()
   }
}

include ("app")
include("business-logic")
 include("data-model")