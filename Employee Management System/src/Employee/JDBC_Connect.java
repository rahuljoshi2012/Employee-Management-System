package Employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBC_Connect  {

    Connection c;
    Statement s;

    public JDBC_Connect(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///empManagement" ,"root" , "rahuljoshi");
            s=c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
