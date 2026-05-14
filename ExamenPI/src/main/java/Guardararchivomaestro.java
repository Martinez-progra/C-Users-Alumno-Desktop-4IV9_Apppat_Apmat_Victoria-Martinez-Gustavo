/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Guardararchivomaestro {
private static final String ARCHIVO_DATOS = "personas.dat";
    public static void guardar(List<Maestro> Maestros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARCHIVO_DATOS))) {
            oos.writeObject(Maestros);
            System.out.println("Datos de personas guardados en '" + ARCHIVO_DATOS + "'.");
        } catch (IOException e) {
            System.out.println("Error al guardar maestros: " + e.getMessage());
        }
    }
    public static List<Maestro> cargar() {
        File archivo = new File(ARCHIVO_DATOS);

        if (!archivo.exists()) {
            System.out.println("No hay datos previos. Iniciando lista vacía.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ARCHIVO_DATOS))) {
            // Cambiamos el cast a List<Persona>
            List<Maestro> Maestros = (List<Maestro>) ois.readObject();
            System.out.println("Personas cargadas: " + Maestros.size());
            return Maestros;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar personas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}    

