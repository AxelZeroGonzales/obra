package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import database.AccesoDB;
import entity.Usuario;
import service.ICrudDao;

public class UsuarioDAO implements ICrudDao<Usuario> {
    // variables

    Connection cn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String sql;
    Usuario cli;
    CallableStatement cs;

    @Override
    public void create(Usuario t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Usuario_Adicionar(?,?)}");
            cs.setString(1, t.getNombre());
            cs.setString(2, t.getClave());

            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }

    }

    @Override

    public void update(Usuario t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Usuario_Actualiza(?,?)}");
            cs.setString(1, t.getNombre());
            cs.setString(2, t.getClave());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void delete(Usuario t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Usuario_Eliminar(?)}");
            cs.setString(1, t.getNombre());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }

    }

    @Override
    public Usuario findForId(Object t) throws Exception {
        cli = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from usuarios where nombre=?");
            ps.setString(1, (String) t);
            rs = ps.executeQuery();
            if (rs.next()) {
                cli = new Usuario(rs.getString(1), rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return cli;
    }

    @Override
    public List<Usuario> readAll() throws Exception {
        List<Usuario> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from usuarios order by nombre";
            ps = cn.prepareStatement(sql);
            //ejecutar comando
            rs = ps.executeQuery();
            while (rs.next()) {
                cli = new Usuario();
                cli.setNombre(rs.getString(1));
                cli.setClave(rs.getString(2));

                lista.add(cli);
            }
            rs.close();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }
        return lista;
    }

    public String findForName(String nombre) throws Exception {
        String cod = null;
        try {
            cn = AccesoDB.getConnection();
            sql = "select Nombre from usuarios where nombre=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            //ejecutar comando
            rs = ps.executeQuery();
            if (rs.next()) {
                cod = rs.getString(1);
            }
            rs.close();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }
        return cod;
    }

    public boolean validar(String nombre, String clave) throws Exception {
        boolean ok = false;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from usuarios where nombre=? and clave=?");
            ps.setString(1, nombre);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                ok = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return ok;
    }

}
