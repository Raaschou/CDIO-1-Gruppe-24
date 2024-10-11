import java.util.Random;

class Dice{
    Random random;

    public Dice(){
        this.random = new Random();

    }
    public int roll(){
        return random.nextInt(6) + 1;
    }
}

