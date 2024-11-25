class NameClass{
    String name;
    NameClass(String str){
        name = str;
    }

    public void getName(){
        System.out.println("Name : "+name);
    }
}

public class ValueRef {
    
    public static void changeName(String str){
        str = "It's ME";
    }

    public static void changeName(NameClass obj){
        obj.name = "It is from method";
    }

    public static void changeNum(int n){
        n = 100;
    }

    public static void main(String[] args) {

        // Pass By Value
        /*
         * The Primitive datatypes are passed as Value only
         * So change in method will not affect it in main function
         */
        String name = "Babu";
        int n = 10;
        changeName(name);
        System.out.println(name);
        changeNum(n);
        System.out.println(n);

        // Pass by Reference
        /*
         * It passes the address of value to the function
         * It can be done through passing objects as the arguments to the functions
         */
        NameClass nc = new NameClass("MyName");
        nc.getName();
        changeName(nc);
        nc.getName();


    }
}
