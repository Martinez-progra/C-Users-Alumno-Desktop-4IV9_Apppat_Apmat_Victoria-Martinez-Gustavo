/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class DAOEstudiante {
  //vamos a crear un programa para dar de alta 10 estudiantes
    
    //un objeto por parte de estudiante
    Estudiante obj[] = new Estudiante[10];
    int x = 0;
    
    //metodo del menu para el programa
    void menu(){
        String var = "si";
        
       while ("si".equalsIgnoreCase(var)) {
            String input = JOptionPane.showInputDialog(
                    "Ingresa la opcion deseada : \n"
                    + "1.- Dar de alta a nuevo estudiante. \n"
                    + "2.- Mostrar los datos de todos los estudiantes \n"
                    + "3.- Editar datos del estudiante \n"
                    + "4.- Eliminar estudiante");
            if (input == null) break;
            int op = Integer.parseInt(input);
            switch (op) {
                case 1:
                    //metodo para registrar

            if (x < 10) pedirEstudiante();
            else JOptionPane.showMessageDialog(null, "Arreglo lleno");
                    
                    break;
                case 2:
                    //mostrar estudiantes
                    mostrarEstudiante();
                break;
                
                case 3:
                    editarEstudiante();
                  break;
                    
                case 4:
                    eliminarEstudiante();
                    
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            var = JOptionPane.showInputDialog("¿Desea repetir el programa?");
        }
    }

    public void pedirEstudiante() {
        
        int numboleta = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa la boleta del estudiante: "));
        String chillon = JOptionPane.showInputDialog("¿El niño llora mucho?");
        String nom = JOptionPane.showInputDialog(
                "Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa la edad del estudiante: "));
        char gen = JOptionPane.showInputDialog(
                "Ingresa el genero del estudiante").charAt(0);
        
        
       
        
        
        obj[x] = new Estudiante(numboleta, chillon, nom, edad, gen); 
    
    x++;
    JOptionPane.showMessageDialog(null, "Registrado");
    }

    public void mostrarEstudiante() {
        //necesitamos recorrer el arreglo del tamaño que sea
    if (x == 0) {
        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados :( ");
        return;
    }
    // Agregamos un salto de línea \n al final del título
    String datos = "Listas de los chamacos\n\n"; 
    
    for(int i = 0; i < x; i++){
        datos += "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n"
              + "El nombre del estudiante es: " + obj[i].getNombre() + "\n"
              + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
              + "El genero del estudiante es: " + obj[i].getGenero() + "\n"
              + "¿Es chillón?: " + obj[i].getChillon() + "\n";
              
    }
   
    JOptionPane.showMessageDialog(null, datos);
    }   
    
    public void editarEstudiante() {
    
    String inputBusca = JOptionPane.showInputDialog("Boleta del alumno a editar");
    if (inputBusca == null) return;
    
    int buscar = Integer.parseInt(inputBusca);
    
    for (int i = 0; i < x; i++) {
        if (obj[i].getNumBoleta() == buscar) {
            // Edición de Nombre
            obj[i].setNombre(JOptionPane.showInputDialog("Nombre a cambiar:", obj[i].getNombre()));
            
            // Edición de Edad (CORREGIDO: Convertimos el int a String para el cuadro de diálogo)
            String nuevaEdad = JOptionPane.showInputDialog("Nueva Edad:", String.valueOf(obj[i].getEdad()));
            obj[i].setEdad(Integer.parseInt(nuevaEdad));
            
            // Edición de Género
            String nuevoGen = JOptionPane.showInputDialog("Nuevo genero:", String.valueOf(obj[i].getGenero()));
            obj[i].setGenero(nuevoGen.charAt(0));
            
            JOptionPane.showMessageDialog(null, "Datos actualizados.");
            return;
        }
    } 
    JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con esa boleta.");
}
    
    
    public void eliminarEstudiante() {
    
    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Boleta del alumno a eliminar"));
    for (int i = 0; i < x; i++) {
            if (obj[i].getNumBoleta() == buscar) {
                for (int j = i; j < x - 1; j++) {
                    obj[j] = obj[j + 1];
                }
                obj[x - 1] = null; // Limpiamos la última posición
                x--; // Reducimos el contador de alumnos
                JOptionPane.showMessageDialog(null, "Estudiante eliminado.");
                return;
                
                
            }
    
   
}
    JOptionPane.showMessageDialog(null, "Estudiante no encontrado intente ");
}
}
