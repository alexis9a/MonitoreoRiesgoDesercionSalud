package vistas;

import controladores.EstudianteController;
import modelos.Estudiante;

import javax.swing.*;

public class FormRegistrarEstudiante extends JFrame {
    private JTextField txtNombres, txtApellidos, txtDni, txtCorreo, txtTelefono;
    private JButton btnRegistrar;

    public FormRegistrarEstudiante() {
        setTitle("Registrar Estudiante");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(20, 20, 80, 25);
        add(lblNombres);
        txtNombres = new JTextField();
        txtNombres.setBounds(100, 20, 200, 25);
        add(txtNombres);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(20, 60, 80, 25);
        add(lblApellidos);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(100, 60, 200, 25);
        add(txtApellidos);

        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(20, 100, 80, 25);
        add(lblDni);
        txtDni = new JTextField();
        txtDni.setBounds(100, 100, 200, 25);
        add(txtDni);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(20, 140, 80, 25);
        add(lblCorreo);
        txtCorreo = new JTextField();
        txtCorreo.setBounds(100, 140, 200, 25);
        add(txtCorreo);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 180, 80, 25);
        add(lblTelefono);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(100, 180, 200, 25);
        add(txtTelefono);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(150, 220, 100, 30);
        add(btnRegistrar);

        btnRegistrar.addActionListener(e -> {
            Estudiante est = new Estudiante(
                txtNombres.getText(),
                txtApellidos.getText(),
                txtDni.getText(),
                txtCorreo.getText(),
                txtTelefono.getText()
            );
            EstudianteController ctrl = new EstudianteController();
            if (ctrl.insertarEstudiante(est)) {
                JOptionPane.showMessageDialog(this, "Estudiante registrado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar estudiante");
            }
        });

        setVisible(true);
    }

    private void limpiar() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }
}
Agregar FormRegistrarEstudiante.java al paquete vistas
