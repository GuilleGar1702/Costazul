/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Guillermo
 */
public class Estacionamiento extends javax.swing.JPanel {

    /**
     * Creates new form Estacionamiento
     */
    LocalDateTime dataTime =  LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
    String entrada = dataTime.format(format);
    private InicioEstacionamiento EstacionamientoInicio;
    public Estacionamiento(InicioEstacionamiento EstacionamientoInicio) {
        initComponents();
        this.EstacionamientoInicio=EstacionamientoInicio;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seccionF = new javax.swing.JLabel();
        seccionE = new javax.swing.JLabel();
        seccionD = new javax.swing.JLabel();
        seccionB = new javax.swing.JLabel();
        seccionC = new javax.swing.JLabel();
        TFPuesto = new javax.swing.JTextField();
        seccionA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblPuesto = new javax.swing.JLabel();
        LblSalida = new javax.swing.JLabel();
        CBSalida = new javax.swing.JComboBox<>();
        LblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion f peque.png"))); // NOI18N
        seccionF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionFMouseExited(evt);
            }
        });
        add(seccionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 240, -1, -1));

        seccionE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion e peque.png"))); // NOI18N
        seccionE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionEMouseExited(evt);
            }
        });
        add(seccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 570, -1, -1));

        seccionD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion d peque.png"))); // NOI18N
        seccionD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionDMouseExited(evt);
            }
        });
        add(seccionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, -1, -1));

        seccionB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion b peque.png"))); // NOI18N
        seccionB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionBMouseExited(evt);
            }
        });
        add(seccionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        seccionC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion c peque.png"))); // NOI18N
        seccionC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionCMouseExited(evt);
            }
        });
        add(seccionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, 160));

        TFPuesto.setBackground(new java.awt.Color(105, 178, 178));
        TFPuesto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPuestoActionPerformed(evt);
            }
        });
        TFPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFPuestoKeyTyped(evt);
            }
        });
        add(TFPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 880, 555, 40));

        seccionA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/seccion a chico.png"))); // NOI18N
        seccionA.setText("jLabel4");
        seccionA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionAMouseExited(evt);
            }
        });
        add(seccionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/visuals/costa azul peque.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        LblPuesto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblPuesto.setText("Puesto");
        add(LblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, -1, 50));

        LblSalida.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblSalida.setText("Salida");
        add(LblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 930, -1, 50));

        CBSalida.setBackground(new java.awt.Color(0, 153, 153));
        CBSalida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CBSalida.setForeground(new java.awt.Color(255, 255, 255));
        CBSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        CBSalida.setBorder(null);
        CBSalida.setOpaque(false);
        add(CBSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 940, 560, 40));

        LblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("ELIJA SU UBICACIÓN");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1920, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoEstacionamiento.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void seccionAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionAMouseEntered
        ImageIcon icon = new ImageIcon("./src/costazul/visuals/rellenoaa.png");
        seccionA.setIcon(icon);
    }//GEN-LAST:event_seccionAMouseEntered

    private void seccionAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionAMouseExited
        ImageIcon icon = new ImageIcon("./src/costazul/visuals/seccionachico.png");
        seccionA.setIcon(icon);
    }//GEN-LAST:event_seccionAMouseExited

    private void seccionAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionAMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon icon = new ImageIcon("./src/costazul/visuals/seccionachico.png");
        seccionA.setIcon(icon);
        EstacionamientoInicio.seccion='A';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= dataTime.format(format);
        EstacionamientoInicio.horaSalida= (String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
        
    }//GEN-LAST:event_seccionAMouseClicked

    private void TFPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPuestoActionPerformed

    private void seccionDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionDMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon icond = new ImageIcon("./src/costazul/visuals/secciondpeque.png");
        seccionD.setIcon(icond);
        EstacionamientoInicio.seccion='D';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= entrada;
        EstacionamientoInicio.horaSalida= (String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
    }//GEN-LAST:event_seccionDMouseClicked

    private void seccionDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionDMouseEntered
        ImageIcon icond = new ImageIcon("./src/costazul/visuals/rellenod.png");
        seccionD.setIcon(icond);
    }//GEN-LAST:event_seccionDMouseEntered

    private void seccionDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionDMouseExited
        ImageIcon icond = new ImageIcon("./src/costazul/visuals/secciondpeque.png");
        seccionD.setIcon(icond);
    }//GEN-LAST:event_seccionDMouseExited

    private void seccionFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionFMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon iconf = new ImageIcon("./src/costazul/visuals/seccionfpeque.png");
        seccionF.setIcon(iconf);
        EstacionamientoInicio.seccion='F';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= entrada;
        EstacionamientoInicio.horaSalida= (String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
    }//GEN-LAST:event_seccionFMouseClicked

    private void seccionFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionFMouseEntered
        ImageIcon iconf = new ImageIcon("./src/costazul/visuals/rellenof.png");
        seccionF.setIcon(iconf);
    }//GEN-LAST:event_seccionFMouseEntered

    private void seccionFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionFMouseExited
        ImageIcon iconf = new ImageIcon("./src/costazul/visuals/seccionfpeque.png");
        seccionF.setIcon(iconf);
    }//GEN-LAST:event_seccionFMouseExited

    private void seccionBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionBMouseExited
        ImageIcon iconb = new ImageIcon("./src/costazul/visuals/seccionbpeque.png");
        seccionB.setIcon(iconb);
    }//GEN-LAST:event_seccionBMouseExited

    private void seccionBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionBMouseEntered
        ImageIcon iconb = new ImageIcon("./src/costazul/visuals/rellenob.png");
        seccionB.setIcon(iconb);
    }//GEN-LAST:event_seccionBMouseEntered

    private void seccionBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionBMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon iconb = new ImageIcon("./src/costazul/visuals/seccionbpeque.png");
        seccionB.setIcon(iconb);
        EstacionamientoInicio.seccion='B';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= entrada;
        EstacionamientoInicio.horaSalida= (String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
    }//GEN-LAST:event_seccionBMouseClicked

    private void seccionEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionEMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon icone = new ImageIcon("./src/costazul/visuals/seccionepeque.png");
        seccionE.setIcon(icone);
        EstacionamientoInicio.seccion='E';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= entrada;
        EstacionamientoInicio.horaSalida= (String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
    }//GEN-LAST:event_seccionEMouseClicked

    private void seccionEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionEMouseEntered
        ImageIcon icone = new ImageIcon("./src/costazul/visuals/rellenoe.png");
        seccionE.setIcon(icone);
    }//GEN-LAST:event_seccionEMouseEntered

    private void seccionEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionEMouseExited
        ImageIcon icone = new ImageIcon("./src/costazul/visuals/seccionepeque.png");
        seccionE.setIcon(icone);
    }//GEN-LAST:event_seccionEMouseExited

    private void seccionCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionCMouseClicked
        String pue = TFPuesto.getText();
        if (EstacionamientoInicio.horaSalida.trim().length() == 0 || pue.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");            
        }else{
        ImageIcon iconc = new ImageIcon("./src/costazul/visuals/seccioncpeque.png");
        seccionC.setIcon(iconc);
        EstacionamientoInicio.seccion='C';
        EstacionamientoInicio.puesto=Integer.parseInt(TFPuesto.getText());
        EstacionamientoInicio.horaEntrada= entrada;
        EstacionamientoInicio.horaSalida=(String)CBSalida.getSelectedItem();
        EstacionamientoInicio.addVehicle();
        EstacionamientoInicio.Tien();
        }
    }//GEN-LAST:event_seccionCMouseClicked

    private void seccionCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionCMouseEntered
        ImageIcon iconc = new ImageIcon("./src/costazul/visuals/rellenoc.png");
        seccionC.setIcon(iconc);
    }//GEN-LAST:event_seccionCMouseEntered

    private void seccionCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionCMouseExited
        ImageIcon iconc = new ImageIcon("./src/costazul/visuals/seccioncpeque.png");
        seccionC.setIcon(iconc);
    }//GEN-LAST:event_seccionCMouseExited

    private void TFPuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPuestoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if (!TFPuesto.getText().equalsIgnoreCase("")){
            if (Integer.parseInt(TFPuesto.getText())>249){
                TFPuesto.setText("");
            }
        }
            
    }//GEN-LAST:event_TFPuestoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CBSalida;
    private javax.swing.JLabel LblPuesto;
    private javax.swing.JLabel LblSalida;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTextField TFPuesto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel seccionA;
    private javax.swing.JLabel seccionB;
    private javax.swing.JLabel seccionC;
    private javax.swing.JLabel seccionD;
    private javax.swing.JLabel seccionE;
    private javax.swing.JLabel seccionF;
    // End of variables declaration//GEN-END:variables
}
