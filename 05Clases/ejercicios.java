import java.util.Scanner;

public class ejercicios{
    //Vamos a hacer una calculadora
    //La calculadora debera tener un menu

    Scanner entrada = new Scanner(System.in);

    public void menu(){
        System.out.println("Bienvenido a la caluladora, selecciona la opcion que escogera");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");

        int opcion=0;

        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                suma();
                break;
            default:
                break;
        }
        }
        public void suma(){
            double num1 = 0.00, num2= 0.00;
            System.out.println("De el valor 1");
            num1 = entrada.nextDouble();
            System.out.println("DE EL VALOR 2");
            num2 = entrada.nextDouble();
            resultadO = num1 + num2;

            System.out.println("Resultado: " + resultadO);
        }
    }

