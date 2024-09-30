# 使用官方的 JDK 17 基础镜像
FROM amazoncorretto:17-alpine-jdk

# 设置工作目录
WORKDIR /app

# 复制构建好的 JAR 文件到容器
COPY target/mlas-server.jar /app/mlas-server.jar

# 暴露应用端口
EXPOSE 8080

# 运行 JAR 文件
ENTRYPOINT ["java", "-jar", "mlas-server.jar"]