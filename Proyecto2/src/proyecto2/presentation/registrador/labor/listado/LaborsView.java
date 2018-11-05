/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.registrador.labor.listado;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto2.logic.Labor;


/**
 *
 * @author oscar
 */
public class LaborsView extends javax.swing.JInternalFrame implements java.util.Observer{

    /**
     * Creates new form LaborView
     */
    
    LaborsController controller;
    LaborsModel model;
    
    public LaborsView() {
        super("",false,true);
        initComponents();
    }

    public LaborsController getController() {
        return controller;
    }

    public void setController(LaborsController controller) {
        this.controller = controller;
    }
    public LaborsModel getModel() {
        return model;
    }

    public void setModel(LaborsModel model) {
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
        labors = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        labors.setModel(new javax.swing.table.DefaultTableModel(
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
        labors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laborsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(labors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laborsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laborsMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() ==2){
            int row = labors.getSelectedRow();
              try {
                  controller.asignaLaboraActivo(row);
                  JOptionPane.showMessageDialog(null, "Funcionario asignado correctamente");
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
              }
        }
    }//GEN-LAST:event_laborsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labors;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        this.labors.setModel(model.getLabors());
    }
}