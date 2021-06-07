import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    board(graphics);


  }

  public static void board(Graphics graphics) {
    int row = 0;
    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        int size = 40;
        int position = (i - 1) * 40;
        if ((i + j) % 2 == 0) {
          graphics.setColor(Color.black);
          graphics.fillRect(row + (j-1) * size, position, size, size);
        } else {
          graphics.setColor(Color.white);
          graphics.fillRect(row + (j-1) * size, position, size, size);
        }

      }
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
