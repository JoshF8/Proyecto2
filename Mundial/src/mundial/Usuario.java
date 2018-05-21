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
public class Usuario {
    private String CUI, Nombre, Contra, Correo, Nac, Nick;
    public int sobresAbiertos, estampasColocadas;
    public ListaGeneral sobres, album;
    
    public Usuario(String CUI, String Nombre, String Nac, String Correo, String Nick, String Contra){
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.Nac = Nac;
        this.Correo = Correo;
        this.Nick = Nick;
        this.Contra = Contra;
    }
    
    
    public String getCUI() {
        return CUI;
    }

    public String getContra() {
        return Contra;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getNac() {
        return Nac;
    }

    public String getNick() {
        return Nick;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setNac(String Nac) {
        this.Nac = Nac;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
