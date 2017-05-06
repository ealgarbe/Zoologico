package zoologico.entidades;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author educacionit
 */
public class Zoologico {
//atributos
    public static final int CANTIDAD_ANIMALES = 25;
    public static final int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;
    public void abrir (){
        this.abierto = true;
        
    }
    public void alimentarAnimales(int unaCantidadDeRaciones){
        Cuidador c = new Cuidador ("Juan", new Date(1976,10,9),unaCantidadDeRaciones);
        c.alimentarAnimales();
    }
    public void cerrar (){
        
    }
           
            
    
}
