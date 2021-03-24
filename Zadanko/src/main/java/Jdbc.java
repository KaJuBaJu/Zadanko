import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class Jdbc {
    private final static String url = "jdbc:mysql://localhost:3306/staty";
    private final static String username = "root";
    private final static String password = "";
    private static Connection myCon;


    public static Connection createConnection() {
        try {
            myCon = DriverManager.getConnection(url, username, password);
            return myCon;
        } catch (SQLException e) {
            System.out.println("Błąd");
            e.printStackTrace();
            return myCon;
        }
    }

    public static void addData(Connection conn, List<Statistics> stats) throws SQLException {
        conn.setAutoCommit(false);
        String sqlInsert = "INSERT INTO lebron (opponent, minutes, fg_madeattempted, fg_percentage, ft, ftpercentage, rebounds, assists, blocks, steals, fouls, turnovers, pointsscored, added_at) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
        for (Statistics stat : stats) {
            stmtInsert.setString(1, stat.opponent);
            stmtInsert.setInt(2, stat.minutes);
            stmtInsert.setString(3, stat.fgmade);
            stmtInsert.setString(4, stat.fgper);
            stmtInsert.setString(5, stat.freeThrows);
            stmtInsert.setString(6, stat.freeThrowsPer);
            stmtInsert.setInt(7, stat.rebounds);
            stmtInsert.setInt(8, stat.assists);
            stmtInsert.setInt(9, stat.blocks);
            stmtInsert.setInt(10, stat.steals);
            stmtInsert.setInt(11, stat.fouls);
            stmtInsert.setInt(12, stat.turnovers);
            stmtInsert.setInt(13, stat.pointsScored);
            stmtInsert.setTimestamp(14, Timestamp.valueOf(LocalDateTime.now()));
            stmtInsert.addBatch();
        }
        stmtInsert.executeBatch();
        conn.commit();
    }

}
