package mycalc;

import mycalc.Calculator;

public class CalculatorUI {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addition(10.0, 20));
        System.out.println(calc.subtraction(10, 20));
        System.out.println(calc.multiply(10, 20));
        System.out.println(calc.divide(100.9, 20));

    }
}
