import AssemblyKeys._ 

assemblySettings

name := "Spark Tutorial"

version := "0.1"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.0-incubating"

mergeStrategy in assembly := { case _ => MergeStrategy.first }