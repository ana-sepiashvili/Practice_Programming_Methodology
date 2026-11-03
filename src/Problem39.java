import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;

public class Problem39 extends GraphicsProgram {
    private static final double BALL_DIAMETER = 50;
    private static final int SPEED = 1;
    private static final int DELAY = 5;
    private GOval ball; // instance variable

    public void run() {
        drawBall();
        while (ball.getX() + BALL_DIAMETER <= getWidth()) {
            ball.move(SPEED, 0);
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
