scalaVersion := "3.2.2"
libraryDependencies += ("org.creativescala" %% "doodle" % "0.9.21").cross(CrossVersion.for3Use2_13)
Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / useSuperShell := false
