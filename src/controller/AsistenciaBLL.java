/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AsistenciaDAO;
import entity.AsistenciaTO;
import java.util.List;


/**
 *
 * @author User
 */
public class AsistenciaBLL  {
    AsistenciaDAO dao;

    //constructor
    public AsistenciaBLL () {
        dao = new AsistenciaDAO();
    }

    //metodos de negocio
    public void AsistenciaAdicionar(AsistenciaTO em) throws Exception {
        dao.create(em);
    }

    public void AsistenciaActualizar(AsistenciaTO em) throws Exception {
        dao.update(em);
    }

    public void AsistenciaEliminar(AsistenciaTO em) throws Exception {
        dao.delete(em);
    }

    public AsistenciaTO AsistenciaBuscar(Object em) throws Exception {
        return dao.findForId(em);
    }

    public List<AsistenciaTO> AsistenciaListar(String nom) throws Exception {
        return dao.readAll(nom);
    }
    
 

}
