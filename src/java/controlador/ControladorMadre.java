/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dominio.Madrem;
import dominio.Hijom;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author HAUSE
 */
@Controller
@RequestMapping("madrem.htm") 
public class ControladorMadre {

@RequestMapping(method=RequestMethod.GET)    
 public ModelAndView controlador(Model model){
     // codigo
    ModelAndView modelo = new ModelAndView();
    modelo.setViewName("madrem");
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
      h2.setMadre(m);
     
     m.setHijou(h1);
    //modelo.addObject("persona",m);
    model.addAttribute("persona",m);
            
      return modelo;
 }
 @RequestMapping(method=RequestMethod.POST)
 public ModelAndView controladorPost(@ModelAttribute("persona") Madrem madre){
 // no es confiable <18  o >60
 
   ModelAndView modelo = new ModelAndView();
  modelo.setViewName("madrem");
  modelo.addObject("persona",madre);
     System.out.println(madre.getCim()+" "+madre.getNombre()+" "+madre.getAp()+" "+madre.getAm());
     System.out.println();
     System.out.println(madre.getHijou().getCih()
     +" "+ madre.getHijou().getNombre() +" "+
     madre.getHijou().getAp()
     );
  return modelo;
 }
 
}

