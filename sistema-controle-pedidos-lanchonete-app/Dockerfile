# Use a imagem base do OpenJDK 21
FROM openjdk:21

# Copie o arquivo JAR da sua aplicação para o contêiner
COPY target/sistema-controle-pedidos-lanchonete-app-0.0.1-SNAPSHOT.jar /app/sistema-controle-pedidos-lanchonete-app-0.0.1-SNAPSHOT.jar

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "sistema-controle-pedidos-lanchonete-app-0.0.1-SNAPSHOT.jar"]
