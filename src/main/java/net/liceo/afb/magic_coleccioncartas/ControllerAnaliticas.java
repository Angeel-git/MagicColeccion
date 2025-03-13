package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;

public class ControllerAnaliticas {
    private Escenas escenas = new Escenas();


    public void initialize(){
        System.out.println("Escena -> Analíticas");
    }


    public void EscenaMenu(ActionEvent event) {
        escenas.Menu(event);
    }
}
