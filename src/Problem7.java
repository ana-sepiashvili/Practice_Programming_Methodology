import stanford.karel.SuperKarel;

public class Problem7 extends SuperKarel {
    @Override
    public void run() {
        fillRow();
        while (canGoUp()) {
            fillFromLeftToRight();

            if (canGoUp()) {
                fillFromRightToLeft();
            }
        }
    }

    private boolean canGoUp() {
        if (facingEast()) {
            return canGoUpFromRightEnd();
        } else {
            return canGoUpFromLeftEnd();
        }
    }

    private boolean canGoUpFromRightEnd() {
        turnLeft();
        if (frontIsClear()) {
            turnRight();
            return true;
        } else {
            turnRight();
            return false;
        }
    }

    private boolean canGoUpFromLeftEnd() {
        turnRight();
        if (frontIsClear()) {
            turnLeft();
            return true;
        } else {
            turnLeft();
            return false;
        }
    }

    private void fillFromLeftToRight() {
        goUpFromRightEnd();
        turnLeft();
        fillRow();
    }

    private void goUpFromRightEnd() {
        turnLeft();
        move();
    }

    private void fillFromRightToLeft() {
        goUpFromLeftEnd();
        turnRight();
        fillRow();
    }

    private void goUpFromLeftEnd() {
        turnRight();
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
