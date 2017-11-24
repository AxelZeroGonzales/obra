
package dao;

import database.AccesoDB;
import entity.AsistenciaTO;
import entity.ObraEmpleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import service.ICrudDao;

public class AsistenciaDAO implements ICrudDao<AsistenciaTO> {
        //variables
    Connection cn;
    PreparedStatement ps;//lo que voy a enviar a la base de datos
    CallableStatement cs; 
    ResultSet rs;// muestra el resultado obtenido deoracle
    AsistenciaTO emp;
    ObraEmpleado oep;
    String sql;

    @Override
    public void create(AsistenciaTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Asistencia_Adicionar(?,?,?)}");
            cs.setString(1, t.getCodEmpleado());
            cs.setString(3, t.getFecha());
            cs.setString(2, t.getHoras());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(AsistenciaTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Asistenciao_Actualiza(?,?,?)}");
            cs.setString(1, t.getCodEmpleado());
            cs.setString(3, t.getFecha());
            cs.setString(2, t.getHoras());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void delete(AsistenciaTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Asistencia_Eliminar(?)}");
            cs.setString(1, t.getCodEmpleado());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public AsistenciaTO findForId(Object t) throws Exception {
            emp = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from asistencia where codempleado=?");
            ps.setString(1, (String) t);
            rs = ps.executeQuery();//ejecuta
            if (rs.next()) {
                emp = new AsistenciaTO(rs.getString(1), rs.getString(2), rs.getString(3));
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

    public List<AsistenciaTO> readAll(String cod) throws SQLException {
         List<AsistenciaTO> lista = new ArrayList<>();
            try {
                cn = AccesoDB.getConnection();
                ps = cn.prepareStatement("select Asis.* \n" +
                                            "from empleados Emp INNER JOIN asistencia Asis\n" +
                                            "  ON Asis.CodEmpleado = Emp.ideMPLEADO\n" +
                                            "where Emp.idempleado=?");
                ps.setString(1, cod);
                rs = ps.executeQuery();
                while (rs.next()) {
                    emp = new AsistenciaTO(rs.getString(1), rs.getString(2),
                            rs.getString(3));
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

    @Override
    public List<AsistenciaTO> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
