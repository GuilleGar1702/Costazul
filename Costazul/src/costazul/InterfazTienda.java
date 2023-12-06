/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Guillermo
 */
public class InterfazTienda extends javax.swing.JPanel {

    /**
     * Creates new form InterfazTienda
     */
    String[] Producto1;
    String[] Producto2;
    String[] Producto3;
    double subTotal1=0, subTotal2=0, subTotal3=0, total=0;
    
    NodoTienda NodoActual;
    
    public ListaTiendas listaTiendas= new ListaTiendas(this);
    private Inicio inicio;
    public InterfazTienda(Inicio inicio) {
        
        
        initComponents();
        this.inicio=inicio;
        CBTiendas.removeAllItems();
        //Cargamos las tiendas
        for(int i=0;i<3;i++){
            cargarTiendas();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelContenido = new javax.swing.JPanel();
        LblPrecio1 = new javax.swing.JLabel();
        LblTienda = new javax.swing.JLabel();
        LblPrecio2 = new javax.swing.JLabel();
        LblPrecio3 = new javax.swing.JLabel();
        LblProducto1 = new javax.swing.JLabel();
        LblProducto2 = new javax.swing.JLabel();
        LblProducto3 = new javax.swing.JLabel();
        LblSubTotal3 = new javax.swing.JLabel();
        LblSubTotal2 = new javax.swing.JLabel();
        LblSubTotal1 = new javax.swing.JLabel();
        TFCantidad1 = new javax.swing.JTextField();
        TFCantidad2 = new javax.swing.JTextField();
        TFCantidad3 = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        BtnComprar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BtnEntrar = new javax.swing.JButton();
        CBTiendas = new javax.swing.JComboBox<>();
        LblEncargado = new javax.swing.JLabel();
        LblRubro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIENDAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 46, 1920, 60));

        PanelContenido.setOpaque(false);
        PanelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPrecio1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPrecio1.setText("$");
        PanelContenido.add(LblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 110, -1));

        LblTienda.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTienda.setText("TIENDA");
        PanelContenido.add(LblTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 70));

        LblPrecio2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblPrecio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPrecio2.setText("$");
        PanelContenido.add(LblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 110, -1));

        LblPrecio3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblPrecio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPrecio3.setText("$");
        PanelContenido.add(LblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 110, -1));

        LblProducto1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblProducto1.setText("PRODUCTOS");
        PanelContenido.add(LblProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, -1));

        LblProducto2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblProducto2.setText("PRODUCTOS");
        PanelContenido.add(LblProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 370, -1));

        LblProducto3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblProducto3.setText("PRODUCTOS");
        PanelContenido.add(LblProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 370, -1));

        LblSubTotal3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblSubTotal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSubTotal3.setText("SUBTOTAL");
        LblSubTotal3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelContenido.add(LblSubTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 250, -1));

        LblSubTotal2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblSubTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSubTotal2.setText("SUBTOTAL");
        LblSubTotal2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelContenido.add(LblSubTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 250, -1));

        LblSubTotal1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblSubTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSubTotal1.setText("SUBTOTAL");
        LblSubTotal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelContenido.add(LblSubTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 250, -1));

        TFCantidad1.setBackground(new java.awt.Color(105, 178, 178));
        TFCantidad1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TFCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFCantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCantidad1KeyTyped(evt);
            }
        });
        PanelContenido.add(TFCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 100, 50));

        TFCantidad2.setBackground(new java.awt.Color(105, 178, 178));
        TFCantidad2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TFCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PanelContenido.add(TFCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 50));

        TFCantidad3.setBackground(new java.awt.Color(105, 178, 178));
        TFCantidad3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TFCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PanelContenido.add(TFCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 100, 50));

        BtnCalcular.setBackground(new java.awt.Color(28, 28, 28));
        BtnCalcular.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        BtnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnCalcular.setText("CALCULAR");
        BtnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCalcularMouseClicked(evt);
            }
        });
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        PanelContenido.add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 250, 70));

        LblTotal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        LblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTotal.setText("TOTAL");
        LblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelContenido.add(LblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 250, -1));

        BtnComprar.setBackground(new java.awt.Color(28, 28, 28));
        BtnComprar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnComprar.setForeground(new java.awt.Color(255, 255, 255));
        BtnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnComprar.setText("COMPRAR");
        BtnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnComprarMouseClicked(evt);
            }
        });
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });
        PanelContenido.add(BtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 750, 250, 70));

        add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 970, 850));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEntrar.setBackground(new java.awt.Color(28, 28, 28));
        BtnEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnEntrar.setText("ENTRAR");
        BtnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEntrarMouseClicked(evt);
            }
        });
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 250, 70));

        CBTiendas.setBackground(new java.awt.Color(0, 153, 153));
        CBTiendas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CBTiendas.setForeground(new java.awt.Color(255, 255, 255));
        CBTiendas.setBorder(null);
        CBTiendas.setOpaque(false);
        jPanel1.add(CBTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 510, 70));

        LblEncargado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LblEncargado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblEncargado.setText("Encargado");
        jPanel1.add(LblEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 510, -1));

        LblRubro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LblRubro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblRubro.setText("Rubro");
        jPanel1.add(LblRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 520, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 700, 570));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoTienda.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntrarMouseClicked
        
    }//GEN-LAST:event_BtnEntrarMouseClicked
    //dividimos la informacion de los productos de su precio y mostramos en pantalla
    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        NodoActual=listaTiendas.buscarElementos(CBTiendas.getSelectedIndex());
        Producto1 = NodoActual.Productos[0].split("_");
        Producto2 = NodoActual.Productos[1].split("_");
        Producto3 = NodoActual.Productos[2].split("_");
        LblProducto1.setText(Producto1[0]); LblPrecio1.setText(Producto1[1]+"$");
        LblProducto2.setText(Producto2[0]); LblPrecio2.setText(Producto2[1]+"$");
        LblProducto3.setText(Producto3[0]); LblPrecio3.setText(Producto3[1]+"$");
        LblTienda.setText(NodoActual.Tienda);
        LblEncargado.setText("Encargado: "+NodoActual.Encargado);
        LblRubro.setText("Rubro: "+NodoActual.Rubro);
        TFCantidad1.setText("");
        TFCantidad2.setText("");
        TFCantidad2.setText("");
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void TFCantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCantidad1KeyTyped
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
            
    }//GEN-LAST:event_TFCantidad1KeyTyped

    private void BtnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCalcularMouseClicked
        
    }//GEN-LAST:event_BtnCalcularMouseClicked

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        //calculamos los submontos (solo si se eligio una cantidad)
        subTotal1=0;subTotal2=0;subTotal3=0;
        if (!TFCantidad1.getText().equalsIgnoreCase("")){
            double Precio =Integer.parseInt(Producto1[1]);
            int Cantidad=Integer.parseInt(TFCantidad1.getText());
            subTotal1=Precio*Cantidad;
            LblSubTotal1.setText(String.valueOf(subTotal1)+"$");
            
        }
        if (!TFCantidad2.getText().equalsIgnoreCase("")){
            double Precio =Integer.parseInt(Producto2[1]);
            int Cantidad=Integer.parseInt(TFCantidad2.getText());
            subTotal2=Precio*Cantidad;
            LblSubTotal2.setText(String.valueOf(subTotal2)+"$");
        }
        if (!TFCantidad3.getText().equalsIgnoreCase("")){
            double Precio =Integer.parseInt(Producto3[1]);
            int Cantidad=Integer.parseInt(TFCantidad3.getText());
            subTotal3=Precio*Cantidad;
            LblSubTotal3.setText(String.valueOf(subTotal3)+"$");
        }
        //calculamos el total
        total=subTotal1+subTotal2+subTotal3;
        Usuario.Encargado=LblEncargado.getText();
        Usuario.Tienda=LblTienda.getText();
        Usuario.producto1=LblProducto1.getText()+" x "+TFCantidad1.getText()+"="+String.valueOf(subTotal1);
        Usuario.producto2=LblProducto2.getText()+" x "+TFCantidad2.getText()+"="+String.valueOf(subTotal2);
        Usuario.producto3=LblProducto3.getText()+" x "+TFCantidad3.getText()+"="+String.valueOf(subTotal3);
        Usuario.totalPago=String.valueOf(total);
        subTotal1=0;subTotal2=0;subTotal3=0;
        LblTotal.setText(String.valueOf(total)+"$");
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnComprarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnComprarMouseClicked

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        inicio.InicioCompraPago();
    }//GEN-LAST:event_BtnComprarActionPerformed

    //Cargador de tiendas (las del txt)
    public void cargarTiendas() 
    {
        try {
            Path ruta= Paths.get("./src/costazul/Tiendas2.txt");
            List<String> listaPajuaTiendas=Files.readAllLines(ruta);
            String[] xd= new String[listaPajuaTiendas.size()];
            listaPajuaTiendas.toArray(xd);
            for (String x:xd){
                String[] atributos = x.split("-");
                //atributos[0] = atributos[0].replace("Tienda: ", "");
                String[] p = atributos[3].split("/");
                listaTiendas.agregarElemento(atributos[0], atributos[1], atributos[2], p);
                CBTiendas.addItem(atributos[0]);
            }
        } catch (IOException ex) {
            Logger.getLogger(InterfazTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnEntrar;
    public javax.swing.JComboBox<String> CBTiendas;
    private javax.swing.JLabel LblEncargado;
    private javax.swing.JLabel LblPrecio1;
    private javax.swing.JLabel LblPrecio2;
    private javax.swing.JLabel LblPrecio3;
    private javax.swing.JLabel LblProducto1;
    private javax.swing.JLabel LblProducto2;
    private javax.swing.JLabel LblProducto3;
    private javax.swing.JLabel LblRubro;
    private javax.swing.JLabel LblSubTotal1;
    private javax.swing.JLabel LblSubTotal2;
    private javax.swing.JLabel LblSubTotal3;
    private javax.swing.JLabel LblTienda;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JTextField TFCantidad1;
    private javax.swing.JTextField TFCantidad2;
    private javax.swing.JTextField TFCantidad3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
