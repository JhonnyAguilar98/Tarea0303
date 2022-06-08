/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.servicio;

import Tarea0303.Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP OME
 */
public class PeliculaServicio implements IPeliculaServicio {

    private static List<Pelicula> peliculaList = new ArrayList<>();

    @Override
    public Pelicula crear( Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        return pelicula;
    }
    
    public List<Pelicula> listar(){
        return this.peliculaList;
    }  
    
}
