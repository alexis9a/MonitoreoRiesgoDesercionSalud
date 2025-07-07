package controladores;

import monitoreo.Conexion;
import modelos.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteController {

    public boolean insertarEstudiante(Estudiante est) {
        String sql = "INSERT INTO Estudiantes (nombres, apellidos, dni, correo, telefono) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, est.getNombres());
            ps.setString(2, est.getApellidos());
            ps.setString(3, est.getDni());
            ps.setString(4, est.getCorreo());
            ps.setString(5, est.getTelefono());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar estudiante: " + e.getMessage());
            return false;
        }
    }

    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM Estudiantes";
        try (Connection con = Conexion.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setIdEstudiante(rs.getInt("idEstudiante"));
                est.setNombres(rs.getString("nombres"));
                est.setApellidos(rs.getString("apellidos"));
                est.setDni(rs.getString("dni"));
                est.setCorreo(rs.getString("correo"));
                est.setTelefono(rs.getString("telefono"));
                lista.add(est);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar estudiantes: " + e.getMessage());
        }
        return lista;
    }
}
Agregar EstudianteController.java al paquete controladores
