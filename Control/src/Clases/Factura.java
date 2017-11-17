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
public class Factura {
    String numero;
    String nombre;
    String apellido;
    String nit;
    String direccion;
    String zona;
    String metrosCubicos;
    String fecha;
    String usuario;
    String idrecibo;
    String tipopago;
    String total;

    public Factura(String numero, String nombre, String apellido, String nit, String direccion, String zona, String metrosCubicos, String fecha, String usuario, String idrecibo, String tipopago, String total) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.direccion = direccion;
        this.zona = zona;
        this.metrosCubicos = metrosCubicos;
        this.fecha = fecha;
        this.usuario = usuario;
        this.idrecibo = idrecibo;
        this.tipopago = tipopago;
        this.total = total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public String getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(String metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(String idrecibo) {
        this.idrecibo = idrecibo;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
}
