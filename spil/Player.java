import java.util.Random;

class Player {
    String name;
    int playerScore;
    int wonGames;
    int[] lastRoll;

    Player(String name, int playerScore, int wonGames){
        this.name = name;
        this.playerScore = playerScore;
        this.wonGames = wonGames;
        this.lastRoll = new int[]{0, 0};
    }

}