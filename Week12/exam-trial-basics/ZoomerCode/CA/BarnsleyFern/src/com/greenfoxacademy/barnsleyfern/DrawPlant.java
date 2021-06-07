package com.greenfoxacademy.barnsleyfern;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPlant extends JFrame {

    public static int iterationCount = 1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawPlant frame = new DrawPlant();
                PlantPanel panel = new PlantPanel();
                panel.setPreferredSize(new Dimension(640,640));
                panel.setBackground(Color.WHITE);
                frame.add(panel, BorderLayout.CENTER);

                JPanel controlPanel = new JPanel();
                JSlider slider = new JSlider();
                slider.setMinimum(0);
                slider.setMaximum(200000);
                slider.setValue(iterationCount);
                slider.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        JSlider slider = (JSlider) e.getSource();
                        iterationCount = slider.getValue();
                    }
                });

                controlPanel.add(slider);

                JButton drawButton = new JButton();
                drawButton.setText("Redraw");
                drawButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().repaint();
                    }
                });

                controlPanel.add(drawButton);

                // Layout managers
                frame.add(controlPanel, BorderLayout.NORTH);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
