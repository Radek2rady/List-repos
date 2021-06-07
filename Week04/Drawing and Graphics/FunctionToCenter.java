import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    toCenter(0, 0, graphics);
  }

  static public void toCenter(int x, int y, Graphics graphics) {
    int distance = 20;
    int position = 0;
    int center = WIDTH / 2;
    for (int i = 0; i < 17; i++) {
      graphics.setColor(Color.black);
      graphics.drawLine(position + (i*distance), position, center, center);
    }
    for (int i = 0; i < 17; i++) {
      graphics.setColor(Color.green);
      graphics.drawLine(position, position + (i*distance), center, center);
    }
    for (int i = 0; i < 17; i++) {
      graphics.setColor(Color.blue);
      graphics.drawLine(WIDTH - (i*distance), WIDTH, center, center);
    }
    for (int i = 0; i < 17; i++) {
      graphics.setColor(Color.red);
      graphics.drawLine(WIDTH, WIDTH - i*distance, center, center);
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
