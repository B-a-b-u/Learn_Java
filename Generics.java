// Generics
/*
 * It means parameterized type
 * It allows to work with different datatypes
 */

class Calculator<N>{
    private N n1;
    private N n2;
    Calculator(N n1, N n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add(){
        System.out.println("N1 : "+this.n1);
        System.out.println("N1 : "+this.n2);
        N sum = this.n1+this.n2;
        System.out.println("Add : "+sum);

    }
}

public class Generics {
    public static void main(String[] args) {
        Calculator<Integer> calci = new Calculator<Integer>(10,20 );
        calci.add();

    }
}
