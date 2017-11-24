/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import database.AccesoDB;
import java.sql.Connection;
import java.sql.SQLException;

public class prueba {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion conforme....");
        } catch (SQLException e) {
            System.out.println("error :" + e.getMessage());
        }
    }
}
