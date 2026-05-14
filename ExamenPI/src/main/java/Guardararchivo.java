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
public class Guardararchivo {
    private static final String ARCHIVO_DATOS = "personas.dat";
    public static void guardar(List<Persona> personas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARCHIVO_DATOS))) {
            oos.writeObject(personas);
            System.out.println("Datos de personas guardados en '" + ARCHIVO_DATOS + "'.");
        } catch (IOException e) {
            System.out.println("Error al guardar personas: " + e.getMessage());
        }
    }
    public static List<Persona> cargar() {
        File archivo = new File(ARCHIVO_DATOS);

        if (!archivo.exists()) {
            System.out.println("No hay datos previos. Iniciando lista vacía.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ARCHIVO_DATOS))) {
            // Cambiamos el cast a List<Persona>
            List<Persona> personas = (List<Persona>) ois.readObject();
            System.out.println("Personas cargadas: " + personas.size());
            return personas;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar personas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

