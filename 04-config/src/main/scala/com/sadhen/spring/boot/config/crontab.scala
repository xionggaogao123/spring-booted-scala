package com.sadhen.spring.boot.config

import com.wacai.config.annotation.conf
import scala.concurrent.duration._

@conf
trait crontab {
  val task1 = new {
    val expr = "*/10 * * * * *"
    val action = "laugh"
    val desc = "every ten seconds"
  }

  val task2 = new {
    val fixed = new {
      val delay = "1000" // (1 second).toMillis
      val rate = "3000" // (3 second).toMillis
    }
    val action = "blink"
    val desc = "every three seconds"
  }
}
