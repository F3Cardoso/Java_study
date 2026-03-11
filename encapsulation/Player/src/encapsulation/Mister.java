package encapsulation;
import encapsulation.Player;
import encapsulation.Team;

//TODO mantenha a identação nas classes
public class Mister {
    void main(){

    int i;
    Player[] group = new Player[6];
    Player fezin = new Player("Fezin",10,"CAM",true);
    Team club = new Team("Baile De Muinique","Alemanha","Lanchelotti");
    Player coppola = new Player("Coppola",9,"ST",false);
    Player pasolini = new Player("Pasolini",11,"LW",true);

    club.addPlayer(fezin);
    club.getFieldedPlayers(fezin);
    club.setCaptain(fezin);
    //TODO não coloque o for todo na mesma linha.
    for(i=0;i<club.fieldedPlayers.length;i++){System.out.println(club.fieldedPlayers[i].getName());}
    club.addPlayer(coppola);
    club.getOutfieldedPlayers(coppola);

    club.addPlayer(pasolini);
    club.getFieldedPlayers(pasolini);
    for(i=0;i<club.fieldedPlayers.length;i++){System.out.println(club.fieldedPlayers[i].getName());}
    club.substitute(coppola,pasolini);
    for(i=0;i<club.fieldedPlayers.length;i++){System.out.println(club.fieldedPlayers[i].getName());}




    }




}
