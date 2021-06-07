package Wanderer.src;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class Board extends JComponent implements KeyListener {

    protected int testBoxX;
    protected int testBoxY;
    static int sizeImg = 720 / 12;
    protected int levelArea;
    PositionedImage image;


    public Board() {
        testBoxX = 300;
        testBoxY = 300;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//         here you have a 720x720 canvas
//         you can create and draw an image using the class below e.g.

        for (int i = 0; i < 10 * sizeImg; i += sizeImg) {
            for (int j = 0; j < 10 * sizeImg; j += sizeImg) {
                if ((i == 3 * sizeImg) && (j < 3 * sizeImg) ||
                        ((i > 0 * sizeImg && i < 4 * sizeImg) && j == 2 * sizeImg) ||
                        ((i == 5 * sizeImg) && ((j > 0 * sizeImg) && (j < 5 * sizeImg))) ||
                        ((i > 4 * sizeImg && i < 9 * sizeImg) && j == 4 * sizeImg) ||
                        ((i >= 0 * sizeImg && i < 4 * sizeImg) && j == 4 * sizeImg) ||
                        ((i > 6 * sizeImg && i < 9 * sizeImg) && j == 1 * sizeImg) ||
                        ((i > 6 * sizeImg && i < 9 * sizeImg) && j == 2 * sizeImg) ||
                        (i == 1 * sizeImg && (j > 3 * sizeImg && j < 7 * sizeImg)) ||
                        (i == 3 * sizeImg && (j > 3 * sizeImg && j < 7 * sizeImg)) ||
                        (i == 5 * sizeImg && (j > 5 * sizeImg && j < 8 * sizeImg)) ||
                        (i == 6 * sizeImg && (j > 5 * sizeImg && j < 8 * sizeImg)) ||
                        (i == 8 * sizeImg && (j > 5 * sizeImg && j < 9 * sizeImg)) ||
                        ((i > 0 * sizeImg && i < 4 * sizeImg) && j == 8 * sizeImg) ||
                        ((i > 4 * sizeImg && (i < 7 * sizeImg)) && j == 9 * sizeImg) ||
                        ((i == 3 * sizeImg) && j == 9 * sizeImg)) {
                    image = new PositionedImage("src/Wanderer/src/img/wall.png", i, j);
                    image.draw(g);
                } else {
                    image = new PositionedImage("src/Wanderer/src/img/floor.png", i, j);
                    image.draw(g);
                }
            }
        }

        image = new PositionedImage("src/Wanderer/src/img/hero-down.png", 0, 0);
        image.draw(g);


    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= sizeImg;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += sizeImg;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= sizeImg;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += sizeImg;
        }
        repaint();

    }

}