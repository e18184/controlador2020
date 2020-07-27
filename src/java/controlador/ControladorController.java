/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HAUSE
 */

public class ControladorController {
 @RequestMapping("controlador.htm")  
 public ModelAndView controlador(){
     // codigo
    ModelAndView modelo = new ModelAndView();
    modelo.setViewName("controlador");
     return modelo;
 }
}
