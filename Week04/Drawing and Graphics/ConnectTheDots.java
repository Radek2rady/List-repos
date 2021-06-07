import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // An array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] xy = {
      {10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] xy2 = {
      {50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    drawingBox(xy, graphics);
    drawingFox(xy2, graphics);

  }

  static void drawingBox(int[][] xy, Graphics graphics) {

    int[] y = new int[xy.length];
    for (int i = 0; i < xy.length; i++) {
      y[i] = xy[i][1];
    }

    int[] x = new int[xy.length];
    for (int j = 0; j < xy.length; j++) {
      x[j] = xy[j][0];
    }
    int positionx = 0;
    int positiony = 0;
    for (int i = 0; i < x.length; i++) {
      if (i < x.length - 1) {
        positionx = x[i + 1];
        positiony = y[i + 1];
      } else {
        positionx = x[0];
        positiony = y[0];
      }
      graphics.setColor(Color.green);
      graphics.drawLine(x[i], y[i], positionx, positiony);
    }
  }

    static void drawingFox(int[][] xy2, Graphics graphics) {

      int[] y = new int[xy2.length];
      for (int i = 0; i < xy2.length; i++) {
        y[i] = xy2[i][1];
      }

      int[] x = new int[xy2.length];
      for (int j = 0; j < xy2.length; j++) {
        x[j] = xy2[j][0];
      }
      int positionx = 0;
      int positiony = 0;
      for (int i = 0; i < x.length; i++) {
        if (i < x.length-1) {
          positionx = x[i + 1];
          positiony = y[i + 1];
        } else {
          positionx = x[0];
          positiony = y[0];
        }
        graphics.setColor(Color.green);
        graphics.drawLine(x[i], y[i], positionx, positiony);
      }


    }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
