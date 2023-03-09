package org.example;

public class Padre {

    private String nombre;
    private final String apellido = "Ardilla";
    private Long fortuna;

    public Padre() {
    }

    public Padre(String nombre, Long fortuna) {
        this.nombre = nombre;
        this.fortuna = fortuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getFortuna() {
        return fortuna;
    }

    public void setFortuna(Long fortuna) {
        this.fortuna = fortuna;
    }
}
