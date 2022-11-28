package org.example.clases;

public class Persona {
    //Atributos
    private String id;
    private String nombrs;
    private String apellidos;
    private Integer edad;

    // contructores
    public Persona() {
    }

    public Persona(String id, String nombrs, String apellidos, Integer edad) {
        this.id = id;
        this.nombrs = nombrs;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //  getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrs() {
        return nombrs;
    }

    public void setNombrs(String nombrs) {
        this.nombrs = nombrs;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola ¿Cómo estás?");
    }




}
