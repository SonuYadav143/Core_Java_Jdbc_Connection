import java.sql.*;
public class Table {
    public static void main(String[] args) {
       String JDBC_URL = "jdbc:mysql://localhost:3306/school";
       String USERNAME = "root";
       String PASSWORD = "Sonu@143";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("select * from it");

            while (rst.next())
                System.out.println(rst.getString(1) + " "+rst.getString(2)+ " "+rst.getString(3)+ " "+rst.getString(4)  + " "+rst.getString(5)   + " "+rst.getString(6));
            con.close();

        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
