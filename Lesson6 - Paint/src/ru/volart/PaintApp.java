package ru.volart;

import ru.volart.geometry.Car;
import ru.volart.ui.Panel;

import javax.swing.*;

public class PaintApp {

    private static final String TITLE = "Paint";


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createUI());
    }

    private static void createUI() {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.setSize(250, 250);
        frame.add(panel);
        frame.setVisible(true);

        panel.setShape(new Car());

    }
}
