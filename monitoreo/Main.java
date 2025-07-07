package monitoreo;

public class Main {
    public static void main(String[] args) {
        Conexion.getConnection();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
Agregar Main.java al paquete monitoreo
