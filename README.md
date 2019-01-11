# springcloud-sample

* springcloud-eurka 
> 注册中心discovery
* springcloud-hello-service
> 服务提供者
* springcloud-ribbon
> 负载均衡
* springcloud-feign
> 负载均衡 feign集成ribbon
* springcloud-zuul
> 服务网关
* springcloud-config-server
> 配置中心
* springcloud-config-client
> 配置客户端
* springcloud-bus-amqp
> 消息服务总线，为提供更新配置中心，post请求：http://localhost:8882/actuator/bus-refresh，config-client会重新读取配置文件
* springcloud-zipkin
> 服务链路追踪 springcloud-ribbon->springcloud-hello-service