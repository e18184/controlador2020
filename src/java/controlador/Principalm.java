/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dominio.Madrem;
import dominio.Hijom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author HAUSE
 */
public class Principalm {
   public static void main(String args[]){
     Madrem m = new Madrem();
     m.setCim("12");
     m.setNombre("Maria");
     m.setAp("Perez");
     m.setAm("Cata");
     Hijom h1 = new Hijom();
     h1.setCih("13");
     h1.setNombre("Marcos");
     h1.setAp("Arce");
     Hijom h2 = new Hijom();
     h2.setCih("14");
     h2.setNombre("Marcela");
     h2.setAp("Avila");
      Hijom h3 = new Hijom();
     h3.setCih("15");
     h3.setNombre("Daniela");
     h3.setAp("Suarez");
     Set <Hijom> hm = new HashSet<Hijom>();
     hm.add(h1);
     //hm.add(h2);
     // madre tiene muchos hijos
     m.setHijo(hm);
       System.out.println("La madre"+m.getNombre());
       System.out.println("Tiene estos hijos");
       
      h2.setMadre(m);
       
       for (Iterator<Hijom> iterator = m.getHijo().iterator(); iterator.hasNext();) 
       {
           Hijom next = iterator.next();
           System.out.println(next.getCih()+" "+
                   next.getNombre());
       }
       
       
       System.out.println(h2.getMadre().getNombre());
       
      
       
     
   } 
}
