package net.liceo.afb.magic_coleccioncartas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MagicColeccion extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MagicColeccion.class.getResource("xml/Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 500);

        stage.setTitle("Coleccion Cartas Magic");

        try {
            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("imgs/Logo.jpg")));
            stage.getIcons().add(icon);
        } catch (NullPointerException e) {
            System.err.println("Error al cargar el icono.");
        }

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}