#spring-cloud 实践

#### 介绍
工程为主要spring-cloud相关进行相关的搭建和组件的学习，采用spring cloud
 作为开发的框架开发的微服务


#### 微服务调用方式
采用聚合模式进行调用，服务分为consumer和provider
- consumer可以调用单个或者多个provider，组合新的功能直接接口给前端调用
- provider作为原子的服务，提供服务给到consumer，但不对外提供接口;provider之间不进行调用

#### 模块划分
- hhh-api 为服务提供者提供访问的接口
- hhh-center 为注册中心
- hhh-common 工程通用模块
- hhh-consumer 服务的消费者,里面可以拓展多个子项目
- hhh-gateway 服务网关,请求转发，过滤，限流等一系列功能
- hhh-model 工程承载信息的实体类，包括dto，entity，封装的入参参数，下面有对应api的子项目
- hhh-provider 服务提供者
- hhh-stream spring-clou-streamd管道类