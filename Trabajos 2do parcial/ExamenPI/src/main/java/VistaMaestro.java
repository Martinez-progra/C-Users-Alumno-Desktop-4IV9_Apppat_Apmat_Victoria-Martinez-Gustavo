/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class VistaMaestro {
    
    
    
    ControladorMaestro crud = new ControladorMaestro();
    int opcion = 0;
    
    public void PrincipalMaestro(){
        
        
            String menu=
            "Bienvenido a la gestion de personas" 
            +"Elija una opcion:\n"
            +"1.- Mostrar lista de personas\n"
            +"2.- Registrar nueva persona\n"
            +"3.- Editar datos de persona\n"
            +"4.- Borrar persona\n"
            +"5.- Salir";
        do{    
            try {
                String input = JOptionPane.showInputDialog(menu);
                if (input == null){
                    break;
                }
            
            opcion = Integer.parseInt(input);
            
            switch (opcion) {
                case 1:
                    ArrayList<Maestro> listadeMaestros 
                            = crud.mostrarMaestro();
                    for(Maestro objeto : listadeMaestros){
                        System.out.println("EL id: " + objeto.getId()
                        + "El nombre: " + objeto.getNombre() 
                        + "La edad :" +  objeto.getMatricula());
                    }
                    
                    break;
                case 2:
                    
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    String nomMaestro = JOptionPane.showInputDialog("Nombre:");
                    String matricula = JOptionPane.showInputDialog("Matrícula:");
                    //envio al objeto de persona
                    Maestro maestroNuevo = new Maestro(id, nomMaestro, matricula);
                        crud.registrarMaestro(maestroNuevo);
                        break;
                case 3:
                    System.out.println("Ingresa el id, para buscar una persona");
                    int idbuscar = Integer.parseInt(JOptionPane.showInputDialog("ID del maestro a editar:"));
                    
                    Maestro MaestroSeleccionada 
                            = crud.buscarMaestro(idbuscar);
                    
                    //primero muestro la informacion
                    JOptionPane.showInputDialog("La informacion es:"
                            + "\n ID: " + MaestroSeleccionada.getId()
                            + "\n Nombre: " + MaestroSeleccionada.getNombre()
                            + "\n Matricula: " + MaestroSeleccionada.getMatricula());
                    
                    
                    String nuevonombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                    
                        String nuevamatricula = JOptionPane.showInputDialog("Nueva matrícula:");

                        MaestroSeleccionada.setNombre(nuevonombre);
                    MaestroSeleccionada.setMatricula(nuevamatricula);
    
                    crud.actualizarMaestro(MaestroSeleccionada);
                   
                case 4:
                    
                    int ideliminar = Integer.parseInt(JOptionPane.showInputDialog("ID de la persona a eliminar miau miau:"));
                    
                    Maestro MaestroEliminar = crud.buscarMaestro(ideliminar);
                    
                    crud.eliminarMaestro(ideliminar);
                    
                    JOptionPane.showMessageDialog(null, "Persona eliminada");
                    break;
                default:
                    System.out.println("Escoge la opcion correcta");
               
            }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese solo números enteros.");
                opcion = 0;
            }
        }while(opcion != 5);
    }

    void Principal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}