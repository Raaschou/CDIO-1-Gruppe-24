import java.util.Random;

class diceGame {
    public static void main(String[] args) {

        // Initialize the scanner and use English locale
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        // Player 1 setup
        System.out.println("Hello player 1, please enter your name.");
        String name1 = scanner.nextLine();
        System.out.println("Hello " + name1 + ", welcome to the game!");

        // Player 2 setup
        System.out.println("Hello player 2, please enter your name.");
        String name2 = scanner.nextLine();
        System.out.println("Hello " + name2 + ", welcome to the game!");

        // Initialize player scores
        int player1Score = 0;
        int player2Score = 0;

        // Dice values
        int terning1 = 0;
        int terning2 = 0;

        // Track won games
        int wongamesby1 = 0;
        int wongamesby2 = 0;

        // Random number generator for dice rolls
        Random random = new Random();

        // Start the game loop

        int k = 2;

        while (true) {
            player1Score = 0;
            player2Score = 0;

            // Simulate turns
            for (; k < 1000; k++) {
                if (k % 2 == 0) { // Player 1's turn
                    System.out.println(name1 + " roll!");
                    while (!scanner.nextLine().equalsIgnoreCase("R")) {
                        System.out.println("Wrong button! " + name1 + ", press 'R' to roll.");
                    }
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player1Score += terning1 + terning2;
                    System.out.println(name1 + " , you rolled: " + terning1 + " & " + terning2 + ", your score is now: " + player1Score);

                    // Check if player 1 has won
                    if (player1Score >= 40) {
                        wongamesby1++;
                        System.out.println(name1 + " just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                    }

                } else { // Player 2's turn
                    System.out.println(name2 + " roll!");
                    while (!scanner.nextLine().equalsIgnoreCase("R")) {
                        System.out.println("Wrong button! " + name2 + ", press 'R' to roll.");
                    }
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player2Score += terning1 + terning2;
                    System.out.println(name2 + " , you rolled: " + terning1 + " & " + terning2 + ", your score is now: " + player2Score);

                    // Check if player 2 has won
                    if (player2Score >= 40) {
                        wongamesby2++;
                        System.out.println(name2 + " just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby2 + " games.");
                    }
                }
            }
        }
    }
}


 /*if(player1Score >= 40 && player2Score >=40) {
                    if(player1Score > player2Score) {
                        wongamesby1++;
                        System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                        break;
                        } else {
                            wongamesby2++;
                            System.out.println("Player 2 just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby2 + " games.");
                            break;            
                        } else if (player1Score >= 40){
                            wongamesby1++;
                            System.out.println("Player 1 just won with a score of " + player1Score + "! Now you've won a total of " + wongamesby1 + " games.");
                            break;
                        } else if (player2Score >= 40){
                            wongamesby2++;
                            System.out.println("Player 2 just won with a score of " + player2Score + "! Now you've won a total of " + wongamesby2 + " games.");
                            break;*/













        /* for(int t = 0; t < 1000; t++) {
            player1Score = 0;
            player2Score = 0;
        for(int i = 0; i < 1000 ; i++) {
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
            //Ellers hvis kun den ene er over vinder den pågældende person*/ 
