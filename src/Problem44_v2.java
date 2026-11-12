import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Problem44_v2 extends GraphicsProgram {
    private static final int RADIUS = 20;
    private static final int SPEED = 2;
    private static final int DELAY = 4;
    private GOval ball;

    public void run() {
        addMouseListeners();
        while (true) {
            if (ball != null && ball.getY() <= getHeight() - 2 * RADIUS) {
                ball.move(0, SPEED);
            }
            pause(DELAY);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (ball == null) {
            ball = new GOval(2 * RADIUS, 2 * RADIUS);
            ball.setFilled(true);
            ball.setColor(Color.red);
            add(ball, e.getX() - RADIUS, e.getY() - RADIUS);
        } else {
            ball.setLocation(e.getX() - RADIUS, e.getY() - RADIUS);
        }
    }
}
