// Copyright (c) 2013-2017 Rob Norris
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package doobie.example

import cats.effect.IO
import doobie._
import doobie.scalatest.imports._
import org.scalatest._

class AnalysisTestScalaCheck extends FunSuite with Matchers with IOChecker {
  val transactor = Transactor.fromDriverManager[IO]("org.postgresql.Driver", "jdbc:postgresql:world", "postgres", "")

  // Commented tests fail!
//test("speakerQuery")  { check(AnalysisTest.speakerQuery(null, 0)) }
  test("speakerQuery2") { check(AnalysisTest.speakerQuery2) }
  test("arrayTest")     { check(AnalysisTest.arrayTest) }
//test("arrayTest2")    { check(AnalysisTest.arrayTest2) }
  test("pointTest")     { check(AnalysisTest.pointTest) }
//test("pointTest2")    { check(AnalysisTest.pointTest2) }
//test("update")        { check(AnalysisTest.update("foo", 42)) }
  test("update2")       { check(AnalysisTest.update2) }

}
