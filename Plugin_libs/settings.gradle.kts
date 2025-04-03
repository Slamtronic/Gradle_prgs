rootProject.name = "Plugin_lib"

pluginManagement  {          
   repositories {       
       gradlePluginPortal()
       google()
        }
    }

dependencyResolutionManagement {
    repositories {
   mavenCentral()
   google()
  
   }
}

include ("java-plugins")