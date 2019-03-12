package proyecto.bases.pkg1;

import Conection.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JDialog {

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    Conexion cx = new Conexion();
    Connection cn = cx.ConectarBaseDatos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
<<<<<<< HEAD
        String sql = "SELECT * FROM login";
=======
        // TODO add your handling code here:
        String sql = "SELECT * FROM login", vendedor = "";
        int id = 0;
        //JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos","Error", JOptionPane.ERROR_MESSAGE);
>>>>>>> 59b84b1ce0ce7ad22d475288fa7e673901ce8798
        Statement st = null;
        boolean adm = false, tra = false;
        try {
            st = cn.createStatement();
<<<<<<< HEAD
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("usuario").equals(jTextField1.getText()) && rs.getString("contraseña").equals(jPasswordField1.getText()) && rs.getBoolean("adm")) {
                    System.out.println("administrador");
                    adm = true;
                    break;
                }
                if (rs.getString("usuario").equals(jTextField1.getText()) && rs.getString("contraseña").equals(jPasswordField1.getText()) && !rs.getBoolean("adm")) {
                    System.out.println("trabajador");
                    tra = true;
                    break;
                }

=======
            ResultSet rs = st.executeQuery(sql), rv;
            while (rs.next()) {
                if (rs.getString("usuario").equals(jTextField1.getText()) && rs.getString("contraseña").equals(jPasswordField1.getText()) && rs.getBoolean("admin")) {
                    System.out.println("administrador");
                    adm = true;
                    this.dispose();
                    Principal p = new Principal();
                    p.setVisible(true);
                    break;
                }
                if (rs.getString("usuario").equals(jTextField1.getText()) && rs.getString("contraseña").equals(jPasswordField1.getText()) && !rs.getBoolean("admin")) {
                    System.out.println("trabajador");
                    rs.close();
                    System.out.println(rs.getInt("id"));
                    rv = st.executeQuery("SELECT v.nombre, lo.id FROM vendedor v \n "
                            + "INNER JOIN  login lo "
                            + "ON v.id = lo.vendedor_id "
                            + "WHERE lo.id = " + rs.getInt("id") + ";");
                    if (rv.next()) {
                        vendedor = rv.getString("nombre");
                        id = rv.getInt("id");
                    }
                    System.out.println(vendedor);
                    System.out.println(id);
                    tra = true;
                    rv.close();
                    this.dispose();
                    Ventas v = new Ventas(null, true);
                    v.vendedor(vendedor, id);
                    v.setVisible(true);
                    break;
                }
>>>>>>> 59b84b1ce0ce7ad22d475288fa7e673901ce8798
            }
            if (tra == adm) {
                JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            jTextField1.setText(null);
            jPasswordField1.setText(null);

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
