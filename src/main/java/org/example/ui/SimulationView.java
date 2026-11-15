package org.example.ui;

import javafx.scene.canvas.Canvas;


public class SimulationView {

    private final Canvas canvas;

    public SimulationView() {
        this.canvas = new Canvas(800, 600);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
