package encapsulation;

public class Player{
    private String name;
    private int number;
    private String position;
    private boolean isFielded;
    private Player player; // TODO Player tem um time, não um player

    //TODO aqui, se você não passar o time e não colocar um setter, o atributo time sempre ficará nulo.
    public Player(String name,int number,String position,boolean isFielded){
        this.name =name;
        this.number = number;
        this.position = position;
        this.isFielded= isFielded;
    }

    public String getStateAsString(boolean fielded){
        if (fielded) return "Em campo";
        else return "Banco";
        //TODO Aqui você deve criar uma String para representar o estado do objeto. Por exemplo: Name = "João", Number = 10 ...
    }

    public Player getName() {
        return player;
    }

    // TODO você deve adicionar métodos getter para os atributos do objeto

    // TODO você pode adicionar métodos setter para os atributos que podem ser alterados no estado do objeto


}