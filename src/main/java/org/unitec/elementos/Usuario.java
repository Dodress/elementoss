/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.annotation.Id;

/**
 *
 * @author jdnsp
 */
public class Usuario {
    @Id    // el atributo que tenga esta anotacion sera el id 
    Integer id;
    String nombre;
    Localizacion localizacion;

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", localizacion=" + localizacion + '}';
    }

    public Usuario() {

    }

    public Usuario(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

}
