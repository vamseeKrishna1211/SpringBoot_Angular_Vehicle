# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Springboot_vehicle application using Spring Boot, Mysql, JPA and Hibernate.


## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial.git
```

**2. Create Mysql database**
```bash
create database vehicle ```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.



## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/vehicles/listall    
    POST /api/vehicles/saveall (or)
 /api/vehicles/saveall    



#the backend was developed using SpringBoot, and named as springboot_vehicle.
we can call directly using `http://localhost:8080/listall`


#Click on batch submit, REST service will call method having post request /api/vehicles/saveall
if checkbox was checked then it will call /api/vehicles/partial



#DATABASE TABLE QUERIES:
  

CREATE TABLE vehicle (
    vehicle_id int NOT NULL AUTO_INCREMENT,
    vehicle_name varchar(40) NOT NULL,
    vehicle_type varchar(40),
    color varchar(40),
    vehicle_model varchar(40),
    PRIMARY KEY (vehicle_id)
);




INSERT INTO vehicle (vehicle_name, vehicle_type, color, vehicle_model)
VALUES ('Ford', 'Focus', 'Red', 't-365');




INSERT INTO vehicle (vehicle_name, vehicle_type, color, vehicle_model)
VALUES ('Toyota', 'SUV', 'Green', 't-455');


