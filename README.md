# gerenciaCadastro
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


### BANCO DE DADOS
jdbc:mysql://localhost/my-invest
Tem que criar o banco primeiramente.


### TABELA TB_ALUNO
CREATE TABLE `TB_ALUNO` (
	`ALUNO_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `NOME_COMPLETO` VARCHAR(80) NULL DEFAULT NULL,
  `PRIMEIRO_NOME` VARCHAR(20) NULL DEFAULT NULL,
  `E_EMAIL` VARCHAR(50) NULL DEFAULT NULL,
  `SEXO` CHAR(1) NOT NULL,
	`CPF` VARCHAR(11) NULL DEFAULT NULL,
  `MATRICULA` VARCHAR(20) NULL DEFAULT NULL,
	`DATA_NASCIMENTO` DATE NULL DEFAULT NULL,
	`TELEFONE1` VARCHAR(20) NULL DEFAULT NULL,
	`TELEFONE2` VARCHAR(20) NULL DEFAULT NULL,
	PRIMARY KEY (`ALUNO_ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;


