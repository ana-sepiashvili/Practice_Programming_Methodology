import stanford.karel.SuperKarel;

public class Problem9 extends SuperKarel {
    @Override
    public void run() {
        goFrom1To2();
        while (beepersPresent()) {
            pickBeeper();
            goFrom2To3();
            moveAllBeepersFrom3To4And1();
            goFrom3To1();
            restoreBeepersOn3();
            goFrom1To2();
        }
    }

    private void goFrom1To2() {
        move();
    }

    private void goFrom3To1() {
        turnAround();
        move();
        move();
        turnAround();
    }

    private void restoreBeepersOn3() {
        while (beepersPresent()) {
            pickBeeper();
            move();
            move();
            putBeeper();
            goFrom3To1();
        }
    }

    private void goFrom2To3() {
        move();
    }

    /**
     * Pre Condition: 3x1 facing east
     * Post Condition: 3x1 facing east
     */
    private void moveAllBeepersFrom3To4And1() {
        while (beepersPresent()) {
            pickBeeper();
            move(); // 3 -> 4
            putBeeper();
            goFrom4To1();
            putBeeper();
            move();
            move();
        }
    }

    private void goFrom4To1() {
        turnAround();
        move(); // 4 -> 3
        move(); // 3 -> 2
        move(); // 2 -> 1
        turnAround();
    }
}
