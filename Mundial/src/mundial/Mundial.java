/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial;
import Ventanas.*;
import Listas.*;
import javax.swing.JFrame;
/**
 *
 * @author Josh
 */
public class Mundial {
    
    /**
     * @param args the command line arguments
     */
    
    public static ListaVentanas ventanas;
    public static ListaGeneral usuarios, equipos, jugadores, estampas;
   
    public static void main(String[] args) {
        ventanas = new ListaVentanas(new NodoGeneral(new Login()));
        ((JFrame) ventanas.nodoInicio.getItem()).setVisible(true);
    }
    
}
