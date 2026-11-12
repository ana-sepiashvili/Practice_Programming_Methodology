import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;

public class Problem40 extends GraphicsProgram {
    private static final double BALL_DIAMETER = 50;
    private static final int SPEED = 1;
    private static final int DELAY = 2;
    private GOval ball; // instance variable

    public void run() {
        drawBall();
        int vx = SPEED;
        while (true) {
            if (ball.getX() + BALL_DIAMETER >= getWidth() || ball.getX() < 0) {
                vx = -vx;
            }
            ball.move(vx, 0);
            pause(DELAY);
        }
    }

    private void drawBall() {
        ball = new GOval(BALL_DIAMETER, BALL_DIAMETER);
        ball.setFilled(true);
        ball.setColor(Color.orange);
        add(ball, 0, (double) getHeight() / 2 - BALL_DIAMETER / 2);
    }
}
