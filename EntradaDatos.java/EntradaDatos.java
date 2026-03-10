/* Vamos a crear 14 programas dentro de un menu gigante para poner a prueba sus conocimientos de algoritmia /* /*
 */
//Desarrollar un programa para calculra el bono de un descuento por edad
//Convertir decimales a numeros binarios
//Convertir temperaturas entre los 3 principales grados C a F y K
//4. Realizar un programa para contar numero de positivos y negativos de una serie de numeros
//5. Desarrollar una tiendita para agregar precios y productos
//6. Desarrollar un programa para calcular el area y perimetro de 5 diferentes figuras
//7. DESARROLLAR UNA tabla
//8. Desarrollar un programa para calcular el factorial con recursividad
//9. Vamos a hacer dibujitos
//10. Desarrollar una figura hueca
//11. Realizar algunas patrones
//12. Realizar un diamante
//13. Desarrollar una calculadora basica + - / *
//14. Salida:


import java.util.Scanner;

class EstructuraDatos {
   public static void main(String[] args){
        //aqui van las variables
        int opcion;
        char letrapararepetir;

        //aqui van los objetos
        Scanner entrada = new Scanner(System.in);

        //aqui va el menu

        do{
        System.out.println("Bienvenido a este programa para verificar que tanto saben programar a partir de algoritmos basicos.");
        System.out.println("Por favor elija la opción deseada:");
        System.out.println("1.- ");
        System.out.println("2.- ");
        System.out.println("3.- ");
        System.out.println("4.- ");
        System.out.println("5.- ");
        System.out.println("6.- ");
        System.out.println("7.- ");
        System.out.println("8.- ");
        System.out.println("9.- ");
        System.out.println("10.- ");
        System.out.println("11.- ");
        System.out.println("12.- ");
        System.out.println("13.- ");
        System.out.println("14.- Salir ");
        
        //entrada de dato
        opcion = entrada.nextInt();

        //ahora tengo que evaluar la entrada
        switch (opcion) {
            case 1:
                
                break;
            case 2:  
            //convertir un numero decimal a binario
            System.out.println("Ingrese un numero positivo entero que se desee convertir a binario");
            int numbinario;
            String guardarbinario ="";
            numbinario = entrada.nextInt();

            if(numbinario > 0){
                //realizamos el mod 2
                while(numbinario > 0){
                    if(numbinario%2 == 0){
                        guardarbinario = "0" + guardarbinario;

                    }else{
                        guardarbinario = "1" + guardarbinario;

                    }
                    numbinario = (int)numbinario/2;
                }

            }else if(numbinario == 0){
                
                guardarbinario = "0";
            }else{
               //aqui no se puede llegale
               guardarbinario = "No se puede convertir ese numero, solo acepta positivos";
            }
            System.out.println("El numero convertido a binario es: " + guardarbinario);
                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }
        System.out.println("Deseas repetir el programa escribe s o S para si");
        letrapararepetir = entrada.next().charAt(0);  
        }while(letrapararepetir != 's' || letrapararepetir == 'S');    

    }
}