/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.Modelo;

import java.time.LocalDate;

/**
 *
 * @author HP OME
 */
public class Actor {
    
    private String Nombre;
    private String Nacionalidad;
    private LocalDate Fecha;
    private String Pais;
    private int Edad;

    public Actor(String Nombre, String Nacionalidad, LocalDate Fecha, String Pais, int Edad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Fecha = Fecha;
        this.Pais = Pais;
        this.Edad = Edad;
    }

    public Actor(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", Fecha=" + Fecha + ", Pais=" + Pais + ", Edad=" + Edad + '}';
    }
    
    
    
}
    

    

