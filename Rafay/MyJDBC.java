import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.lang.Class;


public class MyJDBC{
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String address = sc.next();
        long mobileNo = sc.nextLong();

        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(mobileNo);

        // load driver
        // mysql => com.mysql.jdbc.Driver
        // oracle => oracle.jdbc.driver.OracleDriver
        Class c = Class.forName("org.postgresql.Driver ");
        System.out.println("Class : "+c);

        // establish connection
        // connection string : getConnection(jdbc:oracle:thin:@KITEORACLE38191.kgisledu.com:orcl,"scott","tiger")
        // Connection con = DriverManager.getConnection("jdbc:postgresql://aws-0-ap-south-1.pooler.supabase.com:6543/postgres?user=postgres.lzsdeteonolemastmiyb&password=[21221@Supabase]");
        // System.out.println("Conm : "+con);
    }
}