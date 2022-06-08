/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea0303.Modelo;

/**
 *
 * @author HP OME
 */
public class Pelicula {
    
    private String Nombre;
    private String PeliculaTipo;
    private int AñoDeEstreno;
    private int Rnkin;
    private String PaisDeOrigen;

    public Pelicula(String Nombre, String PeliculaTipo, int AñoDeEstreno, int Rnkin, String PaisDeOrigen) {
        this.Nombre = Nombre;
        this.PeliculaTipo = PeliculaTipo;
        this.AñoDeEstreno = AñoDeEstreno;
        this.Rnkin = Rnkin;
        this.PaisDeOrigen = PaisDeOrigen;
    }

    public Pelicula(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPeliculaTipo() {
        return PeliculaTipo;
    }

    public void setPeliculaTipo(String PeliculaTipo) {
        this.PeliculaTipo = PeliculaTipo;
    }

    public int getAñoDeEstreno() {
        return AñoDeEstreno;
    }

    public void setAñoDeEstreno(int AñoDeEstreno) {
        this.AñoDeEstreno = AñoDeEstreno;
    }

    public int getRnkin() {
        return Rnkin;
    }

    public void setRnkin(int Rnkin) {
        this.Rnkin = Rnkin;
    }

    public String getPaisDeOrigen() {
        return PaisDeOrigen;
    }

    public void setPaisDeOrigen(String PaisDeOrigen) {
        this.PaisDeOrigen = PaisDeOrigen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Nombre=" + Nombre + ", PeliculaTipo=" + PeliculaTipo + ", A\u00f1oDeEstreno=" + AñoDeEstreno + ", Rnkin=" + Rnkin + ", PaisDeOrigen=" + PaisDeOrigen + '}';
    }
    
    
}
