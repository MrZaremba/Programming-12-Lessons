module com.zaremba.module53javafxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zaremba.module53javafxcss to javafx.fxml;
    exports com.zaremba.module53javafxcss;
}