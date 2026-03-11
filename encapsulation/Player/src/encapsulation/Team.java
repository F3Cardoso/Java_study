package encapsulation;

//TODO sempre formate a sua classe para ter uma boa identação e formações horizontal e vertical

public class Team {
    private String name;
    private String baseLocation;
    private String coachName;
    private final Player[] group = new Player[18];
    private Player captain;

    int i, j; // TODO essas variáveis de loop devem ser declaradas dentro do próprio loop. int i = 0; i < group.lenght ...
    int numberOfPlayers = 0;
    int fieldedCount = 0;
    int benchCount = 0;

    Player[] fieldedPlayers = new Player[11];
    Player[] outfieldedPlayers = new Player[7];

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
    }

    public void addPlayer(Player player) {
        if (numberOfPlayers < 18) group[numberOfPlayers++] = player; //TODO evite colocar dois comandos na mesma linha
    }//TODO fecha chaves sempre na linha debaixo.

    public void removePlayer(Player player) {
        for (i = 0; i < group.length; i++) {
            if (group[i] == player) {
                for (j = i; j < group.length - 1; j++) {
                    group[j] = group[j + 1];
                }
                group[group.length - 1] = null;
                break;
            }
        }
    }

    public void substitute(Player substitute, Player starter) {
        //TODO você não precisa de listas adicionais para fielded e outfielded, basta mudar o estado dos objetos.
        //TODO Por exemplo substitute.toField() e starter.toOutfield(). Não deixe de fazer validações para saber se
        //TODO essas mudanças são possíveis.
        for (i = 0; i < fieldedPlayers.length; i++) {
            if (fieldedPlayers[i] == starter) fieldedPlayers[i] = substitute;
            break;

        }
        for (i = 0; i < outfieldedPlayers.length; i++) {
            if (outfieldedPlayers[i] == substitute) outfieldedPlayers[i] = starter;
            break;
        }
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    public Player[] getFieldedPlayers(Player player) {
        //TODO basta percorrer a lista de jogadores pegando apenas aqueles que são fielded (player.isFielded())
        if (fieldedCount <= 10 && player != null) {
            fieldedPlayers[fieldedCount++] = player;
        }
        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers(Player player) {
        //TODO idem
        if (benchCount <= 6) {
            outfieldedPlayers[benchCount++] = player;
        }
        return outfieldedPlayers;
    }

}
