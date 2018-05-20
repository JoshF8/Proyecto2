/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial;

/**
 *
 * @author Josh
 */
public class Equipo {
    
    private String Nombre;
    private int Codigo, Mundiales, Creacion;
    
    public Equipo(String nombre, int codigo, int mundiales, int creacion){
        setNombre(nombre);
        setCodigo(codigo);
        setMundiales(mundiales);
        setCreacion(creacion);
    }

    public int getCodigo() {
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

    public void setCodigo(int Codigo) {
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
