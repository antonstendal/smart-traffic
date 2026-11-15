package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.ui.MainWindow;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        MainWindow mainWindow = new MainWindow(stage);
        mainWindow.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}