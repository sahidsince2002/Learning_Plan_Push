import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception {
        String query = "Select description from tasks where id=2";

        String url="jdbc:postgresql://localhost:5433/task_manager_db";
        String username="postgres";
        String password="sqlroot";
        Connection con = DriverManager.getConnection(url, username, password);
        
        Statement st = con.createStatement();
        System.out.println("Connected");

        ResultSet rs = st.executeQuery(query);

       if (rs.next()) {
            String name = rs.getString("description");
            System.out.println(name);
        } else {
            System.out.println("No record found");
        }
        con.close();
                
            }
        }
