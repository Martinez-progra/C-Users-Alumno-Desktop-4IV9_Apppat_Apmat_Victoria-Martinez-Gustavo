import java.util.Scanner;

class entradaTexto{
    //metodo principal
    public static void main(String[] args){
        //instanceamos el objeto
        Scanner entrada = new Scanner(System.in);

        //las variables locales
        String nombre;
        int edad;
        //entrada
        System.out.println("Escribe tu nombre: ");
        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + " bienvenido a programar muy feo");

        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
    }
}