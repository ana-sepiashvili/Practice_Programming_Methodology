import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

public class Ball2024 extends GraphicsProgram {
    private static final int MAX_VX = 5;
    private static final int MAX_VY = 5;
    private static final int RADIUS = 30;
    private static final int DELAY = 4;

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private int numClicks = 0;
    private int totalDistance = 0;
    private GOval ball;
    private GLabel dist;

    public void run() {
        drawBall();
        createLabel();
        addMouseListeners();
        while (true) {
            int vx = rgen.nextInt(-MAX_VX, MAX_VX + 1); // -5, 5
            int vy = rgen.nextInt(-MAX_VY, MAX_VY + 1);
            // move
            if (numClicks % 2 == 0) {
                ball.move(vx, vy);
                totalDistance = (int) (totalDistance + Math.sqrt(vx * vx + vy * vy));
            }
            // pause
            pause(DELAY);
        }
    }

    private void createLabel() {
        dist = new GLabel("");
    }

    private void drawBall() {
        ball = new GOval(2 * RADIUS, 2 * RADIUS);
        add(ball);
    }

    public void mouseClicked(MouseEvent e) {
        numClicks++;
        if (numClicks % 3 == 0) {
            dist = new GLabel("" + totalDistance);
            add(dist, 0, getHeight());
        } else {
            //            dist.setLabel("");
            remove(dist);
        }
    }
}
