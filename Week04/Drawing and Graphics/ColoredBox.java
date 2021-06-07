import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
graphics.setColor(Color.CYAN);
    graphics.fillRect(10, 55, 200, 45);

    graphics.setColor(Color.red);
    graphics.drawLine(10, 55, 210, 55);
    graphics.setColor(Color.blue);
    graphics.drawLine(210, 55, 210, 100);
    graphics.setColor(Color.black);
    graphics.drawLine(210, 100, 10, 100);
    graphics.setColor(Color.orange);
    graphics.drawLine(10, 100, 10, 55);

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
