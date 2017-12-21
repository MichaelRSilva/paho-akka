addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC11")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % "1.11")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.2")

libraryDependencies += "com.softwaremill.sttp" %% "okhttp-handler" % "0.0.12"
