/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package literatura;

import javax.swing.JOptionPane;
import modelo.ConexionBDS;
import vista.LiteraturaVista;
import vista1.ProductoDAO;
import vista1.ProductoControlador;


public class Literatura {
public static void main(String[] args) throws Exception {
        // TODO code application logic here
        if(!ConexionBDS.probarConexion()){
            JOptionPane.showMessageDialog(
                    null, "No se pudo conectar a la bd");
            return;
        }
        
        ProductoDAO vista1 = new ProductoDAO();
        
        LiteraturaVista vista = new LiteraturaVista();
        
        
        vista.setVisible(true);
        
        
    }
}

    
    

