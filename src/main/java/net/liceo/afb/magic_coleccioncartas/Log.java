package net.liceo.afb.magic_coleccioncartas;

public class Log {
    private final Ficheros f = new Ficheros();

    public Log() {}

    public void insertarCarta(String nombre, String color, int mana, String tipo) {
        f.RegistoNuevaCarta(nombre, color, mana, tipo);
    }
}
