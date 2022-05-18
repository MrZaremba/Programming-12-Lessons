package com.zaremba.guiintro;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class GetInfoController implements Initializable {
    public TextField textGlobal;
    public AnchorPane root;
    public ImageView allDoneIcon;
    private Stage stage;

    public void allDone(ActionEvent actionEvent) {
        GlobalVariable.name = textGlobal.getText();
        System.out.println("all done");
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater( () ->{
            stage = (Stage) root.getScene().getWindow();
        });

    }

    public void changeIcon(ActionEvent actionEvent) {
        InputStream stream = getClass().getResourceAsStream("/icons/thumbs-down.png");
        Image icon = new Image(stream);
        allDoneIcon.setImage(icon);
    }
}
