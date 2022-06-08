/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tarea0303.servicio;

import Tarea0303.Modelo.Pelicula;
import java.util.List;

/**
 *
 * @author HP OME
 */
public interface IPeliculaServicio {
    
    public Pelicula crear (Pelicula pelicula);
    public List<Pelicula> listar();
}
