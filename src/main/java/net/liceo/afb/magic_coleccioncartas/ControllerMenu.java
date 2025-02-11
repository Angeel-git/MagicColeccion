package net.liceo.afb.magic_coleccioncartas;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerMenu {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}