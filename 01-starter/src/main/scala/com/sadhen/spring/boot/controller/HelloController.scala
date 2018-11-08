package com.sadhen.spring.boot.controller

import com.sadhen.spring.boot.service.WorldService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

/**
  * Created by rendong on 17/3/24.
  */
@RestController
@RequestMapping(value = Array("/api"))
class HelloController @Autowired() (worldService: WorldService) {

  @RequestMapping(value = Array("/echo"), method = Array(RequestMethod.POST))
  def echo(@RequestBody body: String): String = {
    body
  }
}
