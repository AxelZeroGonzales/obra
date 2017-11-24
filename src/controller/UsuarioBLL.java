package controller;

import java.util.List;
import dao.UsuarioDAO;
import entity.Usuario;

public class UsuarioBLL {
    //variable de la clase ClienteDao

    UsuarioDAO dao;
    //constructor

    public UsuarioBLL() {
        dao = new UsuarioDAO();
    }

    public List<Usuario> UsuarioListar() throws Exception {
        return dao.readAll();
    }



    //metodos de negocio
    public void UsuarioAdicionar(Usuario em) throws Exception {
        dao.create(em);
    }

    public void UsuarioActualizar(Usuario em) throws Exception {
        dao.update(em);
    }

    public void UsuarioEliminar(Usuario em) throws Exception {
        dao.delete(em);
    }

    public Usuario UsuarioBuscar(Object em) throws Exception {
        return dao.findForId(em);
    }
    public boolean UsuarioValidar(String nom,String pas) throws Exception {
        return dao.validar(nom, pas);
    }
}
