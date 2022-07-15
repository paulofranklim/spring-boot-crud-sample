# spring-boot-crud-sample

This project was used with the purpose of presenting the Spring Boot framework in an internal training on REST API with co-workers.

We talked about the difference between the development model of monolith software and microservices, concepts of scalability, availability, independence between services and the use of containers in the current development scenario.

We had an introduction to some Spring universe concepts such as: Spring MVC, Spring Boot, Spring Cloud, Spring Security, Spring Datra and etc...

Together we created a simple CRUD to demonstrate operations with HTTP requests and their different verbs (GET, POST, PUT and DELETE). The management of entities through the Hibernate framework. We generate the base of a maven project at https://start.spring.io where we add the initial dependencies.

Project tools used:  
-Java 11  
-Spring Boot 2.7.1  
-Spring Web  
-Spring Data JPA  
-H2 Database  
-Eclipse IDE  
-Postman  
  
Endpoints:  
http://localhost:8080/h2-console (Memory Database Console Administration, user: sa and the password is empty)  
  
http://localhost:8080/user/1 (Return an user by id, Method HTTP Get)  
Example:  
&nbsp;&nbsp;{  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id": 1,  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"login": "USER1",  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"name": "Nombre del Nuevo Usuario",  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"calculated": null  
&nbsp;&nbsp;}  
  
http://localhost:8080/user (Send JSON request to save an user, Methid HTTP Post)  
Example:  
&nbsp;&nbsp;{  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"login":"USER1",  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"name":"Nombre del Nuevo Usuario"  
&nbsp;&nbsp;}  
