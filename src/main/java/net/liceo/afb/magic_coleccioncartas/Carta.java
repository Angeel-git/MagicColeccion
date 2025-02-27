package net.liceo.afb.magic_coleccioncartas;

import javax.persistence.*;

@Entity
@Table(name = "Cartas_tabla")
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String color;
    @Column
    private int mana;
    @Column
    private String tipo;
    @Column
    private String descripcion;

    public Carta(){}

    public Carta(String nombre, String color, int mana, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.mana = mana;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", mana=" + mana +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getMana() {
        return mana;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}   