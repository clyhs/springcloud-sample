# springcloud-sample

* springcloud-eurka 
> 注册中心discovery,8761
* springcloud-hello-service
> 服务提供者,8001
* springcloud-ribbon
> 负载均衡,8002
* springcloud-feign
> 负载均衡 feign集成ribbon,8003
* springcloud-zuul
> 服务网关,8004
* springcloud-config-server
> 配置中心,8888
* springcloud-config-client
> 配置客户端,8881
* springcloud-bus-amqp
> 消息服务总线，8882,为提供更新配置中心，post请求：http://localhost:8882/actuator/bus-refresh，config-client会重新读取配置文件
* springcloud-zipkin
> 服务链路追踪,9411, 例子：springcloud-ribbon->springcloud-hello-service