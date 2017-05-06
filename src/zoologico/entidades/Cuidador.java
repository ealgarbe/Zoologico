/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona{
    private int cantidadDeRaciones;
    public Cuidador (String nombre, Date fechaDeNacimiento, int cantidadDeRaciones){
        super (nombre, fechaDeNacimiento);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    public void alimentarAnimales(){
        if(Zoologico.CANTIDAD_ANIMALES*Zoologico.RACIONES_POR_ANIMAL >= cantidadDeRaciones){
            System.out.println("Ok");
        }else{
            System.out.println("No ok");
        }       
    }
    
}
