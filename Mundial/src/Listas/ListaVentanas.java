/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import javax.swing.*;
/**
 *
 * @author Josh
 */
public class ListaVentanas extends ListaGeneral{
    
    public ListaVentanas(NodoGeneral nodoInicio){
        super(nodoInicio);
    }
    
    public void crearVentana(JFrame ventana){
        ((JFrame) nodoFinal.getItem()).setVisible(false);
        crearNodo(ventana);
        ((JFrame) nodoFinal.getItem()).setVisible(true);
    }
    
    public void cerrarVentana(){
        nodoFinal.getAnterior().setSiguiente(null);
        ((JFrame) nodoFinal.getItem()).setVisible(false);
        nodoFinal = nodoFinal.getAnterior();
        ((JFrame) nodoFinal.getItem()).setVisible(true);
    }
}
