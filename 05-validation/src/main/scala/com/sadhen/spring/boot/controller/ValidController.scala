package com.sadhen.spring.boot.controller

import com.sadhen.spring.boot.model.Person
import javax.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

/**
  * Created by rendong on 17/3/24.
  */
@RestController
@RequestMapping(value = Array("/api"))
class ValidController {

  @RequestMapping(value = Array("/person"), method = Array(RequestMethod.POST))
  def echo(@Valid @RequestBody person: Person): Person = {
    person
  }
}

