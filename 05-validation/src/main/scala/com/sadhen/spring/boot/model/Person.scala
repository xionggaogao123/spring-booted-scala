package com.sadhen.spring.boot.model

import javax.validation.constraints.{Min, NotNull}

import scala.beans.BeanProperty

class Person {

  @BeanProperty
  @NotNull
  var name: String = _

  @BeanProperty
  @Min(value = 18, message = "18禁")
  var age: Int = _
}
