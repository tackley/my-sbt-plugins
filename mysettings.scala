import sbt._
import Keys._

object MySettings extends Plugin {	
  override def settings = Seq(
    ivyLoggingLevel := UpdateLogging.DownloadOnly
  )
}
