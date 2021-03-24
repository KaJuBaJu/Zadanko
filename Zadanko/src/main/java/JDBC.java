package Zadanko;
import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/statystyki";
        String username = "root";
        String password = "";

        try {
            Connection myCon = DriverManager.getConnection(url, username, password);

            Statement myStmt = myCon.createStatement();

            ResultSet myRs = myStmt.executeQuery("select * from lebron");


            while (myRs.next()){
                System.out.println(myRs.getString("opponent") + ", " + myRs.getString("pointsscored") + ", " + myRs.getString("minutes"));
            }

        } catch(SQLException e) {
            System.out.println("Błąd");
            e.printStackTrace();
        }
    }
}
