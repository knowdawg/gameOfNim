public class Board {
    private int pieces;

    public void populate(){
        pieces = 50;
    }

    public int getNumPieces(){
        return pieces;
    }

    public void removePieces(int amount){
        pieces -= amount;
    }
}
