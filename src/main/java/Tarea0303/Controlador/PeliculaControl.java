/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.Controlador;

import Tarea0303.Modelo.Pelicula;
import Tarea0303.servicio.PeliculaServicio;
import java.util.List;

/**
 *
 * @author HP OME
 */

public class PeliculaControl {
    private final PeliculaServicio peliculaServicio = new PeliculaServicio();
    
    public Pelicula crear(String [] args){
        var pelicula = new Pelicula(Integer.valueOf(args[0]),args[1],args[2]);
        this.peliculaServicio.crear(pelicula);
        return pelicula;
    }
    
    public List<Pelicula> listar(){
        return this.peliculaServicio.listar();
    }
}
