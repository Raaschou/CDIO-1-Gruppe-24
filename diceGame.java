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
            
            player1.lastRoll = new int[]{0, 0};
            player2.lastRoll = new int[]{0, 0};
            System.out.println("Starting game number " + (t + 1));
            // Slå om hvem der starter
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
            outerloop: for (int i = 0; true; i++) {
                
                // Terningkast for begge players

                /*
                 * Player.start
                 * System.out.println("Press enter to roll dice!");
                 * String buttonPress = scanner.nextLine();
                 * if (!(buttonPress.equals(""))) {
                 * System.out.println("Wrong button pressed! Try again");
                 * 
                 * } else {
                 */
                for (int j = 0; j < 1; j++) {
                    dice1.diceFace = dice1.roll();
                    dice2.diceFace = dice2.roll();
                    
                    player1.playerScore = player1.playerScore + dice1.diceFace + dice2.diceFace;
                    System.out.println(player1.name + " you just rolled: " + dice1.diceFace + " & "
                            + dice2.diceFace + ", your score is now: " + player1.playerScore);
                    // Tjek om der bliver slået et ens par
                    if (dice1.diceFace == dice2.diceFace) {
                        // Hvis det ikke er et par ettere og personen ikke har vundet allerede, slår de
                        // igen
                        if (dice1.diceFace == 6) {
                            if (rule3(player1.lastRoll[0], player1.lastRoll[1])) {
                                System.out.println(player1.name + ", you rolled two pairs of sixes in a row! You win!");
                                player1.wonGames++;
                                System.out.println(player1.name + ", now you've won a total of " + player1.wonGames
                                            + " games.");
                                break outerloop;
                            }
                        }
                        player1.lastRoll[0] = dice1.diceFace;
                        player1.lastRoll[1] = dice2.diceFace;

                        if (player1.playerScore < 40) {
                            System.out.println(player1.name + ", you rolled a pair! You gain another roll!");
                            dice1.diceFace = dice1.roll();
                            dice2.diceFace = dice2.roll();
                            player1.playerScore = player1.playerScore + dice1.diceFace + dice2.diceFace;
                            if (dice1.diceFace == 6 && dice2.diceFace == 6) {
                                //Tjek om regel 3 bliver opfyldt
                                if (rule3(player1.lastRoll[0], player1.lastRoll[1])) {
                                    System.out.println(
                                            player1.name + ", you rolled two pairs of sixes in a row! You win!");
                                    player1.wonGames++;
                                    System.out.println(player1.name + ", now you've won a total of " + player1.wonGames
                                            + " games.");
                                    break outerloop;
                                }
                            }
                            player1.lastRoll[0] = dice1.diceFace;
                            player1.lastRoll[1] = dice2.diceFace;
                            System.out.println(player1.name + ", you just rolled: " + dice1.diceFace + " & "
                                    + dice2.diceFace + ", your score is now: " + player1.playerScore);
                        } else if(dice1.diceFace == 1) {
                            player1.playerScore = 0;
                            System.out.println(player1.name + ", you rolled snake eyes! You lose all your points: "
                                    + player1.playerScore);
                        } 
                    }
                    player1.lastRoll[0] = dice1.diceFace;
                    player1.lastRoll[1] = dice1.diceFace;
                    /* } */
                }
                for (int j = 0; j < 1; j++) {
                    dice1.diceFace = dice1.roll();
                    dice2.diceFace = dice2.roll();
                    
                    player2.playerScore = player2.playerScore + dice1.diceFace + dice2.diceFace;
                    System.out.println(player2.name + " you just rolled: " + dice1.diceFace + " & "
                            + dice2.diceFace + ", your score is now: " + player2.playerScore);
                    // Tjek om der bliver slået et ens par
                    if (dice1.diceFace == dice2.diceFace) {
                        // Hvis det ikke er et par ettere og personen ikke har vundet allerede, slår de
                        // igen
                        if (dice1.diceFace == 6) {
                            if (rule3(player2.lastRoll[0], player2.lastRoll[1])) {
                                System.out.println(player2.name + ", you rolled two pairs of sixes in a row! You win!");
                                player2.wonGames++;
                                System.out.println(player2.name + ", now you've won a total of " + player2.wonGames
                                            + " games.");
                                break outerloop;
                            }
                        }
                        player2.lastRoll[0] = dice1.diceFace;
                        player2.lastRoll[1] = dice2.diceFace;

                        if (player2.playerScore < 40) {
                            System.out.println(player2.name + ", you rolled a pair! You gain another roll!");
                            dice1.diceFace = dice1.roll();
                            dice2.diceFace = dice2.roll();
                            player2.playerScore = player2.playerScore + dice1.diceFace + dice2.diceFace;
                            if (dice1.diceFace == 6 && dice2.diceFace == 6) {
                                if (rule3(player2.lastRoll[0], player2.lastRoll[1])) {
                                    System.out.println(
                                            player2.name + ", you rolled two pairs of sixes in a row! You win!");
                                    player2.wonGames++;
                                    System.out.println(player2.name + ", now you've won a total of " + player2.wonGames
                                            + " games.");
                                    break outerloop;
                                }
                            }
                            player2.lastRoll[0] = dice1.diceFace;
                            player2.lastRoll[1] = dice2.diceFace;
                            System.out.println(player2.name + ", you just rolled: " + dice1.diceFace + " & "
                                    + dice2.diceFace + ", your score is now: " + player2.playerScore);
                        } else if(dice1.diceFace == 1) {
                            player2.playerScore = 0;
                            System.out.println(player2.name + ", you rolled snake eyes! You lose all your points: "
                                    + player2.playerScore);
                        } 
                    }
                    player2.lastRoll[0] = dice1.diceFace;
                    player2.lastRoll[1] = dice1.diceFace;

                }

                // Tjek om de begge er over 40, højeste score vinder
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
            scanner.close();
        }
    }

    public static boolean rule3(int diceFace1, int diceFace2) {
        if (diceFace1 + diceFace2 == 12) {
            
            return true;

        } else {
            return false;
        }
    }

}
