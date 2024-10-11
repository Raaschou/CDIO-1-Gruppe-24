import java.util.Random;

class Player {
    String name;
    int playerScore;
    int wonGames;

    Player(String name, int playerScore, int wonGames){
        this.name = name;
        this.playerScore = playerScore;
        this.wonGames = wonGames;
    }

     static boolean start() {
        boolean start = false;
        Random random = new Random();
        int throwForPlayer1 = random.nextInt(6) + 1;
        int throwForPlayer2 = random.nextInt(6) + 1;
        return start;

    } 
}