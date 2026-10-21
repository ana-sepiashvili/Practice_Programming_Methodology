import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.Color;

public class Problem22 extends GraphicsProgram {

    public void run() {
        double squareLength = (double) getHeight() / 8;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                GRect square = new GRect(squareLength, squareLength);
                boolean isFilled = (i + j) % 2 != 0;
                square.setFilled(isFilled);
                square.setColor(Color.pink);
                add(square, j * squareLength, i * squareLength);
            }
        }
    }
}
