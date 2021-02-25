import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private boolean playing = false;
    
    Board board;
    Scanner sc = new Scanner(System.in);

    public Game(Board b){
        board = b;
        System.out.println("What is Player 1's name?");
        player1 = new Player(sc.nextLine());
        System.out.println("What is Player 2's name?");
        player2 = new Player(sc.nextLine());
    }

    public void play(){
        playing = true;
        while(playing == true){
            System.out.println("There are now " + board.getNumPieces() + " pieces on the board.");
            System.out.println(player1.getName() + ", How many pieces would you like to remove?");
            int p1guess = Integer.parseInt(sc.nextLine());
            if(p1guess > 0 && p1guess <= (board.getNumPieces()/2)){
                board.removePieces(p1guess);
            }else if(board.getNumPieces() == 1){
                player2.addToScore(1);
                System.out.println(player1.getName() + " has lost the game.");
                System.out.println("Player 1 score: " + player1.getScore());
                System.out.println("Player 2 score: " + player2.getScore());
                playing = false;
            }else{
                System.out.println("Invalid move, your turn has been skipped.");
            }

            System.out.println("There are now " + board.getNumPieces() + " pieces on the board.");
            System.out.println(player2.getName() + ", How many pieces would you like to remove?");
            int p2guess = Integer.parseInt(sc.nextLine());
            if(p2guess > 0 && p2guess <= (board.getNumPieces()/2)){
                board.removePieces(p2guess);
            }else if(board.getNumPieces() == 1){
                player2.addToScore(1);
                System.out.println(player1.getName() + " has lost the game.");
                System.out.println("Player 1 score: " + player1.getScore());
                System.out.println("Player 2 score: " + player2.getScore());
                playing = false;
            }else{
                System.out.println("Invalid move, your turn has been skipped.");
            }
        }
        System.out.println("The Game is now over. Would you like to play again? (yes or no)");
        if(sc.nextLine().equals("yes")){
            board.populate();
            play();
        }
    }
}
