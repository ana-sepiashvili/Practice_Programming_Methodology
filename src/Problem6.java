import stanford.karel.SuperKarel;

public class Problem6 extends SuperKarel {
    @Override
    public void run() {
        goTo2ndSquare();
        moveAllBeepersFrom2ndSquareTo4thSquare(); // ends on 2x1
        goTo3rdSquare();
        moveAllBeepersFrom3rdSquareTo4thSquare();
    }

    private void goTo2ndSquare() {
        move();
    }

    /**
     * Pre Condition: starts on 2x1 facing right
     * Post Condition: ends on 3x1 facing right
     */
    private void goTo3rdSquare() {
        move();
    }

    /**
     * Pre Condition: starts on 2x1 facing right
     * Post Condition: ends on 2x1 facing right
     */
    private void moveAllBeepersFrom2ndSquareTo4thSquare() {
        while (beepersPresent()) {
            bringBeeperFrom2To4();
            goBackTo2From4();
        }
    }

    private void moveAllBeepersFrom3rdSquareTo4thSquare() {
        while (beepersPresent()) {
            bringBeeperFrom3To4();
            goBackTo3From4();
        }
    }

    private void bringBeeperFrom2To4() {
        pickBeeper();
        move();
        move();
        putBeeper();
    }

    private void goBackTo2From4() {
        turnAround();
        move();
        move();
        turnAround();
    }

    private void bringBeeperFrom3To4() {
        pickBeeper();
        move();
        putBeeper();
    }

    private void goBackTo3From4() {
        turnAround();
        move();
        turnAround();
    }
}
