import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

    star(graphics);
  }
static int interval = 11;

  public static void star(Graphics graphics) {
    for (int i = 0; i < 14; i++) {
        graphics.setColor(Color.green);
        graphics.drawLine(WIDTH / 2, (i * interval), WIDTH / 2 - (i * interval), WIDTH / 2);
      }


    for (int i = 0; i < 14; i++) {
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2, (i * interval), WIDTH / 2 + (i * interval), WIDTH / 2);
    }

    for (int i = 0; i < 14; i++) {
      if (i == 0) {
        continue;
      } else {
          graphics.setColor(Color.green);
          graphics.drawLine(WIDTH / 2 + (i * interval), WIDTH / 2, WIDTH / 2, WIDTH - (i * interval));
        }
      }
    for (int i = 0; i < 14; i++) {
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2 - (i * interval), WIDTH / 2, WIDTH / 2, WIDTH - (i * interval));
    }

  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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
