


import java.util.Scanner;

public class Figuras {
    

    static Scanner entrada = new Scanner(System.in);
    static double radio, lado, base, altura, diagonalMayor, diagonalMenor, apotema;
    static int opcion;
    static char letra;
    static boolean esValido;

    public static void main(String[] args){
        menu();
        
    }    
    public static void menu(){
    
        do{          
            

            System.out.println("Este es un programa para calcular Areas y Perimetros de Figuras Geometricas");
            System.out.println("1.- Triangulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rombo");
            System.out.println("5.- Heptagono");
            System.out.println("Elija alguna de las opciones que son citadas");

            try {

            opcion = entrada.nextInt();
        

              
            switch (opcion) {
                case 1:
                    //triangulo
                    calcularTriangulo();
                    
                    break;
                case 2:
                    //cuadrado
                    calcularCuadrado();
                    
                    break;
                case 3:
                    //circulo
                    calcularCirculo();
                    
                    break;

                case 4:
                    calcularRombo();

                    break;
            
                case 5:

                    calcularHeptagono();

                break;
                default:
                    System.out.println("Gracias por ocuparme UwU");
                    break;
                } 
            }catch (Exception e) {
            System.out.println("Error: Ingrese un numero entero.");
                entrada.next();    
            }
            System.out.println("Si desea repetir el programa ingrese la letra S");
            letra = entrada.next().charAt(0);
        
        }while(letra == 's' || letra == 'S');    
    }  
     
        public static void calcularTriangulo(){
        System.out.println("Area y Perimetro de un Triangulo");
        System.out.println("Que tipo de triangulo desea calcular:");
        System.out.println("1.-Equilatero");
        System.out.println("2.-Isosceles");
        System.out.println("3.-Escaleno");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                
                esValido = false;
                do{
                try{
                    System.out.println("Ingrese la base:");
                    if(entrada.hasNextDouble()){
                        base = entrada.nextDouble();
                        if(base > 0){
                            esValido = true;
                        }else{
                            System.out.println("La base debe ser un numero positivo");
                        }
                    }else{
                        System.out.println("Ingrese unicamente numeros");
                        entrada.next();
                    }
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                    entrada.next();
                }
                }while(!esValido);
            
            
                esValido = false;
                do{
                try{
                    System.out.println("Ingrese la altura del triangulo");
                    if(entrada.hasNextDouble()){
                        altura = entrada.nextDouble();
                        if(altura > 0){
                            esValido = true;
                        }else{
                            System.out.println("La altura debe ser un numero positivo");
                        }
                    }else{
                        System.out.println("Ingrese unicamente numeros");
                        entrada.next();
                    }
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
                }while(!esValido);
            
            double perimetrote = base * 3;
            double areate = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
            System.out.println("Área: " + areate + " Perímetro: " + perimetrote);

                break;
            case 2:
            System.out.print("Ingresa el valor de los dos lados iguales: ");
            double hI = Math.sqrt(Math.pow(lado, 2) - Math.pow(base / 2, 2));
            double areati = (base * hI) / 2;
            double perimetroti = base + (lado * 2);
                break;
            case 3:
            double l1 = 0, l2 = 0, l3 = 0;
            double perimetrots = l1 + l2 + l3;
            double s = perimetrots / 2; // Semiperímetro
            double areats = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
            System.out.println("TS - Area: " + areats + " | Perimetro: " + perimetrots);
            break;
  
        
            default:
            System.out.println("Operacion no valida");
                break;
        }
        }
    

    public static void calcularCuadrado(){

            esValido = false;
                do{
                try{
                    System.out.println("Ingrese el lado");
                    lado = entrada.nextDouble();
                        if(lado > 0) esValido = true;
                        else System.out.println("El radio debe ser un numero positivo");
                        
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                    entrada.next();
                }
                }while(!esValido);
            
            double areacuadrado = Math.pow(lado, 2);
            double perimetrocuadrado = 4 * lado;
                
            System.out.println("Área: " + areacuadrado);
            System.out.println("Perímetro: " + perimetrocuadrado);
            
            
            }

    public static void calcularCirculo(){

                esValido = false;
                do{
                try{
                    System.out.println("Ingrese el radio");
                    radio = entrada.nextDouble();
                        if(radio > 0) esValido = true;
                        else System.out.println("El radio debe ser un numero positivo");
                        
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                    entrada.next();
                }
                }while(!esValido);

            double areacirculo =  Math.PI * Math.pow(radio, 2);
            double perimetrocirculo =  2 * Math.PI * radio;
            System.out.println("El perimetro es: " + areacirculo + "El perimetro es: " + perimetrocirculo);
            }


    public static void calcularRombo(){
         esValido = false;
                do{
                try{
                    System.out.println("Ingrese la diagonal mayor");
                    diagonalMayor = entrada.nextDouble();
                        if(diagonalMayor > 0) esValido = true;
                        else System.out.println("El lado debe ser un numero positivo");
                        
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                    entrada.next();
                }
                }while(!esValido);

             esValido = false;
                do{
                try{
                    System.out.println("Ingrese la diagonal menor");
                    diagonalMenor = entrada.nextDouble();
                        if(diagonalMenor > 0) esValido = true;
                        else System.out.println("El lado debe ser un numero positivo");
                        
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                    entrada.next();
                }
                }while(!esValido);

            double arearombo = (diagonalMayor * diagonalMenor) / 2;
    
            double ladoRombo = Math.sqrt(Math.pow(diagonalMayor/2, 2) + Math.pow(diagonalMenor/2, 2));
            double perimetrorombo = ladoRombo * 4;

            System.out.println("Area: " + arearombo + " Perimetro: " + perimetrorombo);               
            }            

    public static void calcularHeptagono() {
        esValido = false;
        do {
            try {
                System.out.println("Ingrese un lado:");
                lado = entrada.nextDouble();
                System.out.println("Ingrese el apotema:");
                apotema = entrada.nextDouble();
                if (lado > 0 && apotema > 0) esValido = true;
            } catch (Exception e) {
                entrada.next();
            }
        } while (!esValido);

        double perimetro = lado * 7;
        double area = (perimetro * apotema) / 2;
        System.out.println("Perímetro: " + perimetro + " Área: " + area);
    }

} 
    

