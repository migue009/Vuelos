/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author MIGUEL TULANDE
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registrar() {
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
        lbRegistrar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtPasswordRegistrar = new javax.swing.JPasswordField();
        jTextRegistrar1nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextRegistrar2nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTextRegistrar1apellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextRegistrarSexo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jDateRegistrarFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jTextRegistrar2apellido = new javax.swing.JTextField();
        jComboBoxRegistrarSexo = new javax.swing.JComboBox<>();
        jTextRegistrarFechaNacimiento = new javax.swing.JTextField();
        txtPasswordRegistrarConfirmar = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextRegistrarCorreo = new javax.swing.JTextField();
        jCheckBoxRegistrarContraseña2 = new javax.swing.JCheckBox();
        jCheckBoxRegistrarContraseña1 = new javax.swing.JCheckBox();
        jTextRegistrarTipodeDocumento = new javax.swing.JTextField();
        jComboBoxRegistrarTipodeDocumento = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        jTextRegistrarDigitesuDocumento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        lbRegistrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        lbRegistrar.setText("REGISTRO DE USUARIO");
        jPanel1.add(lbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRARSE");
        btnRegistrar.setBorder(null);
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 170, 30));

        txtPasswordRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordRegistrar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtPasswordRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordRegistrar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordRegistrar.setText("Contraseña");
        txtPasswordRegistrar.setBorder(null);
        txtPasswordRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 181, 20));

        jTextRegistrar1nombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrar1nombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrar1nombre.setText("Primer nombre");
        jTextRegistrar1nombre.setBorder(null);
        jTextRegistrar1nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrar1nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrar1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 160, 30));

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
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 190, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 130, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, 360));

        jTextRegistrar2nombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrar2nombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrar2nombre.setText("Segundo nombre");
        jTextRegistrar2nombre.setBorder(null);
        jTextRegistrar2nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrar2nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrar2nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 160, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 130, 10));

        jTextRegistrar1apellido.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrar1apellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrar1apellido.setText("Primer apellido");
        jTextRegistrar1apellido.setBorder(null);
        jTextRegistrar1apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrar1apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrar1apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 10));

        jTextRegistrarSexo.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarSexo.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarSexo.setText("Sexo");
        jTextRegistrarSexo.setBorder(null);
        jTextRegistrarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 130, 10));

        jDateRegistrarFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateRegistrarFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jDateRegistrarFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 90, 20));

        jTextRegistrar2apellido.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrar2apellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrar2apellido.setText("Segundo apellido");
        jTextRegistrar2apellido.setBorder(null);
        jTextRegistrar2apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrar2apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrar2apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 160, 30));

        jComboBoxRegistrarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, 20));

        jTextRegistrarFechaNacimiento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarFechaNacimiento.setText("Fecha de nacimiento");
        jTextRegistrarFechaNacimiento.setBorder(null);
        jTextRegistrarFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 120, 30));

        txtPasswordRegistrarConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordRegistrarConfirmar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtPasswordRegistrarConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordRegistrarConfirmar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordRegistrarConfirmar.setText("Contraseña");
        txtPasswordRegistrarConfirmar.setBorder(null);
        txtPasswordRegistrarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegistrarConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordRegistrarConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 181, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 190, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 190, 10));

        jTextRegistrarCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarCorreo.setText("Correo electronico");
        jTextRegistrarCorreo.setBorder(null);
        jTextRegistrarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 160, 30));

        jCheckBoxRegistrarContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRegistrarContraseña2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxRegistrarContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jCheckBoxRegistrarContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRegistrarContraseña1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxRegistrarContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jTextRegistrarTipodeDocumento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarTipodeDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarTipodeDocumento.setText("Tipo de documento");
        jTextRegistrarTipodeDocumento.setBorder(null);
        jTextRegistrarTipodeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarTipodeDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarTipodeDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 30));

        jComboBoxRegistrarTipodeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarTipodeDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarTipodeDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 50, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 130, 10));

        jTextRegistrarDigitesuDocumento.setBackground(new java.awt.Color(204, 204, 204));
        jTextRegistrarDigitesuDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jTextRegistrarDigitesuDocumento.setText("Digite su documento");
        jTextRegistrarDigitesuDocumento.setBorder(null);
        jTextRegistrarDigitesuDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegistrarDigitesuDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRegistrarDigitesuDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 160, 30));

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

    private void txtPasswordRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegistrarActionPerformed

    private void jTextRegistrar1nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrar1nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrar1nombreActionPerformed

    private void jTextRegistrar2nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrar2nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrar2nombreActionPerformed

    private void jTextRegistrar1apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrar1apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrar1apellidoActionPerformed

    private void jTextRegistrarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarSexoActionPerformed

    private void jTextRegistrar2apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrar2apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrar2apellidoActionPerformed

    private void jComboBoxRegistrarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarSexoActionPerformed

    private void jTextRegistrarFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarFechaNacimientoActionPerformed

    private void txtPasswordRegistrarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegistrarConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegistrarConfirmarActionPerformed

    private void jTextRegistrarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarCorreoActionPerformed

    private void jCheckBoxRegistrarContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRegistrarContraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRegistrarContraseña2ActionPerformed

    private void jCheckBoxRegistrarContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRegistrarContraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRegistrarContraseña1ActionPerformed

    private void jTextRegistrarTipodeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarTipodeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarTipodeDocumentoActionPerformed

    private void jComboBoxRegistrarTipodeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarTipodeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarTipodeDocumentoActionPerformed

    private void jTextRegistrarDigitesuDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegistrarDigitesuDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegistrarDigitesuDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JCheckBox jCheckBoxRegistrarContraseña1;
    public javax.swing.JCheckBox jCheckBoxRegistrarContraseña2;
    public javax.swing.JComboBox<String> jComboBoxRegistrarSexo;
    public javax.swing.JComboBox<String> jComboBoxRegistrarTipodeDocumento;
    public com.toedter.calendar.JDateChooser jDateRegistrarFechaNacimiento;
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
    public javax.swing.JTextField jTextRegistrar1apellido;
    public javax.swing.JTextField jTextRegistrar1nombre;
    public javax.swing.JTextField jTextRegistrar2apellido;
    public javax.swing.JTextField jTextRegistrar2nombre;
    public javax.swing.JTextField jTextRegistrarCorreo;
    public javax.swing.JTextField jTextRegistrarDigitesuDocumento;
    public javax.swing.JTextField jTextRegistrarFechaNacimiento;
    public javax.swing.JTextField jTextRegistrarSexo;
    public javax.swing.JTextField jTextRegistrarTipodeDocumento;
    public javax.swing.JLabel lbRegistrar;
    public javax.swing.JPasswordField txtPasswordRegistrar;
    public javax.swing.JPasswordField txtPasswordRegistrarConfirmar;
    // End of variables declaration//GEN-END:variables
}
