/* Vamos a crear 14 programas dentro de un menu gigante para poner a prueba sus conocimientos de algoritmia /* /*
 */
//Desarrollar un programa para calculra el bono de un descuento por edad
//Convertir decimales a numeros binarios
//Convertir temperaturas entre los 3 principales grados C a F y K
//4. Realizar un programa para contar numero de positivos y negativos de una serie de numeros
//5. Desarrollar una tiendita para agregar precios y productos
//6. Desarrollar un programa para calcular el area y perimetro de 5 diferentes figuras
//7. DESARROLLAR UNA tabla
//8. Desarrollar un programa para calcular el factorial
//9. Vamos a hacer dibujitos
//10. Desarrollar una figura hueca
//11. Realizar un diamante
//12. Desarrollar una calculadora basica + - / *
//13. Salida:

import java.util.Scanner;

class EntradaDatos {

    /**
     * @param args
     */
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
            System.out.println("13.- Salir ");

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

                        while (numbinario > 0) {

                            if (numbinario % 2 == 0) {
                                guardarbinario = "0" + guardarbinario;
                            } else {
                                guardarbinario = "1" + guardarbinario;
                            }

                            numbinario = numbinario / 2;
                        }

                    } else if (numbinario == 0) {

                        guardarbinario = "0";

                    } else {

                        guardarbinario = "No se puede convertir ese numero, solo acepta positivos";
                    }

                    System.out.println("El numero convertido a binario es: " + guardarbinario);

                    break;
                case 3:
                    //Vamos ahora con este
                    System.out.println("Ingrese unicamente los grados celcius a transformar ");

                    int gradoscelcius = 0;
                    gradoscelcius = entrada.nextInt();

                    double fahrenheit = (gradoscelcius * 9 / 5) + 32;
                    double kelvin = gradoscelcius + 273.15;

                    System.out.println(gradoscelcius + "°C equivale a:");
                    System.out.println(fahrenheit + "°F");
                    System.out.println(kelvin + " K");

                    break;

                case 4:
                    int positivos = 0;
                    int negativos = 0;

                    System.out.println("PONGA cuantos numeros habra: ");
                    int n;
                    n = entrada.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Ingrese los numeritos: " + i);
                        int num;
                        num = entrada.nextInt();
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

                    float compra = 0;

                    if (elementosproducto > 0) {

                        for (int i = 1; i <= elementosproducto; i++) {

                            System.out.println("Ingresa el nombre del producto: ");
                            String nombreproducto = "";
                            nombreproducto = entrada.next();

                            System.out.println("Ingrese el precio");
                            float precioProducto = 0.0f;
                            precioProducto = entrada.nextFloat();

                            System.out.println("Ingrese la cantidad de producto");
                            int cantidad = 0;
                            cantidad = entrada.nextInt();

                            float resultado;
                            resultado = precioProducto * cantidad;

                            compra = resultado + compra;
                        }

                        System.out.println("El total de la compra es: " + compra);

                    } else {
                        System.out.println("ingrese solo cantidades positivas");
                    }

                    break;

                case 6:

                    System.out.println("1. Cuadrado 2. Rectangulo 3. Trianguloisosceles 4. Circulo 5. Pentagono");
                    System.out.println("Escoga una figura: ");
                    int figura;
                    figura = entrada.nextInt();

                    switch (figura) {
                        case 1: {
                            System.out.println("Ingrese el lado: ");
                            double lado;
                            lado = entrada.nextDouble();
                            System.out.println("El area es del cuadrado: " + (lado * lado));
                            System.out.println("El perimetro es del cuadrado: " + (lado + lado + lado + lado));
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese el ladocorto: ");
                            System.out.println("Ingrese ladolargo: ");
                            double ladocorto;
                            ladocorto = entrada.nextDouble();
                            double ladolargo;
                            ladolargo = entrada.nextDouble();
                            System.out.println("El area es del rectangulo: " + (ladolargo * 2 + ladocorto * 2));
                            System.out.println("El perimetro es del rectangulo: " + (ladolargo + ladolargo + ladocorto + ladocorto));
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese la base: ");
                            System.out.println("Ingrese la altura: ");
                            double base;
                            double altura;
                            base = entrada.nextDouble();
                            altura = entrada.nextDouble();
                            System.out.println("El area es del triangulo:" + (base * altura / 2));
                            System.out.println("El perimetro del triangulo" + (base + altura + altura));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el radio: ");
                            double pi = 3.1415;
                            double radio;
                            radio = entrada.nextDouble();
                            System.out.println("El area es del circulo: " + (pi * radio * radio));
                            System.out.println("El perimetro del circulo: " + (pi * 2 * radio));
                            break;
                        }
                        case 5:
                            System.out.println("Ingrese el lado del pentagono: ");
                            System.out.println("Ingrese el apotema: ");
                            double ladopentagono;
                            double apotema;
                            apotema = entrada.nextDouble();
                            ladopentagono = entrada.nextDouble();
                            double perimetropentagono = 5 * ladopentagono;
                            System.out.println("Area del pentagono: " + (perimetropentagono * apotema / 2));
                            System.out.println("El perimetro es: " + (perimetropentagono));
                            break;
                        default:
                        System.out.println("No se encuentra la figura, lea bien señor/a");
                        break;
                    }
                    break;

            

            case 7:
             //quiero dejarles una tabla de multiplicar
                //deberan de darle formato y titulos a cada columna
                    for(n = 1; n <= 10; n++){
                    System.out.println("| " + n + "  | " + (n*10 + " " + (n*100) +" " + (n*1000)));
                }
            break;

            case 8:
            System.out.println("Ingrese un numero (max del 1 al 30 no te pases de rosca: ");
            int factorial;
            factorial = entrada.nextInt();
            int resultado = 1;
            if(factorial >= 2 && factorial <= 30){
                for(int i = 1; i <= factorial; i++){
                    resultado  *= i;

                }
                System.out.println("El factorial es: " + factorial  + "es: " +  resultado);
            }else if (factorial == 1){
                System.out.println("El factorial es 1 ");

            }else{
                System.out.println("Porfavor numeros del 1 al 10");
            }
            break;

            case 9:
            //vamos a realizar un cuadrado magico
                System.out.println("Vamos a realizar el dibujo de un cuadrado magico");
                System.out.println("Ingrese el tamaño del cuadrado");
                int n1= entrada.nextInt();

                if(n1 >= 1 && n1 <=20){
                    //se imprime
                    for(int i = 1; i <= n1; i++){
                        //recorro las columnas
                        //System.out.print(" 1 ");
                        for(int j = 1; j <= n1; j++){
                            System.out.print(" * ");

                        }
                        System.out.println("");
                    }

                }else{
                    System.out.println("Por favor solo ingrese valores entre el 1 y el 20");
                }
                break;


            case 10:
            //vamos a realizar un cuadrado magico ahora con un hueco
                System.out.println("Vamos a realizar el dibujo de un cuadrado magico hueco");
                System.out.println("Ingrese el tamaño del cuadrado");
                int n2;
                n2 = entrada.nextInt();


                if(n2 >= 1 && n2 <=20){
                    
                    for(int i = 1; i <= n2; i++){
                        for(int j = 1; j <= n2; j++){
                         if (i == 1 || i == n2 || j == 1 || j == n2) {
                            System.out.print(" *");
                        }else{
                        System.out.print("  ");
                    }
                    
                    }
                    System.out.println("");
                    }
                }else{
                    System.out.println("Por favor solo ingrese valores entre el 1 y el 20");
                }
                break;

                case 11:
                System.out.println("Ahora va un diamantito");
                System.out.println("Ingrese el tamaño del diamante: ");
                int diamante;
                diamante = entrada.nextInt();
                if (diamante >= 1 && diamante <= 20) {
    
    for (int i = 1; i <= diamante; i++) {
        for (int j = 1; j <= diamante - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    
    for (int i = diamante - 1; i >= 1; i--) {
        
        for (int j = 1; j <= diamante - i; j++) {
            System.out.print(" ");
        }
        
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }

} else {
    System.out.println("Por favor ingrese un valor entre 1 y 20");
}
                break;

                case 12:
                System.out.println("Hola soy la calculadora pepito");
                System.out.println("Opciones:");
                System.out.println("1. suma 2. resta 3. multiplicacion 4. division");
                System.out.println("Selecciona una opcion:");

                int operacion1;
                operacion1 = entrada.nextInt();

                System.out.println("Seleccione cuantos numeros: ");

                int seleccion;
                seleccion = entrada.nextInt();

                if(opcion > 0){
                    System.out.println("Ingresa el primer numero: ");
                double respuesta;
                respuesta = entrada.nextDouble();

                for(int i = 2; i <= operacion1; i++){
                System.out.println("Ingrese el siguiente valor: " + i);
                double numsiguiente;
                numsiguiente = entrada.nextDouble();
                switch (operacion1){
                    case 1:
                    break;
                    case 2:
                    respuesta -= numsiguiente;
                    break;
                    case 3:
                    respuesta *= numsiguiente;
                    break;
                    case 4: 
                    if (numsiguiente != 0) {
                        respuesta /= numsiguiente;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción de operación no válida.");
                    i = seleccion + 1; 
                    break;
            }
        }
        
       
        System.out.println("El resultado final es: " + respuesta);
        
        
    } else {
        System.out.println("Error: La cantidad debe ser mayor a 0.");
    }
    break; 
default:
                break;
        }
        System.out.println("Deseas repetir el programa escribe s o S para si");
        letrapararepetir = entrada.next().charAt(0);  
        }while(letrapararepetir != 's' || letrapararepetir == 'S');    

    }
}
