import stanford.karel.SuperKarel;

public class Problem9 extends SuperKarel {
    @Override
    public void run() {
        goFrom1To2();
        while (beepersPresent()) {
            pickBeeper(); // 2x1
            goFrom2To3();
            moveAllBeepersFrom3To4And1(); // 3 -> 0 beepers
            restoreBeepersFrom1To3(); // 1 - 0 beepers
            goFrom3To2();
        }
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 2x1 facing east
     */
    private void goFrom3To2() {
        turnAround();
        move();
        turnAround();
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

    private void goFrom3To1() {
        turnAround();
        move();
        move();
        turnAround();
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void moveAllBeepersFrom3To4And1() {
        while (beepersPresent()) {
            pickBeeper(); // 3x1
            goFrom3To4();
            putBeeper();
            goFrom4To1();
            putBeeper();
            goFrom1To3();
        }
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
     * Pre Condition: 4x1 facing east
     * Post Condition: 1x1 facing east
     */
    private void goFrom4To1() {
        turnAround();
        move();
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
     * Pre Condition: 2x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void goFrom2To3() {
        move();
    }

    private void goFrom1To2() {
        move();
    }

}
