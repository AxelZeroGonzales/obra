package controller;

import java.util.List;
import dao.ObraDAO;
import entity.EmpleadoTO;
import entity.Obra;

public class ObraBLL {

    //variable de la clase EmpleadoDAO
    ObraDAO dao;

    //constructor
    public ObraBLL() {
        dao = new ObraDAO();
    }

    //metodos de negocio
    public void ObraAdicionar(Obra em) throws Exception {
        dao.create(em);
    }

    public void ObraActualizar(Obra em) throws Exception {
        dao.update(em);
    }

    public void ObraEliminar(Obra em) throws Exception {
        dao.delete(em);
    }

    public Obra ObraBuscar(Object em) throws Exception {
        return dao.findForId(em);
    }

    public List<Obra> ObraListar() throws Exception {
        return dao.readAll();
    }

    public boolean ObraValidar(String usu,String pas) throws Exception {
        return dao.validar(usu, pas);
    }
    
     public String CodigodeObra(String nombre) throws Exception {
        return dao.findForName(nombre);
    }
     public String RellenaCodigo() throws Exception {
        return dao.rellenaCodigo();
    }
     

    public void ObraoEliminar(EmpleadoTO leerDatos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<EmpleadoTO> EmpleadoListar3(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
