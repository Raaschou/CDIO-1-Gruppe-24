import java.util.Random;

class diceGame {
    public static void main (String[] args){
        
        
        //Sæt player score til 0
        //evt skriv eget navn
        //evt egen player class
        var player1 = diceGame.player();


        var player1Score = 0;
        var player2Score = 0;

        //evt opret Terning class
        int terning1 = 0;
        int terning2 = 0;

        int wongamesby1 = 0;
        int wongamesby2 = 0; 

        //Random gen
        Random random = new Random();

        //Antal simuleringer
        for(int t = 0; t < 1000; t++) {
            player1Score = 0;
            player2Score = 0;
        for(int i = 0; true ; i++) {
        //Terningkast for begge players 
            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player1Score = player1Score + terning1 + terning2;
             System.out.println("Player 1 you just rolled: " + terning1 + " & " + terning2 + ", your score is now: " + player1Score);
            

            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player2Score = player2Score + terning1 + terning2;
            System.out.println("Player 2 you just rolled: " + terning1 + " & " + terning2 + ", your score is now: " + player2Score);
            

            //Tjek om de begge er over 40, højeste score vinder
            //Ellers hvis kun den ene er over vinder den pågældende person
            if(player1Score >= 40 && player2Score >=40) {
                if(player1Score > player2Score) {
                wongamesby1++;
                System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                break;
                } else {
                    wongamesby2++;
                    System.out.println("Player 2 just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby2 + " games.");
                    break;
                }
            
                } else if (player1Score >= 40){
                    wongamesby1++;
                    System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                    break;
                } else if (player2Score >= 40){
                    wongamesby2++;
                    System.out.println("Player 2 just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby2 + " games.");
                    break;
                }
            }
        }
    }
}