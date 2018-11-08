package com.sadhen.spring.boot.config

import com.wacai.config.annotation.conf
import scala.concurrent.duration._

@conf
trait crontab {
  val hour = new {
    val start = 0
    val end = 23
  }

  val interval = 5 minutes
}
