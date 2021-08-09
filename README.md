# http4s-4935 #

```
2021-08-09T02:44:56.054+0200                                  app.Main  [ INFO  ]  Started
2021-08-09T02:45:01.489+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: text/*)
2021-08-09T02:45:01.738+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Mon, 09 Aug 2021 00:45:22 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=100, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T02:45:06.491+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: text/*)
2021-08-09T02:45:06.549+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Mon, 09 Aug 2021 00:45:27 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=99, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T02:45:11.488+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: text/*)
2021-08-09T02:45:11.508+0200                                  app.Main  [ ERROR ]  Request failed
org.http4s.ember.core.EmptyStreamError: Cannot Parse Empty Stream
	at org.http4s.ember.core.Parser$MessageP$.$anonfun$parseMessage$1(Parser.scala:48)
	at main$ @ app.Main$.main(Main.scala:17)
```
