/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.registrador.solicitudeslistado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class RegistradorView extends javax.swing.JInternalFrame implements java.util.Observer{

    /**
     * Creates new form RegistradorView
     */
    RegistradorController controller;
    RegistradorModel model;
    
    
    
    public RegistradorView() {
        super("",false,true);
        initComponents();
    }

    public RegistradorController getController() {
        return controller;
    }

    public void setController(RegistradorController controller) {
        this.controller = controller;
    }

    public RegistradorModel getModel() {
        return model;
    }

    public void setModel(RegistradorModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        solicitudes = new javax.swing.JTable();
        buscarButton = new javax.swing.JButton();
        comprobante = new javax.swing.JLabel();
        comprobanteFld = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        estadosComboBox = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        estadosComboBox1 = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(solicitudes);

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        comprobante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comprobante.setText("Comprobante");

        estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estado.setText("Estado");

        estadosComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "por verificar", "por rotular", "procesada" }));

        jLabel1.setText("Cambiar Estado Solicitud");

        estadosComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "por rotular", "procesada" }));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comprobante)
                        .addGap(2, 2, 2)
                        .addComponent(comprobanteFld, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadosComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprobante)
                    .addComponent(comprobanteFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado)
                    .addComponent(buscarButton)
                    .addComponent(estadosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(estadosComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        try{
           
           String selected_text= estadosComboBox.getItemAt(estadosComboBox.getSelectedIndex());
           controller.buscar(selected_text);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitudesMouseClicked
         if (evt.getClickCount() == 2) {
            int row = this.solicitudes.getSelectedRow();
            controller.muestraBien(row);
            controller.hide();
        }
    }//GEN-LAST:event_solicitudesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = this.solicitudes.getSelectedRow();
        try {
            controller.cambiaEstadoSolicitud(this.estadosComboBox1.getSelectedItem().toString(), row);
        } catch (Exception ex) {
            Logger.getLogger(RegistradorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel comprobante;
    private javax.swing.JTextField comprobanteFld;
    private javax.swing.JLabel estado;
    private javax.swing.JComboBox<String> estadosComboBox;
    private javax.swing.JComboBox<String> estadosComboBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable solicitudes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        solicitudes.setModel(model.getSolicitudes());
    }
}
