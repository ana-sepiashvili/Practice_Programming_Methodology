import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem38 extends ConsoleProgram {
    private final RandomGenerator rgen = RandomGenerator.getInstance();
    private final static int LOWEST_BET = 0;
    private final static int HIGHEST_BET = 36;
    private final static int INITIAL_AMOUNT = 1000;

    public void run() {
        int curAmount = INITIAL_AMOUNT;
        println("Your balance is " + curAmount);
        while (curAmount > 0) {
            curAmount += spinRoulette(curAmount);
            println("Your current balance is " + curAmount);
        }
    }

    private int spinRoulette(int curAmount) {
        int betAmount = readInt("Enter amount to bet: ");
        while (betAmount > curAmount || betAmount <= 0) {
            betAmount = readInt("Enter valid amount: ");
        }

        int betNumber = readInt("Enter number between " + LOWEST_BET + " and " + HIGHEST_BET + ": ");
        while (betNumber < LOWEST_BET || betNumber > HIGHEST_BET) {
            betNumber = readInt("enter again: ");
        }

        int winningNumber = rgen.nextInt(LOWEST_BET, HIGHEST_BET);
        if (betNumber == winningNumber) {
            println("You won! Winning number is: " + winningNumber);
            return betAmount * 2;
        } else {
            println("You lost! Winning number is: " + winningNumber);
            return -betAmount;
        }
    }
}
