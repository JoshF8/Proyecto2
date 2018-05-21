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
public class Jugador {
    private String Nombre, Nacimiento, Posicion, Altura, Peso, CodigoEquipo, Tipo;
    private int Camisola;
    private Estampa estampa;
    
    public Jugador(String Nombre, String Posicion, String Nacimiento, String Altura, String Peso, String CodigoEquipo, int  Camisola, String Tipo){
        setNombre(Nombre);
        setPosicion(Posicion);
        setNacimiento(Nacimiento);
        setAltura(Altura);
        setPeso(Peso);
        setCodigoEquipo(CodigoEquipo);
        setCamisola(Camisola);
        setTipo(Tipo);
    }

    public String getAltura() {
        return Altura;
    }

    public Estampa getEstampa() {
        return estampa;
    }

    public int getCamisola() {
        return Camisola;
    }

    public String getCodigoEquipo() {
        return CodigoEquipo;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPeso() {
        return Peso;
    }

    public String getPosicion() {
        return Posicion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public void setCamisola(int Camisola) {
        this.Camisola = Camisola;
    }

    public void setCodigoEquipo(String CodigoEquipo) {
        this.CodigoEquipo = CodigoEquipo;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
