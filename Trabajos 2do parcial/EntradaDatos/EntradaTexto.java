

/* Vamos a crear una instancia de un objeto para la entrada de datos estamdar y la salida de datos */
//Liberar scanner
import java.util.Scanner;
class EntradaTexto{
    //Metodo principal
    public static void main(String[] args){
        //Instamos el objeto
        Scanner entrada = new Scanner(System.in);
        //Las variables locales
        String nombre;
        int edad;
        //Entrada
        System.out.println("Escribe tu nombre: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + "Bienvenido a programar muy feo");
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
    } 
}
