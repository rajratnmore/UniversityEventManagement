# UniversityEventManagement

# Framework and Languages used
   In this project I have used Java Languages and Spring Boot Framework and H2 database for this storage.

# Data Flow
    In this project first data flow from client to server. When first client use post API to store data into database information is stored into H2 database.

 1. Controller
    EventController class 
    StudentController class
 2. Service
    EventService class
    StudentService class
 3. Repo
    EventRepo
    StudentRepo
 4. Model
    Event
    Student
    Department

 Database desing by Entity classes with some validation on 
 age, firstname, time, date.

 # Data Structure used in project
   Actually these is List, Map database has been used in this project

# Project Summary
  This project is design for student information and Event information for managing student and Event of the University.  There are controller classes which calls service class and service classes has access to call repository classes and through repo classes we can store data into H2 database.



