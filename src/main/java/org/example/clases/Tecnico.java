package org.example.clases;

public class Tecnico extends Persona {

    // atributos


    private Double salario;


    // constructor
    public Tecnico() {
    }

    public Tecnico(String id, String nombrs, String apellidos, Integer edad, Double salario) {
        super(id, nombrs, apellidos, edad);
        this.salario = salario;
    }
}
