import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram {

    public void run() {
        int numLines = 10;
        drawHorizontalLines(numLines);
        drawVerticalLines(numLines);
    }

    private void drawVerticalLines(int numLines) {
        double distanceX = (double) getWidth() / numLines;

        for (int i = 1; i < numLines; i++) {
            GLine vertical = new GLine(distanceX * i, 0, distanceX * i, getHeight());
            add(vertical);
        }
    }

    private void drawHorizontalLines(int numLines) {
        double distanceY = (double) getHeight() / numLines;
        for (int i = 1; i < numLines; i++) {
            GLine horizontal = new GLine(0, i * distanceY, getWidth(), i * distanceY);
            add(horizontal);
        }
    }
}
