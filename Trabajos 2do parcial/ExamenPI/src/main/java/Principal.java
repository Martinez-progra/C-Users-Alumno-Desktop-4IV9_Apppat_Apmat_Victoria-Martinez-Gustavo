/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class Principal {
public static void main(String[] args) {
        int seleccion = 0;
        
        do {
            try {
                String menuInicio = 
                         "1. Gestionar Personas\n"
                        + "2. Gestionar Maestros\n"
                        + "3. Salir\n"
                        + "Seleccione una opción:";
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menuInicio));

                switch (seleccion) {
                    case 1:
                        VistaPersona vp = new VistaPersona();
                        vp.Principal();
                        
                        break;
                        
                case 2:
                        VistaMaestro vm = new VistaMaestro();
                        vm.Principal();
                        
                break;
                
                case 3:
                        JOptionPane.showMessageDialog(null, "ADIOS ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido");
            }
            
        } while (seleccion != 3);
    }
}
    

