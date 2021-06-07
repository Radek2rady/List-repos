import com.sun.jdi.Value;

import javax.swing.*;

import java.awt.*;
import java.security.Key;
import java.util.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    String color = "red";
    int m3 = 3000;
    drawingRed(900, "red", graphics);
    drawingRainbow(graphics);
  }

  public static void drawingRed(int m3, String color, Graphics graphics) {
    double sqrt = Math.sqrt(m3);

    String hexaColor = "#B50607";

    graphics.setColor(Color.decode(hexaColor));
    graphics.fillRect(WIDTH / 2 - (int) sqrt / 2, HEIGHT / 2 - (int) sqrt / 2, (int) sqrt, (int) sqrt);
  }

  public static void drawingRainbow(Graphics graphics) {
    List<String> colorsWord = new ArrayList<String>(Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet"));
    List<String> colorsHexa = new ArrayList<String>(Arrays.asList("#B50607", "#FFA502", "#FFFF00", "#008000", "#0000FF", "#4B0082", "#EE82EE"));

    // int indexColorsWord = colorsWord.indexOf(color);

   // for (int i = 1; i < colorsHexa.size(); i++) {
   //   String hexaColor = colorsHexa.get(i-1);

/* didn't find solution :(
      //  colors.get(i);
      colors.put("red", "#B50607");
      colors.put("orange", "#FFA500");
      colors.put("yellow", "#FFFF00");
      colors.put("green", "#008000");
      colors.put("blue", "#0000FF");
      colors.put("indigo", "#4B0082");
      colors.put("violet", "#EE82EE");
*/
      for (int i = 0; i < 7; i++) {
        String hexaColor = colorsHexa.get(i);

        graphics.setColor(Color.decode(hexaColor));
        graphics.fillRect(0 + 22*i, 0 + 22*i, (WIDTH - 44*i),(WIDTH - 44*i));
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
