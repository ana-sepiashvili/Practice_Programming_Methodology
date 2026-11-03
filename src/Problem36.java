import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();
    private static final int NUM_FLIPS = 1_000;

    public void run() {
        averageCounter();
    }

    private void averageCounter() {
        int s = 0;
        for (int i = 0; i < NUM_FLIPS; i++) {
            s += nToReach3();
        }
        println((double) s / NUM_FLIPS);
    }

    private int nToReach3() {
        int totalCount = 0;
        int headCount = 0;

        while (true) {
            boolean head = rg.nextBoolean();
            totalCount++;
            if (head) {
                headCount++;
            } else {
                headCount = 0;
            }
            if (headCount == 3) {
                break;
            }
        }
        return totalCount;
    }
}
