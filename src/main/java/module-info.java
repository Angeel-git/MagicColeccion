module net.liceo.afb.magic_coleccioncartas {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.liceo.afb.magic_coleccioncartas to javafx.fxml;
    exports net.liceo.afb.magic_coleccioncartas;
}