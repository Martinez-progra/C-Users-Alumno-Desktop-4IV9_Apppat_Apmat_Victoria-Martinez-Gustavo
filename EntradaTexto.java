/* Vamos a crear una instancia de un objeto para la entrada de datos estandar y la salida de datos */
// Libreria scanner 
import java.util.Scanner;
class EntradaTexto{
  //metodoprincipal
  public static void main(String[] args){
    // Instanciamos el objeto
    Scanner entrada = new Scanner(System.in);
    //Las variables locales
    String nombre;
    int edad;
    //entrada
    System.out.println("Escribe tu nombre");
    nombre = System.console().readLine();
    System.out.println("Hola: " + nombre + "Bienvenido a programar muy feo");
    System.out.println("Escribe tu edad: "
    edad = entrada.nextInt();
  }
}
