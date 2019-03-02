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
 * @author jdnsp
 */
// servicio rest
@RestController
@RequestMapping("/api") //crea una api que se va crear en forma en json aplication programin intefarce
@CrossOrigin //que es es un origen crusado arquitectura destribuida intermediario
public class ControladorUsuario {

    // clase 10 capa controladora 
    /* capa controller  
     primer servio REST
    la tarea de esta capa es exponer a request (peticiones) http las operaciones ala base de datos 
    es decir las opereciones al exterior
     hay un metodo ttp para cada comando
     */
    // 1. guardar save()
    @Autowired
    RepoUsuario repoU;

    @PostMapping("/usuario")
    Estatus guardar(@RequestBody String json) throws Exception {

        ObjectMapper maper = new ObjectMapper();
        Usuario u = maper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e = new Estatus("usuario guardado", true);
        return e;
    }

    // clase 11 utilizacion del postman
    // vamos a hacer una serializacion 
//2. buscar todos
    @GetMapping("/usuario")
    List<Usuario> buscarTodos() {
        return repoU.findAll();
    }

    // 3. buscar por id
    // {}  en la ruta que es esta se debe poner una ruta
    @GetMapping("/usuario/{id}")
    Usuario buscaPorIf(@PathVariable Integer id) {
        return repoU.findById(id).get();
    }

    // 4. actualizar
    @PutMapping("/usuario")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Usuario u = mapper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e = new Estatus("Usuario actualizado", true);
        return e;
    }

// 5. borraar por id 
    @DeleteMapping("/usuario/{id}")
    Estatus borrar(@PathVariable Integer id) {

        repoU.deleteById(id);
        Estatus e = new Estatus("usuario borrado", true);
        return e;
    }

}
