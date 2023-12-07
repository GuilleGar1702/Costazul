/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.awt.Dialog;
import javax.swing.JDialog;

/**
 *
 * @author Guillermo
 */
public class Puesto extends javax.swing.JFrame {

    /**
     * Creates new form FaltaDeDatos
     */
    private Estacionamiento estacionamiento;
    public Puesto(Estacionamiento estacionamiento) {
        initComponents();
        this.estacionamiento = estacionamiento;
    }

    private Puesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVolver = new javax.swing.JButton();
        CBPuesto = new javax.swing.JComboBox<>();
        LblTienda1 = new javax.swing.JLabel();
        LblTienda3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVolver.setBackground(new java.awt.Color(51, 51, 51));
        BtnVolver.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnVolver.setText("ACEPTAR");
        BtnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverMouseClicked(evt);
            }
        });
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 210, 230, 80));

        CBPuesto.setBackground(new java.awt.Color(0, 153, 153));
        CBPuesto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CBPuesto.setForeground(new java.awt.Color(255, 255, 255));
        CBPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        CBPuesto.setBorder(null);
        CBPuesto.setOpaque(false);
        getContentPane().add(CBPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 40));

        LblTienda1.setBackground(new java.awt.Color(0, 0, 0));
        LblTienda1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblTienda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTienda1.setText("ELIJA SU PUESTO");
        getContentPane().add(LblTienda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, 80));

        LblTienda3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LblTienda3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTienda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoRegistroEstacionamiento.jpg"))); // NOI18N
        getContentPane().add(LblTienda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVolverMouseClicked

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        //Aca pones el codigo para que mande la unformacion a la clase estacionamiento, luego se ejecuta el comando para la siguiente pantalla y luego el dispose para cerrar esta
        estacionamiento.EstacionamientoInicio.puesto=Integer.parseInt((String)CBPuesto.getSelectedItem());
        estacionamiento.EstacionamientoInicio.inicio.IniciarInterfazTienda();
        this.dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Puesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    public javax.swing.JComboBox<String> CBPuesto;
    private javax.swing.JLabel LblTienda1;
    private javax.swing.JLabel LblTienda3;
    // End of variables declaration//GEN-END:variables
}