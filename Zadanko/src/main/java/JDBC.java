package Zadanko;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBC {

    public static Connection createConnection() {
        String url = "jdbc:mysql://localhost:3306/statystyki";
        String username = "root";
        String password = "";

        try {
            Connection myCon = DriverManager.getConnection(url, username, password);
            return myCon;
        } catch(SQLException e) {
            System.out.println("Błąd");
            e.printStackTrace();
        }
    }

    public static void addData(Connection conn, List <Statistics> stats) throws SQLException{

        conn.setAutoCommit(false);
        String sqlInsert = "INSERT INTO lebron (opponent, minutes, fg_madeattempted, fg_percentage, ft, ftpercentage, rebounds, assists, blocks, steals, fouls, turnovers, pointsscored) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
        for (Statistics stat : stats){
            stmtInsert.setString(1, stats.opponet);
            stmtInsert.setString(2, stats.minutes);
            stmtInsert.setFloat(3, stats.fgmade);
            stmtInsert.setString(4, stats.fgper);
            stmtInsert.setFloat(5, stats.freethrows);
            stmtInsert.setInt(6, stats.freethrowsPer);
            stmtInsert.setInt(7, stats.rebounds);
            stmtInsert.setInt(8, stats.assists);
            stmtInsert.setInt(9, stats.blocks);
            stmtInsert.setInt(10, stats.steals);
            stmtInsert.setInt(11, stats.fouls);
            stmtInsert.setInt(12, stats.turnovers);
            stmtInsert.setInt(13, stats.pointsscored);
        }
        stmtInsert.executeBatch();
        conn.commit();
    }

}
