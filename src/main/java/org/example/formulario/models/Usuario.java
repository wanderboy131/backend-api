package org.example.formulario.models;

public class Usuario {
    private int id;
    private String nombre;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
}
