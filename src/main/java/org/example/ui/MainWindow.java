package org.example.ui;

//Scene
//Layout
//SimulationView

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.render.SceneRenderer;

/// Main window
public class MainWindow {

    private final Stage stage;
    private SimulationView view;
    private SceneRenderer sceneRenderer;

    public MainWindow(Stage stage) {
        this.stage = stage;
        initialize();
    }

    private void initialize() {
        createComponents();
        configureScene();
        configureStage();
    }

    private void createComponents() {
        view = new SimulationView();
        sceneRenderer = new SceneRenderer(view.getCanvas());
        sceneRenderer.render();
    }

    private void configureScene() {
        StackPane root = new StackPane(view.getCanvas());
        Scene scene = new Scene(root, 1000, 700);

        stage.setScene(scene);
    }


    private void configureStage() {
        stage.setTitle("Smart traffic");
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.setResizable(true);
    }

    public void show() {
        stage.show();
    }
}
