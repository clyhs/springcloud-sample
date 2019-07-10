# springcloud-sample

* springcloud-eurka 
> 注册中心discovery,8761，8672
> java -jar springcloud-eureka-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer1
* springcloud-hello-service
> 服务提供者,8001
* springcloud-ribbon
> 负载均衡，session共享存放在redis,8002
* springcloud-feign
> 负载均衡 feign集成ribbon,8003
* springcloud-zuul
> 服务网关,访问多个ribbon测试session共享,8004
* springcloud-config-server
> 配置中心,8888
* springcloud-config-client
> 配置客户端,8881
* springcloud-bus-amqp
> 消息服务总线,8882,为提供更新配置中心，post请求：http://localhost:8882/actuator/bus-refresh，springcloud-config-client会重新读取配置文件
* springcloud-zipkin
> 服务链路追踪,9411, 例子：springcloud-ribbon->springcloud-hello-service
* springcloud-hystrix-dashboard
> 断路器监控,8005,服务名service-hi,只监控单服务
> 地址：http://localhost:8005/hystrix
* springcloud-turbine-service
> 断路器聚合监控,8006,监控所有服务
> 地址：http://localhost:8006/turbine.stream
* springcloud-api-gateway,springcloud-api-gateway2
> 服务网关,8080,9090
> springcloud-api-gateway2网关调用服务service-hi(springcloud-hystrix-dashboard)
* springcloud-consul
> 注册中心consul,8500,8007
* springcloud-admin-server
> 一个管理和监控你的 Spring Boot 应用程序的应用程序,使用Spring Cloud（例如 Eureka）发现,8008
> 可以动态切换日志级别、导出日志、导出heapdump、监控各项指标 等等….
* springcloud-admin-client
> 服务提供者provider-demo,8009,注册到Eureka,同时被springcloud-admin-server监控



### 备注
* rabbitmq下载地址：http://www.rabbitmq.com/download.html
> rabbitmq需要erlang语言环境，配置ERLANG_HOME变量,端口5672
* consul下载地址：https://www.consul.io/downloads.html
> consul是golang语言开发，端口8500