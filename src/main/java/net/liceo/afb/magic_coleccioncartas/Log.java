package net.liceo.afb.magic_coleccioncartas;

public class Log {
    private final Ficheros f = new Ficheros();
    private final Hibernate hibernate = new Hibernate();

    public Log() {}

    public void insertarCarta(Carta carta) {
        f.RegistoNuevaCarta(carta); //Metemos la carta en un fichero xml
        hibernate.insertCarta(carta);   //Metemos una nuve acarta en hibernate
    }
}
