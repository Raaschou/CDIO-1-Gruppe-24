import java.util.Random;

class diceGame {
    public static void main(String[] args) {

        // Lav random generator
        Random random = new Random();

        // Sæt player .playerScore til 0
        // evt skriv eget navn
        // evt egen player class
       
       var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
    /*
        System.out.println("Hello player 1 please enter your name.");

        String name1 = scanner.nextLine();

        System.out.println("Hello player 2 please enter your name.");

        String name2 = scanner.nextLine(); */
        System.out.println("Hello player 1 please enter your name.");
        Player player1 = new Player(scanner.nextLine(), 0, 0);
        System.out.println("Hello player 2 please enter your name.");
        Player player2 = new Player(scanner.nextLine(), 0, 0);


/* 
        String player1 = "";
        String player2 = ""; */
        scanner.close();

        /* int player1.playerScore = 0;
        int player2.playerScore = 0; */

        // evt opret Terning class
        int terning1 = 0;
        int terning2 = 0;

        int wongamesby1 = 0;
        int wongamesby2 = 0;

        // Antal simuleringer
        for (int t = 0; t < 5; t++) {
            player1.playerScore = 0;
            player2.playerScore = 0;
            // Slå om hvem der stater
            /* int kastForPlayer1 = random.nextInt(6) + 1;
            int kastForPlayer2 = random.nextInt(6) + 1;
            if (kastForPlayer1 > kastForPlayer2) {
                player1 = name1;
                player2 = name2;
                /* int storedWins1 = wongamesby2;
                wongamesby2 = wongamesby1;
                wongamesby1 = storedWins1;
            } else {
                int storedWins2 = wongamesby1;
                wongamesby1 = wongamesby2;
                wongamesby2 = storedWins2;
                player2 = name1;
                player1 = name2;
                
            } */
            for (int i = 0; true; i++) {
                // Terningkast for begge players

                for (int j = 0; j < 1; j++) {
                    if()
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player1.playerScore = player1.playerScore + terning1 + terning2;
                    System.out.println(player1.name + " you just rolled: " + terning1 + " & "
                            + terning2 + ", your score is now: " + player1.playerScore);
                    // Tjek om der bliver slået et par
                    if (terning1 == terning2) {
                        // Hvis det ikke er et par ettere og personen ikke har vundet allerede, slår de
                        // igen
                        if (!(terning1 == 1) && player1.playerScore < 40) {
                            System.out.println(player1.name + ", you rolled a pair! You gain another roll!");
                            terning1 = random.nextInt(6) + 1;
                            terning2 = random.nextInt(6) + 1;
                            player1.playerScore = player1.playerScore + terning1 + terning2;
                            System.out.println(player1.name + " you just rolled: " + terning1 + " & "
                                    + terning2 + ", your score is now: " + player1.playerScore);
                        } else {
                            player1.playerScore = 0;
                            System.out.println(player1.name + ", you rolled snake eyes! You lose all your points:" + player1.playerScore);
                        }
                    }

                }

                for (int j = 0; j < 1; j++) {
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player2.playerScore = player2.playerScore + terning1 + terning2;
                    System.out.println(player2.name + " you just rolled: " + terning1 + " & " + terning2
                            + ", your score is now: " + player2.playerScore);
                    if (terning1 == terning2) {
                        if (!(terning1 == 1) && player2.playerScore > 40) {
                            System.out.println(player2.name + ", you rolled a pair! You gain another roll");
                            terning1 = random.nextInt(6) + 1;
                            terning2 = random.nextInt(6) + 1;
                            player2.playerScore = player2.playerScore + terning1 + terning2;
                            System.out.println(player2.name + " you just rolled: " + terning1 + " & " + terning2
                                    + ", your score is now: " + player2.playerScore);
                        } else {
                            player2.playerScore = 0;
                            System.out.println(player2.name + ", you rolled snake eyes! You lose all your points: " + player2.playerScore);
                        }
                    }

                }

                // Tjek om de begge er over 40, højeste .playerScore vinder
                // Ellers hvis kun den ene er over vinder den pågældende person
                if (player1.playerScore >= 40 && player2.playerScore >= 40) {
                    if (player1.playerScore > player2.playerScore) {
                        player1.wonGames++;
                        System.out.println(player1.name + " just won with a score of " + player1.playerScore
                                + "! Now you've won a total of " + player1.wonGames + " games.");
                        break;
                    } else {
                        player2.wonGames++;
                        System.out.println(player2.name + " just won with a score of " + player2.playerScore
                                + "! Now you've won a total of " + player2.wonGames + " games.");
                        break;
                    }

                } else if (player1.playerScore >= 40) {
                    player1.wonGames++;
                    System.out.println(player1.name + " just won with a score of " + player1.playerScore
                            + "! Now you've won a total of " + player1.wonGames + " games.");
                    break;
                } else if (player2.playerScore >= 40) {
                    player2.wonGames++;
                    System.out.println(player2.name + " just won with a score of " + player2.playerScore
                            + "! Now you've won a total of " + player2.wonGames + " games.");
                    break;
                }
            }
        }
    }
}
