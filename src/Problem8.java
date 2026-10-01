import stanford.karel.SuperKarel;

public class Problem8 extends SuperKarel {
    @Override
    public void run() {
        goTo3(); // 1 -> 3
        while (beepersPresent()) {
            pickBeeper();
            goFrom3To2();
            pickBeeper();
            goFrom2To3();
        }
        goFrom3To2();
        moveAllBeepersFrom2To4();
    }

    /**
     * Pre Condition: 2x1 facing east
     * Post Condition:
     */
    private void moveAllBeepersFrom2To4() {
        while (beepersPresent()) {
            pickBeeper();
            move(); // 2 -> 3
            move(); // 3 -> 4
            putBeeper();
            turnAround();
            move();
            move();
            turnAround();
        }
    }

    /**
     * Pre Condition: 2x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void goFrom2To3() {
        move();
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

    private void goTo3() {
        move();
        move();
    }
}
