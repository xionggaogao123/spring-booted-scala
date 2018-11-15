package com.sadhen.spring.boot.controller

import com.sadhen.spring.boot.model.Person
import com.typesafe.scalalogging.LazyLogging
import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import org.json4s.jackson.JsonMethods._

@RunWith(classOf[SpringRunner])
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ValidControllerTest extends Matchers with LazyLogging {
  @Autowired
  var restTemplate: TestRestTemplate = _

  def echo(person: Person): Unit = {
    val body = restTemplate.postForEntity("/api/person", person, classOf[Person])
    val echo = body.getBody
    assert(body.getStatusCodeValue === 200)
    assert(person.age === echo.age)
    assert(person.name === echo.name)
  }

  def error(person: Person): Unit = {
    val body = restTemplate.postForEntity("/api/person", person, classOf[String])
    logger.error(pretty(parse(body.getBody)))
    assert (body.getStatusCodeValue != 200)
  }


  @Test
  def testHello(): Unit = {
    val person = new Person
    person.setName("data")
    person.setAge(24)
    echo(person)
  }

  @Test
  def nullValidation(): Unit = {
    val person = new Person
    person.setName(null)
    person.setAge(24)
    error(person)
  }

  @Test
  def over18(): Unit = {
    val person = new Person
    person.setName("young")
    person.setAge(17)
    error(person)
  }
}
