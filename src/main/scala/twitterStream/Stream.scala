package twitterStream

import twitter4j._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.concurrent.TimeoutException
import scala.util.Success
import scala.util.Failure
import utils._

object Stream extends App {
  val twitterStream = new TwitterStreamFactory(Util.config).getInstance
  twitterStream.addListener(Util.simpleStatusListener)
  twitterStream.sample
  //twitterStream.cleanUp
  //twitterStream.shutdown
}




