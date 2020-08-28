/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dominio.Persona;
import dominio.Estudiante;
import dominio.Materias;
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
@RequestMapping("objetos.htm") 
public class Controlador2 {

@RequestMapping(method=RequestMethod.GET)    
 public ModelAndView controlador(){
     // codigo
    ModelAndView modelo = new ModelAndView();
    modelo.setViewName("objetos");
    Estudiante e =new Estudiante(1654,"Jose","mata","14/06/2014");
    Materias m =new Materias("INF16","Redes");
    modelo.addObject("estudiante",e);
    modelo.addObject("materias", m);
      return modelo;
 }
 @RequestMapping(method=RequestMethod.POST)
 public ModelAndView controladorPost(@ModelAttribute("estudiante") Estudiante estudiante,
         @ModelAttribute("materias") Materias materias){
 // no es confiable <18  o >60
     System.out.println(estudiante.toString());
     System.out.println(materias.toString());
   ModelAndView modelo = new ModelAndView();
  modelo.setViewName("objetos");
  modelo.addObject("estudiante",estudiante);
  modelo.addObject("materias",materias);
  return modelo;
 }
 
}
