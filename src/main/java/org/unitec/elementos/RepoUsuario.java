/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jdnsp
 */



// interfas todos sus elementos son compuestos abtractas no deben yevar cuerpo heredan
                                                  // entidad , tipo de dato a buscar 
public interface RepoUsuario extends MongoRepository<Usuario, Integer>{
    
    // metodo controido por nosotros
    List<Usuario> findByNombre(String nombre);
}
