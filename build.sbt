resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

libraryDependencies <+= (sbtVersion) {
  case "0.10.1" => "com.github.mpeltonen" % "sbt-idea_2.8.1" % "0.10.0"
  case "0.11.0" => "com.github.mpeltonen" % "sbt-idea_2.9.1_0.11.0" % "0.11.0" from "http://mpeltonen.github.com/maven/com/github/mpeltonen/sbt-idea_2.9.1_0.11.0/0.11.0/sbt-idea-0.11.0.jar"
  case "0.11.1" => "com.github.mpeltonen" % "sbt-idea_2.9.1_0.11.1" % "0.11.0" from "http://mpeltonen.github.com/maven/com/github/mpeltonen/sbt-idea_2.9.1_0.11.1/0.11.0/sbt-idea-0.11.0.jar"
  case "0.11.2" => "com.github.mpeltonen" % "sbt-idea_2.9.1_0.11.2" % "1.0.0" from "http://mpeltonen.github.com/maven/com/github/mpeltonen/sbt-idea_2.9.1_0.11.2/1.0.0/sbt-idea-1.0.0.jar"
  case "0.11.3" => "com.github.mpeltonen" % "sbt-idea_2.9.1_0.11.3" % "1.1.0-SNAPSHOT" from "http://mpeltonen.github.com/maven/com/github/mpeltonen/sbt-idea_2.9.1_0.11.3/1.1.0-SNAPSHOT/sbt-idea-1.1.0-SNAPSHOT.jar"
  case other => error("no sbt-idea plugin for this version of sbt - " + other)
}

