import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

public class Ball extends GraphicsProgram {

    // constants
    private static final int RADIUS = 50;
    private static final int MAX_V = 5;
    private static final int DELAY = 5;

    // instances
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GOval ball;
    private GLabel label;
    private int distance = 0;
    private int numClicks = 0;

    public void run() {
        addMouseListeners();
        initBall();

        while (true) {
            double vx = rgen.nextDouble(-MAX_V, MAX_V);
            double vy = rgen.nextDouble(-MAX_V, MAX_V);

            if (numClicks % 2 == 0) { // if even clicks
                ball.move(vx, vy);
                distance += Math.sqrt(vx * vx + vy * vy);
            }

            pause(DELAY); // runs always
        }
    }

    private void initBall() {
        ball = new GOval(0, 0, 2 * RADIUS, 2 * RADIUS);
        add(ball);
    }

    public void mouseClicked(MouseEvent e) {
        numClicks++;

        if (numClicks % 3 == 0) {
            label = new GLabel("" + distance);
            add(label, 0, getHeight());
        } else if (label != null) {
            remove(label);
        }
    }
}