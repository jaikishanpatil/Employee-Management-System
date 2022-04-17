
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
       public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","");
            return con;
        } catch (Exception e) {
            System.err.println("Connection error");
            return null;
        }
    }
    
    
}
