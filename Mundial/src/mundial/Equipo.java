/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial;
import Listas.*;
/**
 *
 * @author Josh
 */
public class Equipo {
    
    private String Nombre, Codigo;
    private int Mundiales, Creacion;
    public ListaGeneral jugadores;
    
    public Equipo(String nombre, String codigo, int mundiales, int creacion){
        setNombre(nombre);
        setCodigo(codigo);
        setMundiales(mundiales);
        setCreacion(creacion);
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getCreacion() {
        return Creacion;
    }

    public int getMundiales() {
        return Mundiales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setCreacion(int Creacion) {
        this.Creacion = Creacion;
    }

    public void setMundiales(int Mundiales) {
        this.Mundiales = Mundiales;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
