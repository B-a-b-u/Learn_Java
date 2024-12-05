# JDBC
* JDBC stands for **Java Database Connectivity**.
* It is a set of API used to connect with database.
* There are 5 steps to connect with database through java.

---

### Archieves in Java
JAR => Java Archieve => It is a compressed collection of .class byte codes
EAR
WAR

---

### 5 Steps
1. Load the Driver
2. Connection establishment
3. Create Statement
4. Execute the Query
5. Release the Resources

---

### Types of Drives (4)
1. Type1 Driver (also called **JDBC ODBC bridge driver**)
2. Type2 Driver (also called **Native driver**)
3. Type3 Driver (also called **MiddleWare Driver**)
4. Type4 Driver (also called **100% Java Driver**)

---

### Default ID and password
* The default user id and password of **MYSQL** is **root**.
* The Default user id and password of **Oracle (Orcl)** is **scott and tiger**.
* The default host string of oracle is **orcl**

* SQL is 90% database independent

## MYSQL
* Create Database
```
create database <dbname>;
```

* Use database
```
use <db name>;
```

* Create table
```
create table student(id int primary key, name varchar(20) not null, address varchar(30) mobile_no bigint);
```

* Select query
```
select * from student;
```

## Connecting jdbc
1. Load jdbc
    * for type1 driver
    ```
     ms access : sun.jdbc.odbc.JdbcOdbcDriver
    ```
    * for type4
    ```
    com.mysql.jdbc.Driver
    ```
    * for mysql5
    ```
    com.mysql.jdbc.Driver
    ```
    * for mysql 8
    ```
    com.mysql.oracle.odbc.Driver
    ```
```
Class.forName("com.mysql.jdbc.Driver")

```
2. connection establishement
```
DriverManager.getConnection("jdbc:mysql://localhost:3306/kgisl","root","root");
```

3. Create prepared Statement
```
PreparedStatement ps = con.prepareStatement("SQL Query")
PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)")
```
? => placeholder
```
ps.setInt(1,id); // setting values to placeholder ?
```

4. Execute the query
```
int ch = ps.executeUpdate()
```

5. Release the resource
```
con.close()
ps.close()
```

# Ways to import class

 1. Import a specific class like java.util.Scanner;
 2. Import whole library => java.util.*;
    * This import is not like include
    * It does not include even a single line from header file to our own code
 3. Use fully qualified name => java.util.Scanner  sc = new java.util.Scanner(System.in)
 4. Static Import
    * It is worst method for production but for Interview
    * It never includes a class but imports the static content of the class 
    * For Static methods, it neeeds to called with Classname Math.min()
    * But using static method
    ```
    import static java.lang.Math.max;
    or
    import static java.lang.Math.*;
    ```

---

## Difference between include and import

 * include => 
    *  all code in header files with get included in our program 
    *  so it makes our own code heavier
 * import =>  it just refers to the library

---
## Ways to get input from console
1. Command line args
2. Scanner
3. Input buffer
3. Console class
---