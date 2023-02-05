import java.sql.*;

public class TestJDBC {
    public static void main( String[] args ) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=ApplicationDistribue;integratedSecurity=true;encrypt=false;";
            Connection cx = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection Successful!");
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
        } catch (SQLException e){
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

    }
}