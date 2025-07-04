package Die;

import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        return random.nextInt(numberOfFaces) + 1;
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
    }
}
