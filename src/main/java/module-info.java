module net.liceo.afb.magic_coleccioncartas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;

    // Abrir el paquete tanto a Hibernate como a JavaFX
    opens net.liceo.afb.magic_coleccioncartas to javafx.fxml, org.hibernate.orm.core;

    exports net.liceo.afb.magic_coleccioncartas;
}
