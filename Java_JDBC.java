import java.sql.*;
public class Java_JDBC {
    public static void main(String[] args) {

        String JDBC_URL = "jdbc:mysql://localhost:3306/love";
        String JDBC_USERNAME = "root";
        String JDBC_PASSWORD = "Sonu@143";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            //step number 5th get all data from database...
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString(4));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



