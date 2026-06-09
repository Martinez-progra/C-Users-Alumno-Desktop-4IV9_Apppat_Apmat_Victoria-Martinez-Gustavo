/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class Autor  {


    private int id_autor;
    private String nombre;
    private String nacionalidad;
    private Date fechanacimiento;
    private String muerte;
    
    
    
    public Autor() {
        super();
        this.id_autor = (int) 0.0;
        this.nombre = "";
        this.nacionalidad = "";
        this.fechanacimiento = null;
        this.muerte = "";
    }
    
    

    public Autor(int id_autor, String nombre, String nacionalidad, Date fechaNacimiento, String muerte) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechanacimiento = fechaNacimiento;
        this.muerte = muerte;
    }

    public int getIdAutor() {
        return id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechanacimiento;
    }

    public String getMuerte() {
        return muerte;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechanacimiento = fechaNacimiento;
    }

    public void setMuerte(String muerte) {
        this.muerte = muerte;
    }
    
    
}
