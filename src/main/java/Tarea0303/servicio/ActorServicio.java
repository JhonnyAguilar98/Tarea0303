/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.servicio;

import Tarea0303.Modelo.Actor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP OME
 */
public class ActorServicio implements IActorServicio {

    private static List<Actor> actorList = new ArrayList<>();

    @Override
    public Actor crear( Actor actor) {
        this.actorList.add(actor);
        return actor;
    }
    
    public List<Actor> listar(){
        return this.actorList;
    }  

       
}
