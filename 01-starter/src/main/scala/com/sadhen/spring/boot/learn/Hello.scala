package com.sadhen.spring.boot.learn

/**
  * @author keven
  */
object Hello {

  def method: Unit = {
    
  }

  def  abs(x: Double) = if( x >= 0) x else -x

  def sum(args: Int*) ={
    var result = 0
    for (arg <- args) {
      result += arg
    }
    result
  }


  def boxTest(s:String): Unit = {

  }

  def box(): Unit = {

  }


  def decorate(str: String, left: String="[", right: String="]") = left + str + right

  def main(args: Array[String]): Unit = {
    /*for (i <- 1 to 3 ; j<- 1 to 3 if i != j) {
      println("i ==" + i +",j==" + j)
      println("result ==" + 10 * i + j)
    }*/



    /*for (i <- 1 to 3; from = 4-i; j <- from to 3) {
      println("i==" + i)
      println("result==" + 10 * i + j)
    }

    for (i <- 1 to 10)
      yield i % 3*/

   /* println(decorate("hello"))
    println(decorate("hello world","《","》"))*/


    val result = sum(1,2,3,4,5,6)
    println(result)

    var  x = -1
    if(x > 0) {
      x
    }else{
      throw new IllegalArgumentException("x should be more then zero")
    }

    println(x)


  }
}
