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
    
    public ListaGeneral eliminarNodo(NodoGeneral nodo){
        nodo.setNull();
        if(nodo != nodoInicio){
            if(nodo != nodoFinal){
                nodo.getAnterior().setSiguiente(nodo.getSiguiente());
                nodo.getSiguiente().setAnterior(nodo.getAnterior());
            }else{
                nodo.getAnterior().setSiguiente(null);
                nodoFinal = nodo.getAnterior();
            }
        }else{
            if(nodo != nodoFinal){
                nodo.getSiguiente().setAnterior(null);
                nodoInicio = nodo.getSiguiente();
            }else{
                nodoFinal = nodoInicio = null;
                return null;
            }
        }
        return this;
    }
}
