import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.lang.Class;


public class MyOrclJDBC{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Class :"+c);

        // establish connection
        // connection string : getConnection(jdbc:oracle:thin:@KITEORACLE38191.kgisledu.com:orcl,"scott","tiger")
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@KITEORACLE38191.kgisledu.com:1521:orcl","scott","tiger");
        System.out.println("Conm : "+con);

        PreparedStatement ps = con.prepareStatement("insert into Student_Babu values(?,?,?,?)");

        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,address);
        ps.setLong(4,mobileNo);

        int ch = ps.executeUpdate();
        System.out.println("Rows affected : "+ch);

        con.close();
        ps.close();
    }
}