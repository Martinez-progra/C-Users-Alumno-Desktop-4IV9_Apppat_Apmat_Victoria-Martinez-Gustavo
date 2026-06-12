


    import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JavaSwingejemplocodigo {
    //Importamos todo los paquetes basicos de java swing en la parte superior, incluso hacemos dibujitos con ellos :)
    

    public static void main(String[] args) {
    //Siempre debemos declarar nuestra clase public void
        
        //Haremos ventanitas con el primer elemento visto
        JFrame ventana = new JFrame("Mi Primera Interfaz");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Recordemos que usamos este comando para cerrar otros componentes y al poner ventanas no se salgan de esa parte
        ventana.setLocationRelativeTo(null); 
        //Aqui centramos la ventanita para que no se vea fea 

        //Ahora crearemos unos paneles
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        //Ahora crearemos etiquetas y botones 
        JLabel etiqueta = new JLabel("¡Hola! Presiona el botón para continuar.");
        JButton boton = new JButton("Saludar");

        // Agregaremos paneles principales a las ventanas etiqueta, boton, panel
        panel.add(etiqueta);
        panel.add(boton);
        ventana.add(panel);

        //Ahora veremos la ventana 
        ventana.setVisible(true);

        //Este tipo de boton es especial para que la interfaz intercatue con el sistema
        boton.addActionListener(e -> {
            JOptionPane.showMessageDialog(ventana, "¡Bienvenido al sistema!");
        });
        System.out.println("Cabe resaltar en donde se quiere hacer lineas, difuminados y/o dibujitos basicos hay que usar Graphics2D");
    }
}
    



