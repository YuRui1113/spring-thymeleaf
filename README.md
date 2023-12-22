# Spring Boot中使用Thymeleaf模板引擎以及实现语言国际化

### 1、Spring MVC模板引擎Thymeleaf

Spring MVC支持多种模板引擎，包括：JSP、Thymeleaf、Groovy、FreeMarker和Jade，视图技术的选取是可插入的，主要取决于我们的配置。这里主要介绍Spring Boot中使用Thymeleaf模板引擎。
Thymelaf是一个Java模板引擎，可以处理HTML、XML、文本、JavaScript或CSS文件。与其他模板引擎不同，Thymelaf允许使用模板作为原型，这意味着它们可以被视为静态文件。
Spring Boot通过添加Thymeleaf starter依赖项来提供Thymeleaf模板引擎自动装配：
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-thymeleaf</artifactId>
  <version>3.2.0</version>
</dependency>

```
Thymeleaf还提供了对Spring Security的支持，如果要基于用户角色、权限或其他安全表达式有条件地显示内容，还有需要访问Spring Authentication对象的时候可以添加Spring Security with Thymeleaf依赖：
```
<dependency>
  <groupId>org.thymeleaf.extras</groupId>
  <artifactId>thymeleaf-extras-springsecurity6</artifactId>
  <version>3.1.2.RELEASE</version>
</dependency>
```

### 2、开发环境

当前项目使用以下开发环境：
- 操作系统：Windows 11
- JDK 17
- 数据库：PostgreSQL 15.2
- IDE：VS Code（版本1.83.1），并安装以下插件：
  1. Extension Pack for Java
  1. Spring Boot Extension Pack
