ThisBuild / scalaVersion := "2.13.6"
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"

lazy val `http4s-4935` = project
  .in(file("."))
  .settings(
    scalacOptions ++= Seq("-Xsource:3"),
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic"     % "1.2.5",
      "org.http4s"    %% "http4s-dsl"          % "0.23.1",
      "org.http4s"    %% "http4s-ember-client" % "0.23.1",
      "org.typelevel" %% "log4cats-slf4j"      % "2.1.1"
    ),
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
