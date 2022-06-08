/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.Modelo;

/**
 *
 * @author HP OME
 */
public class Personaje {

    private String Nombre;
    private int NumeroDeEscenas;
    private int EdadDelPersonaje;
    private Actor actor;
    private Pelicula pelicula;

    public Personaje(String Nombre, int NumeroDeEscenas, int EdadDelPersonaje, Actor actor, Pelicula pelicula) {
        this.Nombre = Nombre;
        this.NumeroDeEscenas = NumeroDeEscenas;
        this.EdadDelPersonaje = EdadDelPersonaje;
        this.actor = actor;
        this.pelicula = pelicula;
    }

    public Personaje(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDeEscenas() {
        return NumeroDeEscenas;
    }

    public void setNumeroDeEscenas(int NumeroDeEscenas) {
        this.NumeroDeEscenas = NumeroDeEscenas;
    }

    public int getEdadDelPersonaje() {
        return EdadDelPersonaje;
    }

    public void setEdadDelPersonaje(int EdadDelPersonaje) {
        this.EdadDelPersonaje = EdadDelPersonaje;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Personaje{" + "Nombre=" + Nombre + ", NumeroDeEscenas=" + NumeroDeEscenas + ", EdadDelPersonaje=" + EdadDelPersonaje + ", actor=" + actor + ", pelicula=" + pelicula + '}';
    }
    
    
    
}
