/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author MIGUEL TULANDE
 */
public class RegistrarConRol2 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public RegistrarConRol2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbRegistrarConRol = new javax.swing.JLabel();
        btnRegistrarConRol = new javax.swing.JButton();
        txtPasswordRegistrarConRol = new javax.swing.JPasswordField();
        jTextRegistrarConRol1nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextRegistrarConRol2nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTextRegistrarConRol1apellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextRegistrarConRolSexo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jDateRegistrarConRolFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jTextRegistrarConRol2apellido = new javax.swing.JTextField();
        jComboBoxRegistrarConRolSexo = new javax.swing.JComboBox<>();
        jTextRegistrarConRolFechaNacimiento = new javax.swing.JTextField();
        txtPasswordRegistrarConRolConfirmar = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextRegistrarConRolCorreo = new javax.swing.JTextField();
        jCheckBoxRegistrarConRolContraseña2 = new javax.swing.JCheckBox();
        jCheckBoxRegistrarConRolContraseña1 = new javax.swing.JCheckBox();
        jTextRegistrarConRolTipodeDocumento = new javax.swing.JTextField();
        jComboBoxRegistrarConRolTipodeDocumento = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        jTextRegistrarConRolDigitesuDocumento = new javax.swing.JTextField();
        jComboBoxRegistrarConRol_Roles = new javax.swing.JComboBox<>();
        jTextRegistrarconRol_Rol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRegistrarConRol.setBackground(new java.awt.Color(0, 0, 0));
        lbRegistrarConRol.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbRegistrarConRol.setForeground(new java.awt.Color(0, 0, 0));
        lbRegistrarConRol.setText("REGISTRO DE USUARIO");
        jPanel1.add(lbRegistrarConRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnRegistrarConRol.setBackground(new java.awt.Color(0, 153, 255));
        btnRegistrarConRol.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        btnRegistrarConRol.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarConRol.setText("REGISTRARSE");
        btnRegistrarConRol.setBorder(null);
        jPanel1.add(btnRegistrarConRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 170, 30));

        txtPasswordRegistrarConRol.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordRegistrarConRol.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtPasswordRegistrarConRol.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordRegistrarConRol.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordRegistrarConRol.setText("Contraseña");
        txtPasswordRegistrarConRol.setBorder(null);
        txtPasswordRegistrarConRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegistrarConRolActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordRegistrarConRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 181, 20));

        jTextRegistrarConRol1nombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRol1nombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRol1nombre.setText("Primer nombre");
        jTextRegistrarConRol1nombre.setBorder(null);
        jTextRegistrarConRol1nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRol1nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRol1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 160, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 470));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 190, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 130, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, 360));

        jTextRegistrarConRol2nombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRol2nombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRol2nombre.setText("Segundo nombre");
        jTextRegistrarConRol2nombre.setBorder(null);
        jTextRegistrarConRol2nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRol2nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRol2nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 160, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 130, 10));

        jTextRegistrarConRol1apellido.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRol1apellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRol1apellido.setText("Primer apellido");
        jTextRegistrarConRol1apellido.setBorder(null);
        jTextRegistrarConRol1apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRol1apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRol1apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 10));

        jTextRegistrarConRolSexo.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRolSexo.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRolSexo.setText("Sexo");
        jTextRegistrarConRolSexo.setBorder(null);
        jTextRegistrarConRolSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRolSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRolSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 130, 10));

        jDateRegistrarConRolFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateRegistrarConRolFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jDateRegistrarConRolFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 90, 20));

        jTextRegistrarConRol2apellido.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRol2apellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRol2apellido.setText("Segundo apellido");
        jTextRegistrarConRol2apellido.setBorder(null);
        jTextRegistrarConRol2apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRol2apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRol2apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 160, 30));

        jComboBoxRegistrarConRolSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarConRolSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarConRolSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, 20));

        jTextRegistrarConRolFechaNacimiento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRolFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRolFechaNacimiento.setText("Fecha de nacimiento");
        jTextRegistrarConRolFechaNacimiento.setBorder(null);
        jTextRegistrarConRolFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRolFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRolFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 120, 30));

        txtPasswordRegistrarConRolConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordRegistrarConRolConfirmar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtPasswordRegistrarConRolConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordRegistrarConRolConfirmar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordRegistrarConRolConfirmar.setText("Contraseña");
        txtPasswordRegistrarConRolConfirmar.setBorder(null);
        txtPasswordRegistrarConRolConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegistrarConRolConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordRegistrarConRolConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 181, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 190, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 190, 10));

        jTextRegistrarConRolCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRolCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRolCorreo.setText("Correo electronico");
        jTextRegistrarConRolCorreo.setBorder(null);
        jTextRegistrarConRolCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRolCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRolCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 160, 30));

        jCheckBoxRegistrarConRolContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRegistrarConRolContraseña2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxRegistrarConRolContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jCheckBoxRegistrarConRolContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRegistrarConRolContraseña1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxRegistrarConRolContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        jTextRegistrarConRolTipodeDocumento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRolTipodeDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRolTipodeDocumento.setText("Tipo de documento");
        jTextRegistrarConRolTipodeDocumento.setBorder(null);
        jTextRegistrarConRolTipodeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRolTipodeDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRolTipodeDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 30));

        jComboBoxRegistrarConRolTipodeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarConRolTipodeDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarConRolTipodeDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 50, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 130, 10));

        jTextRegistrarConRolDigitesuDocumento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarConRolDigitesuDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarConRolDigitesuDocumento.setText("Digite su documento");
        jTextRegistrarConRolDigitesuDocumento.setBorder(null);
        jTextRegistrarConRolDigitesuDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarConRolDigitesuDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarConRolDigitesuDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 160, 30));

        jComboBoxRegistrarConRol_Roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarConRol_RolesActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarConRol_Roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 140, 20));

        jTextRegistrarconRol_Rol.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarconRol_Rol.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarconRol_Rol.setText("Rol");
        jTextRegistrarconRol_Rol.setBorder(null);
        jTextRegistrarconRol_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarconRol_RolActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarconRol_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordRegistrarConRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegistrarConRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegistrarConRolActionPerformed

    private void jTextRegistrarConRol1nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRol1nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRol1nombreActionPerformed

    private void jTextRegistrarConRol2nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRol2nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRol2nombreActionPerformed

    private void jTextRegistrarConRol1apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRol1apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRol1apellidoActionPerformed

    private void jTextRegistrarConRolSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRolSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRolSexoActionPerformed

    private void jTextRegistrarConRol2apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRol2apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRol2apellidoActionPerformed

    private void jComboBoxRegistrarConRolSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarConRolSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarConRolSexoActionPerformed

    private void jTextRegistrarConRolFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRolFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRolFechaNacimientoActionPerformed

    private void txtPasswordRegistrarConRolConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegistrarConRolConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegistrarConRolConfirmarActionPerformed

    private void jTextRegistrarConRolCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRolCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRolCorreoActionPerformed

    private void jCheckBoxRegistrarConRolContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRegistrarConRolContraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRegistrarConRolContraseña2ActionPerformed

    private void jCheckBoxRegistrarConRolContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRegistrarConRolContraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRegistrarConRolContraseña1ActionPerformed

    private void jTextRegistrarConRolTipodeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRolTipodeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRolTipodeDocumentoActionPerformed

    private void jComboBoxRegistrarConRolTipodeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarConRolTipodeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarConRolTipodeDocumentoActionPerformed

    private void jTextRegistrarConRolDigitesuDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarConRolDigitesuDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarConRolDigitesuDocumentoActionPerformed

    private void jComboBoxRegistrarConRol_RolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarConRol_RolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarConRol_RolesActionPerformed

    private void jTextRegistrarconRol_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarconRol_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarconRol_RolActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarConRol2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarConRol2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarConRol2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarConRol2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarConRol2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarConRol;
    public javax.swing.JCheckBox jCheckBoxRegistrarConRolContraseña1;
    public javax.swing.JCheckBox jCheckBoxRegistrarConRolContraseña2;
    public javax.swing.JComboBox<String> jComboBoxRegistrarConRolSexo;
    public javax.swing.JComboBox<String> jComboBoxRegistrarConRolTipodeDocumento;
    public javax.swing.JComboBox<String> jComboBoxRegistrarConRol_Roles;
    public com.toedter.calendar.JDateChooser jDateRegistrarConRolFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTextField jTextRegistrarConRol1apellido;
    public javax.swing.JTextField jTextRegistrarConRol1nombre;
    public javax.swing.JTextField jTextRegistrarConRol2apellido;
    public javax.swing.JTextField jTextRegistrarConRol2nombre;
    public javax.swing.JTextField jTextRegistrarConRolCorreo;
    public javax.swing.JTextField jTextRegistrarConRolDigitesuDocumento;
    public javax.swing.JTextField jTextRegistrarConRolFechaNacimiento;
    public javax.swing.JTextField jTextRegistrarConRolSexo;
    public javax.swing.JTextField jTextRegistrarConRolTipodeDocumento;
    public javax.swing.JTextField jTextRegistrarconRol_Rol;
    public javax.swing.JLabel lbRegistrarConRol;
    public javax.swing.JPasswordField txtPasswordRegistrarConRol;
    public javax.swing.JPasswordField txtPasswordRegistrarConRolConfirmar;
    // End of variables declaration//GEN-END:variables
}
