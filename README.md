## 系统简介
翻新之前的二次供水项目

## 开发环境
. jdk1.8+
. maven3.5+
. eclipse
. 

## 技术栈
spring boot2.0
mybatis-plus
restful
swagger2
druid
pagehelper
webservice


## 开发准备
eclispe需要集成lombok环境 [https://blog.csdn.net/dorothy1224/article/details/79280591/](https://blog.csdn.net/dorothy1224/article/details/79280591/ "eclipse如何集成lombok")





## 相关技术学习传送门

**Mybatis-Plus：**

[https://mp.baomidou.com/](https://mp.baomidou.com/ "https://mp.baomidou.com/")

**Swagger2**

[https://blog.csdn.net/u014231523/article/details/76522486](https://blog.csdn.net/u014231523/article/details/76522486 "https://blog.csdn.net/u014231523/article/details/76522486")

**Spring Boot**
[https://www.breakyizhan.com/springboot/3028.html](https://www.breakyizhan.com/springboot/3028.html "https://www.breakyizhan.com/springboot/3028.html")

**lombok**

[https://www.cnblogs.com/heyonggang/p/8638374.html](https://www.cnblogs.com/heyonggang/p/8638374.html "https://www.cnblogs.com/heyonggang/p/8638374.html")

**Hutool工具类**
[https://hutool.cn/docs/](https://hutool.cn/docs/ "https://hutool.cn/docs/")



## 关键说明

- 在自己的业务处理上多写**注释！注释！注释！**
- 一般情况下，不直接返回给前端entity、  在指定的包下编写vo类返回。
- 采用统一日志记录用户行为，在controller的关键方法加@SYS_LOG注解，
- 接口返回数据用统一封装类：“R”，
- 能尽量用Hutools的类就不要用自定义的utils工具方法，
- 分页使用pagehelper类
- 尽量维持原有逻辑与返回的必要结果不改变（无用字段就不要返回了）。
- 非强相关的业务，并且影响到查询性能的方法，请调用@Async注解，实现异步。
- 系统配置了多数据源策略，在需要变更数据库查询的dao方法上，加上对应注解
- 定时任务在指定的timer类进行编写，基于cron表达式来实现。
- 




## 
