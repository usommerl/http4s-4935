# http4s-4935 #

```
2021-08-09T01:03:23.254+0200                                  app.Main  [ INFO  ]  Started
2021-08-09T01:03:28.697+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:29.050+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Sun, 08 Aug 2021 23:03:49 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=100, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T01:03:33.696+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:33.745+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Sun, 08 Aug 2021 23:03:54 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=99, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T01:03:38.693+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:38.709+0200                                  app.Main  [ ERROR ]  Request failed
org.http4s.ember.core.EmptyStreamError: Cannot Parse Empty Stream
	at org.http4s.ember.core.Parser$MessageP$.$anonfun$parseMessage$1(Parser.scala:48)
	at main$ @ app.Main$.main(Main.scala:18)
2021-08-09T01:03:43.712+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:43.806+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Sun, 08 Aug 2021 23:04:04 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=100, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T01:03:43.809+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:43.858+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Sun, 08 Aug 2021 23:04:04 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=99, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T01:03:48.693+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:48.741+0200      o.h.client.middleware.ResponseLogger  [ INFO  ]  HTTP/1.1 200 OK Headers(Date: Sun, 08 Aug 2021 23:04:09 GMT, Server: Apache/2.4.25 (Debian), Last-Modified: Sun, 08 Aug 2021 21:58:57 GMT, ETag: "c-5c91360229b57", Accept-Ranges: bytes, Content-Length: 12, Keep-Alive: timeout=5, max=98, Connection: Keep-Alive, Content-Type: text/plain)
2021-08-09T01:03:53.693+0200  o.http4s.client.middleware.RequestLogger  [ INFO  ]  HTTP/1.1 GET http://173.212.192.245/http4s-4935/small.txt Headers(Accept: application/json, Accept: text/*)
2021-08-09T01:03:53.698+0200                                  app.Main  [ ERROR ]  Request failed
org.http4s.ember.core.EmptyStreamError: Cannot Parse Empty Stream
	at org.http4s.ember.core.Parser$MessageP$.$anonfun$parseMessage$1(Parser.scala:48)
	at main$ @ app.Main$.main(Main.scala:18)
```
