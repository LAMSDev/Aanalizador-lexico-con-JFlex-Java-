/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lexer_v01;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author cereb
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        pfcontraseña.setEchoChar((char)0);
        pfcontraseña.setText("Ingrese su contraseña");
       
    }
    static int xx,yy;  ////Esto ayudara a poder arrastar en formulario de login desde cualquier panel
    static boolean maximized = true;
    
    
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        pfcontraseña = new javax.swing.JPasswordField();
        tfusuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bsalir = new keeptoo.KButton();
        Biniciarsesion = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        BMinimizar = new javax.swing.JLabel();
        BExpandir = new javax.swing.JLabel();
        BCerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lexer Lexy");
        setBackground(new java.awt.Color(47, 137, 252));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 227, 202));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lexy las analiza para ti...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 230, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\cereb\\Downloads\\reviewing (1).png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 260, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tu defines la cadena de entrada ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 480, 530));

        jPanel2.setBackground(new java.awt.Color(47, 137, 252));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inicio de sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, 30));

        jSeparator1.setAlignmentX(0.4F);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 260, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 260, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\cereb\\Downloads\\user (1).png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        pfcontraseña.setBackground(new java.awt.Color(47, 137, 252));
        pfcontraseña.setForeground(new java.awt.Color(204, 204, 255));
        pfcontraseña.setText("jPasswordField1");
        pfcontraseña.setToolTipText("");
        pfcontraseña.setBorder(null);
        pfcontraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pfcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfcontraseñaMouseClicked(evt);
            }
        });
        pfcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfcontraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(pfcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, 30));

        tfusuario.setBackground(new java.awt.Color(47, 137, 252));
        tfusuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tfusuario.setForeground(new java.awt.Color(204, 255, 255));
        tfusuario.setText(" Ingrese su nombre  de usuario");
        tfusuario.setBorder(null);
        tfusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfusuarioFocusLost(evt);
            }
        });
        tfusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfusuarioMouseClicked(evt);
            }
        });
        tfusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(tfusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 220, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Person_28px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Padlock_Outline_28px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 30, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Export_28px_1.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Import_28px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, 30));

        Bsalir.setText("Salir");
        Bsalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Bsalir.setkBorderRadius(60);
        Bsalir.setkEndColor(new java.awt.Color(47, 137, 252));
        Bsalir.setkHoverEndColor(new java.awt.Color(47, 137, 252));
        Bsalir.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Bsalir.setkHoverStartColor(new java.awt.Color(48, 227, 202));
        Bsalir.setkIndicatorColor(new java.awt.Color(47, 137, 252));
        Bsalir.setkSelectedColor(new java.awt.Color(87, 167, 224));
        Bsalir.setkStartColor(new java.awt.Color(48, 227, 202));
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        jPanel2.add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 270, 50));

        Biniciarsesion.setText("Inciar sesión");
        Biniciarsesion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Biniciarsesion.setkBorderRadius(60);
        Biniciarsesion.setkEndColor(new java.awt.Color(47, 137, 252));
        Biniciarsesion.setkHoverEndColor(new java.awt.Color(47, 137, 252));
        Biniciarsesion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Biniciarsesion.setkHoverStartColor(new java.awt.Color(48, 227, 202));
        Biniciarsesion.setkIndicatorColor(new java.awt.Color(47, 137, 252));
        Biniciarsesion.setkSelectedColor(new java.awt.Color(87, 167, 224));
        Biniciarsesion.setkStartColor(new java.awt.Color(48, 227, 202));
        Biniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiniciarsesionActionPerformed(evt);
            }
        });
        jPanel2.add(Biniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 270, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 470, 530));

        jPanel3.setBackground(new java.awt.Color(47, 137, 252));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Filled_Circle_15px_1.png"))); // NOI18N
        BMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(BMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        BExpandir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Filled_Circle_15px_2.png"))); // NOI18N
        BExpandir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BExpandirMouseClicked(evt);
            }
        });
        jPanel3.add(BExpandir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 20, -1));

        BCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Filled_Circle_15px.png"))); // NOI18N
        BCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(BCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 470, 60));

        jPanel4.setBackground(new java.awt.Color(48, 227, 202));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfcontraseñaActionPerformed

    private void tfusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusuarioMouseClicked
        // TODO add your handling code here:
        tfusuario.setText("");
        
    }//GEN-LAST:event_tfusuarioMouseClicked

    private void pfcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfcontraseñaMouseClicked
        // TODO add your handling code here:
        pfcontraseña.setEchoChar('●');
        pfcontraseña.setText("");
        
        
    }//GEN-LAST:event_pfcontraseñaMouseClicked

    private void tfusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfusuarioFocusLost
        // TODO add your handling code here:
//        pfcontraseña.setEchoChar((char)0);
//        pfcontraseña.setText("Ingrese su contraseña");
        
    }//GEN-LAST:event_tfusuarioFocusLost

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0); //CIERRE Y SALIDAD DEL SISTEMA
        
    }//GEN-LAST:event_BsalirActionPerformed

    private void BiniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiniciarsesionActionPerformed
        // TODO add your handling code here:
             String usuario=tfusuario.getText();
             String contraseña=pfcontraseña.getText();

        //        usuario=tfusuario.getText();
        //        contraseña=pfcontraseña.getPassword();
        //
        if (usuario.contains("Randy") && (contraseña.contains("123")))
        {
            //            tfusuario.setText("ME TOME EL USUARIO :v");
            //            pfcontraseña.setText("ME TOME EL PASWORD :V");
            this.dispose();
            new AnalizadorForm().setVisible(rootPaneCheckingEnabled);
            //
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Oops! :( "
                + "se detectó un error en los datos escitos , compruebe la información de acceso, ,","Error de inicio se sesión LexerLAMS, ",
                JOptionPane.WARNING_MESSAGE);
            //
        }
    }//GEN-LAST:event_BiniciarsesionActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
        
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        //AQUÍ OBTENEMOS LAS COORDENADAS ENPANTALLA
        //DE DÓNDE SE ESTÁ DEJANDO EL MOUSE PRESIONADO TANTO PARA EL EJEDE X COMO DE Y
        xx = evt.getX();
        yy = evt.getY();
        
       
    }//GEN-LAST:event_jPanel1MousePressed

    private void tfusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusuarioActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_tfusuarioActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
       //PERMITIR QUE EL FORM SEA ARRASTRABLE
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-xx, Y-yy);
      //PERMITIR QUE EL FORM SEA ARRASTRABLE
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
      //PERMITIR QUE EL FORM SEA ARRASTRABLE
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-xx, Y-yy);
      //PERMITIR QUE EL FORM SEA ARRASTRABLE
        
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
         xx = evt.getX();
         yy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
       //PERMITIR QUE EL FORM SEA ARRASTRABLE
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-xx, Y-yy);
      //PERMITIR QUE EL FORM SEA ARRASTRABLE
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
        
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
       //PERMITIR QUE EL FORM SEA ARRASTRABLE
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-xx, Y-yy);
      //PERMITIR QUE EL FORM SEA ARRASTRABLE
        
    }//GEN-LAST:event_jPanel3MouseDragged

    private void BMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
        
        
    }//GEN-LAST:event_BMinimizarMouseClicked

    private void BExpandirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BExpandirMouseClicked
       
        // TODO add your handling code here:
        
//        AQUI MAXIMIZAMOS EL FORMULARIO EVALUANDO SI ESTÁ ACTUALMENTE EN ESTADO
//        MAXIMIZADO O NO
        if(maximized) {  
            LoginForm.this.setExtendedState(LoginForm.MAXIMIZED_BOTH);  
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();  
            LoginForm.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;          
        }
        else 
        {
          setExtendedState(LoginForm.NORMAL);
          maximized = true;
        }
                
    }//GEN-LAST:event_BExpandirMouseClicked

    private void BCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0); //CIERRE Y SALIDAD DEL SISTEMA
    }//GEN-LAST:event_BCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
               
                
            }
        });
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCerrar;
    private javax.swing.JLabel BExpandir;
    private javax.swing.JLabel BMinimizar;
    private keeptoo.KButton Biniciarsesion;
    private keeptoo.KButton Bsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pfcontraseña;
    private javax.swing.JTextField tfusuario;
    // End of variables declaration//GEN-END:variables
}
