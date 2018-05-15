/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Josh
 */
public class NodoGeneral {
    private NodoGeneral siguiente, anterior;
    private Object item;

    public NodoGeneral(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public NodoGeneral getSiguiente() {
        return siguiente;
    }

    public NodoGeneral getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoGeneral siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoGeneral anterior) {
        this.anterior = anterior;
    }
    
    public void setNull(){
        this.item = null;
    }
}
