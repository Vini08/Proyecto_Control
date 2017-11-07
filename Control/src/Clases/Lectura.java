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
public class Lectura {
    private String fechalectura;
    private int lecturaanterior;
    private int lecturaactual;
    private int metroscubicos;
    private int idmedidor;

    public Lectura() {
    }

    public String getFechalectura() {
        return fechalectura;
    }

    public void setFechalectura(String fechalectura) {
        this.fechalectura = fechalectura;
    }

    public int getLecturaanterior() {
        return lecturaanterior;
    }

    public void setLecturaanterior(int lecturaanterior) {
        this.lecturaanterior = lecturaanterior;
    }

    public int getLecturaactual() {
        return lecturaactual;
    }

    public void setLecturaactual(int lecturaantual) {
        this.lecturaactual = lecturaantual;
    }

    public int getMetroscubicos() {
        return metroscubicos;
    }

    public void setMetroscubicos(int metroscubicos) {
        this.metroscubicos = metroscubicos;
    }

    public int getIdmedidor() {
        return idmedidor;
    }

    public void setIdmedidor(int idmedidor) {
        this.idmedidor = idmedidor;
    }
    
    
    
}
