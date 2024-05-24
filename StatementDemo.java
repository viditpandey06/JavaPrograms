import java.sql.*;
import java.util.Scanner;

public class StatementDemo {
    public static void main(String args[])
    {
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter id");
            int val1=s.nextInt();
            s.nextLine();
            System.out.println("Enter name");
            String val2=s.nextLine();
            System.out.println("Enter salary");
            int val3=s.nextInt();

            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1. driver regestered");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "system");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "system", "system");
            System.out.println("2. connection created");
            Statement stmt=con.createStatement();
            System.out.println("3. statement created");
            String s1="insert into employee3 values("+val1+","+ val2+","+ val3")";
            System.


        }
    }
    
}