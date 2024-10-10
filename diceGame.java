import java.util.Random;

class diceGame {
    public static void main(String[] args) {

        // Random gen
        Random random = new Random();

        // Sæt player score til 0
        // evt skriv eget navn
        // evt egen player class
        /* var player1 = diceGame.player(); */
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        System.out.println("Hello player 1 please enter your name.");

        String name1 = scanner.nextLine();

        System.out.println("Hello player 2 please enter your name.");

        String name2 = scanner.nextLine();

        String player1 = "";
        String player2 = "";
        scanner.close();

        int kastForPlayer1 = random.nextInt(6) + 1;
        int kastForPlayer2 = random.nextInt(6) + 1;
        if (kastForPlayer1 > kastForPlayer2) {
            player1 = name1;
            player2 = name2;
        } else {
            player2 = name1;
            player1 = name2;
        }

        int player1Score = 0;
        int player2Score = 0;

        // evt opret Terning class
        int terning1 = 0;
        int terning2 = 0;

        int wongamesby1 = 0;
        int wongamesby2 = 0;

        // Antal simuleringer
        for (int t = 0; t < 5; t++) {
            player1Score = 0;
            player2Score = 0;

            for (int i = 0; true; i++) {
                // Terningkast for begge players

                for (int j = 0; j < 1; j++) {
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player1Score = player1Score + terning1 + terning2;
                    System.out.println(player1 + " you just rolled: " + terning1 + " & " + terning2
                            + ", your score is now: " + player1Score);
                    if (terning1 == terning2) {
                        if (!(terning1 == 1)) {
                            System.out.println(player1 + ", you rolled a pair! You gain another roll!");
                            terning1 = random.nextInt(6) + 1;
                            terning2 = random.nextInt(6) + 1;
                            player1Score = player1Score + terning1 + terning2;
                            System.out.println(player1 + " you just rolled: " + terning1 + " & " + terning2
                                    + ", your score is now: " + player1Score);
                        } else {
                            player1Score = 0;
                            System.out.println(player1 + ", you rolled snake eyes! You lose all your points!");
                        }
                    }

                }

                for (int j = 0; j < 1; j++) {
                    terning1 = random.nextInt(6) + 1;
                    terning2 = random.nextInt(6) + 1;
                    player2Score = player2Score + terning1 + terning2;
                    System.out.println(player2 + " you just rolled: " + terning1 + " & " + terning2
                            + ", your score is now: " + player2Score);

                    if (terning1 == terning2) {
                        if (!(terning1 == 1) && player2Score > 40) {
                            System.out.println(player2 + ", you rolled a pair! You gain another roll");
                            terning1 = random.nextInt(6) + 1;
                            terning2 = random.nextInt(6) + 1;
                            player2Score = player2Score + terning1 + terning2;
                            System.out.println(player2 + " you just rolled: " + terning1 + " & " + terning2
                                    + ", your score is now: " + player2Score);
                        } else {
                            player2Score = 0;
                            System.out.println(player2 + ", you rolled snake eyes! You lose all your points: " + player2Score);
                        }
                    }

                }

                // Tjek om de begge er over 40, højeste score vinder
                // Ellers hvis kun den ene er over vinder den pågældende person
                if (player1Score >= 40 && player2Score >= 40) {
                    if (player1Score > player2Score) {
                        wongamesby1++;
                        System.out.println(player1 + " just won with a score of " + player1Score
                                + "! Now you've won a total of " + wongamesby1 + " games.");
                        break;
                    } else {
                        wongamesby2++;
                        System.out.println(player2 + " just won with a score of " + player2Score
                                + "! Now you've won a total of " + wongamesby2 + " games.");
                        break;
                    }

                } else if (player1Score >= 40) {
                    wongamesby1++;
                    System.out.println(player1 + " just won with a score of " + player1Score
                            + "! Now you've won a total of " + wongamesby1 + " games.");
                    break;
                } else if (player2Score >= 40) {
                    wongamesby2++;
                    System.out.println(player2 + " just won with a score of " + player2Score
                            + "! Now you've won a total of " + wongamesby2 + " games.");
                    break;
                }
            }
        }
    }
}
