import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
    private final RandomGenerator rgen = RandomGenerator.getInstance();
    private final static int LOWEST_BET = 0;
    private final static int HIGHEST_BET = 36;

    public void run() {
        int input = readInt("Enter number between 0 and 36: ");
        while (input < LOWEST_BET || input > HIGHEST_BET) {
            input = readInt("enter again: ");
        }

        int winningNumber = rgen.nextInt(LOWEST_BET, HIGHEST_BET);
        if (input == winningNumber) {
            println("You won! winning number is: " + winningNumber);
        } else {
            println("try again, winning number was: " + winningNumber);
        }
    }
}
