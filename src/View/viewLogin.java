/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import animaciones.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import controller.UsuarioBLL;

import java.util.TimerTask;

/**
 *
 * @author LENOVO
 */
public class viewLogin extends javax.swing.JFrame {

    private Timer objTimer;
    private int a;
    int xx, xy;

    public viewLogin() {
        initComponents();
        AWTUtilities.setOpaque(this, false);
        this.setLocationRelativeTo(null);


    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtpassword = new app.bolivia.swing.JCTextField();
        txtusuario = new app.bolivia.swing.JCTextField();
        loader = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        btnaceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JLabel();
        img_loader = new javax.swing.JLabel();
        lbl_loader = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel4.setText("jLabel4");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 97, 141));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Drywall Family");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, -1));

        txtpassword.setBackground(new java.awt.Color(31, 97, 141));
        txtpassword.setBorder(null);
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtpassword.setPhColor(new java.awt.Color(255, 255, 255));
        txtpassword.setPlaceholder("Contraseña");
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

        txtusuario.setBackground(new java.awt.Color(31, 97, 141));
        txtusuario.setBorder(null);
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtusuario.setPhColor(new java.awt.Color(255, 255, 255));
        txtusuario.setPlaceholder("Nombre de Usuario");
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 320));

        loader.setBackground(new java.awt.Color(255, 255, 255));
        loader.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        loader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        login.setForeground(new java.awt.Color(0, 0, 51));
        login.setAutoscrolls(true);
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginMouseDragged(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnaceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnaceptar.setForeground(new java.awt.Color(51, 51, 51));
        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img11.png"))); // NOI18N
        btnaceptar.setBorder(null);
        btnaceptar.setBorderPainted(false);
        btnaceptar.setContentAreaFilled(false);
        btnaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnaceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnaceptar.setIconTextGap(-3);
        btnaceptar.setSelected(true);
        btnaceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnaceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        login.add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 200));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Bienvenido");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 51));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_1.png"))); // NOI18N
        exit.setIconTextGap(8);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        login.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/substract_1.png"))); // NOI18N
        jLabel7.setIconTextGap(8);
        login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btn_agregar.setBackground(new java.awt.Color(31, 97, 147));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar.setText("Iniciar Sesion");
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setOpaque(true);
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });
        login.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        loader.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 200, 320));

        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animate.gif"))); // NOI18N
        loader.add(img_loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 61, 150, 130));

        lbl_loader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_loader.setForeground(new java.awt.Color(31, 97, 141));
        lbl_loader.setText("Cargando....");
        lbl_loader.setToolTipText("");
        loader.add(lbl_loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        getContentPane().add(loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 190, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
        jLabel4.setVisible(false);
    }
    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked

    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_loginMouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_loginMousePressed

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
            UsuarioBLL oUsuario = new UsuarioBLL();
        try {
            if (oUsuario.UsuarioValidar(txtusuario.getText(), String.valueOf(txtpassword.getText()))) {
                objTimer = new Timer(20, new ClaseTime());
                objTimer.start();
                loader.show();
                login.hide();

                // lets add timeout
                new java.util.Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        //after validating let's show the main Jframe
                        viewPrincipal m = new viewPrincipal();
                        
                        m.show();
                        dispose();

                    }
                }, 1000 * 2);

            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado...");
            }
        } catch (Exception ex) {
            Logger.getLogger(viewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    public class ClaseTime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }
    }

    private void Cerrar() {
        dispose();
    }

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewLogin().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_agregar;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel login;
    private app.bolivia.swing.JCTextField txtpassword;
    private app.bolivia.swing.JCTextField txtusuario;
    // End of variables declaration//GEN-END:variables
   

}
