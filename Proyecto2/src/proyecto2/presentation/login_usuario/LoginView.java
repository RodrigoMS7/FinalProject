/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.login_usuario;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyecto2.Application;
import proyecto2.logic.Usuario;

/**
 *
 * @author Dani
 */
public class LoginView extends javax.swing.JFrame implements java.util.Observer {

    LoginController controller;
    LoginModel model;
    int x; int y;
    
    public void setController(LoginController controller){
        this.controller=controller;
    }

    public LoginController getController() {
        return controller;
    }
    
    public void setModel(LoginModel model){
        this.model=model;
         model.addObserver(this);
    }

    public LoginModel getModel() {
        return model;
    }
    
   public void update(java.util.Observable updatedModel,Object parametros){
//       this.limpiarErrores();
       Usuario current = model.getCurrent();
       this.fromUsuario(current);
    } 
   
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.passwordOculto.setVisible(false);
        this.label_hidePassword.setVisible(false);
        this.userText.setForeground(Color.black);
        this.setIconImage(new ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/100.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLlabl = new javax.swing.JLabel();
        passwordLabl = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label_textoContraseña = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        passwordOculto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        label_Exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_Min = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_showPassword = new javax.swing.JLabel();
        label_hidePassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLlabl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userLlabl.setText("Usuario");
        getContentPane().add(userLlabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 72, -1));

        passwordLabl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabl.setText("Contraseña");
        getContentPane().add(passwordLabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        userText.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        userText.setForeground(new java.awt.Color(102, 102, 102));
        userText.setText("Ingrese usuario...");
        userText.setBorder(null);
        userText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userText.setOpaque(false);
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextMouseClicked(evt);
            }
        });
        getContentPane().add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/Enter_ON_ver2.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/Enter_ON_ver2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, 30));

        label_textoContraseña.setForeground(new java.awt.Color(102, 102, 102));
        label_textoContraseña.setText("Contraseña...");
        label_textoContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        label_textoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_textoContraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(label_textoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));

        passwordText.setForeground(new java.awt.Color(0, 0, 0));
        passwordText.setBorder(null);
        passwordText.setOpaque(false);
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextMouseClicked(evt);
            }
        });
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));

        passwordOculto.setBorder(null);
        passwordOculto.setOpaque(false);
        getContentPane().add(passwordOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 270, 10));

        label_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/icons8_Multiply_32px.png"))); // NOI18N
        label_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                label_ExitMouseMoved(evt);
            }
        });
        label_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ExitMouseExited(evt);
            }
        });
        getContentPane().add(label_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        label_Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        label_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Min.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                label_MinMouseMoved(evt);
            }
        });
        label_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_MinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_MinMouseExited(evt);
            }
        });
        getContentPane().add(label_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/thumb-1920-418892.jpg"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/logo_UNA.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/icons8_User_96px_2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        label_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/show_password_opt.png"))); // NOI18N
        label_showPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                label_showPasswordMouseMoved(evt);
            }
        });
        label_showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_showPasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_showPasswordMouseExited(evt);
            }
        });
        getContentPane().add(label_showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        label_hidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/hide_password.png"))); // NOI18N
        label_hidePassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                label_hidePasswordMouseMoved(evt);
            }
        });
        label_hidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_hidePasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_hidePasswordMouseExited(evt);
            }
        });
        getContentPane().add(label_hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 312, 270, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/icons8_Key_32px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/icons8_customer_32px_1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/presentation/login_usuario/images/fondo-de-pantalla-abstracto-textura-azul-hd.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
                this.controller.login(this.toUsuario());
                //pplication.APPLICATION_CONTROLLER.show();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMouseClicked
        if(this.passwordText.getPassword().length == 0)
            this.label_textoContraseña.setVisible(true);
        
        if("Ingrese usuario...".equals(this.userText.getText())){
            this.userText.setText("");
            this.userText.setForeground(Color.black);
        }
    }//GEN-LAST:event_userTextMouseClicked

    private void label_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ExitMouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Está seguro de salir?", "Exit", dialogo);
        if(resultado == 0)
            System.exit(0);
    }//GEN-LAST:event_label_ExitMouseClicked

    private void label_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_MinMouseClicked
        this.setState(LoginView.ICONIFIED);
    }//GEN-LAST:event_label_MinMouseClicked

    private void label_ExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ExitMouseMoved
        this.label_Exit.setBorder(javax.swing.BorderFactory.createSoftBevelBorder(0, new java.awt.Color(110,0,0), Color.black));
    }//GEN-LAST:event_label_ExitMouseMoved

    private void label_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ExitMouseExited
        this.label_Exit.setBorder(null);
    }//GEN-LAST:event_label_ExitMouseExited

    private void label_MinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_MinMouseMoved
        this.label_Min.setBorder(javax.swing.BorderFactory.createSoftBevelBorder(0, new java.awt.Color(110,0,0), Color.black));
    }//GEN-LAST:event_label_MinMouseMoved

    private void label_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_MinMouseExited
        this.label_Min.setBorder(null);
    }//GEN-LAST:event_label_MinMouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void passwordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseClicked
        if(this.userText.getText().isEmpty() /*|| this.userText.getText() == "Ingrese usuario"*/){
            this.userText.setText("Ingrese usuario...");
            this.userText.setForeground(new java.awt.Color(102,102,102));
        }
    }//GEN-LAST:event_passwordTextMouseClicked

    private void label_showPasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_showPasswordMouseMoved
        this.label_showPassword.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_label_showPasswordMouseMoved

    private void label_showPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_showPasswordMouseExited
        this.label_showPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, null));
    }//GEN-LAST:event_label_showPasswordMouseExited

    private void label_showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_showPasswordMouseClicked
        this.passwordOculto.setText(new String(this.passwordText.getPassword()));
        this.passwordText.setVisible(false);
        this.passwordOculto.setVisible(true);
        this.label_showPassword.setVisible(false);
        this.label_hidePassword.setVisible(true);
    }//GEN-LAST:event_label_showPasswordMouseClicked

    private void label_hidePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_hidePasswordMouseClicked
        this.passwordText.setText(this.passwordOculto.getText());
        this.passwordText.setVisible(true);
        this.passwordOculto.setVisible(false);
        this.label_showPassword.setVisible(true);
        this.label_hidePassword.setVisible(false);
    }//GEN-LAST:event_label_hidePasswordMouseClicked

    private void label_hidePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_hidePasswordMouseExited
        this.label_hidePassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, null));
    }//GEN-LAST:event_label_hidePasswordMouseExited

    private void label_hidePasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_hidePasswordMouseMoved
        this.label_hidePassword.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_label_hidePasswordMouseMoved

    private void label_textoContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_textoContraseñaMouseClicked
        if(this.userText.getText().isEmpty() /*|| this.userText.getText() == "Ingrese usuario"*/){
            this.userText.setText("Ingrese usuario...");
            this.userText.setForeground(new java.awt.Color(102,102,102));
        }
        this.passwordText.requestFocus();
        this.label_textoContraseña.setVisible(false);
    }//GEN-LAST:event_label_textoContraseñaMouseClicked

    /**
     * @param args the command line arguments
     */
   Usuario toUsuario(){
        Usuario result = new Usuario();
        result.setUsername(this.userText.getText());
        result.setPassword(new String(this.passwordText.getPassword()));
        return result;
   }
    
   public void fromUsuario(Usuario current){ 
       userText.setText(current.getUsername());
       passwordText.setText(current.getPassword());
   }
   
//   public void limpiarErrores(){
//       this.idLbl.setForeground(Application.COLOR_OK); 
//       this.claveLbl.setForeground(Application.COLOR_OK); 
//   }
//   
//    boolean validar(){
//        boolean error=false;
//        
//        this.idLbl.setForeground(Application.COLOR_OK); 
//        if (this.idFld.getText().isEmpty()){
//            this.idLbl.setForeground(Application.COLOR_ERROR);
//             error=true;
//        }
//        
//        this.claveLbl.setForeground(Application.COLOR_OK); 
//        if ( (new String(this.claveFld.getPassword())).isEmpty()){
//            this.claveLbl.setForeground(Application.COLOR_ERROR);
//             error=true;
//        }
//        
//        return !error;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Exit;
    private javax.swing.JLabel label_Min;
    private javax.swing.JLabel label_hidePassword;
    private javax.swing.JLabel label_showPassword;
    private javax.swing.JLabel label_textoContraseña;
    private javax.swing.JLabel passwordLabl;
    private javax.swing.JTextField passwordOculto;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel userLlabl;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
