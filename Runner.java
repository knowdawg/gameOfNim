public class Runner {
    public static void main(String[] args)
    {
      Board board = new Board();
      board.populate();
      
      Game nim = new Game(board); 
      nim.play();
      
    }
}
