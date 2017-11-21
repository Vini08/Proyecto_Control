/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_Cajero;

import Clases.Factura;
import Clases.listadoRecibos;
import ventanas_SupervisorCajero.*;

import Conexion.Conexion;
import static Conexion.Conexion.Enlace;
import Conexion.MostrarTabla;

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
import javax.swing.DefaultComboBoxModel;
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
import ventanas_Logueo.inicio_logueo;


/**
 *
 * @author Vinicio
 */
public class Registrar_Cobro extends javax.swing.JInternalFrame {
    public static String NameUsuario;
    
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    public static String ID_Cliente;
    public static String nombreTipo;
    public static String ID_Empleado;
    public static String ID_Factura;
     public static String ID_Lectura;
    static DefaultComboBoxModel modelo;
   
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
private Dimension DimensionBarra = null; 
Color BTNmenuACT =new Color(45,70,94);
Color BTNmenuMouse =new Color(31,51,70);

    public Registrar_Cobro(String usernam) {
        
        initComponents();
         modelo = new DefaultComboBoxModel();
         llena_combo();
         NameUsuario = usernam;
        jTextField6.setText(NameUsuario);
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
    
    public void llena_combo(){ // static para poder llamarlo desde el otro frame o JDialog

try {
    modelo.removeAllElements(); // eliminamos lo elementos
    conn=Enlace(conn);
    st=conn.createStatement();
    ResultSet rs=st.executeQuery("SELECT DISTINCT NOMBRETIPO from TIPOPAGO ");
    modelo.addElement("---");
    while(rs.next())
    {                
        modelo.addElement(rs.getString("NOMBRETIPO"));
        jComboBox1.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        co = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        to = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        c1 = new javax.swing.JTextField();
        di2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        di = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel1.setText("Pantalla de Cobros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 88, 88));
        jLabel2.setText("Tipo de Pago:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 180, 56));

        jLabel3.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(88, 88, 88));
        jLabel3.setText("Fecha de Emision");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 220, 56));

        c2.setEditable(false);
        c2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 220, -1));

        co.setEditable(false);
        co.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        co.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        co.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(co, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 240, -1));

        jTextField5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, 40));

        jLabel8.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 250, 50));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 250, 57));

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(88, 88, 88));
        jLabel7.setText("TOTAL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 90, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cobrar");
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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 250, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 250, 57));

        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 310, 40));

        to.setEditable(false);
        to.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        to.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        to.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 377, 150, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 88, 88));
        jLabel4.setText("Cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 100, 40));

        jLabel11.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Buscar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 250, 50));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 250, 57));

        c1.setEditable(false);
        c1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 240, -1));

        di2.setEditable(false);
        di2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        di2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(di2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 80, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(88, 88, 88));
        jLabel5.setText("Nit:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 50, 40));

        di.setEditable(false);
        di.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        di.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        di.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(di, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 350, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 88, 88));
        jLabel9.setText("M3 Consumidos:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(88, 88, 88));
        jLabel12.setText("Direccion:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 120, 30));

        mc.setEditable(false);
        mc.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 33)); // NOI18N
        mc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(mc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 150, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Generar Factura");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 250, 50));

        jButton7.setBackground(new java.awt.Color(45, 70, 94));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 250, 57));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 810, 250));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Apellido", "Nit", "Direccion", "Zona", "M3 Consumidos", "Fecha", "Usuario", "Codigo", "Pago", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 810, 120));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 140, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 88, 88));
        jLabel6.setText("Numero de Recibo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, 56));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 220, 40));

        jLabel14.setText("Usuario:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, -1));

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
 
        
           
        try {                                      
            Connection conn=null;  
            Statement stmt;
            ResultSet rsult;
            
            int idrecibo=Integer.parseInt(jTextField5.getText());
            String fecha= new SimpleDateFormat("dd/MM/yyyy").format(jDateChooser1.getDate());
            int total=Integer.parseInt(to.getText());
            String nombretipo= (String) jComboBox1.getSelectedItem();
            String idempleado=jTextField6.getText();
            int idlectura= Integer.parseInt(co.getText());
            
    
            PreparedStatement pstm1 = Conexion.Enlace(conn).prepareStatement("select IDTIPO from tipopago where NOMBRETIPO = ?");
            pstm1.setString(1, nombretipo );
            rsult=pstm1.executeQuery();
            
            while (rsult.next()) {
                nombreTipo = rsult.getString("IDTIPO");
            }
            
            PreparedStatement pstm2 = Conexion.Enlace(conn).prepareStatement("select CLIENTE.IDCLIENTE, LECTURA.IDLECTURA from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where recibo.IDRECIBO = ?");
            pstm2.setInt(1, idrecibo );
            rsult=pstm2.executeQuery();
            
            while (rsult.next()) {
                ID_Cliente = rsult.getString("IDCLIENTE");
                ID_Lectura = rsult.getString("IDLECTURA");
            }
            
            PreparedStatement pstm5 = Conexion.Enlace(conn).prepareStatement("select idempleado from empleado where USUARIO = ?");
            pstm5.setString(1, idempleado );
            rsult=pstm5.executeQuery();
            
            while (rsult.next()) {
                ID_Empleado = rsult.getString("IDEMPLEADO");
            }
            
            
            
      
            try {
                Connection miConexion = (Connection) Conexion.Enlace(conn);
                    java.util.Date utilDate=new java.util.Date();
                    long InMilisegundos=utilDate.getTime();
                    java.sql.Time sqlTime=new java.sql.Time(InMilisegundos);
                    
                    Statement statement = (Statement) miConexion.createStatement();
                    
                    
                    PreparedStatement pstm4 = Conexion.Enlace(conn).prepareStatement("insert into "
                            + "FACTURA(FECHA, TOTAL, IDCLIENTE, IDEMPLEADO,IDPAGO,IDLECTURA) "
                            + " values(TO_DATE(?,'dd/mm/yyyy'),?,?,?,?,?)");
                    
                    
                    pstm4.setString(1, fecha);
                    pstm4.setInt(2,total);
                    pstm4.setString(3, ID_Cliente);
                    pstm4.setString(4, ID_Empleado);
                    pstm4.setString(5, nombreTipo);
                    pstm4.setString(6, ID_Lectura);
                    pstm4.execute();
                    pstm4.close();
            } catch (Exception ex) {
                Logger.getLogger(Registrar_Cobro.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
            try{
                Connection miConexion = (Connection) Conexion.Enlace(conn);
                
                Statement statement = (Statement) miConexion.createStatement();  
                
                
                try (PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("UPDATE RECIBO "
                        + "SET ESTADO = ? "
                        + "WHERE IDRECIBO = ? ")) {
                    pstm.setInt(1, 2);
                    pstm.setInt(2, idrecibo);
                    pstm.execute();
                }
                 } catch (SQLException ex) {
                    Logger.getLogger(Registrar_Cobro.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registrar_Cobro.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
         try{
         ResultSet rsult;
         PreparedStatement pstm6 = Conexion.Enlace(conn).prepareStatement("select MAX(IDFACTURA) as Numero from factura");
            rsult=pstm6.executeQuery();
            
            while (rsult.next()) {
                ID_Factura = rsult.getString("NUMERO");
            }
            } catch (SQLException ex) {
                    Logger.getLogger(Registrar_Cobro.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
        
         DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();          
            Object [] fila=new Object[12];
            fila[0]= ID_Factura;
            fila[1]=c1.getText();
            fila[2]=c2.getText();
            fila[3]=co.getText();
            fila[4]=di.getText();
            fila[5]=di2.getText();
            fila[6]=mc.getText();
            fila[7]=new SimpleDateFormat("dd/MM/yyyy").format (jDateChooser1.getDate());
            fila[8]=jTextField6.getText();
            fila[9]=jTextField5.getText();
            fila[10]=jComboBox1.getSelectedItem();
            fila[11]=to.getText();
            modelo.addRow(fila);
            jTable2.setModel(modelo);
                   
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        
        c1.setText("");
        c2.setText("");
        di.setText("");
        di2.setText("");
        mc.setText("");
        co.setText("");
        to.setText("");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            int idrecibo=Integer.parseInt(jTextField5.getText());
            Conexion cxn = new Conexion();// llamamos a la clase Conexion
            MostrarTabla tabla=new MostrarTabla();//llamamos a la clase MostrarJTable
            DefaultTableModel modelot = new DefaultTableModel();
            conn=Conexion.Enlace(conn);
            rs=Conexion.GenerarFactura(idrecibo);
            
             while(rs.next()){
        c1.setText(rs.getString("NOMBRE"));
        c2.setText(rs.getString("apellido"));
        di.setText(rs.getString("direccion"));
        di2.setText(rs.getString("zona"));
        mc.setText(rs.getString("metroscubicos"));
        co.setText(rs.getString("nit"));
        to.setText(rs.getString("total"));
            }
            
            
            
              
        } catch (SQLException ex) {
            Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
          List lista = new ArrayList();
        for(int i=0; i<jTable2.getRowCount();i++){
           Factura fac = new Factura(jTable2.getValueAt(i, 0).toString(), jTable2.getValueAt(i, 1).toString(), jTable2.getValueAt(i, 2).toString(), jTable2.getValueAt(i, 3).toString(), jTable2.getValueAt(i, 4).toString(), jTable2.getValueAt(i, 5).toString(),jTable2.getValueAt(i, 6).toString(), jTable2.getValueAt(i, 7).toString(),jTable2.getValueAt(i, 8).toString(),jTable2.getValueAt(i, 9).toString(),jTable2.getValueAt(i, 10).toString(),jTable2.getValueAt(i, 11).toString());
            lista.add(fac);
        }
            
        try {
          JasperReport reporte = (JasperReport) JRLoader.loadObject("factura.jasper");
           Map parametro = new HashMap();
            //parametro.put("zona", jComboBox1.getSelectedItem());
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(jprint, false);
        } catch (JRException ex) {
            Logger.getLogger(Listado_Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField co;
    private javax.swing.JTextField di;
    private javax.swing.JTextField di2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField mc;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
