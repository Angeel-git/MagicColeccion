package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ControllerMenu {

    @FXML
    public Label NombreCarta, LabelMana;
    public TextField TextFieldMana, TextFieldNombre;
    public VBox VBoxCarta;
    public MenuButton ColoresMenu, TipoMenu;
    public Button InsertCarta, AgregarCarta;

    Escenas escenas = new Escenas();
    Log log = new Log();
    Alertas alerta = new Alertas();


    public void initialize() {

        System.out.println("Escena -> Menú");

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
            System.err.println("El usuario tiene que introducir el nombre de la carta antes de continuar");

            alerta.informa("NombreCarta", "",
                        "Tienes que introducir primero el nombre de la carta.");
        }
    }

    public void InsertCarta(ActionEvent event) {
        try{
            int mana = Integer.parseInt(TextFieldMana.getText().trim());
            String nombre = NombreCarta.getText().trim();
            String color = ColoresMenu.getText().trim();
            String tipo = TipoMenu.getText().trim();

            if(color.equals("Color de carta")||tipo.equals("Tipo de carta")){
                alerta.informa("Campos Color/Tipo", "Campos \"color\" y \"tipo\"",
                        "Los campos \"color\" y/o \"tipo\" no son validos, tienes que cambiar los valores establecidos");
            }else{
                Carta carta = new Carta(nombre, color, mana, tipo);
                log.insertarCarta(carta);
                System.out.println(carta);
            }
        }catch (NumberFormatException nfe){
            System.err.println("El mana tiene que ser un numero entero");

            alerta.error("Alerta_Mana", "Valor del mana incorrecto",
                                "El valor del mana debe ser un numero entero");
        }
    }

    public void EscenaBuscador(ActionEvent event) {
        escenas.Buscador(event);
    }

    public void EscenaListado(ActionEvent event) {
        escenas.Listado(event);
    }

    public void EscenaAnaliticas(ActionEvent event) {
        escenas.Analiticas(event);
    }

}