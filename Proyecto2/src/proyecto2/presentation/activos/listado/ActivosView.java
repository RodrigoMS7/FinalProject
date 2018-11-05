/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.activos.listado;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto2.Application;
import proyecto2.logic.Activo;

/**
 *
 * @author oscar
 */
public class ActivosView extends javax.swing.JInternalFrame implements java.util.Observer{

    /**
     * Creates new form ActivosView
     */
    ActivosController controller;
    ActivosModel model;
    
    public ActivosView() {
        super("",false,true);
        initComponents();
    }

    public ActivosController getController() {
        return controller;
    }

    public void setController(ActivosController controller) {
        this.controller = controller;
    }
    public ActivosModel getModel() {
        return model;
    }

    public void setModel(ActivosModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    public void fromActivo(Activo filtro){
        codigo.setText(filtro.getCodigo());
    }
    
    public Activo toActivo(){
        Activo result=new Activo();
        result.setCodigo(codigo.getText());
        return result;
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
        activos = new javax.swing.JTable();
        codigoFld = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        asignarFuncionarioButton = new javax.swing.JButton();
        imprimirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        activos.setModel(new javax.swing.table.DefaultTableModel(
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
        activos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(activos);

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setText("Codigo:");

        asignarFuncionarioButton.setText("Asignar funcionario");
        asignarFuncionarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarFuncionarioButtonActionPerformed(evt);
            }
        });

        imprimirButton.setText("Imprimir ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(codigoFld, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarButton)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(asignarFuncionarioButton)
                        .addGap(28, 28, 28)
                        .addComponent(imprimirButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(buscarButton)
                    .addComponent(codigoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignarFuncionarioButton)
                    .addComponent(imprimirButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        try{
            controller.buscar(this.toActivo());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void asignarFuncionarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarFuncionarioButtonActionPerformed
        // TODO add your handling code here:
        try {
            int row = this.activos.getSelectedRow();
            controller.getLabores(asignarFuncionarioButton.getLocation(), row);
        } catch (Exception ex) {
           // Logger.getLogger(JefeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_asignarFuncionarioButtonActionPerformed
    Activo seleccionado;
    private void activosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activosMouseClicked
        // TODO add your handling code here:
         try{
            int row=activos.getSelectedRow();
            seleccionado= model.getActivos().getRowAt(row);
           
        }catch(Exception e){
        }
        
    }//GEN-LAST:event_activosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activos;
    private javax.swing.JButton asignarFuncionarioButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoFld;
    private javax.swing.JButton imprimirButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        Activo filtro=model.getFilter();
        this.fromActivo(filtro);
        activos.setModel(model.getActivos());
    }
}
