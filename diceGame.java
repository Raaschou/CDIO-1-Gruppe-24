class diceGame {
    public static void main(String[] args) {

        // Initiering af terning objekt
        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);
        Dice dice3 = new Dice(0);
        Dice dice4 = new Dice(0);

        // Initiering af scanner
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        // Spørg om navn og initier? player class for begge spillere
        System.out.println("Hello player 1 please enter your name.");
        Player player1 = new Player(scanner.nextLine(), 0, 0);
        System.out.println("Hello player 2 please enter your name.");
        Player player2 = new Player(scanner.nextLine(), 0, 0);

        // Antal simuleringer
        for (int t = 1; t <= 2; t++) {
            

            player1.playerScore = 0;
            player2.playerScore = 0;
            
            player1.lastRoll = new int[]{0, 0};
            player2.lastRoll = new int[]{0, 0};
            
            System.out.println("\n" + "Starting game number " + (t)+"\n");
            
            outerloop: for (int i = 0; true; i++) {
                
                
                for (int j = 0; j < 1; j++) {
                    System.out.println(player1.name + " please press Enter to roll your dice.");
                    scanner.nextLine(); // Wait for the player to press Enter
                    
                   
                        

                    dice1.diceFace = dice1.roll();
                    dice2.diceFace = dice2.roll();

                    // evt.player1.playerScore += dice1.diceFace + dice2.diceFace;
                    player1.playerScore = player1.playerScore + dice1.diceFace + dice2.diceFace;
                    System.out.println(player1.name + " you just rolled: " + dice1.diceFace + " & "
                            + dice2.diceFace + ", your score is now: " + player1.playerScore+"\n");
                            
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

                        if (player1.playerScore < 40 && dice1.diceFace != 1) {
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
                    
                }
                for (int j = 0; j < 1; j++) {

                    System.out.println(player2.name + " please press Enter to roll your dice.");
                    scanner.nextLine(); // Wait for the player to press Enter
                    
                    dice3.diceFace = dice3.roll();
                    dice4.diceFace = dice4.roll();
                    
                    player2.playerScore = player2.playerScore + dice3.diceFace + dice4.diceFace;
                    System.out.println(player2.name + " you just rolled: " + dice3.diceFace + " & "
                            + dice4.diceFace + ", your score is now: " + player2.playerScore+"\n");
                    // Tjek om der bliver slået et ens par
                    if (dice3.diceFace == dice4.diceFace) {
                        // Hvis det ikke er et par ettere og personen ikke har vundet allerede, slår de
                        // igen
                        if (dice3.diceFace == 6) {
                            if (rule3(player2.lastRoll[0], player2.lastRoll[1])) {
                                System.out.println(player2.name + ", you rolled two pairs of sixes in a row! You win!");
                                player2.wonGames++;
                                System.out.println(player2.name + ", now you've won a total of " + player2.wonGames
                                            + " games.");
                                break outerloop;
                            }
                        }
                        player2.lastRoll[0] = dice3.diceFace;
                        player2.lastRoll[1] = dice4.diceFace;

                        if (player2.playerScore < 40 && dice3.diceFace != 1) {
                            System.out.println(player2.name + ", you rolled a pair! You gain another roll!");
                            dice1.diceFace = dice3.roll();
                            dice2.diceFace = dice4.roll();
                            player2.playerScore = player2.playerScore + dice3.diceFace + dice4.diceFace;
                            if (dice3.diceFace == 6 && dice4.diceFace == 6) {
                                if (rule3(player2.lastRoll[0], player2.lastRoll[1])) {
                                    System.out.println(
                                            player2.name + ", you rolled two pairs of sixes in a row! You win!");
                                    player2.wonGames++;
                                    System.out.println(player2.name + ", now you've won a total of " + player2.wonGames
                                            + " games.");
                                    break outerloop;
                                }
                            }
                            player2.lastRoll[0] = dice3.diceFace;
                            player2.lastRoll[1] = dice4.diceFace;
                            System.out.println(player2.name + ", you just rolled: " + dice3.diceFace + " & "
                                    + dice4.diceFace + ", your score is now: " + player2.playerScore+ "\n");
                        } else if(dice3.diceFace == 1) {
                            player2.playerScore = 0;
                            System.out.println(player2.name + ", you rolled snake eyes! You lose all your points: "
                                    + player2.playerScore);
                        } 
                    }
                    player2.lastRoll[0] = dice3.diceFace;
                    player2.lastRoll[1] = dice4.diceFace;

                }

                // Tjek om de begge er over 40, højeste score vinder
                // Ellers hvis kun den ene er over vinder den pågældende person
                
                if (player1.playerScore >= 40 && player2.playerScore >= 40) {
                    if (dice1.diceFace == dice2.diceFace&& dice3.diceFace == dice4.diceFace){
                        continue;
                    }
                        if (dice1.diceFace == dice2.diceFace) {
                            player1.wonGames++;
                            System.out.println(player1.name + " just won with a score of " + player1.playerScore
                                    + "! Now you've won a total of " + player1.wonGames + " games.");
                            break;
                        
                    } else if (dice3.diceFace == dice4.diceFace) {
                            player2.wonGames++;
                            System.out.println(player2.name + " just won with a score of " + player2.playerScore
                                    + "! Now you've won a total of " + player2.wonGames + " games.");
                            break;
                        }
                    
                    // Hvis ingen vinder, bed begge spillere om at rulle igen.
                    System.out.println("You're both close to winning; roll a pair to win..." + "\n");

                } else if (player1.playerScore >= 40) {
                    System.out.println("You're close to winning " +player1.name+ " roll a pair to win..." + "\n");
                        player1.lastRoll[0] = dice1.diceFace;
                        player1.lastRoll[1] = dice2.diceFace;
                        if (dice1.diceFace==dice2.diceFace){
                            player1.wonGames++;
                        System.out.println(player1.name + " just won with a score of " + player1.playerScore
                                        + "! Now you've won a total of " + player1.wonGames + " games.");
                                       
                        break;
                        
                        }else{
                        System.out.println("You rolled: " + dice1.diceFace + " & " + dice2.diceFace + " Sorry try again " + player1.name + "..." + "\n");
                        
                        }
                } else if (player2.playerScore >= 40) {
                    System.out.println("You're close to winning " +player2.name+ " roll a pair to win..." + "\n");
                        player2.lastRoll[0] = dice3.diceFace;
                        player2.lastRoll[1] = dice4.diceFace;
                        if (dice3.diceFace==dice4.diceFace){
                            player2.wonGames++;
                        System.out.println(player2.name + " just won with a score of " + player2.playerScore
                                        + "! Now you've won a total of " + player2.wonGames + " games.");
                                       
                        break;
                        
                        }else{
                        System.out.println("You rolled: " + dice3.diceFace + " & " + dice4.diceFace + " Sorry try again " + player2.name + "..." + "\n");
                        
                        }
                }
            }
            
            
        } scanner.close();
    }

    public static boolean rule3(int diceFace1, int diceFace2) {
        if (diceFace1 + diceFace2 == 12) {
            
            return true;

        } else {
            return false;
        }
    }

}
