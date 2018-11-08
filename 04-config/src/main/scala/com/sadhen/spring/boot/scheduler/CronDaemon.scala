package com.sadhen.spring.boot.scheduler

import com.sadhen.spring.boot.config.crontab
import com.typesafe.scalalogging.LazyLogging
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class CronDaemon extends LazyLogging with crontab {

  @Scheduled(cron = "${crontab.task1.expr}")
  def runTask1(): Unit = {
    logger.info(s"I'm ${task1.action}ing ${task1.desc}")
  }

  @Scheduled(fixedRateString = "${crontab.task2.fixed.rate}")
  def runTask2(): Unit = {
    logger.info(s"I'm ${task2.action}ing ${task2.desc}")
  }
}
