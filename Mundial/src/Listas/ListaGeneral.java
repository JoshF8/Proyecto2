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
public class ListaGeneral {
    public NodoGeneral nodoInicio, nodoFinal;
    
    public ListaGeneral(NodoGeneral inicio){
        nodoInicio = inicio;
        nodoFinal = inicio;
    }
    
    public void crearNodo(Object item){
        NodoGeneral nuevoNodo = new NodoGeneral(item);
        nodoFinal.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(nodoFinal);
        nodoFinal = nuevoNodo;
    }
}
