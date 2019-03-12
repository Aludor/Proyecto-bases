package Conection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static Connection conexion;
    public Conexion() {
    }
    public Connection ConectarBaseDatos() {
        try {
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/surtifiestas", "root", "bases1");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
