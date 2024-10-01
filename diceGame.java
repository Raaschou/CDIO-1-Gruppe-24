import java.util.Random;

class diceGame {
    public static void main (String[] args){
        

        //Sæt player score til 0
        //evt skriv eget navn
        //evt egen player class
        var player1Score = 0;
        var player2Score = 0;

        //Terning class
        int terning1 = 0;
        int terning2 = 0;

        int wongamesby1 = 0;
        int wongamesby2 = 0; 

        //Random gen
        Random random = new Random();

        for(int i = 0; i < 10 ; i++) {

        //Terningkast for player1
            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player1Score = player1Score + terning1 + terning2;
             System.out.println("Player 1 you just rolled: " + terning1 + " & " + terning2 + "your score is now: " + player1Score);
            
            if (player1Score >= 40){
                System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                break;
            }


            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player2Score = player2Score + terning1 + terning2;
            System.out.println("Player 2 you just rolled: " + terning1 + " & " + terning2 + "your score is now: " + player2Score);


            /*if (player1Score >= 40){
                System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                break;*/
            
            if (player2Score >= 40){
                System.out.println("Player 2 just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby1 + " games.");
                break;
            }
        }
        }
    }