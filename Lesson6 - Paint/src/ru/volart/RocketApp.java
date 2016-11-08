package ru.volart;

import ru.volart.geometry.Rocket;
import ru.volart.ui.Panel;

import javax.swing.*;

/**
 * Created by katerina on 11/9/16.
 */
public class RocketApp {
    private static final String TITLE = "Rocket";


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createUI());
    }

    private static void createUI() {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.setSize(300, 300);
        frame.add(panel);
        frame.setVisible(true);

        panel.setShape(new Rocket());

    }
}
