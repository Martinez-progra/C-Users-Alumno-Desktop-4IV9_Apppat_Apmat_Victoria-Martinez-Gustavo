/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gustavo
 */


import java.sql.Date;

/**
 * Modelo que representa la tabla 'editoriales'.
 
 */
public class Editorial {

    private int    idEditorial;
    private String nombre;
    private String sitioWeb;
    private Date   fechaEditorial; 
    private String pais;

    public Editorial() {
        this.nombre         = "";
        this.sitioWeb       = "";
        this.fechaEditorial = null;
        this.pais           = "";
    }

    public Editorial(int idEditorial, String nombre, String sitioWeb,
                     Date fechaEditorial, String pais) {
        this.idEditorial    = idEditorial;
        this.nombre         = nombre;
        this.sitioWeb       = sitioWeb;
        this.fechaEditorial = fechaEditorial;
        this.pais           = pais;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public Date getFechaEditorial() {
        return fechaEditorial;
    }

    public String getPais() {
        return pais;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public void setFechaEditorial(Date fechaEditorial) {
        this.fechaEditorial = fechaEditorial;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
}