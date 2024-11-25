
/*
 * TASK :
 *  Create a Calculator class with 4 methods
 *  Methods : to add, to sub, to multiply, to divide
 */
class Calculator{
    
    // addition method
    public int addition(int n1, int n2){
        return n1+n2;
    }
    public double addition(double n1, double n2){
        return n1+n2;
    }



    // subtraction method
    public int subtraction(int n1, int n2){
        return n1-n2;
    }
    public double subtraction(double n1, double n2){
        return n1-n2;
    }

    

    // multiply method
    public int multiply(int n1,int n2){
        return n1*n2;
    }
    public double multiply(double n1,double n2){
        return n1*n2;
    }
    

    // divide method
    public int divide(int n1, int n2){
        return n1/n2;
    }
    public double divide(double n1, double n2){
        return n1/n2;
    }
    

}

public class CalculatorUI {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addition(10.0, 20));
        System.out.println(calc.subtraction(10, 20));
        System.out.println(calc.multiply(10, 20));
        System.out.println(calc.divide(100.9, 20));

    }
}
