# nappyzap-vehicle

This is an start up project for creating JPA based restful (json) web services.

You can follow the following steps to run & test it, and then you can build your services on top of it.

(1) Download the project:
    git clone git@github.com:dhewzulla/nappyzap-vehicle.git

(2) import the project with STS 

(3) Run the project.

Direct your browser:

http://localhost:8080/vehicles

You should see the vehicles in json format, which are read from the database.

Direct your browser:

http://localhost:8080/customers

You should see the customers in json format, which are read from the database.

In order to use the mysql database, you need to rename the file:
  src/main/application-mysql.properties 
to 
  src/main/application.properties 
and then you need to specify credentials how to connect to your database:

spring.datasource.url=jdbc:mysql://localhost/<your database>
spring.datasource.username=<db-user-name>
spring.datasource.password=<db-password?
