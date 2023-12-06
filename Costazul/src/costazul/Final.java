/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

/**
 *
 * @author Guillermo
 */
public class Final extends javax.swing.JPanel {

    /**
     * Creates new form Final
     */
    private Inicio inicio;
    public Final(Inicio inicio) {
        initComponents();
        this.inicio=inicio;
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
        jLabel3 = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        BtnTiendas = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡GRACIAS POR SU COMPRA!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 250, 1920, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VUELVA PRONTO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 350, 1920, 60));

        BtnInicio.setBackground(new java.awt.Color(51, 51, 51));
        BtnInicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnInicio.setText("VOLVER AL INICIO");
        BtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInicioMouseClicked(evt);
            }
        });
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 310, 140));

        BtnTiendas.setBackground(new java.awt.Color(51, 51, 51));
        BtnTiendas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnTiendas.setForeground(new java.awt.Color(255, 255, 255));
        BtnTiendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnTiendas.setText("VOLVER A TIENDAS");
        BtnTiendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTiendasMouseClicked(evt);
            }
        });
        BtnTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTiendasActionPerformed(evt);
            }
        });
        add(BtnTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 700, 310, 140));

        BtnSalir.setBackground(new java.awt.Color(51, 51, 51));
        BtnSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 1000, 130, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoCompraPago.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioMouseClicked

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        inicio.volverEsta();
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnTiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTiendasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTiendasMouseClicked

    private void BtnTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTiendasActionPerformed
        inicio.IniciarInterfazTienda();
    }//GEN-LAST:event_BtnTiendasActionPerformed

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTiendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
