package mypackage;
import mypackage.JavaPackages;

@SuppressWarnings("unused")
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello From My class");
        JavaPackages jp = new JavaPackages();
        jp.sayHello();
    }
}
