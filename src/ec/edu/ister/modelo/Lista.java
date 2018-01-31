/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import ec.edu.ister.controlador.Nodo;

//Añadir a la clase Lista, un método que devuelve cierto si la lista esta vacia
public class Lista {
 Nodo cab;
 int size;
	public Lista() {
		cab = null;
                size=0;
                
	}
       
	public boolean estaVacio(){
            return(cab==null)?true:false;
            
        } 
}
