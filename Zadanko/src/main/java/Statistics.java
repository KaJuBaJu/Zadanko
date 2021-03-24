public class Statistics {
    public String opponent;
    public Integer minutes;
    public String fgmade;
    public String fgper;
    public String freeThrows;
    public String freeThrowsPer;
    public Integer rebounds;
    public Integer assists;
    public Integer blocks;
    public Integer steals;
    public Integer fouls;
    public Integer turnovers;
    public Integer pointsScored;

    @Override
    public String toString() {
        return ""+opponent + ',' +
                minutes + ',' +
                fgmade + ',' +
                fgper + ',' +
                freeThrows + ',' +
                freeThrowsPer + ',' +
                rebounds + ',' +
                assists + ',' +
                blocks + ',' +
                steals + ',' +
                fouls + ',' +
                turnovers + ',' +
                pointsScored + '\n';
    }
}

