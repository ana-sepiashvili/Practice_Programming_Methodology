import stanford.karel.SuperKarel;

public class Problem10 extends SuperKarel {
    @Override
    public void run() {
        goFrom1To2();
        while (beepersPresent()) {
            subtractMFromCell2(); // 2x1: -m beepers, 3x1: 0 beepers, 1x1: m beepers
            restoreBeepersFrom1To3(); // 1x1: 0 beepers, 3x1: m beepers
            addOneToCell4(); // 4x1: +1 beeper
        }
    }

    /**
     * Pre Condition: 2x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void subtractMFromCell2() {
        goFrom2To3();
        while (beepersPresent()) {
            pickBeeper(); // 3x1
            goFrom3To1();
            putBeeper(); // copy, used for restoring 3x1
            goFrom1To2();
            pickBeeper(); // 2x1, one of the m removed
            goFrom2To3();
        }
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void restoreBeepersFrom1To3() {
        goFrom3To1();
        while (beepersPresent()) {
            pickBeeper();
            goFrom1To3();
            putBeeper();
            goFrom3To1();
        }
        goFrom1To3();
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 2x1 facing east
     */
    private void addOneToCell4() {
        goFrom3To4();
        putBeeper();
        goFrom4To2();
    }

    /**
     * Pre Condition: 4x1 facing east
     * Post Condition: 2x1 facing east
     */
    private void goFrom4To2() {
        turnAround();
        move();
        move();
        turnAround();
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 4x1 facing east
     */
    private void goFrom3To4() {
        move();
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 1x1 facing east
     */
    private void goFrom3To1() {
        turnAround();
        move();
        move();
        turnAround();
    }

    /**
     * Pre Condition: 1x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void goFrom1To3() {
        move();
        move();
    }

    /**
     * Pre Condition: 1x1 facing east
     * Post Condition: 2x1 facing east
     */
    private void goFrom1To2() {
        move();
    }

    /**
     * Pre Condition: 2x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void goFrom2To3() {
        move();
    }
}
