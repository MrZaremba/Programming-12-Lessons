package com.zaremba.guiintro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloController {
    public Label lblName;
    public TextField textName;
    public Label lblAddOne;
    public ListView<Person> listView;
    public Label lblList1;
    public Label lblList2;


    public void getName() {
        lblName.setText(GlobalVariable.name);
    }


    public void addOne() {
       /*int current = Integer.parseInt(lblAddOne.getText());
        int addition = 0;
        boolean keepTryin = true;
        while (keepTryin) {
            keepTryin = false;
            try {
                addition = Integer.parseInt(textName.getText());
            } catch (NumberFormatException e) {
                addition = 0;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Thats not a number");
                alert.showAndWait();
            }
        }
        current += addition;
        lblAddOne.setText("" + current);
        loadWindow("/layouts/getInfo.fxml","Get Information Page");

        */
        loadWindow("/layouts/table.fxml", "A table");
    }

    public void getPerson() {
        Person person = listView.getSelectionModel().getSelectedItem();
        if (person == null) {
            return;
        }
    }

    private void loadWindow(String location, String title) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource(location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}