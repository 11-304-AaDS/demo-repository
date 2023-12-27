package org.example;



import org.example.IFunction;

import javax.swing.*;
import java.awt.*;

public class PlotFunction extends JFrame {

    private IFunction function;
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;
    private static final int SCALE = 2;

    public PlotFunction(IFunction function) {
        super("График функции");
        this.function = function;

        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);

        g2d.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT); //Y
        for (int i = 0; i < HEIGHT / 2; i = i + 10) {
            g2d.drawLine(WIDTH / 2 - 3, HEIGHT / 2 + i, WIDTH / 2 + 3, HEIGHT / 2 + i);
            g2d.drawLine(WIDTH / 2 - 3, HEIGHT / 2 - i, WIDTH / 2 + 3, HEIGHT / 2 - i);
        }

        g2d.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2); //X
        for (int i = 0; i < WIDTH; i = i + 10) {
            g2d.drawLine(WIDTH / 2 - i, HEIGHT / 2 - 3, WIDTH / 2 - i, HEIGHT / 2 + 3);
            g2d.drawLine(WIDTH / 2 + i, HEIGHT / 2 - 3, WIDTH / 2 + i, HEIGHT / 2 + 3);
        }

        g2d.drawString("Y", WIDTH / 2 + 10, 50);
        g2d.drawString("X", WIDTH - 20, HEIGHT / 2 + 20);

        g2d.setColor(Color.RED);

        Font currentFont = g2d.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 3F);
        g2d.setFont(newFont);

        g2d.drawString("Спираль", 100, 120);

        g2d.setStroke(new BasicStroke(SCALE));
        for (double t = 0; t < 15*3.14; t = t + 0.01) {
            g2d.fillRect((int) (t * function.Sin(t)*5)+400, (int) (t* function.Cos(t)*5) + 300, 2, 2);
        }
    }
}
