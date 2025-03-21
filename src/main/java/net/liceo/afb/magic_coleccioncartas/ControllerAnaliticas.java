package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ControllerAnaliticas {
    public Label LabelAnaliticas;
    private Escenas escenas = new Escenas();


    public void initialize(){
        System.out.println("Escena -> Analíticas");
        LabelAnaliticas.setText("Número de cartas de cada tip\n " +
                        "Tierra -> \n" +
                        "Criaturas -> \n" +
                        "Encantamientos -> \n" +
                        "Conjuros -> \n" +
                        "Instantáneos -> \n" +
                        "Artefactos -> \n");
    }


    public void EscenaMenu(ActionEvent event) {
        escenas.Menu(event);
    }
}
