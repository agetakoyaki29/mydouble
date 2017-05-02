

lazy val root = (project in file("."))
  .settings(
    organization := "com.github.agetakoyaki29",
    name := "mydouble",
    version := "1.0",
    scalaVersion := "2.12.2",

    libraryDependencies += scalactic,
    libraryDependencies += scalatest,

    logBuffered in Test := false
  )

// ---- lib ----
lazy val scalactic = "org.scalactic" %% "scalactic" % "3.0.0"
lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.0" % "test"
