/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.AccesoDB;
import entity.Obra;
import entity.ObraEmpleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import service.ICrudDao;

/**
 *
 * @author User
 */
public class ObraEmpleadosDAO implements ICrudDao<ObraEmpleado> {

    //variables
    Connection cn;
    PreparedStatement ps;
    CallableStatement cs;
    ResultSet rs;
    ObraEmpleado oba;
    String sql;

    @Override
    public void create(ObraEmpleado t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_ObraEmpleados_Adicionar(?,?)}");
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getIdobra());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(ObraEmpleado t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_ObraEmpleados_Actualiza(?,?,?,?,?)}");
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getIdobra());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void delete(ObraEmpleado t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_CodigoObraEmpleados_Eliminar(?)}");
            cs.setString(1, t.getIdobra());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public ObraEmpleado findForId(Object t) throws Exception {
        oba = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from obraEmpleados where codigo=?");
            ps.setString(1, (String) t);
            rs = ps.executeQuery();
            if (rs.next()) {
                oba = new ObraEmpleado(rs.getString(1), rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return oba;
    }

    @Override
    public List<ObraEmpleado> readAll() throws Exception {
        List<ObraEmpleado> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from obra");
            rs = ps.executeQuery();
            while (rs.next()) {
               oba = new ObraEmpleado(rs.getString(1), rs.getString(2));
                lista.add(oba);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }

    private String generaCodigo() throws SQLException {
        sql = "select valor from control where parametro='Obra'";
        ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        int cont = rs.getInt(1);
        rs.close();
        sql = "update control set valor=valor+1 where parametro='Obras'";
        ps = cn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        String cod = "";
        if (cont < 10) {
            cod = "O000" + cont;
        } else {
            cod = "O00" + cont;
        }
        return cod;
    }

    public boolean validar(String usuario, String clave) throws Exception {
        boolean ok = false;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from obra where usuario=? and clave=?");
            ps.setString(1, usuario);
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

    public String findForName(String nombre) throws Exception {
        String cod = null;
        StringTokenizer token = new StringTokenizer(nombre);
        String nom = token.nextToken();
        String ape = token.nextToken();
        try {
            cn = AccesoDB.getConnection();
            sql = "select Codigo from obra where nombre=? and apellidos=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, ape);
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
}