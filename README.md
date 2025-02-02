<h1 align="center">🔗 Projeto web services com Spring Boot e JPA / Hibernate </h1>

<h2 align="center">Curso: Programação Orientada a Objetos com Java - Udemy </h2>

Este projeto faz parte do curso de Programação Orientada a Objetos com Java, ministrado na Udemy. O objetivo principal é criar uma aplicação web utilizando Spring Boot e JPA / Hibernate, estruturando o sistema em camadas lógicas e implementando operações básicas de CRUD (Create, Retrieve, Update, Delete). Durante o desenvolvimento, diversas técnicas serão aplicadas para configurar e manipular um banco de dados de teste (H2), povoar o banco de dados, e tratar exceções de forma eficiente.

## 📌 Objetivos
- Criar projeto Spring Boot Java 
- Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções

## Modelo de domínio utilizado no projeto

![Domain Model](Domain_Model.png)

## Instância de Domínio

![Domain Instance](Domain_Instance.png)

## Camadas Lógicas

![Camadas Lógicas](Logical_Layers.png)

## 🗂️ Project Setup
### Project created
**Checklist:**
- Spring Initializr
  - Maven
  - Java 17
  - Packing JAR
  - Dependencies: Spring Web, JPA, devtools, h2 e postgresql

### User entity and resource
**Basic entity checklist:**
- Basic attributes
- Associations (instantiate collections)
- Constructors
- Getters & Setters (collections: only get)
- hashCode & equals
- Serializable

### H2 database, test profile, JPA
**Checklist:**
- JPA & H2 dependencies
- `application.properties`
- `application-test.properties`
- Entity: JPA mapping

**Dependencies:**
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
```
**application.properties:**

```properties
spring.profiles.active=test
spring.jpa.open-in-view=true
```

**application-test.properties:**

```properties
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

JPA repository, dependency injection, database seeding
Checklist:

- UserRepository extends JPARepository<User, Long>

- Configuration class for "test" profile

- @Autowired UserRepository

- Instantiate objects in memory

- Persist objects

**Objects:**
```java
User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
```
Service layer, component registration

Order, Instant, ISO 8601 Basic new entity checklist:

- Entity

  - To many" association, lazy loading, JsonIgnore

- Repository

- Seed

- Service

- Resource

Objects:



## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- H2 Database e Postgres SQL 
- Maven
- Postman

#### 📌 Autor

👨‍💻 **Albert Silva**
