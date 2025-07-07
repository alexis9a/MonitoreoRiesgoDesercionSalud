package monitoreo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection con;

    public static Connection getConnection() {
        if (con != null) return con;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=MonitoreoRiesgoDesercionSalud;encrypt=true;trustServerCertificate=true";
        String user = "sa"; // tu usuario
        String password = "tu_contraseña"; // tu contraseña
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a SQL Server");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
Agregar Conexion.java al paquete monitoreo
