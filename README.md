# spring-sensor-rest-api
3rd project of [Spring -  Full course. Boot, Hibernate, Security, REST. (by Nail Alishev)] (https://swiftbook.org/courses/438)
#
###REST API Service - Get(JSON) data from sensor and store in a database.
- POST /sensors/registration -> Registers a new sensor in the system. In other words, just adds a new
sensor to the table of sensors in the database.
![Screenshot from 2022-10-03 16-57-32](https://user-images.githubusercontent.com/83831759/193571443-e75a575a-146a-4839-b531-b03eac519235.png)
- POST /measurements/add -> Adds a new measurement.
 file:///home/farkhat94/Pictures/Screenshots/Screenshot%20from%202022-10-03%2016-57-04.png
- GET /measurements -> Returns all measurements from the database.
- GET /measurements/rainyDaysCount -> Returns the number of rainy days from the database.
#
###Technoligies used
- Java 11
- Spring Web
- Spring Boot
- Spring Data JPA
- Hibernate Validator
- PostgreSQL
