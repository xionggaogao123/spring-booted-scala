name := "spring-boot-with-scala"
organization := "com.sadhen.spring.boot"
version := "1.0"

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
// resolvers += "aliyun" at "http://maven.aliyun.com/nexus/content/groups/public"

scalaVersion := "2.12.7"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

lazy val springBootVersion = "2.1.0.RELEASE"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-web" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-actuator" % springBootVersion,
  "org.springframework.boot" % "spring-boot-autoconfigure" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-logging" % springBootVersion,
  "com.wacai" %% "config-annotation" % "0.3.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
)

mainClass := Some("com.sadhen.spring.boot.Application")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

enablePlugins(JavaAppPackaging)
