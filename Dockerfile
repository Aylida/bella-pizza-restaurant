# 1. Aşama: Maven ile projeyi paketle
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Aşama: Çalıştırma aşaması (Hata veren yeri güncelledik!)
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
