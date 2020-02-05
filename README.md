# javaAssignment

Installation

> MariaDB 
>> localhost:3306

>> user: root

>> password: toor

>> table:donations

> Note: if you change any of the above make sure to change the backend>src>main>resources>application.properties as well.

> Create a new table in mariadb using the following code:

```
CREATE TABLE IF NOT EXISTS donations (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255),
  surname varchar(255),
  amount int,
  currency varchar(255),
  PRIMARY KEY (id)
);
```

>In the main folder (javaAssignment) using the cmd type:
>> mvn clean install

>> java -jar ./backend/target/backend-0.0.1-SNAPSHOT.jar

>Open your browser and type the following url:
>>http://localhost:8080/
