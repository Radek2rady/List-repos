package com.greenfoxacademy.barnsleyfern;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PlantPanel extends JPanel {

    // new x = a*x + b*y
    // new y = c*x + d*y

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();

        int xStart = this.getWidth() / 2;
        int yStart = this.getHeight();

        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;

        double f = 0;

        double x = 0;
        double y = 0;

        g.setColor(Color.decode("#33a663"));

        for (int i = 0; i < DrawPlant.iterationCount; i++) {
            double randomValue = random.nextDouble();
            if (randomValue <= 0.01) {
                a = 0;
                b = 0;
                c = 0;
                d = 0.16;
                f = 0;
            } else if (randomValue <= 0.08) {
                a = 0.20;
                b = -0.26;
                c = 0.23;
                d = 0.22;
                f = 1.60;
            } else if (randomValue <= 0.15) {
                a = -0.15;
                b = 0.28;
                c = 0.26;
                d = 0.24;
                f = 0.44;
            } else {
                a = 0.85;
                b = 0.04;
                c = -0.04;
                d = 0.85;
                f = 1.60;
            }

            double newX = a * x + b * y;
            double newY = c * x + d * y + f;
            x = newX;
            y = newY;

            int drawnX = (int) Math.round(xStart + x * getWidth() / 11);
            int drawnY = (int) Math.round(yStart - y * getHeight() / 11);

            g.drawRect(drawnX, drawnY, 1,1);


        }
    }
}
