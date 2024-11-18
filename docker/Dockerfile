# 第一阶段：构建阶段，使用 Maven 镜像
FROM maven:3.8.5-openjdk-8 AS builder
WORKDIR /app
# 将代码拷贝到容器中
COPY . .
# 使用 Maven 构建应用
RUN mvn clean package -DskipTests

# 第二阶段：运行阶段，使用轻量级的 OpenJDK 镜像
FROM openjdk:8-jre-slim
WORKDIR /app
# 从构建阶段拷贝编译后的 jar 文件
COPY --from=builder /app/target/my_java_project-1.0-SNAPSHOT-jar-with-dependencies.jar .
# 运行 Java 应用
# 运行 Java 应用
# 运行 Java 应用
CMD ["java", "-jar", "my_java_project-1.0-SNAPSHOT-jar-with-dependencies.jar.jar"]
