/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_Tesoreria;

import Clases.ReporteC;
import Clases.listadoRecibos;
import Conexion.Conexion;
import Conexion.MostrarTabla;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import ventanas_SupervisorCajero.Editar_Cliente;
import ventanas_SupervisorCajero.Listado_Recibos;

/**
 *
 * @author Fernando Ambrosio
 */
public class Reportes_Cajero extends javax.swing.JInternalFrame {
     static Connection conn=null;
      static Statement st=null;
    static ResultSet rs=null;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
private Dimension DimensionBarra = null; 
Color BTNmenuACT =new Color(45,70,94);
Color BTNmenuMouse =new Color(31,51,70);
Color X1 =new Color(69,69,69);
Color X2 =new Color(102,102,102);
    public Reportes_Cajero() {
        initComponents();
        QuitarLaBarraTitulo();
        jButton2.setOpaque(true);
        jButton2.setContentAreaFilled(false);
       Border thickBorder = new LineBorder(BTNmenuACT, 86);
       Border thickBorderSearch = new LineBorder(X2, 86);
       jButton2.setBorder(thickBorder);
       
       
            ResultSet rs;
        
          TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(cajero);
           Connection conn=null;
           
        try {
            PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select USUARIO from empleado where IDROL=3 order by USUARIO ASC ");
               rs= pstm.executeQuery(); 
        
               while( rs.next() )

            {

            textAutoAcompleter.addItem( rs.getString( "USUARIO" ) );
            
            

            }
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cajero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totald = new javax.swing.JTextField();

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
        jLabel1.setText("Reportes de Ingreso Por Cajero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1130, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 88, 88));
        jLabel2.setText("TOTAL Q.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 130, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Generar Reporte");
        jLabel10.setMaximumSize(new java.awt.Dimension(157, 27));
        jLabel10.setMinimumSize(new java.awt.Dimension(157, 27));
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 260, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 260, 50));

        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 230, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 790, 250));

        jLabel3.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(88, 88, 88));
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 40));

        cajero.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajeroActionPerformed(evt);
            }
        });
        getContentPane().add(cajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Buscar");
        jLabel12.setMaximumSize(new java.awt.Dimension(157, 27));
        jLabel12.setMinimumSize(new java.awt.Dimension(157, 27));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 260, 50));

        jButton4.setBackground(new java.awt.Color(45, 70, 94));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 260, 50));

        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 88, 88));
        jLabel4.setText("Cajero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 40));

        totald.setEditable(false);
        totald.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        totald.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaldActionPerformed(evt);
            }
        });
        getContentPane().add(totald, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
    Border thickBorder = new LineBorder(BTNmenuMouse, 86);
       jButton2.setBorder(thickBorder);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
    Border thickBorder = new LineBorder(BTNmenuACT, 86);
       jButton2.setBorder(thickBorder);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajeroActionPerformed

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         
        if (cajero.getText().equals("") || jDateChooser1.getDate()==null){
            JOptionPane.showMessageDialog(null, "Complete los Campos Vacios");
        }
        else { 
        try {
             // TODO add your handling code here:
             String nomcajero=cajero.getText();
             String fecha= new SimpleDateFormat("dd/MM/yyyy").format(jDateChooser1.getDate());
             
             
             Conexion cxn = new Conexion();// llamamos a la clase Conexion
             MostrarTabla tabla=new MostrarTabla();//llamamos a la clase MostrarJTable
             DefaultTableModel modelot = new DefaultTableModel();
             conn=Conexion.Enlace(conn);
             rs=Conexion.BuscarReporteC(nomcajero, fecha);
             modelot=tabla.Imprimir(rs,modelot);
             jTable1.setModel(modelot);
         } catch (SQLException ex) {
             Logger.getLogger(Reportes_Cajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        double sumatoria1=0;
        int totalRow= jTable1.getRowCount();
       
        totalRow-=1; 
       
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(jTable1.getValueAt(i,3)));

             sumatoria1+=sumatoria;
              totald.setText(String.valueOf(sumatoria1));
           }
           }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         List lista = new ArrayList();
        for(int i=0; i<jTable1.getRowCount();i++){
           ReporteC reporte = new ReporteC(jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), Integer.parseInt(jTable1.getValueAt(i, 3).toString()));
           reporte.setSuma(i);
           lista.add(reporte);
        }
            
        try {
          JasperReport reporte = (JasperReport) JRLoader.loadObject("reportec.jasper");
           Map parametro = new HashMap();
           //parametro.put("totald",totald.getText() );
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(jprint,false);
        } catch (JRException ex) {
            Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void totaldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totald;
    // End of variables declaration//GEN-END:variables
}
