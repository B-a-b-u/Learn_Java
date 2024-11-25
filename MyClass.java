// Defining Class
class Human{
    // attributes
    // public String name;
    // public int age;

    // Access Specifiers
/*
 * Default is PUBLIC
 * Type:
 *  public => can be used in any class => by instantiating the object
 *  private => only the defined class can use it, not even by instantiating
 *  protected => only defined and inherited class can use it, not even by instantiating
 */

    private String name;
    private int age;

    // Static 
    // => Value will be same for all the instances
    // => NO Multiple copy is created
    // => Access only with Class name

    private static int count = 0;

    // Constructor
    // constructor with arguments
    Human(String name, int age){
        // this.name => refers to attribute in class
        // name => parameter to constructor
        this.name = name;
        this.age = age;
        count += 1;
    }

    // behaviour
    public void walk(){
        // this references to current object address like self in python
        System.out.println(this.name+" is walking.");
    }

    // Getter => returns the private(not only private) data value
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    // setter => set the value of private(not only private) data
    public void setAge(int age){
        this.age = age;
    }

    public int getCount(){
        return count;
    }

}


// Inheritance
class MetaHuman extends  Human{
    private int skillLevel;
    public MetaHuman(String name, int age, int level) {
        super(name, age); // super => keyword used to call super class methods
        this.skillLevel = level;
    }    

    public void getDetails(){
        System.out.println("NAme :"+super.getName());
        System.out.println("AGE :"+super.getAge());
        System.out.println("Level :"+this.skillLevel);


    }

    public void getLevel(){
        System.out.println("Level is "+this.skillLevel);
    }
}



public class MyClass{
    public static void main(String args[]){

        // Creating Object
        Human human1 = new Human("Babu",21);

        // access attributes
        // human.name = "Baburaj";
        // human.age = 21;

        // Invoke Behaviour
        human1.walk();

        System.out.println("Hello World");

        Human human2 = new Human("Eren",19);
        System.out.println(human2.getName());
        System.out.println(human2.getAge());
        System.out.println(human1.getCount()); // 2
        System.out.println(human2.getCount()); // 2

        MetaHuman mh1 = new MetaHuman("SuperMan",31,2);
        // mh1.getName();
        mh1.getDetails();

        // Car 
        Car unova1 = new Car("Unova","Black");
        unova1.drive();
        unova1.getCarDetails();
        System.out.println("Car Type : "+unova1.getCarType());
        unova1.getMaxSpeed();

        RaceCar rc1 = new RaceCar("Ford", "Black");
        rc1.getCarDetails();
        rc1.drive();
        System.out.println("Car Type : "+rc1.getCarType());
        rc1.getMaxSpeed();

        Car audi = new Car("Audi","Red");
        audi.drive();
        audi.getCarDetails();
        System.out.println("Car Type : "+audi.getCarType());
        audi.getMaxSpeed();

        rc1.getMaxSpeed();





    }
}


// Task
// Define car 
// brand name
// color
// behaviour : drive
// speed = (100km/h)

// define race car
// all property of car
// speed = 200km/h

class Car{
    private String brand;
    private String color;
    protected  String carType;
    private  static int maxSpeed;

    Car(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.carType = "Normal";
        Car.maxSpeed = 100;
    }

    public void  getCarDetails(){
        System.out.println("Car Brand :"+this.brand);
        System.out.println("Car Color :"+this.color);
    }

    public void drive(){
        System.out.println(this.brand+" is in drive");
    }

    public String getCarType(){
        return this.carType;
    }

    public void getMaxSpeed(){
        System.out.println("Car Max Speed :"+maxSpeed);
    }
}


class RaceCar extends Car{
    private static int maxSpeed;
    RaceCar(String brand, String color){
        super(brand, color);
        super.carType = "Racing";
        maxSpeed = 200;
    }

   public void getMaxSpeed(){
        System.out.println("Car Max Speed :"+maxSpeed);
    }
}

// Abstract Class
// It only have abstract behaviour and do not have any code within that behaviour
// The class extending the abstract class can override the abstract methods
// Cannot be instantiated

// abstract  class Animal{
//     public void sound() {
//     }
// }

// class Dog extends Animal{
//     @Override
//     public void sound(){
//         System.out.println("Baw Baw!!");
//     }
// }


// // Interface
// Complete abstraction
// interface Trainable{
//     public  void Trainable();
// }