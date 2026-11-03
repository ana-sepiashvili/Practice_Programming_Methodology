import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem35 extends ConsoleProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();
    private static final int NUM_FLIPS = 1000;

    public void run() {
        calculateAverage();
    }

    private void calculateAverage() {
        int totalFlips = 0;

        for (int i = 0; i < NUM_FLIPS; i++) {
            totalFlips += flipTillTails();
        }

        println("Average number of flips till Tails is " + (double) totalFlips / NUM_FLIPS + ".");
    }

    private int flipTillTails() {
        int counter = 0;

        while (true) {
            boolean isTails = rg.nextBoolean();
            counter++;

            if (isTails) {
                break;
            }
        }

        return counter;
    }
}
