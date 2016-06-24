/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class NodoCliente {
    
    String ficha,nombre,edad,servicio,prioridad;
    NodoCliente siguiente;

    public NodoCliente(String ficha, String nombre, String edad, String servicio, String prioridad) {
        this.ficha= ficha;
        this.nombre= nombre;
        this.edad= edad;
        this.servicio= servicio;
        this.prioridad= prioridad;
        this.siguiente= null;
    }

    public String getFicha() {
        return ficha;
    }
    public void setFicha(String ficha) {
        this.ficha = ficha;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public NodoCliente getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }
}
