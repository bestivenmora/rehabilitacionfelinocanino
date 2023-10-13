/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
package models;

public class Canino extends Mascota {
    private final int nivelEntrenamiento;
    
    public Canino(String nombre, String raza, String color, int edad, int nivelEntrenamiento) {
        super(nombre, raza, color, edad);
        this.tipo = "Canino";
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }
}
