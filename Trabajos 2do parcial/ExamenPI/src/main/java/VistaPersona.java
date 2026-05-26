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

public class VistaPersona {
    
    
    
    ControladorPersona crud = new ControladorPersona();
    int opcion = 0;
    
    public void Principal(){
        
        
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
                    ArrayList<Persona> listadePersonas 
                            = crud.mostrarPersonas();
                    for(Persona objeto : listadePersonas){
                        System.out.println("EL id: " + objeto.getId()
                        + "El nombre: " + objeto.getNombre() 
                        + "La edad :" +  objeto.getEdad());
                    }
                    
                    break;
                case 2:
                    
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                    
                    String nompersona = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
                    int edadpersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                    //envio al objeto de persona
                    Persona personaNueva 
                            = new Persona(edad, nompersona, 
                                    edadpersona);
                    crud.registrarPersona(personaNueva);
                    break;
                case 3:
                    System.out.println("Ingresa el id, para buscar una persona");
                    int idbuscar = Integer.parseInt(JOptionPane.showInputDialog("ID de la persona a editar:"));
                    
                    Persona personaSeleccionada 
                            = crud.buscarPersona(idbuscar);
                    
                    //primero muestro la informacion
                    JOptionPane.showInputDialog("La informacion es:"
                            + "\n ID: " + personaSeleccionada.getId()
                            + "\n Nombre: " + personaSeleccionada.getNombre()
                            + "\n Edad: " + personaSeleccionada.getEdad());
                    
                    
                    String nuevonombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                    
                    int nuevaedad = Integer.parseInt("Ingrese la nueva edad");
                    
                    personaSeleccionada.setNombre(nuevonombre);
                    personaSeleccionada.setEdad(nuevaedad);
                    
                    crud.actualizarPersona(personaSeleccionada);
                    break;
                case 4:
                    
                    int ideliminar = Integer.parseInt(JOptionPane.showInputDialog("ID de la persona a eliminar miau miau:"));
                    
                    Persona personaEliminar = crud.buscarPersona(ideliminar);
                    
                    crud.eliminarPersona(personaEliminar);
                    
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
    
    
    
} 


