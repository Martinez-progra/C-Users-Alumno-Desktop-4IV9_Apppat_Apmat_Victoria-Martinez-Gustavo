import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JavasSwingejemplocodigo {
    // PASO 1: Los imports siempre deben ir en la parte superior, fuera de la clase[cite: 8, 53].

    public static void main(String[] args) {
        
        // PASO 2: Crear el JFrame (Ventana principal)[cite: 31, 48].
        JFrame ventana = new JFrame("Mi Primera Interfaz");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centra la ventana

        // PASO 3: Crear un JPanel (Contenedor intermedio)[cite: 32, 49].
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        // PASO 4: Crear componentes individuales (Etiquetas y Botones)
        JLabel etiqueta = new JLabel("¡Hola! Presiona el botón para continuar.");
        JButton boton = new JButton("Saludar");

        // PASO 5: Agregar componentes al panel y el panel a la ventana.
        panel.add(etiqueta);
        panel.add(boton);
        ventana.add(panel);

        // PASO 6: Hacer visible la ventana
        ventana.setVisible(true);

        // PASO 7: Uso de JOptionPane para interactuar[cite: 33, 50].
        boton.addActionListener(e -> {
            JOptionPane.showMessageDialog(ventana, "¡Bienvenido al sistema!");
        });
    }
}
    

