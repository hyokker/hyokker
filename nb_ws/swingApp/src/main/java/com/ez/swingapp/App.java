package com.ez.swingapp;

import com.ez.view.LoginGUI;
import com.ez.view.MemberFrame;
import com.ez.view.ProductGUI;
import com.ez.view.SubZipcode;
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
        
        ProductGUI f = new ProductGUI();
        //LoginGUI f= new LoginGUI();
        //MemberFrame f= new MemberFrame();
        //SubZipcode f = new SubZipcode();
        f.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}