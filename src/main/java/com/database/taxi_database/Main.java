package com.database.taxi_database;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        OperatorMainPage operatorMainPage = new OperatorMainPage();
        stage.setTitle("Operator Space");
        stage.setScene(OperatorMainPage.operatorMainPage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}