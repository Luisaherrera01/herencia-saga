package org.example;

public class Hijo extends Padre{

    private String nombre;

    public Hijo() {
    }


    public Hijo(String nombre, Long fortuna, String nombre1) {
        super(nombre, fortuna); //carga los datos del papa
        this.nombre = nombre1; // carga los datos del hijo
    }

    @Override //anotacion. Decoradores de clase. sobreescribir los valores del hijo, es un funcionamiento adicional
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
