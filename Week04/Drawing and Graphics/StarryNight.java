import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

nightSky(graphics);
  }
  static void nightSky (Graphics graphics) {

    graphics.setColor(Color.black);
    graphics.fillRect(0,0, WIDTH, HEIGHT);
    Random rand = new Random();
    for (int i = 0; i < 20; i++) {
      int rand_int1 = rand.nextInt(300);
      int rand_int2 = rand.nextInt(255);
      Color randomColor = new Color(rand_int2, rand_int2, rand_int2);
      graphics.setColor(randomColor);
      graphics.fillRect(rand_int1, rand_int2, 20, 20);


    }}

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
