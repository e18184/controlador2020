/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dominio.Madre;
import dominio.Hijo;
/**
 *
 * @author HAUSE
 */
public class Principal {
   public static void main(String args[]){
     Madre m = new Madre();
     m.setCim("12");
     m.setNombre("Maria");
     m.setAp("Perez");
     m.setAm("Cata");
     Hijo h = new Hijo();
     h.setCih("13");
     h.setNombre("Marcos");
     h.setAp("Arce");
     m.setHijo(h);
     
      
   } 
}
