public class TestJDBC {

    public static void main( String[] args ) throws Exception {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection cx = DriverManager.getConnection(
                "jdbc:derby:mabase"
                ,
                "login"
                ,
                "passwd");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM personnes" );
        while (rs.next()) {
            String nom = rs.getString("nom");
            int age = rs.getInt("age");
            System.out.println( nom + " a " + age + " ans" );
        }
        rs.close();
        st.close();
        cx.close();
    }
}
