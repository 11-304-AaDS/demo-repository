package org.example;


import javax.swing.*;

public class MainPlotFunction {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlotFunction(new MyFunction());
            }
        });
    }
}