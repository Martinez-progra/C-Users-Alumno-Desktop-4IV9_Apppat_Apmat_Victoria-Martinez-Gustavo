/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import java.io.Serializable;
public class Maestro {
    private int id;
  private String nombre;
  private String matricula;

    public Maestro() {
    }
    public Maestro(int id, String nombre, String matricula) {
    this.id = id;
    this.nombre = nombre;
    this.matricula = matricula;
}

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
