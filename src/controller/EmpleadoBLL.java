package controller;

import java.util.List;
import dao.EmpleadoDAO;
import entity.EmpleadoTO;
import java.sql.SQLException;

public class EmpleadoBLL {

    //variable de la clase EmpleadoDAO
    EmpleadoDAO dao;

    //constructor
    public EmpleadoBLL() {
        dao = new EmpleadoDAO();
    }

    //metodos de negocio
    public void EmpleadoAdicionar(EmpleadoTO em) throws Exception {
        dao.create(em);
    }

    public void EmpleadoActualizar(EmpleadoTO em) throws Exception {
        dao.update(em);
    }

    public void EmpleadoEliminar(EmpleadoTO em) throws Exception {
        dao.delete(em);
    }

    public EmpleadoTO EmpleadoBuscar(Object em) throws Exception {
        return dao.findForId(em);
    }

    public List<EmpleadoTO> EmpleadoListar() throws Exception {
        return dao.readAll();
    }

    
    
    public boolean EmpleadoValidar(String usu,String pas) throws Exception {
        return dao.validar(usu, pas);
    }
    
     public String CodigodeEmpleado(String nombre) throws Exception {
        return dao.findForName(nombre);
    }

    public List<EmpleadoTO> EmpleadoListar(String nom) throws Exception {
        return dao.readAll(nom);  
    }

    public List<EmpleadoTO> EmpleadoListar2(String text) throws SQLException {
            return dao.readAll2 (text);      
    }
    public List<EmpleadoTO> EmpleadoListar3(String cod) throws SQLException {
            return dao.readAll3 (cod);      
    }

}
