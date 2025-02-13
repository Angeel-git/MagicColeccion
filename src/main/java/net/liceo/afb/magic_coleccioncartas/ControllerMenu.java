package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ControllerMenu {
    @FXML
    public HBox HBoxMenu;
    @FXML
    public Label NombreCarta, LabelMana, Error;
    public TextField TextFieldMana, TextFieldNombre;
    public VBox VBoxCarta;
    public MenuButton ColoresMenu, TipoMenu;
    public Button InsertCarta, AgregarCarta;

    Log log = new Log();


    public void initialize() {
        // Agregar evento a cada item del MenuButton
        for (MenuItem item : ColoresMenu.getItems()) {
            item.setOnAction(event -> {
                // Actualizar el texto del MenuButton con el color seleccionado
                ColoresMenu.setText(item.getText());
            });
        }
        for (MenuItem item : TipoMenu.getItems()) {
            item.setOnAction(event -> {
                // Actualizar el texto del MenuButton con el tipo de Carta seleccionado
                TipoMenu.setText(item.getText());
            });
        }
    }


    public void PedirDatosCarta(ActionEvent event) {

        if(AgregarCarta.isArmed() && !(TextFieldNombre.getText().isEmpty())){   //Si pulsa el boton y el nombre no esta en blanco

            System.out.println("Pedir datos para añadir la carta \"" + TextFieldNombre.getText() + "\"");

            //Oculto el error
            Error.setManaged(false); Error.setVisible(false);

            //Muestro los datos que tiene que rellenar el usuario para añadir la carta a la basae de datos
            AgregarCarta.setDisable(true);
            VBoxCarta.setManaged(true);
            NombreCarta.setManaged(true); NombreCarta.setText(TextFieldNombre.getText()); TextFieldNombre.setDisable(true);
            ColoresMenu.setManaged(true); ColoresMenu.setVisible(true);
            VBoxCarta.setManaged(true);
            LabelMana.setManaged(true);
            TextFieldMana.setManaged(true);
            TipoMenu.setManaged(true); TipoMenu.setVisible(true);
            InsertCarta.setManaged(true);

        }else{
            Error.setManaged(true);
            Error.setText("Tienes que introducir un nombre\npara la carta que quieres guardar");
        }
    }

    public void InsertCarta(ActionEvent event) {
        try{
            int mana = Integer.parseInt(TextFieldMana.getText().trim());
        System.out.println("Nombre-> " + NombreCarta.getText() + "\nColor -> " + ColoresMenu.getText() +
                "\nMana-> " + mana +
                "\nTipo de carta -> " + TipoMenu.getText());

            log.insertarCarta(NombreCarta.getText(), ColoresMenu.getText(), mana,TipoMenu.getText());

        }catch (NumberFormatException nfe){
            System.err.println("El mana tiene que ser un numero entero");
        }
    }
}