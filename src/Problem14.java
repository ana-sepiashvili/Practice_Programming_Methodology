import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.Color;

public class Problem14 extends GraphicsProgram {
    public void run() {
        drawFace();
        drawEyes();
        drawMouth();
    }

    private void drawMouth() {
        int centerOfX = getWidth() / 2;
        int centerOfY = getHeight() / 2;

        double mouthWidth = 150;
        double mouthHeight = 60;
        double distanceFromY = 50;

        GOval mouth = new GOval(mouthWidth, mouthHeight);
        mouth.setFilled(true);
        mouth.setColor(Color.blue);
        mouth.setFillColor(Color.cyan);
        add(mouth, centerOfX - mouthWidth / 2, centerOfY + distanceFromY);
    }

    private void drawEyes() {
        int eyeDiameter = 70;

        int centerOfX = getWidth() / 2;
        int centerOfY = getHeight() / 2;

        int distanceFromXCenter = 15;
        int distanceFromYCenter = 20;

        GOval leftEye = new GOval(eyeDiameter, eyeDiameter);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.yellow);
        leftEye.setColor(Color.blue);
        add(leftEye, centerOfX - distanceFromXCenter - eyeDiameter, centerOfY - eyeDiameter - distanceFromYCenter);

        GOval rightEye = new GOval(eyeDiameter, eyeDiameter);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.yellow);
        rightEye.setColor(Color.blue);
        add(rightEye, centerOfX + distanceFromXCenter, centerOfY - eyeDiameter - distanceFromYCenter);
    }

    private void drawFace() {
        double width = 220;
        double height = 280;

        int centerOfX = getWidth() / 2;
        int centerOfY = getHeight() / 2;

        GRect face = new GRect(width, height);
        face.setColor(Color.green);
        face.setFilled(true);
        add(face, centerOfX - width / 2, centerOfY - height / 2);
    }
}
