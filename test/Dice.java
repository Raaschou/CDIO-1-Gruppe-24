import java.util.Random;

class Dice{
    int diceFace;
    Random random;
    
    //Terning constructor
    public Dice(int diceFace){
        this.diceFace = diceFace;
        this.random = new Random();
        
    }


    //Terningkast funktion
    public int roll(){
        return random.nextInt(6) + 1;
    }
}

