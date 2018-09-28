> 本篇利用Spring Boot来开发一个小型的Demo，主要的功能就是增、删、改、查 ， 但是通过这个项目能够快速了解java 的 Web应用是怎么样的一个开发过程，对于 从其它语言转到Java的同学来说，我觉得还是挺困难的，所有的东西都要从头学起， 但是有编程经验还是比较容易的


**一、环境介绍**

1.1、开发环境的介绍

1. 开发工具 ( IntelliJ IDEA 2018.2.3）
2. JDK版本： 1.8
3. Maven版本：Apache Maven 3.5.4 

1.2、项目依赖的包介绍

1. Spring Boot 2.0.5
2. mysql驱动
3. Thymeleaf
4. mybatis
5. devtools（热部署）， 热部署需要一些设置，不会的请参考另一篇博文，地址：  https://91helpme.com/spring-boot-h5a1e

1.3、下载项目源码
```
git clonoe https://github.com/luohuacc/Spring-Boot.git
```

1.4、创建数据表

下载完项目之后，会有一个叫 scott.sql 文件即可，导入自己的mysql服务器上即可


**二、项目环境搭建**

2.1、项目功能预览

* 列表页介绍

![image.png](https://91helpme.com/storage/article/2018/09/28/D7yyWDzidFjXTXCNWE6ZsbNO5BZhkxXSzOK1YMGh.png)

* 新增页介绍


![image.png](https://91helpme.com/storage/article/2018/09/28/8JbemtD2IJxuAky0fvMsUGgQRgpdE8cQuTQV2GWR.png)
* 详情页介绍



![image.png](https://91helpme.com/storage/article/2018/09/28/fQzVupP9agLxZsxpjiW3BWRBi6pwYwObu3OaXTrU.png)





2.2、idea导入项目

* 第一步

![image.png](https://91helpme.com/storage/article/2018/09/28/aIQ6ClPsqQYd8fZQDdWBk18vML2sScxqWHGfO1m5.png)

* 第二步，选中pom.xml即可

![image.png](https://91helpme.com/storage/article/2018/09/28/et1XQtD9ChICgKVJAddQrTL1l8ZKMnNKNICAu7UZ.png)

* 第三步，修改连接mysql的配置文件
![image.png](https://91helpme.com/storage/article/2018/09/28/scapjhy2yFHJFOcrkcX5U4pjyo8k8qqLH2fBNEQe.png)


* 第四步， 打开浏览器访问如下地址即可
![image.png](https://91helpme.com/storage/article/2018/09/28/DejNAXbbKH4INcSgZQLUpyXDlRFILK41FMsPhYs3.png)





**三、项目源码介绍**


3.1、目录结构介绍

1. .idea   idea编译器自带的，不用管）
2. .mvn   (maven 自带的，不用管)
3. src  (源码所在的目录，开发基本都是在此目录下开发，重点)
4. pom.xml（maven的描述文件，用于下载依赖包的）

3.2、项目MVC结构

1. Controller层， 在src/main/java/ 下有个controller,这个就是C层
2. View层， 在 src/main/resources/templates 下
3. Model层， 在 src/main/java 下有个mapper，这个是接口类，实际上底层对应resources/mybatis/mapper的目录


3.3、项目的配置文件

1. 在src/main/resources/application.properties ，此文件就是项目的配置文件

3.4、静态资源文件

*  在/src/main/resources/static的文件夹中

**四、总结**

具体的编码过程就不介绍了，大家自己下载源码体验就知道了， 当然demo有很多不完善的地方，因为我是php开发人员， 所以本次主要就是体验编写java web应用的感觉，记录下吧，也希望能够给了解Spring Boot 的同学一点点帮助
