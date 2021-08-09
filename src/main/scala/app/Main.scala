package app

import cats.effect._
import cats.implicits._
import fs2.Stream
import org.http4s.client.Client
import org.http4s.client.dsl.Http4sClientDsl
import org.http4s.client.middleware.{RequestLogger, ResponseLogger}
import org.http4s.dsl.io._
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.implicits._
import org.typelevel.log4cats.Logger
import org.typelevel.log4cats.slf4j.Slf4jLogger

import scala.concurrent.duration._

object Main extends IOApp.Simple with Http4sClientDsl[IO] {

  def run: IO[Unit] =
    EmberClientBuilder
      .default[IO]
      .build
      .map(RequestLogger(logHeaders = true, logBody = false))
      .map(ResponseLogger(logHeaders = true, logBody = false))
      .flatMap(start)
      .useForever

  private def start(client: Client[IO]): Resource[IO, Unit] =
    Resource.eval(Slf4jLogger.create[IO].flatTap(_.info("Started")).flatMap(repeatRequest(client)))

  def repeatRequest(client: Client[IO])(logger: Logger[IO]): IO[Unit] = {
    val frequency = 5.seconds
    val io        =
      client
        .expect[String](GET(uri"http://173.212.192.245/http4s-4935/small.txt"))
        .attemptTap {
          case Left(error) => logger.error(error)(s"Request failed")
          case _           => IO.unit
        }
    Stream.retry(io, frequency, identity, 3).repeat.metered(frequency).compile.drain
  }
}
