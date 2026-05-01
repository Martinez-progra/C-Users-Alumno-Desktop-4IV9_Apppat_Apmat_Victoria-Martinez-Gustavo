//Ahora vamos con el examen
import java.util.Scanner;
    class ExamenPrimerParcial{
        public static void main(String[] args) {

        int opcion;
        char letrapararepetir;

        Scanner entrada = new Scanner(System.in);

        String nombre = "";
        String apellidopaterno  = "";
        String apellidomaterno = "";
        String  fechanacimiento = "";
        String residencia = "";

        do{

            System.out.println("Bienvenidos a este fabuloso programa:");
            System.out.println("Favor de ingresar su opcion preferida: ");
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4: Salir");

            opcion = entrada.nextInt();
            //En el codigo se pide que los datos de nombre apellido etc se guarden
            //En este caso el entrada.int guarda los strings para que se conserven mientras la consola se guarde
            //Si le agregamos ya el famoso int solo va a ver los valores int y no los va a guardar
            entrada.nextLine();
            switch(opcion){
            case 1:
            //Aui se declara ya para guardar los datos de tipo string 
            //Esta funcion fue sacada por google para que los datos no se borraran al poner las opciones string
            System.out.print("Nombre: "); nombre = entrada.nextLine();
            System.out.print("Apellido paterno: "); apellidopaterno = entrada.nextLine();
            System.out.print("Apellido materno: "); apellidomaterno = entrada.nextLine();
            System.out.print("Fecha de nacimiento: "); fechanacimiento = entrada.nextLine();
            System.out.print("Domicilio: "); residencia = entrada.nextLine();
            break;

            case 2:
            System.out.println("Los mejores precios solo aqui: ");
            System.out.println("1 Porcelanato 22.35 el metro cuadrado");
            System.out.println("2 Marmoleado 34.27 el metro cuadrado");
            System.out.println("3 Acrilico 22.94 el metro cuadrado");
            
            break;

            case 3:
    int cuartos = 0;           
    int materialelegido = 0;   
    double precio = 0.0;     
    double largopiso = 0.0;    
    double anchopiso = 0.0;    
    double subtotalcuarto = 0.0;  
    double subtotalgeneral = 0.0; 
    String nombrematerial = "";     


    System.out.print("¿Cuántos cuartos desea calcular? (2-4): ");
    cuartos = entrada.nextInt(); 

    if (cuartos >= 2 && cuartos <= 4) {
        for (int i = 1; i <= cuartos; i++) {
            
            System.out.print("Ingrese Largo: ");
            largopiso = entrada.nextDouble();
            
            System.out.print("Ingrese Ancho: ");
            anchopiso = entrada.nextDouble();

            System.out.println("Elija Material: 1.Porcelanato  2.Marmoleado  3.Acrílico");
            System.out.print("Opción: ");
            materialelegido = entrada.nextInt(); 

            
            if (materialelegido == 1) {
                precio = 22.35;
                nombrematerial = "Porcelanato";
            } else if (materialelegido == 2) {
                precio = 34.27;
                nombrematerial = "Marmoleado";
            } else if (materialelegido == 3) {
                precio = 22.94;
                nombrematerial = "Acrílico";
            } else {
                System.out.println("Opción no válida.");
            }

            
            subtotalcuarto = (largopiso * anchopiso) * precio;
            subtotalgeneral += subtotalcuarto;
            
            System.out.println(" Cuarto " + i +  "  precio " + subtotalcuarto);

        double porcentajeIva = 0.16;
        double montoIva = subtotalgeneral * porcentajeIva;
        double totalConIva = subtotalgeneral + montoIva;
        double montodescuento = totalConIva * 0.0795;
        double descuento = totalConIva - montodescuento;
        System.out.println("Subtotal General: " + subtotalgeneral);
        System.out.println("IVA (16%): " + montoIva);
        System.out.println("Total a pagar: " + totalConIva);
        System.out.println("Total a pagar con descuento: " + descuento);
        
    } 
    }
            break;
                
    } 
        
        System.out.println("Deseas repetir el programa? escribe s para si: ");
        letrapararepetir = entrada.next().charAt(0);  

    } while (letrapararepetir == 's' || letrapararepetir == 'S'); 

    } 
} 
//Atte un programador programa. 