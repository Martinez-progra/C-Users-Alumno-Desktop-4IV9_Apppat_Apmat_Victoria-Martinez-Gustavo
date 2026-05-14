/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import java.util.ArrayList;
public class ControladorMaestro {

  /*
    vamos a ocupar un objeto especial para poder almacenar
    diferentes tipos de variable, y diferentes objetos, llamado
    arraylist, su particularidad es redimencional 
    */
    
    //creamos el objeto para consultar a las personas
    
    public static ArrayList<Maestro> listadeMaestro = new ArrayList<Maestro>();

    public ArrayList<Maestro> mostrarMaestro() {
        return listadeMaestro;
    }

    public void registrarMaestro(Maestro m) {
        listadeMaestro.add(m);
    }

    
    public Maestro buscarMaestro(int id) {
        
        Maestro encontrada = null; 
        
        for (Maestro m : listadeMaestro) {
            if (id == m.getId()) {
                encontrada = m;
                break; 
            }
        }
        return encontrada; 
    }

    
    public void actualizarMaestro(Maestro maestroActualizado) {
        
        Maestro maestroExistente = buscarMaestro(maestroActualizado.getId());
        
        
        if (maestroExistente != null) {
            listadeMaestro.remove(maestroExistente);
            listadeMaestro.add(maestroActualizado);
            System.out.println("Actualizado correctamente.");
        } else {
            System.out.println("No se encontró el ID para actualizar.");
        }
    }

    public void eliminarMaestro(int id) {
        Maestro m = buscarMaestro(id);
        if (m != null) {
            listadeMaestro.remove(m);
        }
    }
}


