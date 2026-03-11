package encapsulation;

public class Team {
    private String name;
    private String baseLocation;
    private String coachName;
    private final encapsulation.Player[] group = new Player[18];
    private Player captain;

    int i,j;
    int numberOfPlayers=0;
    int fieldedCount=0;
    int benchCount = 0;
    Player[] fieldedPlayers = new Player[11];
    Player[] outfieldedPlayers = new Player[7];
    public Team(String name,String baseLocation,String coachName){
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
    }
    public void addPlayer(Player player) {
        if (numberOfPlayers<18) group[numberOfPlayers++] = player;}

    public void removePlayer(Player player){
        for(i=0;i<group.length;i++){
            if(group[i]==player) {
                for(j=i;j< group.length-1;j++) {
                    group[j] = group[j + 1];
                }
                group[group.length-1] = null;
                break;
            }
        }
    }

    public void substitute(Player substitute, Player starter ){
        for (i=0;i<fieldedPlayers.length;i++){
            if(fieldedPlayers[i]==starter)fieldedPlayers[i] = substitute; break;

        }
        for (i=0;i<outfieldedPlayers.length;i++){
            if(outfieldedPlayers[i]==substitute)outfieldedPlayers[i] = starter;break;
        }
    }

    public void setCaptain(Player captain){
        this.captain = captain;
    }

    public Player[] getFieldedPlayers(Player player){
        if (fieldedCount<=10 && player != null) {fieldedPlayers[fieldedCount++] = player;}
        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers(Player player){
        if (benchCount<=6) {outfieldedPlayers[benchCount++] = player;}
        return outfieldedPlayers;
    }

}
