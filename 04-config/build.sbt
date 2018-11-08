name := "spring-boot-with-scala"
organization := "com.sadhen.spring.boot"
version := "1.0"

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
// resolvers += "aliyun" at "http://maven.aliyun.com/nexus/content/groups/public"

scalaVersion := "2.12.7"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

lazy val springBootVersion = "2.0.6.RELEASE"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-web" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-actuator" % springBootVersion,
  "org.springframework.boot" % "spring-boot-autoconfigure" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-logging" % springBootVersion,
  "com.wacai" %% "config-annotation" % "0.3.7",
  "org.log4s" %% "log4s" % "1.6.1",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.6",
  "org.json4s" %% "json4s-jackson" % "3.6.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.scalamock" %% "scalamock" % "4.1.0" % Test,
  "org.springframework.boot" % "spring-boot-starter-test" % springBootVersion % Test,
  "junit" % "junit" % "4.12" % Test,
)

mainClass := Some("com.sadhen.spring.boot.Application")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)


enablePlugins(JavaAppPackaging)
