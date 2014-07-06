import play._
import sbt.Keys._

lazy val root = (project in file(".")).enablePlugins(PlayJava)

organization in ThisBuild := "pl.matisoft"

scalaVersion := "2.10.4"
