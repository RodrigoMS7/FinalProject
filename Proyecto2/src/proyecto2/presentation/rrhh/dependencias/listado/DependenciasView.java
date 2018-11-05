/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.rrhh.dependencias.listado;

import java.util.Observable;
import javax.swing.JOptionPane;
import proyecto2.Application;
import proyecto2.logic.Dependencia;

/**
 *
 * @author oscar
 */
public class DependenciasView extends javax.swing.JInternalFrame implements java.util.Observer{

    DependenciasController controller;
    DependenciasModel model;

    public DependenciasController getController() {
        return controller;
    }

    public void setController(DependenciasController controller) {
        this.controller = controller;
    }

    public DependenciasModel getModel() {
        return model;
    }

    public void setModel(DependenciasModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    public DependenciasView() {
        super("",false,true);
        initComponents();
    }
    
    boolean validar(){
        boolean error=false;
        
        this.codigo.setForeground(Application.COLOR_OK); 
        if (this.codigoTextField.getText().isEmpty()){
            this.codigo.setForeground(Application.COLOR_ERROR);
            error=true;
        }
        return !error;
    }
    public void limpiarErrores(){
       this.codigo.setForeground(Application.COLOR_OK); 
    }
    
    public void fromDependencia(Dependencia filtro){
       codigoTextField.setText(filtro.getCodigo());
    }
   
    Dependencia toDependencia(){
        Dependencia result = new Dependencia();
        result.setCodigo(codigoTextField.getText());
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

        buscarButton = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dependenciasFld = new javax.swing.JTable();
        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        buscarButton.setText("buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        codigo.setText("Codigo");

        dependenciasFld.setModel(new javax.swing.table.DefaultTableModel(
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
        dependenciasFld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependenciasFldMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dependenciasFld);

        agregarButton.setText("agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Lista Funcionarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agrega Funcionario a Dependencia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregarButton)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(codigo)
                        .addGap(18, 18, 18)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(buscarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton)
                    .addComponent(codigo)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        //if(this.validar()){
            try{
                controller.buscar(this.toDependencia());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        //}else
          //  JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
        try {
            controller.preAgregar(this.agregarButton.getLocationOnScreen());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        int row = this.dependenciasFld.getSelectedRow();
        controller.borrar(row);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void dependenciasFldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependenciasFldMouseClicked
          if (evt.getClickCount() == 2) {
            int row = this.dependenciasFld.getSelectedRow();
            int col = this.dependenciasFld.getSelectedColumn();
            controller.editar(row, evt.getLocationOnScreen());
        }
    }//GEN-LAST:event_dependenciasFldMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = this.dependenciasFld.getSelectedRow();
        controller.listaFuncionariosDependencia(jButton1.getLocation(),row);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int row = this.dependenciasFld.getSelectedRow();
        controller.asignaFuncionario(jButton2.getLocation(),row);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JTable dependenciasFld;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable updateModel, Object parametros) {
        this.limpiarErrores();
        Dependencia filtro=model.getFilter();
        this.fromDependencia(filtro);
        dependenciasFld.setModel(model.getDependencias());
    }
}
