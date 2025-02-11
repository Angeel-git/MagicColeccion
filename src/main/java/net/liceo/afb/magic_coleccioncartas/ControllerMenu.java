package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerMenu {
    @FXML
    public HBox HBoxMenu;
    @FXML
    public Label NombreCarta;
    public TextField TextFieldMana, TextFieldTipo;
    public VBox VBoxCarta;
    public MenuButton ColoresMenu, TipoMenu;

    Log log = new Log();


    public void PedirDatosCarta(ActionEvent event) {

    }
}