import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestJDBC {

    public static void main( String[] args ) throws Exception {
        Connection cx = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres"
                ,
                "postgres"
                ,
                "12345");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM students" );
        while (rs.next()) {
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            int age = rs.getInt("age");
            System.out.println( firstname + " " + lastname + " a " + age + " ans" );
        }
        rs.close();
        st.close();
        cx.close();
    }
}
