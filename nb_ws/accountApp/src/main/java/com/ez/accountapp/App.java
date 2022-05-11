package com.ez.accountapp;

import com.ez.view.LoginGUI;
import com.ez.view.alistGUI;
import com.ez.view.amemberFrame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();
        /*
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        */
       // amemberFrame f = new amemberFrame();
       // alistGUI f = new alistGUI();
        LoginGUI f = new LoginGUI();
        f.show();
    }

    public static void main(String[] args) {
        launch();
    }

}