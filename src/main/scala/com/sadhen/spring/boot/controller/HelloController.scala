package com.sadhen.spring.boot.controller

import com.fasterxml.jackson.databind.JsonNode
import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods.asJsonNode
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by rendong on 17/3/24.
  */
@RestController
@RequestMapping(value = Array("/api"))
class HelloController {
  @RequestMapping(value = Array("/hello"))
  def hello: JsonNode = {
    val ret = ("hello" -> "world") ~
      ("year" -> 2017)
    asJsonNode(ret)
  }
}
