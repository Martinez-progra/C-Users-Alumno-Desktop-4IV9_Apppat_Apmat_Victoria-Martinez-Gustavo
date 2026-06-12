public class Animal {

    private String nombre, raza, tipo_alimento;
    private int edad;

    //toda clase debe de tener un constructor
    //sirven para poder declarar la existencia de una clase, para poder inicializar sus variables y poder crear instancias de la misma
    public Animal(){
        //primero su acceso es publico
        //El nombre del constructor es el mismo que de la clase pero sin parametros
        //Es un metodo
    }
    
    public Animal(String nombre, String raz, String tipo_alime, int edad){
        //constructor sobrecargado
        //para poder obtener el paso de cada parametro esto es necesario porque debemos de obtener el acceso a los atributos
        //vamos a ocupar la palabra reservada this
        this.nombre = nombre;
        this.raza = raz;
        this.tipo_alimento = tipo_alime;
        this.edad = edad;

    
    }

    //para poder obtener o enviar los datos correspondientes de la clase, necesitamos hacer uso de los metodos 
    //get para obtener o recibir
    //set para asignar o enviar

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raz){
        this.raza = raz;
    }

    public String getTipo_alimento(){
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }



    
}
