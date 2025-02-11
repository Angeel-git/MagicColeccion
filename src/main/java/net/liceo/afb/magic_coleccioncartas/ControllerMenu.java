package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerMenu {
    @FXML
    public HBox HBoxMenu;
    @FXML
    public Label NombreCarta, LabelMana;
    public TextField TextFieldMana;
    public VBox VBoxCarta;
    public MenuButton ColoresMenu, TipoMenu;
    public Button InsertCarta, AgregarCarta;

    Log log = new Log();


    public void PedirDatosCarta(ActionEvent event) {
        System.out.println("Pedir datos para añadir carta");
        

            //Muestro los datos que tiene que rellenar el usuario para añadir la carta a la basae de datos
        VBoxCarta.setManaged(true);
        NombreCarta.setManaged(true);
        ColoresMenu.setManaged(true); ColoresMenu.setVisible(true);
        VBoxCarta.setManaged(true);
        LabelMana.setManaged(true);
        TextFieldMana.setManaged(true);
        TipoMenu.setManaged(true); TipoMenu.setVisible(true);
        InsertCarta.setManaged(true);

    }
}