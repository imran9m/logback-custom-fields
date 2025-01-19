# Logback Custom Fields Converter Example

Run `mvn clean install` and tests execution will show spring property case is converted to uppercase in logs.

```declarative
{"@timestamp":"2025-01-18T22:22:17.120754559-05:00","@version":"1","message":"Tomcat started on port 45019 (http) with context path '/'","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","level":"INFO","level_value":20000,"springAppName":"LOGBACK-CUSTOM-FIELDS"}
4890 [main] INFO  o.s.b.w.e.tomcat.TomcatWebServer -- Tomcat started on port 45019 (http) with context path '/' LOGBACK-CUSTOM-FIELDS
```