package org.example

import sbt.{AutoPlugin, TaskKey}
import sbt.Keys.name

class ExamplePlugin extends AutoPlugin {
  override val trigger = allRequirements

  override val projectSettings = Seq(
    TaskKey[Unit]("look-ma") := println(s"foo ${name.value}")
  )
}
