#ribbon介绍

###Ribbon简介
Ribbon是Netflix发布的云中间层服务开源项目，其主要功能是提供客户端实现负载均衡算法。
Ribbon客户端组件提供一系列完善的配置项如连接超时，重试等。
简单的说，Ribbon是一个客户端负载均衡器，我们可以在配置文件中Load Balancer后面的所有机器，
Ribbon会自动的帮助你基于某种规则（如简单轮询，随机连接等）去连接这些机器，我们也很容易使用Ribbon实现自定义的负载均衡算法。

###eureka和ribbon共用的架构图
![](https://img-blog.csdn.net/20180401083228491)
Ribbon工作时分为两步：第一步选择Eureka Server，它优先选择在同一个Zone且负载较少的Server；第二步再根据用户指定的策略，再从Server取到的服务注册列表中选择一个地址。其中Ribbon提供了很多策略，例如轮询round robin、随机Random、根据响应时间加权等

####源码阅读参考
https://www.cnblogs.com/longyunfei/p/7329398.html
 