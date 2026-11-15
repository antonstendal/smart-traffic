package org.example.render;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SceneRenderer {

    private final GraphicsContext gc;

    public SceneRenderer(Canvas canvas) {
        this.gc = canvas.getGraphicsContext2D();
    }

    public void render() {
        gc.setFill(Color.GRAY);
        gc.fillRect(100, 100, 100, 100);
        gc.setFill(Color.RED);
        gc.fillRect(300, 300 , 100, 100);
    }
}
