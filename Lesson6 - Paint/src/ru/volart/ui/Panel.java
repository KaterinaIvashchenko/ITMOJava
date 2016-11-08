package ru.volart.ui;

import javax.swing.*;
import java.awt.*;

import ru.volart.geometry.Shape;

public class Panel extends JPanel {

    private Shape shape;

    public Panel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(shape != null){
            shape.paint(g);
        }

    }


    public void setShape(Shape shape) {
        this.shape = shape;
        repaint();
    }
}
