/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api") //crea una api que se va crear en forma en json aplication programin intefarce
@CrossOrigin 

public class ControladorEmpleado {
   @Autowired
    RepoEmpleado repoE;

    @PostMapping("/Empleado")
    Estatus guardar(@RequestBody String json) throws Exception {

        ObjectMapper maper = new ObjectMapper();
        Empleado em = maper.readValue(json, Empleado.class);
        repoE.save(em);
        Estatus e = new Estatus("Empleado guardado", true);
        return e;
    }  
}
