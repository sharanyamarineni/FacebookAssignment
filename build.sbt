name := "FacebookAssignment"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.36",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.0",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "com.h2database" % "h2" % "1.4.187" % "test",
  "org.twitter4j" % "twitter4j-stream" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.mockito" % "mockito-all" % "1.8.4",
  "com.github.vooolll" %% "facebook4s" % "0.3.3",
  "org.facebook4j" % "facebook4j-core" % "2.4.1"
)

resolvers += Resolver.sonatypeRepo("releases")