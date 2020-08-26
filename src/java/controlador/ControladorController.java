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
@RequestMapping("controlador.htm") 
public class ControladorController {

@RequestMapping(method=RequestMethod.GET)    
 public ModelAndView controlador(){
     // codigo
    ModelAndView modelo = new ModelAndView();
    modelo.setViewName("controlador");
    Persona p =new Persona("Jose","mata",30);
    modelo.addObject("persona",p);
      return modelo;
 }
 @RequestMapping(method=RequestMethod.POST)
 public ModelAndView controladorPost(@ModelAttribute("persona") Persona persona){
 // no es confiable <18  o >60
 int edad=persona.getEdad();
 if(edad<18 || edad>60){
     System.out.println("Vacuna no confiable");
 }else{
     System.out.println("Vacuna confiable");
 }
     System.out.println("el ru es:"+persona.getNombre());
     System.out.println("el lugar de nacimiiento es:"+persona.getLugarnacimiento());
   ModelAndView modelo = new ModelAndView();
  modelo.setViewName("controlador");
  modelo.addObject("persona",persona);
  return modelo;
 }
 
}
