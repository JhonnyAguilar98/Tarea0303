/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tarea0303.servicio;

import Tarea0303.Modelo.Personaje;
import java.util.List;

/**
 *
 * @author HP OME
 */
public interface IPersonajeServicio {
    
    public Personaje crear (Personaje personaje);
    public List<Personaje> listar();
}
