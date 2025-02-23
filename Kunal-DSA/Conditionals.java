import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Fibonacci fibo = new Fibonacci();
        // int res = fibo.findNthFibo(7);
        // System.out.println(res);

        // Occurence occur = new Occurence();
        // System.out.println(occur.noOfOccurenceOfNumber(1323453433, 3));

        Calculator calc = new Calculator();
        calc.calc();
       
    }
}

class Fibonacci{
    public int findNthFibo(int n){
        int a = 0;
        int b = 1;
        int t;
        for(int i = 2; i <= n ; i++){
            t = a + b;
            a = b;
            b = t;
        }
        return b;
    }
}


class Occurence{
    public int noOfOccurenceOfNumber(int num, int digit){
        int count = 0;
        while(num > 0){
            if(num%10 == digit){
                count += 1;
            }
            num = (int)(num/10);
        }
        return count;
    }
}

class Calculator{
    public void calc(){
        double res = 0;
        char ch;
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        do{
            System.out.print("Enter a operation :");
            ch = input.next().trim().charAt(0);
            
            if(ch == 'x' || ch == 'X'){
                break;
            }

            System.out.print("Enter number1: ");
            num1 = input.nextDouble();
            System.out.print("Enter number2: ");
            num2 = input.nextDouble();
            
            if(ch == '+'){
                res = num1 + num2;
            }
            else if(ch == '-'){
                res = num1 - num2;
            }
            else if(ch == '*'){
                res = num1 * num2;
            }
            else if(ch == '/'){
                res = num1 / num2;
            }
            else if(ch == '%'){
                res = num1 % num2;
            }
            else{
                System.out.println("Invalid Input");
            }

            System.out.println("Result is "+res);
        }while(ch != 'X' || ch != 'x');

        input.close();
    }
}