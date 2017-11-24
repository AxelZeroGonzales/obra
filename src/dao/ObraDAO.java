package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import database.AccesoDB;
import entity.EmpleadoTO;
import entity.Obra;
import service.ICrudDao;

public class ObraDAO implements ICrudDao<Obra> {

    //variables
    Connection cn;
    PreparedStatement ps;
    CallableStatement cs;
    ResultSet rs;
    Obra emp;
    String sql;

    @Override
    public void create(Obra t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            String codigo = generaCodigo();
            t.setCodigo(codigo);
            cs = cn.prepareCall("{call usp_Obra_Adicionar(?,?,?,?,?)}");
            cs.setString(1, t.getCodigo());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getLugar());
            cs.setString(4, t.getEmpresa());
            cs.setString(5, t.getEncargado());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(Obra t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Obra_Actualiza(?,?,?,?,?)}");
            cs.setString(1, t.getCodigo());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getLugar());
            cs.setString(4, t.getEmpresa());
            cs.setString(5, t.getEncargado());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void delete(Obra t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Obra_Eliminar(?)}");
            cs.setString(1, t.getCodigo());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public Obra findForId(Object t) throws Exception {
        emp = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from Obra where codigo=?");
            ps.setString(1, (String) t);
            rs = ps.executeQuery();
            if (rs.next()) {
                 emp = new Obra(rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return emp;
    }

    @Override
    public List<Obra> readAll() throws Exception {
        List<Obra> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from obra order by codigo");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new Obra (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(emp);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }    public List<Obra> readAll(String nombre) throws Exception {
        List<Obra> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados where nombre like ?");
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new Obra(rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(emp);
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
     public List<Obra> readAll2(String cargo) throws SQLException {
     List<Obra> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from obra where cargo like ?");
            ps.setString(1, cargo + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new Obra(rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(emp);
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
        sql = "select valor from control where parametro='OBRA'";
        ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        int cont = rs.getInt(1);
        rs.close();
        sql = "update control set valor=valor+1 where parametro='OBRA'";
        ps = cn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        String cod = "";
        if (cont < 10) {
            cod = "0000" + cont;
        } else {
            cod = "O00" + cont;
        }
        return cod;
    }
    public String rellenaCodigo() throws SQLException {
     sql = "select valor from control where parametro='OBRA'";
        ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        int cont = rs.getInt(1);
        rs.close();
        String cod = "";
        if (cont < 10) {
            cod = "0000" + cont;
        } else {
            cod = "O00" + cont;
        }
        return cod;
}
    
    public boolean validar(String usuario, String clave) throws Exception {
        boolean ok = false;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from Obra where usuario=? and clave=?");
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
            sql = "select IdEmpleado from Obra where nombre=? and apellidos=?";
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
