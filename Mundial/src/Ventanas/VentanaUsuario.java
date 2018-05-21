/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Listas.ListaGeneral;
import Listas.NodoGeneral;
import mundial.*;

/**
 *
 * @author Josh
 */
public class VentanaUsuario extends javax.swing.JFrame {
    Usuario usuario;
    /**
     * Creates new form VentanaUsuario
     */
    public VentanaUsuario(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        jLabel6.setText("Sobres abiertos: " + usuario.sobresAbiertos);
        jLabel7.setText("Estampas colocadas: " + usuario.estampasColocadas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Intercambiar = new javax.swing.JButton();
        Abrirn = new javax.swing.JButton();
        Abrird = new javax.swing.JButton();
        VerEstampas = new javax.swing.JButton();
        VerSobres = new javax.swing.JButton();
        Album = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuario");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sobres abiertos: 0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estampas colocadas: 0");

        Intercambiar.setText("Intercambiar");
        Intercambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntercambiarActionPerformed(evt);
            }
        });

        Abrirn.setText("Abrir sobre normal");
        Abrirn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirnActionPerformed(evt);
            }
        });

        Abrird.setText("Abrir sobre dorado");
        Abrird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirdActionPerformed(evt);
            }
        });

        VerEstampas.setText("Ver estampas");
        VerEstampas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstampasActionPerformed(evt);
            }
        });

        VerSobres.setText("Ver sobres");
        VerSobres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerSobresActionPerformed(evt);
            }
        });

        Album.setText("Mi álbum");
        Album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumActionPerformed(evt);
            }
        });

        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Intercambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abrirn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Abrird, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VerEstampas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VerSobres, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Album, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Intercambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Abrirn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abrird, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerEstampas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerSobres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Album, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntercambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntercambiarActionPerformed
        
    }//GEN-LAST:event_IntercambiarActionPerformed

    private void AbrirnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirnActionPerformed
        int estampas = Randomizar(3, 9), totales = 0;
        NodoGeneral actual;
        ListaGeneral sobreActual = null;
        for(int i = 0; i < estampas; i++){
            int j=-1;
            totales = Randomizar(0, Mundial.numeroEstampas);
            actual = Mundial.estampas.nodoInicio;
            while(j < totales){
                j++;
                actual = actual.getSiguiente();
            }
            if(usuario.sobres == null){
                usuario.sobres = new ListaGeneral(new NodoGeneral(new ListaGeneral(new NodoGeneral(actual.getItem()))));
                sobreActual = (ListaGeneral)usuario.sobres.nodoFinal.getItem();
            }else{
                if(sobreActual == null){
                    usuario.sobres.crearNodo(new ListaGeneral(new NodoGeneral(actual.getItem())));
                    sobreActual = (ListaGeneral)usuario.sobres.nodoFinal.getItem();
                }else{
                    sobreActual.crearNodo(actual.getItem());
                }
            }
            usuario.sobresAbiertos++;
            
        }
        Mundial.ventanas.crearVentana(new NuevoSobre(sobreActual));
    }//GEN-LAST:event_AbrirnActionPerformed

    private void AbrirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbrirdActionPerformed

    private void VerEstampasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstampasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerEstampasActionPerformed

    private void VerSobresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSobresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerSobresActionPerformed

    private void AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlbumActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteActionPerformed

    private int Randomizar(int min, int max){
        return (int)(Math.random()*(max-min)) + min;
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
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario(null).setVisible(true);
            }
        });
    }

    @Override
    public void dispose(){
        Mundial.ventanas.cerrarVentana();
        super.dispose();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrird;
    private javax.swing.JButton Abrirn;
    private javax.swing.JButton Album;
    private javax.swing.JButton Intercambiar;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton VerEstampas;
    private javax.swing.JButton VerSobres;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
