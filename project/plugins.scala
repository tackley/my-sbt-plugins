import sbt._

object Plugins extends Build {
  lazy val root = Project("global-plugins", file("."))
    .dependsOn(
      uri("git://github.com/mpeltonen/sbt-idea.git"), 
      uri("git://github.com/steppenwells/sbt-sh.git")
    )
}
