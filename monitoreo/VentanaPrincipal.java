package monitoreo;

import vistas.FormRegistrarEstudiante;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Monitoreo de Riesgo de Deserción Académica");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Gestión");

        JMenuItem itemRegistrarEstudiante = new JMenuItem("Registrar Estudiante");
        itemRegistrarEstudiante.addActionListener(e -> new FormRegistrarEstudiante());

        menu.add(itemRegistrarEstudiante);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
}
Agregar VentanaPrincipal.java al paquete monitoreo
