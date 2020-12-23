/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaballoTroya;

/**
 *
 * @author lenovo
 */
public class Guerrero {
    private tipoGuerrero tipo;
    private int fuerza;
    private String nombre;
    
    public Guerrero(String nombre, tipoGuerrero tipo, int fuerza){
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.nombre = nombre;
    }
    public enum tipoGuerrero{GRIEGO, TROYANO};
    
    public tipoGuerrero getTipo() {
        return tipo;
    }

    public void setTipo(tipoGuerrero tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nGuerrero{"+ " Nombre=" + nombre + ", tipo=" + tipo + ", fuerza=" + fuerza +  '}';
    }
    
    
    
    
}
