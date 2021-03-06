/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Listas.*;
import javax.swing.JOptionPane;
import mundial.*;
/**
 *
 * @author Josh
 */
public class FormularioEquipos extends javax.swing.JFrame {

    /**
     * Creates new form FormularioEquipos
     */
    private int tipo;
    private Equipo equipo;
    public FormularioEquipos() {
        initComponents();
        tipo = 0;
        setLocationRelativeTo(null);
    }
    
    public FormularioEquipos(Equipo equipo){
        initComponents();
        tipo = 1;
        this.equipo = equipo;
        setLocationRelativeTo(null);
        llenarInformacion();
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
        jLabel3 = new javax.swing.JLabel();
        TextoCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextoMundiales = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextoCreacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de equipo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del equipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad de mundiales");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Año de creación");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TextoCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TextoMundiales, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoMundiales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    if(Mundial.equipos == null){
                        Mundial.equipos = new ListaGeneral(new NodoGeneral(new Equipo(TextoNombre.getText(), TextoCodigo.getText(), Integer.valueOf(TextoMundiales.getText()),Integer.valueOf(TextoCreacion.getText()))));
                    }else{
                        Mundial.equipos.crearNodo(new Equipo(TextoNombre.getText(), TextoCodigo.getText(), Integer.valueOf(TextoMundiales.getText()), Integer.valueOf(TextoCreacion.getText())));
                    }
                    JOptionPane.showMessageDialog(null, "Equipo guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
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
        return !(TextoNombre.getText().trim().equals("") || TextoCodigo.getText().trim().equals("") || TextoMundiales.getText().trim().equals("") || TextoCreacion.getText().trim().equals(""));
    }
    
    private void llenarInformacion(){
        TextoNombre.setText(equipo.getNombre());
        TextoCodigo.setText(String.valueOf(equipo.getCodigo()));
        TextoMundiales.setText(String.valueOf(equipo.getMundiales()));
        TextoCreacion.setText(String.valueOf(equipo.getCreacion()));
    }
    
    private void vaciar(){
        TextoNombre.setText("");
        TextoCodigo.setText("");
        TextoMundiales.setText("");
        TextoCreacion.setText("");
    }
    
    private void guardar(){
        try {
            equipo.setNombre(TextoNombre.getText());
            equipo.setCodigo(TextoCodigo.getText());
            equipo.setMundiales(Integer.valueOf(TextoMundiales.getText()));
            equipo.setCreacion(Integer.valueOf(TextoCreacion.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado mal los datos, revíselos nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(FormularioEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEquipos().setVisible(true);
            }
        });
    }

     @Override
    public void dispose(){
        Mundial.ventanas.cerrarVentana();
        super.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCreacion;
    private javax.swing.JTextField TextoMundiales;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
