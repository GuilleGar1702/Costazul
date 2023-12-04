/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guillermo
 */
public class InterfazTienda extends javax.swing.JPanel {

    /**
     * Creates new form InterfazTienda
     */
    public ListaTiendas listaTiendas= new ListaTiendas(this);
    private Inicio inicio;
    public InterfazTienda(Inicio inicio) {
        initComponents();
        this.inicio=inicio;
        CBTiendas.removeAllItems();
        for(int i=0;i<3;i++){
            cargarTiendas();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CBTiendas = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIENDAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 46, 1920, 60));

        CBTiendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(CBTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 180, 440, 50));
    }// </editor-fold>//GEN-END:initComponents


    
    public void cargarTiendas() 
    {
        try {
            Path ruta= Paths.get("./src/costazul/Tiendas.txt");
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
    public javax.swing.JComboBox<String> CBTiendas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
