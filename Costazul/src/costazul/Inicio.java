package costazul;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Guillermo
 */
public class Inicio extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
    public Inicio() {
        this.setContentPane(fondo);
        setResizable(false);
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        InicioEntrada();
        IniciarTiendas();
    }
    
    
    public void InicioEntrada(){
        System.out.println(new File(".").getAbsolutePath());
        Entrada entrada = new Entrada(this);
        PanelSetter(entrada);
    }
    
    
    public void InicioEsta(){
        InicioEstacionamiento inicioEsta = new InicioEstacionamiento(this);
        PanelSetter(inicioEsta);
    }
    
    public void IniciarTiendas(){
        try {
            Tiendas tiendas = new Tiendas();
            tiendas.cargarTiendas();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PanelSetter(JPanel panel){
        panel.setSize(1920, 1080);
        panel.setLocation(0, 0);
        PanelContenido.removeAll();
        PanelContenido.add(panel, BorderLayout.CENTER);
        PanelContenido.revalidate();
        PanelContenido.repaint();
        PanelContenido.setOpaque(false);
        panel.setOpaque(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        PanelContenido.setMaximumSize(new java.awt.Dimension(1920, 1080));
        PanelContenido.setMinimumSize(new java.awt.Dimension(1920, 1080));
        PanelContenido.setPreferredSize(new java.awt.Dimension(1920, 1080));
        PanelContenido.setLayout(new javax.swing.BoxLayout(PanelContenido, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    // End of variables declaration//GEN-END:variables

    
    class Fondo extends JPanel{
        private Image ca;
        public void paint (Graphics grafico){
            ca = new ImageIcon(getClass().getResource("fondo.png")).getImage();
            grafico.drawImage(ca, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(grafico);
        }
    }
    
    
}
