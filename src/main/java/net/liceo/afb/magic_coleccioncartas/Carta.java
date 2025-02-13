package net.liceo.afb.magic_coleccioncartas;

public class Carta {
    private String color;
    private int mana;
    private String tipo;
    private String descripcion;

    public Carta(String color, int mana, String tipo) {
        this.color = color;
        this.mana = mana;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
