module com.mycompany.t19.persona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t19.persona to javafx.fxml;
    exports com.mycompany.t19.persona;
}
