package com.zaremba.libraries;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindow implements Initializable{
    public ImageView mainImage;
    private Stage stage;
    private File file;
    private Image image;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> stage = (Stage)mainImage.getScene().getWindow());
    }

    public void openFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        file = fileChooser.showOpenDialog(stage);
        try (InputStream stream = new FileInputStream(file)){
            image = new Image(stream);
            mainImage.setImage(image);
            mainImage.setRotate(90);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
