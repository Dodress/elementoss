


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

/**
 *
 * @author T-107
 */
public class Direccion {
    Long sp;
    String calle;
    String municipio;

    public Long getSp() {
        return sp;
    }

    public void setSp(Long sp) {
        this.sp = sp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "sp=" + sp + ", calle=" + calle + ", municipio=" + municipio + '}';
    }
    
}
