
import java.util.Random;

public class PinMaker {

    public static void main(String[] args) {
        Random pin = new Random();
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int randomNumber = pin.nextInt(9);
                System.out.print(randomNumber);

            }
        }
    }
}
