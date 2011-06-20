import sbt._

object Plugins extends Build {
 lazy val root = Project("root", file("."))
	.dependsOn (uri("git://github.com/ijuma/sbt-idea.git#sbt-0.10"), uri("git://github.com/steppenwells/sbt-sh.git"))
}
