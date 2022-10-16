Breweries csv reader using Spring Boot and MySQL

A breweries application using Spring Boot with the following options:

- Spring JPA and MySQL for data persistence
- OpenCsv for reading data from csv file
- Gradle for building application

To build and run the sample from a fresh clone of this repo:
Configure MySQL

- Create a database in your MySQL instance.
- Update the application.properties file in the src/main/resources folder with the URL, username and password for your MySQL instance. The table schema for the Todo objects will be created for you in the database.

Build and run the sample

- build gradlew
- start the application
- there are two endpoints:
  - /api/v1/breweries/import - to import csv file
  - /api/v1/breweries/print - to print in console data
    

