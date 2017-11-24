/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ObraEmpleadosDAO;
import entity.EmpleadoTO;
import entity.ObraEmpleado;
import java.util.List;

/**
 *
 * @author User
 */
public class ObraEmpleadosBLL  {
    ObraEmpleadosDAO dao;

    //constructor
    public ObraEmpleadosBLL () {
        dao = new ObraEmpleadosDAO();
    }

    //metodos de negocio
    public void ObraEmpleadosAdicionar(ObraEmpleado em) throws Exception {
        dao.create(em);
    }

    public void ObraEmpleadosActualizar(ObraEmpleado em) throws Exception {
        dao.update(em);
    }

    public void ObraEmpleadosEliminar(ObraEmpleado em) throws Exception {
        dao.delete(em);
    }

    public ObraEmpleado ObraEmpleadoBuscar(Object em) throws Exception {
        return dao.findForId(em);
    }

    public List<ObraEmpleado> ObraListar() throws Exception {
        return dao.readAll();
    }
    
    public boolean ObraValidar(String usu,String pas) throws Exception {
        return dao.validar(usu, pas);
    }
    
     public String CodigodeObra(String nombre) throws Exception {
        return dao.findForName(nombre);
    }

    public void ObraoEliminar(EmpleadoTO leerDatos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ObraEmpleadosAdicionar(Object[] panda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
