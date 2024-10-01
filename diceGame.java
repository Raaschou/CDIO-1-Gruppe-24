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

        //Random gen
        Random random = new Random(); 



        //for(int i = 0; i < ; i++) {

        //Terningkast for player1
            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player1Score = terning1 + terning2;
            terning1 = random.nextInt(6)+1;
            terning2 = random.nextInt(6)+1;
            player2Score = terning1 + terning2;


        System.out.println(player1Score);
        System.out.println(player2Score);
        



    }
}