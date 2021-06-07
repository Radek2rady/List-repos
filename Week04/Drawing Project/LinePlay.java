import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

    lines(graphics);
  }
  public static void lines (Graphics graphics){
    for (int i = 0; i < 13; i++) {
      int interval = 20;
      graphics.setColor(Color.decode("#8b32a8"));
      graphics.drawLine(50 + (i*interval), 3, 300, 20 + (i*interval));
    }

    for (int i = 0; i < 14; i++) {
      int interval = 20;
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH-40 - (i*interval), HEIGHT - 3, 3, HEIGHT-20 - (i*interval));
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
