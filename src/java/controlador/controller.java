/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dominio.Estudiante;
/**
 *
 * @author HAUSE
 */
public class controller {
    @RequestMapping("controlador2.htm")  
 public ModelAndView controlador(){
     // codigo
    ModelAndView modelo = new ModelAndView();
    modelo.setViewName("controlador2");
    
    Estudiante[][] estudiantes = {
        {new Estudiante(101,"Fabiana","Aguirre","10/08/1999"),new Estudiante(102,"Oscar","Flores","25/09/1998")}
            ,{new Estudiante(103,"Carla","Leon","20/06/2000"),new Estudiante(104,"Laura","Martinez","12/04/1999")}
    };
    
    modelo.addObject("miprimeravariable",estudiantes);
    return modelo;
 }
}
