package encapsulation;

public class Player{
    private String name;
    private int number;
    private String position;
    private boolean isFielded;
    private Player player;

    public Player(String name,int number,String position,boolean isFielded){
        this.name =name;
        this.number = number;
        this.position = position;
        this.isFielded= isFielded;
    }

    public String getStateAsString(boolean fielded){
        if (fielded) return "Em campo";
        else return "Banco";
    }

    public Player getName() {
        return player;
    }

}