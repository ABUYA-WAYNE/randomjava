package Die;

public class Program {
    public static void main(String[] args) {
        Die die = new Die(6);

        for (int i = 0; i < 1; i++) {
            System.out.println(die.throwDie());
        }
    }
}