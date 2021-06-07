package Triangles;

import javax.swing.*;

import java.awt.*;

import static java.lang.StrictMath.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesNew {
    static int interval = 20;
    static int X1base = 0;
    static int Y1base = 850;


    public static void mainDraw(Graphics g) {
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]
        for (int i = 21; i > 0; i--) {
            X1base = X1base + interval / 2;
            Y1base = Y1base - (int) (interval / 2 * sqrt(3));
            for (int j = 0; j < 21; j++) {
                triangles(g, X1base + j * interval, Y1base);
            }

        }

    }

    public static void triangles(Graphics g, int X1base, int Y1base) {
        g.setColor(Color.black);
        g.drawLine(X1base, Y1base, X1base + interval, Y1base);
        g.drawLine(X1base, Y1base, X1base + interval / 2, Y1base - (int) (interval / 2 * sqrt(3)));
        g.drawLine(X1base + interval, Y1base, X1base + interval / 2, Y1base - (int) (interval / 2 * sqrt(3)));

    }

    //    Don't touch the code below
    static int WIDTH = 450;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
