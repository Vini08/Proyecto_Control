/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_SupervisorCajero;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Vinicio
 */
public class Registrar_Cliente extends javax.swing.JInternalFrame {

private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
private Dimension DimensionBarra = null; 
Color BTNmenuACT =new Color(45,70,94);
Color BTNmenuMouse =new Color(31,51,70);

    public Registrar_Cliente() {
        initComponents();
        QuitarLaBarraTitulo();
        jButton1.setOpaque(true);
        jButton1.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.setContentAreaFilled(false);
       Color X1 =new Color(61,61,61);
       Border thickBorder = new LineBorder(BTNmenuACT, 86);
       jButton1.setBorder(thickBorder);
       jButton2.setBorder(thickBorder);
    }

    public void QuitarLaBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
DimensionBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1140, 700));
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 47, 47));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1090, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 88, 88));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 120, 56));

        jLabel3.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(88, 88, 88));
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 120, 56));

        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 88, 88));
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 120, 57));

        jLabel5.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(88, 88, 88));
        jLabel5.setText("NIT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, 58));

        jLabel6.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 88, 88));
        jLabel6.setText("Dirección");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 120, 56));

        jTextField1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 456, 56));

        jTextField2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 456, 56));

        jTextField3.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 456, 56));

        jTextField4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 456, 56));

        jTextField5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 456, 56));

        jLabel8.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 250, 50));

        jButton1.setBackground(new java.awt.Color(45, 70, 94));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 250, 57));

        jLabel9.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 88, 88));
        jLabel9.setText("Dpi");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, 56));

        jTextField7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 456, 56));

        jTextField6.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 456, 56));

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(88, 88, 88));
        jLabel7.setText("Zona");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 120, 57));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registrar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 250, 50));

        jButton2.setBackground(new java.awt.Color(45, 70, 94));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 250, 57));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
Border thickBorder = new LineBorder(BTNmenuMouse, 86);
       jButton1.setBorder(thickBorder);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
Border thickBorder = new LineBorder(BTNmenuACT, 86);
       jButton1.setBorder(thickBorder);
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {                                         
            // TODO add your handling code here:
            
            Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
                
                String Nombre = jTextField1.getText();
                String Apellido = jTextField7.getText();
                String Dpi = jTextField2.getText();
                String Nit = jTextField3.getText();
                int Telefono = Integer.parseInt(jTextField6.getText());
                
                
                //Aquí se asigna a la fecha en un formato el cual puede ser cambiado
                
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "CLIENTE(NOMBRE, APELLIDO, DPI, NIT, TELEFONO) "
                        + " values(?,?,?,?,?)");
                
               
                pstm.setString(1, Nombre);
                pstm.setString(2, Apellido);
                pstm.setString(3,Dpi);
                pstm.setString(4,Nit);
                pstm.setInt(5,Telefono);
                
               
            
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            }
            
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
                
                String Direccion = jTextField4.getText();
                int Zona = Integer.parseInt(jTextField5.getText());
                
                
                //Aquí se asigna a la fecha en un formato el cual puede ser cambiado
                
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "INMUEBLE(DIRECCION, ZONA) "
                        + " values(?,?)");
                
               
                pstm.setString(1, Direccion);
                pstm.setInt(2, Zona);
                JOptionPane.showMessageDialog(this, "Datos ingresados correctamente");
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Registrar_Cliente.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
Border thickBorder = new LineBorder(BTNmenuMouse, 86);
       jButton2.setBorder(thickBorder);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
    Border thickBorder = new LineBorder(BTNmenuACT, 86);
       jButton2.setBorder(thickBorder);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
          // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
