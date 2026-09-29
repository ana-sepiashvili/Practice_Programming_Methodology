import stanford.karel.*;

public class KarelProgramSample extends SuperKarel {

	@Override
	public void run() {

	}

    private void runProblem1() {
        move();
        move();
        pickBeeper();
        move();
        putBeeper();
    }

    private void runProblem2() {
        for (int i = 0; i < 4; i++) {
            move();
        }
        for (int i = 0; i < 10; i++) {
            pickBeeper();
        }
        move();
        for (int i = 0; i < 10; i++) {
            putBeeper();
        }
    }

    private void runProblem3() {
        while (frontIsClear()) {
            move();
        }
    }

    private void runProblem4() {
        while (frontIsClear()) {
            putBeeper();
            move();
        }
        putBeeper();
    }

    private void runProblem5() {
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
