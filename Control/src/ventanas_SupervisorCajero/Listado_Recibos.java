/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_SupervisorCajero;

import Clases.listadoRecibos;
import Conexion.Conexion;
import static Conexion.Conexion.Enlace;
import Conexion.MostrarTabla;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
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


/**
 *
 * @author Vinicio
 */
public class Listado_Recibos extends javax.swing.JInternalFrame {
    
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    static DefaultComboBoxModel modelo;
     static DefaultComboBoxModel modeloa;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
private Dimension DimensionBarra = null; 
Color BTNmenuACT =new Color(45,70,94);
Color BTNmenuMouse =new Color(31,51,70);
Color X1 =new Color(69,69,69);
Color X2 =new Color(102,102,102);
    public Listado_Recibos() {
     
      //  try {
            //7try {
            initComponents();
            modelo = new DefaultComboBoxModel();
            modeloa = new DefaultComboBoxModel();
            llena_combo();
            llena_combod();
            
           // Conexion cxn = new Conexion();// llamamos a la clase Conexion
            //MostrarTabla tabla=new MostrarTabla();//llamamos a la clase MostrarJTable
            //DefaultTableModel modelo = new DefaultTableModel();
            //conn=Conexion.Enlace(conn);
            //rs=Conexion.BuscarRecibo(rs);
            //modelo=tabla.Imprimir(rs,modelo);
            //jTable1.setModel(modelo);
            
            QuitarLaBarraTitulo();
            jButton2.setOpaque(true);
            jButton2.setContentAreaFilled(false);
            Border thickBorder = new LineBorder(BTNmenuACT, 86);
            Border thickBorderSearch = new LineBorder(X2, 86);
            jButton2.setBorder(thickBorder);
            jComboBox2.addItem("ENERO");
            jComboBox2.addItem("FEBRERO");
            jComboBox2.addItem("MARZO");
            jComboBox2.addItem("ABRIL");
            jComboBox2.addItem("MAYO");
            jComboBox2.addItem("JUNIO");
            jComboBox2.addItem("JULIO");
            jComboBox2.addItem("AGOSTO");
            jComboBox2.addItem("SEPTIEMBRE");
            jComboBox2.addItem("OCTUBRE");
            jComboBox2.addItem("NOVIEMBRE");
            jComboBox2.addItem("DICEMBRE");
            //} catch (SQLException ex) {
            //   Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
            //}
       // } catch (SQLException ex) {
         //   Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }

    public void QuitarLaBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
DimensionBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
}
    
    public void llena_combo(){ // static para poder llamarlo desde el otro frame o JDialog

try {
    modelo.removeAllElements(); // eliminamos lo elementos
    conn=Enlace(conn);
    st=conn.createStatement();
    ResultSet rs=st.executeQuery("SELECT DISTINCT ZONA from INMUEBLE order by ZONA ASC");
    modelo.addElement("---");
    while(rs.next())
    {                
        modelo.addElement(rs.getString("ZONA"));
        jComboBox1.setModel(modelo);
    }
      // seteamos el modelo y se cargan los datos
} catch (SQLException ex) {
    Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
}     
}
    
    public void llena_combod(){ // static para poder llamarlo desde el otro frame o JDialog

try {
    modeloa.removeAllElements(); // eliminamos lo elementos
    conn=Enlace(conn);
    st=conn.createStatement();
    ResultSet rs=st.executeQuery("SELECT DISTINCT EXTRACT(YEAR FROM FECHAVENCI) as año  FROM recibo");
    modeloa.addElement("---");
    while(rs.next())
    {                
        modeloa.addElement(rs.getString("año"));
        jComboBox3.setModel(modeloa);
    }
      // seteamos el modelo y se cargan los datos
} catch (SQLException ex) {
    Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
}     
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
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

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
        jLabel1.setText("Listado de Recibos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1130, 50));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Generar Recibo");
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 250, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 250, 57));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 950, 300));

        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox1KeyReleased(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 100, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 88, 88));
        jLabel9.setText("Año");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(88, 88, 88));
        jLabel11.setText("Zona");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 60, 30));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 100, 40));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(88, 88, 88));
        jLabel12.setText("Mes");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 60, 30));

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

    private void jComboBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyReleased
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            int fecha = 0;
            
             
            if (jComboBox2.getSelectedItem().toString().equals("ENERO")){
                fecha = 1;
            }
            else {
            if (jComboBox2.getSelectedItem().toString().equals("FEBRERO")){
                fecha = 2;
            }
            else {
                
            if (jComboBox2.getSelectedItem().toString().equals("MARZO")){
                fecha = 3;
            }
            else {
             if (jComboBox2.getSelectedItem().toString().equals("ABRIL")){
                fecha = 4;
            }  
             else {
             if (jComboBox2.getSelectedItem().toString().equals("MAYO")){
                fecha = 5;
            }
             else {
            if (jComboBox2.getSelectedItem().toString().equals("JUNIO")){
                fecha = 6;
            }
            else {
            if (jComboBox2.getSelectedItem().toString().equals("JULIO")){
                fecha = 7;
            }
            else {
            if (jComboBox2.getSelectedItem().toString().equals("AGOSTO")){
                fecha = 8;
            } 
            else {
            if (jComboBox2.getSelectedItem().toString().equals("SEPTIEMBRE")){
                fecha = 9;
            } 
            else {
            if (jComboBox2.getSelectedItem().toString().equals("OCTUBRE")){
                fecha = 10;
            }
            else{
            if (jComboBox2.getSelectedItem().toString().equals("NOVIMBRE")){
                fecha = 11;
            }
            else {
            if (jComboBox2.getSelectedItem().toString().equals("DICIEMBRE")){
                fecha = 12;
            }    
            }
            }   
            }
            }
            }
            }
             }
             } 
            }    
            }  
            } 
            
            
            
            int zona=Integer.parseInt((String) jComboBox1.getSelectedItem());
            int fechaa=Integer.parseInt((String) jComboBox3.getSelectedItem());
            
            Conexion cxn = new Conexion();// llamamos a la clase Conexion
            MostrarTabla tabla=new MostrarTabla();//llamamos a la clase MostrarJTable
            DefaultTableModel modelot = new DefaultTableModel();
            conn=Conexion.Enlace(conn);
            rs=Conexion.BuscarRecibo(fechaa,fecha, zona);
            modelot=tabla.Imprimir(rs,modelot);
            jTable1.setModel(modelot);
              
        } catch (SQLException ex) {
            Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox1KeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //TODO add your handling code here:
       List lista = new ArrayList();
        for(int i=0; i<jTable1.getRowCount();i++){
           listadoRecibos recibos = new listadoRecibos(jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 5).toString(),jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 7).toString(), jTable1.getValueAt(i, 8).toString(),jTable1.getValueAt(i, 9).toString() );
            lista.add(recibos);
        }
            
        try {
          JasperReport reporte = (JasperReport) JRLoader.loadObject("recibos.jasper");
           Map parametro = new HashMap();
            parametro.put("zona", jComboBox1.getSelectedItem());
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(jprint, false);
        } catch (JRException ex) {
            Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /** String path= "";
        try{
            URL url = this.getClass().getResource("/Reportes/recibos.jasper");
            path = URLDecoder.decode(path, "UTF-8");
            
             Connection conn=null;
             Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            Map parametros = new HashMap();
            JasperReport reporte = (JasperReport) JRLoader.loadObject(url);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte,parametros, miConexion);
            JasperViewer visor = new JasperViewer(imprimir,false);
            visor.setTitle("Libro Diario");
            visor.setVisible(true);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
         }  */ 
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
