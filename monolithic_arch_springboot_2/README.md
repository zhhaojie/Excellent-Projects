# Fenix's BookStore后端：以单体架构实现
## 运行程序

> ```bash
> $ docker run -d -p 8080:8080 --name bookstore icyfenix/bookstore:monolithic 
> ```
>
> 然后在浏览器访问：[http://localhost:8080](http://localhost:8080)，系统预置了一个用户（user:icyfenix，pw:123456），也可以注册新用户来测试。
>
> 默认会使用HSQLDB的内存模式作为数据库，并在系统启动时自动初始化好了Schema，完全开箱即用。但这同时也意味着当程序运行结束时，所有的数据都将不会被保留。
>
> 如果希望使用HSQLDB的文件模式，或者其他非嵌入式的独立的数据库支持的话，也是很简单的。以常用的MySQL/MariaDB为例，程序中也已内置了MySQL的表结构初始化脚本，你可以使用环境变量“PROFILES”来激活SpringBoot中针对MySQL所提供的配置，命令如下所示：
>
> ```bash
> $ docker run -d -p 8080:8080 --name bookstore icyfenix/bookstore:monolithic -e PROFILES=mysql
> ```
>
> 此时你需要通过Docker link、Docker Compose或者直接在主机的Host文件中提供一个名为“mysql_lan”的DNS映射，使程序能顺利链接到数据库，关于数据库的更多配置，可参考源码中的[application-mysql.yml](https://github.com/fenixsoft/monolithic_arch_springboot/blob/70f435911b0e0753d7e4cee27cd96304dbef786d/src/main/resources/application-mysql.yml)。


## 技术组件

Fenix's BookStore单体架构后端尽可能采用标准的技术组件进行构建，不依赖与具体的实现，包括：

- [JSR 370：Java API for RESTful Web Services 2.1](https://jcp.org/en/jsr/detail?id=370)（JAX-RS 2.1）<br/>RESTFul服务方面，采用的实现为Jersey 2，亦可替换为Apache CXF、RESTeasy、WebSphere、WebLogic等

- [JSR 330：Dependency Injection for Java 1.0](https://jcp.org/en/jsr/detail?id=330)<br/>依赖注入方面，采用的的实现为SpringBoot 2中内置的Spring Framework 5。虽然在多数场合中尽可能地使用了JSR 330的标准注解，但仍有少量地方由于Spring在对@Named、@Inject等注解的支持表现上与本身提供的注解差异，使用了Spring的私有注解。如替换成其他的CDI实现，如HK2，需要较大的改动

- [JSR 338：Java Persistence 2.2](https://jcp.org/en/jsr/detail?id=338)<br/>持久化方面，采用的实现为Spring Data JPA。可替换为Batoo JPA、EclipseLink、OpenJPA等实现，只需将使用CrudRepository所省略的代码手动补全回来即可，无需其他改动。

- [JSR 380：Bean Validation 2.0](https://jcp.org/en/jsr/detail?id=380)<br/>
  数据验证方面，采用的实现为Hibernate Validator 6，可替换为Apache BVal等其他验证框架

- [JSR 315：Java Servlet 3.0](https://jcp.org/en/jsr/detail?id=315)<br/>
  Web访问方面，采用的实现为SpringBoot 2中默认的Tomcat 9 Embed，可替换为Jetty、Undertow等其他Web服务器

有以下组件仍然依赖了非标准化的技术实现，包括：

- [JSR 375：Java EE Security API specification 1.0](https://jcp.org/en/jsr/detail?id=375)<br/>
认证/授权方面，在2017年才发布的JSR 375中仍然没有直接包含OAuth2和JWT的直接支持，因后续实现微服务架构时对比的需要，单体架构中选择了Spring Security 5作为认证服务，Spring Security OAuth 2.3作为授权服务，Spring Security JWT作为JWT令牌支持，并未采用标准的JSR 375实现，如Soteria。

- [JSR 353/367：Java API for JSON Processing/Binding](https://jcp.org/en/jsr/detail?id=353)<br/>在JSON序列化/反序列化方面，由于Spring Security OAuth的限制（使用JSON-B作为反序列化器时的结果与Jackson等有差异），采用了Spring Security OAuth默认的Jackson，并未采用标准的JSR 353/367实现，如Apache Johnzon、Eclipse Yasson等。

## 工程结构

Fenix's BookStore单体架构后端参考（并未完全遵循）了DDD的分层模式和设计原则，整体分为以下四层：

1. Resource：对应DDD中的User Interface层，负责向用户显示信息或者解释用户发出的命令。请注意，这里指的“用户”不一定是使用用户界面的人，可以是位于另一个进程或计算机的服务。由于本工程采用了MVVM前后端分离模式，这里所指的用户实际上是前端的服务消费者，所以这里以RESTFul中的核心概念”资源“（Resource）来命名。
2. Application：对应DDD中的Application层，负责定义软件本身对外暴露的能力，即软件本身可以完成哪些任务，并负责对内协调领域对象来解决问题。根据DDD的原则，应用层要尽量简单，不包含任何业务规则或者知识，而只为下一层中的领域对象协调任务，分配工作，使它们互相协作，这一点在代码上表现为Application层中一般不会存在任何的条件判断语句。在许多项目中，Application层都会被选为包裹事务（代码进入此层事务开始，退出此层事务提交或者回滚）的载体。
3. Domain：对应DDD中的Domain层，负责实现业务逻辑，即表达业务概念，处理业务状态信息以及业务规则这些行为，此层是整个项目的重点。
4. Infrastructure：对应DDD中的Infrastructure层，向其他层提供通用的技术能力，譬如持久化能力、远程服务通讯、工具集，等等。

<GitHubWrapper>
<p align="center">
    <img  src="https://raw.githubusercontent.com/fenixsoft/awesome-fenix/master/.vuepress/public/images/ddd-arch.png" >
</p>
</GitHubWrapper>
