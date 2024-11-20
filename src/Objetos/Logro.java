/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;

/**
 *
 * @author david
 */
public class Logro {
    
    private String nombre, descripcion, dificultad;
    
    public Logro(String nombre, String descripcion, String dificultad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDificultad() {
        return this.dificultad;
    }
    
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Logro) {
            if (this.descripcion.equalsIgnoreCase(((Logro) obj).descripcion)
                    && this.dificultad.equalsIgnoreCase(((Logro) obj).dificultad)
                    && this.descripcion.equalsIgnoreCase(((Logro) obj).descripcion)) {
                return true;
            }
        }
        return false;
    }
    
}
