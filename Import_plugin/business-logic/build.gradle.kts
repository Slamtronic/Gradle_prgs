//business-logic
plugins{
 id("my-java-library")
 
//id("application")  //id("base")
}

dependencies {
  implementation ( project(":data-model"))
  implementation ("org.apache.commons :commons-lang3 :3.17.0" )       
}