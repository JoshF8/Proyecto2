/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Listas.NodoGeneral;
import javax.swing.JOptionPane;
import mundial.*;
import Listas.*;

/**
 *
 * @author Josh
 */
public class FormularioJugador extends javax.swing.JFrame {

    private int tipo;
    private Jugador jugador;
    
    /**
     * Creates new form FormularioJugador
     */
    public FormularioJugador() {
        initComponents();
        tipo = 0;
        setLocationRelativeTo(null);
        ComboEquipo.removeAllItems();
        ComboTipo.removeAllItems();
        llenarCombo();
        ComboTipo.addItem("j");
        ComboTipo.addItem("c");
    }
    
    public FormularioJugador(Jugador jugador) {
        initComponents();
        tipo = 1;
        this.jugador = jugador;
        setLocationRelativeTo(null);
        ComboEquipo.removeAllItems();
        ComboTipo.removeAllItems();
        llenarCombo();
        ComboTipo.addItem("j");
        ComboTipo.addItem("c");
        llenarInformacion();
    }
    
    private void llenarCombo(){
        NodoGeneral actual = Mundial.equipos.nodoInicio;
        while(actual != null){
            ComboEquipo.addItem(((Equipo)actual.getItem()).getCodigo());
            actual = actual.getSiguiente();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextoPosicion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoNacimiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextoAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextoPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboEquipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TextoCamisola = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ComboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario jugador");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del jugador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Posición");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Año de nacimiento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Altura");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Peso");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Equipo");

        ComboEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Número de camisola");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de jugador");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(TextoCamisola, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(TextoPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(TextoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(TextoNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(TextoPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(ComboEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoCamisola, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(comprobarLlenado()){
            try {
                if(tipo == 0){
                    if(Mundial.jugadores == null){
                        Mundial.jugadores = new ListaGeneral(new NodoGeneral(new Jugador(TextoNombre.getText(), TextoPosicion.getText(), TextoNacimiento.getText(), TextoAltura.getText(), TextoPeso.getText(), ComboEquipo.getSelectedItem().toString(), Integer.valueOf(TextoCamisola.getText().trim()), ComboTipo.getSelectedItem().toString())));
                        Equipo equipo = buscarEquipo();
                        equipo.jugadores = new ListaGeneral(Mundial.jugadores.nodoFinal);
                    }else{
                        Mundial.jugadores.crearNodo(new Jugador(TextoNombre.getText(), TextoPosicion.getText(), TextoNacimiento.getText(), TextoAltura.getText(), TextoPeso.getText(), ComboEquipo.getSelectedItem().toString(), Integer.valueOf(TextoCamisola.getText().trim()), ComboTipo.getSelectedItem().toString()));
                        Equipo equipo = buscarEquipo();
                        if(equipo.jugadores == null){
                            equipo.jugadores = new ListaGeneral(Mundial.jugadores.nodoFinal);
                        }else{
                            equipo.jugadores.crearNodo(Mundial.jugadores.nodoFinal.getItem());
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Jugador guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    vaciar();
                }else{
                    if(JOptionPane.showConfirmDialog(null, "¿Está seguro de guardar los cambios?", "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                        guardar();
                        dispose();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ingresado mal los datos, revíselos nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ha ingresado mal los datos, revíselos nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean comprobarLlenado(){
        return !(TextoNombre.getText().trim().equals("") || TextoPosicion.getText().trim().equals("") || TextoNacimiento.getText().trim().equals("") || TextoPeso.getText().trim().equals("") || TextoAltura.getText().trim().equals("") || TextoCamisola.getText().trim().equals(""));
    }
    
    private void vaciar(){
        TextoNombre.setText("");
        TextoPosicion.setText("");
        TextoAltura.setText("");
        TextoPeso.setText("");
        TextoNacimiento.setText("");
        TextoCamisola.setText("");
    }
    
    private Equipo buscarEquipo(){
        NodoGeneral actual = Mundial.equipos.nodoInicio;
        while(actual != null){
            if(((Equipo) actual.getItem()).getCodigo().equals(ComboEquipo.getSelectedItem().toString())){
                return ((Equipo) actual.getItem());
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    
    private void llenarInformacion(){
        TextoNombre.setText(jugador.getNombre());
        TextoPosicion.setText(jugador.getPosicion());
        TextoAltura.setText(jugador.getAltura());
        TextoPeso.setText(jugador.getPeso());
        TextoNacimiento.setText(jugador.getNacimiento());
        TextoCamisola.setText(String.valueOf(jugador.getCamisola()));
        System.out.println(jugador.getTipo());
        if(jugador.getTipo().equals("j")){
            ComboTipo.setSelectedIndex(0);
        }else{
            ComboTipo.setSelectedIndex(1);
        }
        int contador = 0;
        NodoGeneral actual = Mundial.equipos.nodoInicio;
        while(actual != null){
            if(((Equipo)actual.getItem()).getCodigo().equals(jugador.getCodigoEquipo())){
                ComboEquipo.setSelectedIndex(contador);
                break;
            }
            contador++;
            actual = actual.getSiguiente();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioJugador().setVisible(true);
            }
        });
    }

    @Override
    public void dispose(){
        Mundial.ventanas.cerrarVentana();
        super.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEquipo;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JTextField TextoAltura;
    private javax.swing.JTextField TextoCamisola;
    private javax.swing.JTextField TextoNacimiento;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoPeso;
    private javax.swing.JTextField TextoPosicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private void guardar() {
        try {
            jugador.setNombre(TextoNombre.getText());
            jugador.setPosicion(TextoPosicion.getText());
            jugador.setNacimiento(TextoNacimiento.getText());
            jugador.setAltura(TextoAltura.getText());
            jugador.setPeso(TextoPeso.getText());
            jugador.setCodigoEquipo(ComboEquipo.getSelectedItem().toString());
            jugador.setCamisola(Integer.valueOf(TextoCamisola.getText().trim()));
            jugador.setTipo(ComboTipo.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado mal los datos, revíselos nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
