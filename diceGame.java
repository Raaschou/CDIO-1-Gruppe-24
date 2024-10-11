class diceGame {
    public static void main(String[] args) {

        // Initiering af terning objekt
        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);

        // Initiering af scanner
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        // Spørg om navn og initier? player class for begge spillere
        System.out.println("Hello player 1 please enter your name.");
        Player player1 = new Player(scanner.nextLine(), 0, 0);
        System.out.println("Hello player 2 please enter your name.");
        Player player2 = new Player(scanner.nextLine(), 0, 0);

        // Antal simuleringer
        for (int t = 0; t < 5; t++) {
            player1.playerScore = 0;
            player2.playerScore = 0;
            // Slå om hvem der stater
            /*
             * int kastForPlayer1 = dice.roll();
             * int kastForPlayer2 = dice.roll();
             * if (kastForPlayer1 > kastForPlayer2) {
             * player1 = name1;
             * player2 = name2;
             * /* int storedWins1 = wongamesby2;
             * wongamesby2 = wongamesby1;
             * wongamesby1 = storedWins1;
             * } else {
             * int storedWins2 = wongamesby1;
             * wongamesby1 = wongamesby2;
             * wongamesby2 = storedWins2;
             * player2 = name1;
             * player1 = name2;
             * 
             * }
             */
            for (int i = 0; true; i++) {
                // Terningkast for begge players
                /*System.out.println("Press enter to roll dice!");
                String buttonPress = scanner.nextLine();
                if (!(buttonPress.equals(""))) {
                    System.out.println("Wrong button pressed! Try again");

                } else { */
                    for (int j = 0; j < 1; j++) {
                        dice1.diceFace = dice1.roll();
                        dice2.diceFace = dice2.roll();

                        player1.playerScore = player1.playerScore + dice1.diceFace + dice2.diceFace;
                        System.out.println(player1.name + " you just rolled: " + dice1.diceFace + " & "
                                + dice2.diceFace + ", your score is now: " + player1.playerScore);
                        // Tjek om der bliver slået et par
                        if (dice1.diceFace == dice2.diceFace) {
                            // Hvis det ikke er et par ettere og personen ikke har vundet allerede, slår de
                            // igen
                            if (!(dice1.diceFace == 1) && player1.playerScore < 40) {
                                System.out.println(player1.name + ", you rolled a pair! You gain another roll!");
                                dice1.diceFace = dice1.roll();
                                dice2.diceFace = dice2.roll();
                                player1.playerScore = player1.playerScore + dice1.diceFace + dice2.diceFace;
                                System.out.println(player1.name + " you just rolled: " + dice1.diceFace + " & "
                                        + dice2.diceFace + ", your score is now: " + player1.playerScore);
                            } else {
                                player1.playerScore = 0;
                                System.out.println(player1.name + ", you rolled snake eyes! You lose all your points:"
                                        + player1.playerScore);
                            }
                        }

                    /* } */
                }
                for (int j = 0; j < 1; j++) {
                    dice1.diceFace = dice1.roll();
                    dice2.diceFace = dice2.roll();
                    player2.playerScore = player2.playerScore + dice1.diceFace + dice2.diceFace;
                    System.out.println(player2.name + " you just rolled: " + dice1.diceFace + " & " + dice2.diceFace
                            + ", your score is now: " + player2.playerScore);
                    if (dice1.diceFace == dice2.diceFace) {
                        if (!(dice1.diceFace == 1) && player2.playerScore > 40) {
                            System.out.println(player2.name + ", you rolled a pair! You gain another roll");
                            dice1.diceFace = dice1.roll();
                            dice2.diceFace = dice2.roll();
                            player2.playerScore = player2.playerScore + dice1.diceFace + dice2.diceFace;
                            System.out.println(
                                    player2.name + " you just rolled: " + dice1.diceFace + " & " + dice2.diceFace
                                            + ", your score is now: " + player2.playerScore);
                        } else {
                            player2.playerScore = 0;
                            System.out.println(player2.name + ", you rolled snake eyes! You lose all your points: "
                                    + player2.playerScore);
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
        scanner.close();
    }
}
