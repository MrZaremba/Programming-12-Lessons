package com.zaremba.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainWIndow {

    public void opensWindow() {
        //loadWindow("newWindow.fxml","New Window Title");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("This is an alert");
        alert.setHeaderText("Header Text");
        alert.showAndWait();
    }

    private void loadWindow(String location, String title){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/fxml/" + location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
