package net.liceo.afb.magic_coleccioncartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Escenas {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void Buscador(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MagicColeccion.class.getResource("BuscarCarta.fxml"));
            root = fxmlLoader.load(); // Cargar solo UNA vez

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, 850, 500); // Usar root en lugar de cargar dos veces

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al cambiar de escena: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void Menu(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MagicColeccion.class.getResource("Menu.fxml"));
            root = fxmlLoader.load(); // Cargar solo UNA vez

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, 850, 500); // Usar root en lugar de cargar dos veces

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al cambiar de escena: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
