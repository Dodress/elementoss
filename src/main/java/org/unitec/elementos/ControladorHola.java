/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package org.unitec.elementos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jdnsp -------------- clase #2
 */
//#1
@RestController

//#2
@RequestMapping("/")

//REST optener 
    // estado Http  (GET)  lectura
    // poster  ""   (POST) manipulacion
    // editar  ""   (PUT)  modificar
    // borrar  ""   (DELATE) borrar

//Siclo de vida de un sisteam
//diseño
//testing 
//aplicacion

// httplocalhost .8080/
// contexto

public class ControladorHola {
    
    
    @GetMapping("/")
    public String holamundo(){
    return "mi primer servicio REST :D con 0010101101";
    }
    
    
    
    
}
