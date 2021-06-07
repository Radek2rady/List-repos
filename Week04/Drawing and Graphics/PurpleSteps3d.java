import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {


    steps(5, graphics);

  }

  public static void steps(int nr, Graphics graphics) {
    int position = 0;
    int size = 8;
    for (int i = 1; i < nr + 2; i++) {
      size = size + 10;
      position = size-10 + position;
      graphics.setColor(Color.decode("#af5bd9"));
      graphics.fillRect(position, position, size, size);
      graphics.setColor(Color.black);
      graphics.drawRect(position, position, size, size);
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
