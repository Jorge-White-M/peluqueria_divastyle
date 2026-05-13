# Usar una imagen base de Java 17
FROM eclipse-temurin:21-jre-jammy

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado al contenedor
COPY target/*.jar app.jar

# Exponer el puerto configurado en la aplicación
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
