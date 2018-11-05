/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import proyecto2.Application;
import proyecto2.SessionUsuario;

/**
 *
 * @author oscar
 */
public class ApplicationView extends javax.swing.JFrame implements java.util.Observer{

    ApplicationController controller;
    ApplicationModel model;
    Dimension dim;
   
    public void setController(ApplicationController controller){
        this.controller=controller;
    }

    public ApplicationController getController() {
        return controller;
    }
    
    public void setModel(ApplicationModel model){
        this.model=model;
        model.addObserver(this);
    }

    public ApplicationModel getModel() {
        return model;
    }
    public ApplicationView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setSize(this.getMaximumSize());
    }
    @Override
    public void update(java.util.Observable updatedModel,Object parametros) {
//        if (model.getCurrent()!=null){
//           this.setTitle("DEPENDENCIAS ("+model.getCurrent().getIdUsuario()+")");
//       }
//       else{
//           this.setTitle("PERSONAS");
//       }     
    }
    
    public void addInternalFrame(JInternalFrame f){
       try{
        this.desktopPane.add(f);
       } catch(Exception ex){ }
   }
    public void habilitaSecretario(){
        secretaria.setEnabled(true);
    }
     public void habilitaJefe(){
        jefe.setEnabled(true);
    }
      public void habilitaRegistrador(){
        registrador.setEnabled(true);
    }
    public void habilitaAdministrador() {
        administrador.setEnabled(true);
    }

    public void habilitaRRHH() {
        RRHH.setEnabled(true);
        //RRHH.setForeground(Color.GRAY);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        RRHH = new javax.swing.JMenu();
        dependenciasListadoMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        solicitudesMenu = new javax.swing.JMenu();
        solicitudesMenuItem = new javax.swing.JMenuItem();
        registrador = new javax.swing.JMenu();
        solicitudesRegistrador = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        activosMenu = new javax.swing.JMenu();
        activosMenuItem = new javax.swing.JMenuItem();
        secretaria = new javax.swing.JMenu();
        secretariaMenuItem = new javax.swing.JMenuItem();
        administrador = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jefe = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Opciones");
        desktopPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/application/images/icons8_Menu_32px_1.png"))); // NOI18N
        desktopPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/application/images/thumb-1920-418892.jpg"))); // NOI18N
        desktopPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/application/images/if_sign-in_59203.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/application/images/ampliacion.png"))); // NOI18N
        desktopPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 1088));

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RRHH.setText("Jefe de RRHH");
        RRHH.setEnabled(false);

        dependenciasListadoMenuItem.setText("Dependencias");
        dependenciasListadoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciasListadoMenuItemActionPerformed(evt);
            }
        });
        RRHH.add(dependenciasListadoMenuItem);

        jMenuItem1.setText("Funcionarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        RRHH.add(jMenuItem1);

        jMenuBar1.add(RRHH);

        solicitudesMenu.setText("Solicitudes");

        solicitudesMenuItem.setText("Listado");
        solicitudesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesMenuItemActionPerformed(evt);
            }
        });
        solicitudesMenu.add(solicitudesMenuItem);

        jMenuBar1.add(solicitudesMenu);

        registrador.setText("Registrador");
        registrador.setEnabled(false);

        solicitudesRegistrador.setText("Bien");
        solicitudesRegistrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesRegistradorActionPerformed(evt);
            }
        });
        registrador.add(solicitudesRegistrador);

        jMenuItem5.setText("Activos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        registrador.add(jMenuItem5);

        jMenuItem4.setText("categoria");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        registrador.add(jMenuItem4);

        jMenuBar1.add(registrador);

        activosMenu.setText("Activos");

        activosMenuItem.setText("Listado");
        activosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activosMenuItemActionPerformed(evt);
            }
        });
        activosMenu.add(activosMenuItem);

        jMenuBar1.add(activosMenu);

        secretaria.setText("Secretaria");

        secretariaMenuItem.setText("Solicitudes");
        secretariaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretariaMenuItemActionPerformed(evt);
            }
        });
        secretaria.add(secretariaMenuItem);

        jMenuBar1.add(secretaria);

        administrador.setText("Administrador");

        jMenuItem3.setText("Solicitudes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        administrador.add(jMenuItem3);

        jMenuBar1.add(administrador);

        jefe.setText("Jefe de la OCCB");

        jMenuItem2.setText("Solicitudes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jefe.add(jMenuItem2);

        jMenuBar1.add(jefe);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dependenciasListadoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciasListadoMenuItemActionPerformed
        try {
            controller.dependenciasShow();
        } catch (Exception ex) {
            Logger.getLogger(ApplicationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dependenciasListadoMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       controller.funcionariosShow();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void solicitudesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesMenuItemActionPerformed
        controller.solicitudesShow();
    }//GEN-LAST:event_solicitudesMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       controller.solicitudesJefeShow();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void secretariaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretariaMenuItemActionPerformed
        controller.solicitudesSecretariaShow();
    }//GEN-LAST:event_secretariaMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        controller.AdministradorSolicitudShow();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void solicitudesRegistradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesRegistradorActionPerformed
        // TODO add your handling code here:
        controller.solicitudRegistradorShow();
    }//GEN-LAST:event_solicitudesRegistradorActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        controller.categoriaShow();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void activosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activosMenuItemActionPerformed
        // TODO add your handling code here:
        controller.activosShow();
    }//GEN-LAST:event_activosMenuItemActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Está seguro de volver a login?", "Exit", dialogo);
        if(resultado == 0){
            this.controller.hide();
            Application.LOGIN_CONTROLLER.logout();
            //Application.LOGIN_CONTROLLER.show();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(ApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu RRHH;
    private javax.swing.JMenu activosMenu;
    private javax.swing.JMenuItem activosMenuItem;
    private javax.swing.JMenu administrador;
    private javax.swing.JMenuItem dependenciasListadoMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jefe;
    private javax.swing.JMenu registrador;
    private javax.swing.JMenu secretaria;
    private javax.swing.JMenuItem secretariaMenuItem;
    private javax.swing.JMenu solicitudesMenu;
    private javax.swing.JMenuItem solicitudesMenuItem;
    private javax.swing.JMenuItem solicitudesRegistrador;
    // End of variables declaration//GEN-END:variables
}
