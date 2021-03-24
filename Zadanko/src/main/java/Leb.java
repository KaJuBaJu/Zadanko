import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Leb {

    public static List<Statistics> matchStatistics = new ArrayList<>();

    public static void main(String[] args) throws SQLException {

        String url = "https://www.espn.com/nba/player/gamelog/_/id/1966/lebron-james";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.out.println("Nie można połączyć z " + url);
            return;
        }
        long startTime = System.nanoTime();
        for (Element row : doc.getElementsByClass("gamelog").first().getElementsByTag("tr")) {


            Elements cols = row.getElementsByTag("td");

            if (cols.size() <= 1 || row.hasClass("totals_row") || row.text().contains("Totals"))
                continue;
            try {
                String opponent = cols.get(1).getElementsByTag("a").first().attr("title").substring(7);
                String minutes = cols.get(3).text();
                String fgmade = cols.get(4).text();
                String fgper = cols.get(5).text();
                String freeThrows = cols.get(8).text();
                String freeThrowsPer = cols.get(9).text();
                String rebounds = cols.get(10).text();
                String assists = cols.get(11).text();
                String blocks = cols.get(12).text();
                String steals = cols.get(13).text();
                String fouls = cols.get(14).text();
                String turnovers = cols.get(15).text();
                String pointsScored = cols.get(16).text();

                Statistics stats = new Statistics();
                stats.opponent = opponent;
                stats.minutes = Integer.parseInt(minutes);
                stats.fgmade = fgmade;
                stats.fgper = fgper;
                stats.freeThrows = freeThrows;
                stats.freeThrowsPer = freeThrowsPer;
                stats.rebounds = Integer.parseInt(rebounds);
                stats.assists = Integer.parseInt(assists);
                stats.blocks = Integer.parseInt(blocks);
                stats.steals = Integer.parseInt(steals);
                stats.fouls = Integer.parseInt(fouls);
                stats.turnovers = Integer.parseInt(turnovers);
                stats.pointsScored = Integer.parseInt(pointsScored);

                matchStatistics.add(stats);
            } catch (NullPointerException e) {
                continue;
            }

        }
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1_000_000_000;
        System.out.println("Statystyki pobrane w: " + duration + "sekundy");
        StringBuilder content = new StringBuilder("Opponent,Minutes,FG Made-Attempted,FG Percentage,FT,FT Percentage,Rebounds,Assists,Blocks,Steals,Fouls,Turnovers,Points Scored\n");
        for (Statistics s : matchStatistics) {
            content.append(s.toString());
        }
        try {
            FileWriter myWriter = new FileWriter("lebron.csv");
            myWriter.write(content.toString());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Connection connection = Jdbc.createConnection();
        try {
            Jdbc.addData(connection, matchStatistics);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
