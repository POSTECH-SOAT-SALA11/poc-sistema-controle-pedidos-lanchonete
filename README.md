# Sistema de Controle de Pedidos para Lanchonete

Este é um sistema de controle de pedidos para uma lanchonete, desenvolvido como parte de um desafio acadêmico de final de semestre. O sistema visa proporcionar uma experiência eficiente para clientes e funcionários, permitindo a realização de pedidos de forma automatizada e o acompanhamento do progresso dos pedidos em tempo real.

## Funcionalidades Principais

- **Geração de Usuário**: através da rota localhost:8080/clientes, podemos inserir um novo usuário no sistema. 

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.5
- Docker
- Banco de Dados (PostgreSQL)

## Estrutura do Projeto

O projeto segue os princípios de Domain-Driven Design (DDD) e arquitetura hexagonal, com as seguintes camadas:

- **Camada de Aplicação**: Contém os casos de uso e interfaces de aplicação.

- **Camada de Domínio**: Contém as entidades, objetos de valor, repositórios e serviços de domínio.

- **Camada de Infraestrutura**: Contém as implementações de infraestrutura, como persistência em banco de dados e comunicação com APIs externas.

## Documentação do Sistema

A documentação do sistema, incluindo o Event Storming e os diagramas de DDD, está disponível na pasta `/docs`.

## Execução do Projeto

Para executar o projeto localmente, siga estas etapas:

1. Clone o repositório.
2. Navegue até a pasta do projeto de banco de dados.
3. Execute o comando `docker-compose up` para iniciar o ambiente Docker com Banco de Dados.
4. Acesse o banco de dados através da URL `jdbc:postgresql://localhost:5432/lanchonete_db`, com o usuário `lanchonete_user` e a senha `lanchonete_password`.
5. Navegue até a pasta do projeto de aplicação.
6. Execute o comando `docker build -t sistema-controle-pedidos-lanchonete-app-imagem .` para gerar a imagem da aplicação.
7. Execute o comando `docker run -d -p 8080:8080 --name sistema-controle-pedidos-lanchonete-app-container sistema-controles-lanchonete-imagem` para iniciar o ambiente Docker com aplicação Java.
8. Divirta-se :D

## Autores

- Hennan Cesar Alves Gadelha de Freitas
(hennangadelhafreitas@gmail.com)

- Adinelson da Silva Bruhmuller Júnior
(adinelsonsbruhmuller@gmail.com)

- RAUL DE SOUZA
(dev.raulsouza@outlook.com)

- Raphael Soares Teodoro
(raphael.s.teodoro@outlook.com)