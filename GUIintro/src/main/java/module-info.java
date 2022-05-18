module com.zaremba.guiintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zaremba.guiintro to javafx.fxml;
    exports com.zaremba.guiintro;
}