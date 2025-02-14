package net.liceo.afb.magic_coleccioncartas;

import javafx.scene.control.Alert;

public class Alertas {
    public void error(String titulo, String cabercero, String contenido){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle(titulo);
        a.setHeaderText(cabercero);
        a.setContentText(contenido);
        a.showAndWait();
    }

    public void informa(String titulo, String cabercero, String contenido){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle(titulo);
        a.setHeaderText(cabercero);
        a.setContentText(contenido);
        a.showAndWait();
    }

}
