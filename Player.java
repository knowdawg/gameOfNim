public class Player {
    private String name;
    private int score;

    public Player(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void addToScore(int amount){
        score += amount;
    }
}
