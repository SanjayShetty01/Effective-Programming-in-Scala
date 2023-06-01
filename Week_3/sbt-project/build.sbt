scalaVersion := "3.2.2"
libraryDependencies ++= List("com.lihaoyi" %% "fansi" % "0.2.14",
                            "org.scalameta" % "sbt-munit" % "0.7.29" % Test
)

testFrameworks += TestFramework("munit.Framework")
