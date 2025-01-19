# Logback Custom Fields Converter Example

Run `mvn clean install` and tests execution will show spring property case is converted to uppercase in logs.

```declarative
{"@timestamp":"2025-01-18T22:34:27.727725475-05:00","@version":"1","message":"Tomcat started on port 39167 (http) with context path '/'","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","level":"INFO","level_value":20000,"foo":"APPFOOPROPVALUE"}
5030 [main] INFO  o.s.b.w.e.tomcat.TomcatWebServer -- Tomcat started on port 39167 (http) with context path '/' APPFOOPROPVALUE
```