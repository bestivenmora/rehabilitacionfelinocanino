/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
package models;

public abstract class Mascota {
    protected String tipo;
    protected String nombre;
    protected String raza;
    protected String color;
    protected int edad;
    
    public Mascota(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }
}


