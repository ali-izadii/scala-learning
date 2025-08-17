ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "scala-practice",
    idePackagePrefix := Some("com.scala.practice"),
//    libraryDependencies ++= Seq(
//      "org.scalatest" %% "scalatest" % "3.2.17" % Test,
//      "org.scalactic" %% "scalactic" % "3.2.17",
//      "com.typesafe.akka" %% "akka-actor" % "2.8.5"
//    )
  )
