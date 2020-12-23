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
public class Caballo implements PuedeMontarse{
    public int capacidad = 10;
    public int ocupacion;
    public Guerrero[] ocupantes;
    
    public Caballo(Guerrero g []){
        int todosGriegos = 0;
        for (int i = 0; i < g.length; i++) {
            if(g[i].getTipo()==g[i].getTipo().GRIEGO){
                todosGriegos=todosGriegos+1;
            }
        }
        if(todosGriegos==g.length){
            ocupantes = g;
            capacidad  = g.length;
            ocupacion = g.length;
        }else{
            ocupacion = 0;
            capacidad = 100;
            ocupantes = new Guerrero[0];
        }
    }
        
    
    public Caballo(Guerrero guerrero, int capacidad){
        if(guerrero.getTipo()==guerrero.getTipo().GRIEGO){
            ocupacion = 1;
            this.capacidad = capacidad;
            ocupantes = new Guerrero [capacidad];
            ocupantes [0]=guerrero;
        }else{
            ocupacion = 0;
            this.capacidad = capacidad;
            ocupantes = new Guerrero[this.capacidad];
        }     
    }
    public void ordenar(){
        int i, j, menor, pos;
        Guerrero tmp;
          for (i = 0; i < ocupantes.length - 1; i++) {     
                menor = ocupantes[i].getFuerza();                                   
                pos = i;                           
                for (j = i + 1; j < ocupantes.length; j++){ 
                      if (ocupantes[j].getFuerza() < menor) {           
                          menor = ocupantes[j].getFuerza();             
                          pos = j;
                      }
                }
                if (pos != i){                                       
                    tmp = ocupantes[i];
                    ocupantes[i] = ocupantes[pos];
                    ocupantes[pos] = tmp;
                }
          }
    }
    public int buscar (String nombre){
        for (int i = 0; i < ocupantes.length; i++) {
            if(ocupantes[i].getNombre().equals(nombre)){
                System.out.println("Posicion del guerrero: "+i);
                return i;
            }else{
                return -1;
            }
        }
        return 1;
    }

    @Override
    public int montar(Guerrero g) {
        if(g.getTipo()==g.getTipo().GRIEGO){
            if(ocupacion==capacidad){
            return -1;
            }   
            if(ocupacion<capacidad){
                for (int i = 0; i < capacidad; i++) {
                    if(ocupantes[i]==null){
                    ocupantes[i]=g;
                    return 1;
                    }
                }
            }
        }else{
            return -2;
        }
        return 1;
    }

    @Override
    public void desmontar() {
        for (int i = 0; i < capacidad; i++) {
            ocupantes[i]=null;
        }
    }

    @Override
    public String toString() {
        String c = "+\n";
        for (int i = 0; i < capacidad; i++) {
            c += ocupantes[i];
        }
        return c;
    }
    
    
}
