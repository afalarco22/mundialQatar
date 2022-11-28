package org.example.clases;

public class Jugador extends Persona {

    // atributos

    private String posicion;

    private Integer numeroCamista;

    // contructor


    public Jugador() {

    }

    public Jugador(String id, String nombrs, String apellidos, Integer edad, String posicion, Integer numeroCamista) {
        super(id, nombrs, apellidos, edad);
        this.posicion = posicion;
        this.numeroCamista = numeroCamista;
    }
}
