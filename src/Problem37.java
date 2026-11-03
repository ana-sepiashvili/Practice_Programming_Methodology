import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();

    public void run() {
        int n = readInt("enter number from 0-36");
        while (n < 0 || n > 36) {
            n = readInt("enter number from 0-36");
        }
        int result = rg.nextInt(0, 36);
        if (n == result) {
            println("you won");
        } else {
            println("you lost" + result);
        }
    }
}
