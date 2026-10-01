import stanford.karel.SuperKarel;

public class Problem7 extends SuperKarel {
    @Override
    public void run() {
        fillRow();
        while (canGoUp()) {
            fillFromRightToLeft();

            if (canGoUp()) {
                fillFromLeftToRight();
            }
        }
    }

    private boolean canGoUp() {
        if (facingEast() && leftIsClear()) { // right end
            return true;
        } else if (facingWest() && rightIsClear()) { // left end
            return true;
        }
        return false;
    }

    private void fillFromLeftToRight() {
        goUpFromLeftEnd();
        turnRight();
        fillRow();
    }

    private void goUpFromLeftEnd() {
        turnRight();
        move();
    }

    private void fillFromRightToLeft() {
        goUpRightEnd();
        turnLeft();
        fillRow();
    }

    private void goUpRightEnd() {
        turnLeft();
        move();
    }

    private void fillRow() {
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }

        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}