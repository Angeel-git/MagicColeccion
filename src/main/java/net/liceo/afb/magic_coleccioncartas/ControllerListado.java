package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;

public class ControllerListado {
    private Escenas escenas = new Escenas();


    public void initialize(){
        System.out.println("Escena -> ListarCartas");
    }

    public void EscenaMenu(ActionEvent event) {
        escenas.Menu(event);
    }
}
