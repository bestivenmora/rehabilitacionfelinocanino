/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
package models;

public class Felino extends Mascota {
    private final boolean libreToxoplasmosis;
    
    public Felino(String nombre, String raza, String color, int edad, boolean libreToxoplasmosis) {
        super(nombre, raza, color, edad);
        this.tipo = "Felino";
        this.libreToxoplasmosis = libreToxoplasmosis;
    }

    public boolean isLibreToxoplasmosis() {
        return libreToxoplasmosis;
    }
}
