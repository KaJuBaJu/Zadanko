public class Statistics {
    public String opponent = "";
    public String minutes = "";
    public String fgmade = "";
    public String fgper = "";
    public String freethrows = "";
    public String freethrowsPer = "";
    public String rebounds = "";
    public String assists = "";
    public String blocks = "";
    public String steals = "";
    public String fouls = "";
    public String turnovers = "";
    public String pointsScored = "";

    @Override
    public String toString() {
        return ""+opponent + ',' +
                minutes + ',' +
                fgmade + ',' +
                fgper + ',' +
                freethrows + ',' +
                freethrowsPer + ',' +
                rebounds + ',' +
                assists + ',' +
                blocks + ',' +
                steals + ',' +
                fouls + ',' +
                turnovers + ',' +
                pointsScored + '\n';
    }
}
