# String Handling

1. String
2. StringBuffer
3. StringBuilder -> jdk 1.5
4. StringTokenizer
5. StringJoiner -> jdk 1.8

## String methods
1. length() => return 
2. charAt([index])
3. indexOf([character])
4. lastIndexOf([character])

### To get what are the methods and attributes inside a class

```
javap Classname
```
* The above is the java profile (javap) command used to get all methods inside a class
* **But we must provide fully qualified name of the class** like java.util.Scanner
**Eg:**
```
javap java.lang.String
```

| Primitive Datatype | Wrapper Class -> 1.5|
|---|---|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|
|boolean|Boolean|
|char|Character|

### Which class is the Parent Class of the java?
* **Object** class is the parent class of the java
* This class is parent class for every class in java
* If class do not have any parent, then also it has parent which is Object

### Can we access private members from outside the class
* By using **Reflection API** which can used to access private members of the class
```
javap java.lang.reflect.Method
```

## Difference
### Difference between replace and replaceAll
```
String str = "Kgisl Coimbatore";
System.out.println(str.replace("kgisl", "KGISL")); // KGISL Coimbatore
System.out.println(str.replaceAll("Coimbatore","Tamil Nadu")); // KGISL TN
```
* replaceAll => supports regular expression
* replace => do not support regular expression

```
System.out.println(replaceAll("[a-z]" , "*")); // KGISL T**** N***
```

|String | String Buffer | String Builder|
|---|---|---|
|String is immutable|String buffer is mutable| String builder is mutable|
|Memory object cannot be changed|Memory object can be changed|Memory object can be changed|
|String is Asynchronous|Synchronous|Asynchronous|
|Not Thread safe| Thread Safe | Not Thread Safe |
|Fast| Slow | Fast |

**Synchronous** => when one person is inside, then all other have to wait until that person finishes its job
**Asynchronous** => do not follow the one by one order

```
String str = "KGISL";
System.out.println(str); // KGISL
str.concat(" Coimbatore"); 
System.out.println(str); // KGISL
```
* The concat creates new memory KGISL Coimbatore
* but str only points to KGISL its reference is never changed
* so the value in str is not changed

```
StringBuffer str = "KGISL";
System.out.println(str); // KGISL
str.append(" Coimbatore"); 
System.out.println(str); // KGISL
```
* The str.append() creates new memory KGISL Coimbatore, and changes the str's reference to this new memory
* Then 

# Phases of Compiler
1. Lexical analyzer => buffering, tokenizing
2. Syntax Analyzer
3. Semantic Analyzer
4. Intermediate Code Generation
5. Code Optimization
6. Code Generation


# Books
* A Complete Reference => Herber Schildt
* Khalid Mughal => for OCJP
* Kathy Sierra 

# Reserved Words of OS (22)
* Os is case insensitive
    * con
    * prn
    * nul
    * aux
    * com1
    * com2
    * com3
    * com4
    * com5
    * com6
    * com7
    * com8
    * com9
    * LPT 1-9
* We cannot use this words as file name in java
* Because the file name should be same as public class name
* So it uses reserved word for .java as well as .class

# Question
* Garbage collection types and work
* Why compiler never compiles commands?
    * The compiler on lexical analyzing phase, when tokenizing, if it encounters // , /* */, /** */, then it removes it from the buffer of compiler
* What is parallel sort