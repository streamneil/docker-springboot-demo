# What

Docker是一个具有社區性的Linux容器管理工具集，它允許用户发布镜像或者使用其他开发者发布的镜像。Docker镜像本質上是一个進程的运行環境。在這篇guide中，我們将构建一个運行Spring Boot应用程序的鏡像。

# mvn配置

```$xml
pom.xml

<properties>
   <docker.image.prefix>springio</docker.image.prefix>
</properties>
<build>
    <plugins>
        <plugin>
            <groupId>com.spotify</groupId>
            <artifactId>dockerfile-maven-plugin</artifactId>
            <version>1.3.4</version>
            <configuration>
                <repository>${docker.image.prefix}/${project.artifactId}</repository>
            </configuration>
        </plugin>
    </plugins>
</build>
```
配置了2个东西：
* image 名称
* image tag(可选)，默认latest

# 构建命令

`$ ./mvnw install dockerfile:build`

# 发布镜像到`Docker`

`$ ./mvnw dockerfile:push`

前提需要注册一个`dockerID`，使用科学上网。
