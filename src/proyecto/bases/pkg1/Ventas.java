package proyecto.bases.pkg1;

import Conection.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.StatementEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JDialog {
    public Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    Conexion cx = new Conexion();
    Connection cn = cx.ConectarBaseDatos();
    double total = 0;
    static int id;
    int idv=0;
    static String  vendedores;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel1.setText("0");

        jLabel2.setText("0");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Vender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        jLabel4.setText("Cambio");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void vendedor(String vendedr, int identificador){
        vendedores = vendedr;
        id = identificador;
        jLabel5.setText(vendedores);
        this.setTitle(vendedores);
    }
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery("select * from producto");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            if(evt.getKeyCode() == 10){
                while(r.next()){
                    if(r.getString("codigo").equals(jTextField1.getText())){
                        Object[] producto = new Object[]{1,r.getString("nombre"),r.getDouble("precio")};
                        model.addRow(producto);
                        total += r.getDouble("precio");
                        jLabel1.setText(String.valueOf(total));
                        jTextField1.setText("");
                        break;
                    }
                }
                jTextField1.setText("");                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode() == 10){
            double cambio = Double.parseDouble(jTextField2.getText());
            cambio -= Double.parseDouble(jLabel1.getText());
            jLabel2.setText(String.valueOf(cambio));
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object valor = new Object();
        String cadena;
        System.out.println(jTable1.getSelectedRow());
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int filas = dtm.getRowCount();
            if(filas == 0 || jTable1.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane, "SELECCIONE EL PRODUCTO", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                valor = dtm.getValueAt(jTable1.getSelectedRow(), 2);
                cadena = String.valueOf(valor);
                total = total - Double.valueOf(cadena);
                jLabel1.setText(String.valueOf(total));
                dtm.removeRow(jTable1.getSelectedRow()); 
            }
        jTextField1.requestFocus();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int filas = dtm.getRowCount();
        String nombre,fecha;
        Object valor = new Object();
        Calendar cal = new GregorianCalendar();
            if (filas == 0 ) {
                JOptionPane.showMessageDialog(rootPane, "NO HAY PRODCUTOS", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                    fecha = cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH+1)+"-"+cal.get(Calendar.DAY_OF_MONTH);
                    System.out.println(fecha);
                    venta(total,fecha,"1" , id);
                    idventa();
                    int a = 0;
                        while(a < filas){
                            valor = dtm.getValueAt(a, 1);
                            nombre = String.valueOf(valor);
                            restarbd(nombre);
                            a++;
                        }
                        for (int i = filas; i >= 1; i--) {  
                            dtm.removeRow(dtm.getRowCount()-1);
                        }
                        jLabel1.setText("0");
                        jLabel2.setText("0");
                        total = 0;  
            }
       jTextField1.requestFocus();
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DetalleV dtv = new DetalleV(null,true);
        dtv.datosvendedor(id);
        dtv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void descripcionv(int idp, int idv, double precio){
        try {
             Statement s = cn.createStatement();
             ResultSet r = s.executeQuery("select * from descripcionv");
             boolean encontrado = true;
             
                 while(r.next()){
                    if(r.getInt("producto_id") == idp && r.getInt("venta_id")== idv){
                        System.out.println(idv+"="+r.getInt("venta_id"));
                        System.out.println(r.getInt("producto_id")+"=="+idp);
                            PreparedStatement pps = s.getConnection().prepareStatement("update descripcionv set cantidad ='" + (r.getInt("cantidad")+1) +
                            "'where producto_id = '" + r.getInt("producto_id") + "'");
                            System.out.println("paso varias veces");
                            pps.executeUpdate();
                            encontrado = false;
                            break;
                        }
                    }
                if(encontrado){
                     PreparedStatement stm;
                     System.out.println("paso primera vez");
                            stm = cn.prepareStatement("insert into descripcionv(producto_id, venta_id, cantidad, precio) values(?,?,?,?)");
                            stm.setInt(1, idp);
                            stm.setInt(2, idv);
                            stm.setDouble(4, precio);
                            stm.setInt(3, 1);
                            stm.executeUpdate();
                            stm.close();
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void  idventa(){
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery("select id from venta");
                while(r.next()){
                    idv = r.getInt("id");
                    System.out.println(idv);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void venta(Double total, String fecha, String nofactura,int id){
        try {
            PreparedStatement stm;
            stm = cn.prepareStatement("insert into venta(total, fecha, nfactura, login_id) values(?,?,?,?)");
            stm.setDouble(1, total);
            stm.setDate(2, Date.valueOf(fecha));
            stm.setString(3, nofactura);
            stm.setInt(4, id);
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void restarbd(String nombre){
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery("select * from producto");
                while(r.next()){
                    if(r.getString("nombre").equals(nombre)){
                        System.out.println("idvvv"+idv);
                        descripcionv(r.getInt("id"), idv, r.getDouble("precio"));
                        PreparedStatement pps = s.getConnection().prepareStatement("update producto set cantidad ='" + (r.getInt("cantidad")-1) +
                        "'where id = '" + r.getInt("id") + "'");
                        pps.executeUpdate();
                        break;
                    }
                }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventas dialog = new Ventas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
