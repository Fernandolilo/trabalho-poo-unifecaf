# Trabalho POO — UniFECAF

Projeto acadêmico desenvolvido em Java como parte dos estudos de Programação Orientada a Objetos (POO), com aplicação de conceitos de desenvolvimento backend utilizando o ecossistema Spring.

## Sobre o projeto

O objetivo deste projeto é aplicar conhecimentos de programação Java e desenvolvimento de aplicações web, explorando a organização de código, persistência de dados, validação de informações e mapeamento de objetos.

A aplicação utiliza Spring Boot para estruturar o backend e Maven para gerenciar dependências e o processo de build.

## Tecnologias utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java 17 | Linguagem de programação |
| Spring Boot | Estrutura da aplicação backend |
| Spring Data JPA | Persistência e acesso a dados |
| H2 Database | Banco de dados relacional |
| Jakarta Validation | Validação de dados |
| Lombok | Redução de código repetitivo |
| ModelMapper | Mapeamento entre objetos |
| Springdoc OpenAPI | Documentação de APIs |
| Maven | Gerenciamento de dependências e build |
| Git e GitHub | Versionamento do código |

## Estrutura do projeto

```text
trabalho-poo-unifecaf/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

*Observação: a estrutura interna de pacotes e classes pode variar conforme a implementação atual do projeto.*

## Pré-requisitos

Antes de executar a aplicação, tenha instalado:

- Java JDK 17 ou compatível com a configuração do projeto.
- Git, para clonar o repositório.
- Uma IDE Java, como IntelliJ IDEA, Eclipse ou Visual Studio Code com extensões Java.

O Maven Wrapper (`mvnw` ou `mvnw.cmd`) está disponível para executar os comandos Maven sem depender necessariamente de uma instalação global do Maven.

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/Fernandolilo/trabalho-poo-unifecaf.git
```

### 2. Entrar na pasta

```bash
cd trabalho-poo-unifecaf
```

### 3. Executar a aplicação

No Windows:

```cmd
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

### 4. Compilar e executar os testes

Windows:

```cmd
mvnw.cmd clean verify
```

Linux ou macOS:

```bash
./mvnw clean verify
```

## Documentação da API

O projeto inclui Springdoc OpenAPI para documentação dos endpoints.

Após iniciar a aplicação, tente acessar a interface Swagger UI em:

```text
http://localhost:8080/swagger-ui/index.html
```

A disponibilidade dessa URL depende da porta configurada e da inicialização correta da aplicação.

## Objetivos de aprendizagem

- Aplicar conceitos de Programação Orientada a Objetos com Java.
- Desenvolver uma aplicação backend utilizando Spring Boot.
- Trabalhar com persistência de dados por meio do Spring Data JPA.
- Validar informações de entrada.
- Organizar dependências e configurações com Maven.
- Conhecer ferramentas de documentação de APIs.
- Utilizar Git e GitHub para versionamento e compartilhamento de código.

## Autor

**Fernando da Silva**

GitHub: [@Fernandolilo](https://github.com/Fernandolilo)

## Licença

Projeto desenvolvido para fins acadêmicos e de aprendizado.
