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

class EntradaDatos {

    public static void main(String[] args) {
        //aqui van las variables
        int opcion;
        char letrapararepetir;

        //aqui van los objetos
        Scanner entrada = new Scanner(System.in);

        //aqui va el menu
        do {
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
                    //Ejercicio 1
                    System.out.println("Ponga su edad, compre ya");
                    int edad;
                    double precio = 1890.50;
                    double descuento = 0;
                    edad = entrada.nextInt();
                    if (edad >= 60) {
                        descuento = 0.25;
                    } else if (edad > 18) {
                        descuento = 0.20;

                    } else {
                        descuento = 0.10;
                    }
                    double monto = precio - (precio * descuento);
                    System.out.println("Su ahorro fue del:" + (descuento * 100) + "% Del maravilloso descuento");
                    System.out.println("El total es:" + monto);

                    break;
                case 2:
                    //convertir un numero decimal a binario
                    System.out.println("Ingrese un numero positivo entero que se desee convertir a binario");
                    int numbinario;
                    String guardarbinario = "";
                    numbinario = entrada.nextInt();

                    if (numbinario > 0) {
                        //realizamos el mod 2
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                guardarbinario = "0" + guardarbinario;

                            } else {
                                guardarbinario = "1" + guardarbinario;

                            }
                            numbinario = (int) numbinario / 2;
                        }

                    } else if (numbinario == 0) {

                        guardarbinario = "0";
                    } else {
                        //aqui no se puede llegale
                        guardarbinario = "No se puede convertir ese numero, solo acepta positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + guardarbinario);

                    break;
                case 3:
                    //Vamos ahora con este
                    System.out.println("Ingrese unicamente los grados celcuis a transformar ");
                    int grados = 0;
                    grados = entrada.nextInt();

                    double fahrenheit = (celsius * 9 / 5) + 32;
                    double kelvin = celsius + 273.15;

                    System.out.println(celsius + "°C equivale a:");
                    System.out.println(fahrenheit + "°F");
                    System.out.println(kelvin + " K");

                    break;

                case 4:
                    int[] serie = {12, -5, 0, 8, -22, 45, -1, 7};
                    int positivos = 0;
                    int negativos = 0;

                    for (int num : serie) {
                        if (num > 0) {
                            positivos++;
                        } else if (num < 0) {
                            negativos++;
                        }
                    }

                    System.out.println("Cantidad de positivos: " + positivos);
                    System.out.println("Cantidad de negativos: " + negativos);

                    break;

                case 5:
                    System.out.println("Bienvenido a esta hermosa tiendita linda y kawaii");
                    System.out.println("Por favor ingrese cuantos elementos va a comprar");
                    int elementosproducto = 0;
                    elementosproducto = entrada.nextInt();
                    if (elementosproducto > 0) {
                        for (int i = 1; i <= elementosproducto; i++) {
                            System.out.println("Ingresa el nombre del producto");
                            String nombreproducto = "";
                            nombreproducto = entrada.next();
                            System.out.println("Ingrese el precio");
                            float precio = 0.0;
                            precio = entrada.nextFloat();
                            float resultado;
                            System.out.println("Ingrese la cantidad de producto");
                            int cantidad = 0;
                            precio = entrada.nextInt();
                            resultado = precio * cantidad;
                            float compra = 0;
                            compra = resultado + compra;

                        }
                        System.out.println("El total de la compra es: " + compra);

                    } else {
                        System.out.println("ingrese solo cantidades positivas");
                    }

                    break;

                case 6:
                    double radio = 5;
                    System.out.println("Círculo - Área: " + (Math.PI * Math.pow(radio, 2)));
                    System.out.println("Círculo - Perímetro: " + (2 * Math.PI * radio));

                    break;

                default:
                    break;
            }
            System.out.println("Deseas repetir el programa escribe s o S para si");
            letrapararepetir = entrada.next().charAt(0);
        } while (letrapararepetir != 's' || letrapararepetir == 'S');

    }
}
