package com.sadhen.spring.boot.service

import com.sadhen.spring.boot.config.crontab
import org.springframework.stereotype.Service
import org.log4s._

/**
  * Created by rendong on 17/3/26.
  */
@Service
class WorldService extends crontab {
  private[this] val logger = getLogger

  logger.info(s"start at ${hour.start}")
  logger.info(s"end at ${hour.end}")
  logger.info(s"interval: ${interval.toString}")

  def getCountry: String = {
    "中国"
  }
}
