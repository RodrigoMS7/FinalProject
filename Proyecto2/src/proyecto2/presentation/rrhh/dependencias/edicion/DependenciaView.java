/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.rrhh.dependencias.edicion;

import java.util.Arrays;
import java.util.Observable;
import javax.swing.JOptionPane;
import proyecto2.Application;
import proyecto2.logic.Dependencia;

/**
 *
 * @author oscar
 */
public class DependenciaView extends javax.swing.JInternalFrame implements java.util.Observer{

    DependenciaController controller;
    DependenciaModel model;

    public DependenciaView(java.awt.Frame parent, boolean modal) {
        super("", false, true);
        initComponents();
    }
    
    public void setController(DependenciaController controller){
        this.controller=controller;
    }
    public DependenciaController getController(){
        return controller;
    }
    
    public void setModel(DependenciaModel model){
        this.model=model;
        model.addObserver(this);
    }
    public DependenciaModel getModel(){
        return model;
    }
    
//    public DependenciaView(/*java.awt.Frame parent, boolean modal*/) {
//        super(/*parent, modal*/);
//        initComponents();
//    }
    @Override
    public void update(Observable o, Object o1) {
        this.limpiarErrores();
        Dependencia actual=model.getCurrent();
        this.fromDependencia(actual);
    }
    public boolean validar(){
        boolean error=false;
        Dependencia actual=model.getCurrent();
        
        this.codigo.setForeground(Application.COLOR_OK);
        if(this.codigoTextField.getText().isEmpty()){
            this.codigo.setForeground(Application.COLOR_ERROR);
            error=true;
        }
        this.nombre.setForeground(Application.COLOR_OK);
        if (this.nombreTextField.getText().isEmpty()) {
            this.nombre.setForeground(Application.COLOR_ERROR);
            error = true;
        }
        return !error;
    }
    
    Dependencia toDependencia(){
        Dependencia d=new Dependencia();
        d.setCodigo(codigoTextField.getText());
        d.setNombre(nombreTextField.getText());
        return d;
    }
    public void limpiarErrores() {
        this.codigo.setForeground(Application.COLOR_OK);
        this.nombre.setForeground(Application.COLOR_OK);
    }
    
    public void fromDependencia(Dependencia actual){
        this.codigoTextField.setEnabled(model.getModo()==Application.MODO_AGREGAR);
        codigoTextField.setText(actual.getCodigo());
        Boolean editable = Arrays.asList(Application.MODO_AGREGAR, Application.MODO_EDITAR).contains(model.getModo());
        
        nombreTextField.setEnabled(editable);
        nombreTextField.setText(actual.getNombre());
        this.guardarButton.setVisible(editable);
        this.validate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarButton = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();

        guardarButton.setText("guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        codigo.setText(" Codigo");

        cancelarButton.setText("cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        nombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre)
                            .addComponent(codigo))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(nombreTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(guardarButton)
                        .addGap(57, 57, 57)
                        .addComponent(cancelarButton)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton)
                    .addComponent(cancelarButton))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
        if(this.validar()){
            try{
                this.controller.guardar(this.toDependencia());
                 JOptionPane.showMessageDialog(this, "Dependencia Agregada", "OK", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                 JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(this, "Datos invalidos", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        controller.hide();
    }//GEN-LAST:event_cancelarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables

    
}
