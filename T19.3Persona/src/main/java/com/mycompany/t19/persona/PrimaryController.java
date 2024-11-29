package com.mycompany.t19.persona;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class PrimaryController {
     @FXML
    private RadioButton btnDis;
    @FXML
    private RadioButton btnNDis;
    @FXML
    private ButtonBar gbtn;
    
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtEstado;
    @FXML
    private TextField txtNombre;
    @FXML
    void Mostrar(ActionEvent event) {
        String no = txtNombre.getText();
        String ap = txtApellido.getText();
        int ed = Integer.parseInt(txtEdad.getText());
        String es = txtEstado.getText();
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("MOSTRAR INFORMACIÓN");
        alert.setHeaderText("Datos ingresados de la Persona:");
        alert.setContentText(no+" "+ap+", de "+ed+" años de edad. \nEstado:"+es);
        alert.show();
    }
}
