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
public class Estampa {
    String Nombre, CodigoEquipo, RutaImagen;
    int Rareza;
    
    public Estampa(String Nombre, String CodigoEquipo, int Rareza, String RutaImagen){
        setNombre(Nombre);
        setCodigoEquipo(CodigoEquipo);
        setRareza(Rareza);
        setRutaImagen(RutaImagen);
    }

    public String getCodigoEquipo() {
        return CodigoEquipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getRareza() {
        return Rareza;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setCodigoEquipo(String CodigoEquipo) {
        this.CodigoEquipo = CodigoEquipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRareza(int Rareza) {
        this.Rareza = Rareza;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }
}
