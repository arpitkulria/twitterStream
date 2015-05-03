name := """braggr.me"""

version := "1.0-SNAPSHOT"

organization := "com.knoldus.braggr"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.11.6", "2.10.4")

libraryDependencies ++= Seq(
  	"org.twitter4j"          % "twitter4j-stream" 				% "3.0.3"
)

publishArtifact in Test := false

parallelExecution in Test := false
