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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guerrero troyano1 = new Guerrero("Jorge", Guerrero.tipoGuerrero.TROYANO, 4);
        Guerrero griego1 = new Guerrero("Rodrigo", Guerrero.tipoGuerrero.GRIEGO, 3);
        Guerrero griego2 = new Guerrero("Victor", Guerrero.tipoGuerrero.GRIEGO, 4);
        Guerrero griego3 = new Guerrero("Nacho", Guerrero.tipoGuerrero.GRIEGO, 5);
        Caballo c1 = new Caballo(griego3, 4);
        c1.montar(griego1);
        c1.montar(griego2);
        c1.montar(troyano1);
        
        System.out.println(c1);
        
                
                
    }
    
}
