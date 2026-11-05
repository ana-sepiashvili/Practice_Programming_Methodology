import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Problem44 extends GraphicsProgram {
    private GOval ball;
    private static final int RADIUS = 50;
    private static final int SPEED = 1;
    private static final int DELAY = 4;

    public void run() {
        addMouseListeners();
        while (true) {
            if (ball != null && ball.getY() + 2 * RADIUS <= getHeight()) {
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
            ball.setColor(Color.PINK);
            add(ball, e.getX() - RADIUS, e.getY() - RADIUS);
        } else {
            ball.setLocation(e.getX() - RADIUS, e.getY() - RADIUS);
        }
    }
}
