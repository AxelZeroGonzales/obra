/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class ObraEmpleado {
    String idobra;
    String idempleado;

    public ObraEmpleado() {
    }

    public ObraEmpleado(String idobra, String idempleado) {
        this.idobra = idobra;
        this.idempleado = idempleado;
    }

    public ObraEmpleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getIdobra() {
        return idobra;
    }

    public void setIdobra(String idobra) {
        this.idobra = idobra;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }


    
}
