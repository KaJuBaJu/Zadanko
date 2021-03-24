import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;


public class Leb {

    private static ArrayList<Statistics> matchStatistics = new ArrayList<Statistics>();

    public static void main(String[] args) {

        String url = "https://www.espn.com/nba/player/gamelog/_/id/1966/lebron-james";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.out.println("Nie można połączyć z " + url);
            return;
        }

        for (Element row : doc.getElementsByClass("gamelog").first().getElementsByTag("tr")) {

            String opponent = "";
            String minutes = "";
            String fgmade = "";
            String fgper = "";
            String freethrows = "";
            String freethrowsPer = "";
            String rebounds = "";
            String assists = "";
            String blocks = "";
            String steals = "";
            String fouls = "";
            String turnovers = "";
            String pointsScored = "";

            Elements cols = row.getElementsByTag("td");

            if (cols.size() <= 1 || cols.isEmpty() || row.hasClass("totals_row") || row.text().contains("Totals") )
                continue;

            try {
                opponent = cols.get(1).getElementsByTag("a").first().attr("title").substring(7);
                minutes = cols.get(3).text();
                fgmade = cols.get(4).text();
                fgper = cols.get(5).text();
                freethrows = cols.get(8).text();
                freethrowsPer = cols.get(9).text();
                rebounds = cols.get(10).text();
                assists = cols.get(11).text();
                blocks = cols.get(12).text();
                steals = cols.get(13).text();
                fouls = cols.get(14).text();
                turnovers = cols.get(15).text();
                pointsScored = cols.get(16).text();

                Statistics stats = new Statistics();
                stats.opponent = opponent;
                stats.minutes = minutes;
                stats.fgmade = fgmade;
                stats.fgper = fgper;
                stats.freethrows= freethrows;
                stats.freethrowsPer = freethrowsPer;
                stats.rebounds = rebounds;
                stats.assists = assists;
                stats.blocks = blocks;
                stats.steals = steals;
                stats.fouls = fouls;
                stats.turnovers = turnovers;
                stats.pointsScored = pointsScored;

                matchStatistics.add(stats);

            } catch (NullPointerException e) {
                continue;
            }
        }

        String content = "Opponent,Minutes,FG Made-Attempted,FG Precentage,FT,FT Percentage,Rebounds,Assists,Blocks,Steals,Fouls,Turnovers,Points Scored\n";
        for (Statistics s: matchStatistics) {
            content += s.toString();
        }
        try {
            FileWriter myWriter = new FileWriter("lebron.csv");
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
