package com.example.chainclothingproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/CustomerDashboard.fxml"));
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Warehouse/WarehouseDashboard.fxml"));
>>>>>>> 0f856be399ffc18f4d934bc71946e9e7c12b6585
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}