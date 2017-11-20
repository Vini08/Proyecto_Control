/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Fernando Ambrosio
 */
public class listadoRecibos {
    String nombre;
    String apellido;
    String direccion;
    String zona;
    String lecturaAnterior;
    String lecturaActual;
    String metrosCubicos;
    String fechaVenci;
    String total;
    String idrecibo;

    public listadoRecibos(String nombre, String apellido, String direccion, String zona, String lecturaAnterior, String lecturaActual, String metrosCubicos, String fechaVenci, String total, String idrecibo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.zona = zona;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.metrosCubicos = metrosCubicos;
        this.fechaVenci = fechaVenci;
        this.total = total;
        this.idrecibo = idrecibo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(String lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public String getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(String lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public String getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(String metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public String getFechaVenci() {
        return fechaVenci;
    }

    public void setFechaVenci(String fechaVenci) {
        this.fechaVenci = fechaVenci;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(String idrecibo) {
        this.idrecibo = idrecibo;
    }

   

    
    
    
}
