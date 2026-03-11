//Vamos a realizar una infografia del Try catch y sus diferentes usos
//El Try catch ayuda a a capturar errores que solo puede ser vistos al momento de ejecutar el programa
//A diferencia de los warnings estos aparecen como correcton en el codigo
//Algunos ejemplos de como se pueden usar estos son:
//1. Convertir un int (Entero) a un String. 
//2. Algunos usos de usar el 0 como en la division.
//La conversion de un tipo de dato a otro.

//El uso 3 es el mas comun para este tipo de caso del "Try Catch"
//A continuacion analizaremos un ejercicio comun en internet y plataformas.
//Uno de estos ejemplos es calcular el area de un cuadrado usando int como si fuera un String
//Importar el scanner
import java.util.InputMismatchException;
import java.util.Scanner;
//El import java.util.InputMismatchException; se usa para evitar la alerta que previamente estabamos compartiendo
//Este import evita que al usuario al momento de compilar evite errores o warnings.
//Este import es de clase publica, siendo hijo del import NoSuchElementException.

class Infografia{
    //Definimos las variables globales
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        //Declaramos un entero como num y no como un numero entero
        boolean repetir;
        //Usamos un boolean para indicar si el usuario puso bien los datos
        //Recordemos que solo podemos poner numerros enteros
        do{

           try{
            //Recordemos que el do es como el "Iniciador del codigo"
            //Mientras el try asi como su significado en español doce, intenta ejecutar el coigo
            repetir = false
            //Decalramos repetir como false, ya que queremos calcular con enteros usando strings como ints
            System.out.println("Ingrese un valor");
            num = entrada.nextInt();
            //Usamos este comando para que el usuario ponga un valor
            int cuadrado = num * num;
            //Declarar cuadrado como int para este ejercicio y calcular su area



        //
        }catch (InputMismatchException ex){
            //Se usa catch para que el error se este vigilando
            //Evita que el usuario al poner caracteres no vigilados se coorrompa el codigo 
            System.out.println("Ponga solo numeros :( )");
            entrada.Next();
            repetir = true;
            //Se declaran de nuevo repetir cuando el usuario si puso numeros
            //Este solo es un ejemplo basico del Try Catch
            //Por supuesto que lo podemos usar con un if y un switch
        }
        }while(repetir);
        
    }
}    