/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gustavo
 */
public class Genero {

    private int idGenero;
    private String nombre;
    private String tipoGenero;
    private String subgenero;
    private String creacion;
    
    public Genero() {
        super();
        this.idGenero = (int) 0.0;
        this.nombre = "";
        this.tipoGenero = "";
        this.subgenero = "";
        this.creacion = "";
    }

    public Genero(int idGenero, String nombre, String tipoGenero, String subgenero, String creacion) {
        this.idGenero = idGenero;
        this.nombre = nombre;
        this.tipoGenero = tipoGenero;
        this.subgenero = subgenero;
        this.creacion = creacion;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }
    
        
}

