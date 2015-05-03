package utils

import twitter4j._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.concurrent.TimeoutException
import scala.util.Success
import scala.util.Failure

object Util {
  val config = new twitter4j.conf.ConfigurationBuilder()
    .setOAuthConsumerKey("App Consumer Key")
    .setOAuthConsumerSecret("App Consumer Sercet")
    .setOAuthAccessToken("Access Token")
    .setOAuthAccessTokenSecret("TOken Secret")
    .build

  def simpleStatusListener = new StatusListener() {
    def onStatus(status: Status) {
      val tweets = for {
        getTweets <- getTweets(status)
        tweet <- printTweet(getTweets)
      } yield tweet

        tweets map {tweet=>
        println(tweet)
        Thread.sleep(2000)
      }

/*      tweets onSuccess {
        case tweet => println(" hello " + tweet)
      }

      tweets onFailure {
        case ex: TimeoutException => println(" timeout" + ex.printStackTrace())
      }
*/
      /*tweets onComplete {
        case Success(tweet) => println(" hello " + tweet )
        case Failure(ex:Exception) => println(" timeout" + ex.printStackTrace())
      }*/

    }
    def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice) {}
    def onTrackLimitationNotice(numberOfLimitedStatuses: Int) {}
    def onException(ex: Exception) { ex.printStackTrace }
    def onScrubGeo(arg0: Long, arg1: Long) {}
    def onStallWarning(warning: StallWarning) {}
  }

  def printTweet(tweet: String): Future[String] = {
    Future("tweet is = " + tweet)
  }

  def getTweets(status:Status) :Future[String]={
    Future(status.getText)
  }
}
