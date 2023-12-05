/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.io.IOException;


import costazul.arbol.ArbolPersona;
import costazul.arbol.NodoPersona;
import java.io.File;
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
public class RegistroPersonal extends javax.swing.JPanel {

    /**
     * Creates new form InicioEstacionamiento
     */
    public String nombre;
    public String apellido;
    public int cedula;
    public boolean vehiculo=false;
    
    public ArbolPersona ArbolPersonas = new ArbolPersona();
    
    private Inicio inicio;
    public RegistroPersonal(Inicio inicio) {
        initComponents();
        this.inicio=inicio;
        CrearArchivoPersona();
        cargarNodos();
        //ArbolPersonas.iniciarPreorden(ArbolPersonas.raiz);
        //EliminarArchivo();
        System.out.println("-----------------------------------------------------------------");
        ArbolPersonas.iniciarPreorden(ArbolPersonas.raiz);
        //ArbolPersonas.borrar(10);
        //RefrescarEliminacion();
    }
    
    
    
    private void RefrescarEliminacion(){
        EliminarArchivoPersona();
        CrearArchivoPersona();
        ArbolPersonas.Registro(ArbolPersonas.raiz);
    }
    
    
    //Cargamos los nodos guardados en el txt
    public void cargarNodos(){
        try {
            Path ruta= Paths.get("./src/costazul/arbol/Personas.txt");
            List<String> listaPajuaTiendas=Files.readAllLines(ruta);
            String[] xd= new String[listaPajuaTiendas.size()];
            listaPajuaTiendas.toArray(xd);
            //nodo.cedula+"-"+nodo.nombre+"-"+nodo.apellido
            for (String x:xd){
                String[] atributos = x.split("-");
                nombre=atributos[1];
                apellido=atributos[2];
                cedula=Integer.parseInt(atributos[0]);
                ArbolPersonas.raiz=ArbolPersonas.insertar(ArbolPersonas.raiz, nombre, apellido, cedula);
                ArbolPersonas.iniciarPreorden(ArbolPersonas.raiz);
            }
        } catch (IOException ex) {
            Logger.getLogger(InicioEstacionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        LblTitulo = new javax.swing.JLabel();
        PDatos = new javax.swing.JPanel();
        TFCedula = new javax.swing.JTextField();
        LblCedula = new javax.swing.JLabel();
        LblCedula1 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        LblApellido = new javax.swing.JLabel();
        TFApellido = new javax.swing.JTextField();
        BtnRegistrarse = new javax.swing.JButton();
        CBTiendas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("REGISTRO PERSONAL");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1920, -1));

        PDatos.setOpaque(false);
        PDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFCedula.setBackground(new java.awt.Color(105, 178, 178));
        TFCedula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCedulaKeyTyped(evt);
            }
        });
        PDatos.add(TFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 5, 300, 50));

        LblCedula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula.setText("Cédula");
        PDatos.add(LblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        LblCedula1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula1.setText("Nombre");
        PDatos.add(LblCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 145, -1, 53));

        TFNombre.setBackground(new java.awt.Color(105, 178, 178));
        TFNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNombreKeyTyped(evt);
            }
        });
        PDatos.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 145, 300, 50));

        LblApellido.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblApellido.setText("Apellido");
        PDatos.add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 285, -1, 57));

        TFApellido.setBackground(new java.awt.Color(105, 178, 178));
        TFApellido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFApellidoKeyTyped(evt);
            }
        });
        PDatos.add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, 300, 50));

        add(PDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 540, 350));

        BtnRegistrarse.setBackground(new java.awt.Color(51, 51, 51));
        BtnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnRegistrarse.setText("REGISTRARSE");
        BtnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarseMouseClicked(evt);
            }
        });
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 960, 320, 80));

        CBTiendas.setBackground(new java.awt.Color(0, 153, 153));
        CBTiendas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CBTiendas.setForeground(new java.awt.Color(255, 255, 255));
        CBTiendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palmera", "Roble", "Mangle", "Samán", "Guayacán", "Bambú" }));
        CBTiendas.setBorder(null);
        CBTiendas.setOpaque(false);
        add(CBTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 810, 510, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoRegistroPersonal.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    public void Tien(){
        InterfazTienda Tien = new InterfazTienda(inicio);
        inicio.PanelSetter(Tien);
    }
    
    //Creamos el archivo en caso de no existir
    private void CrearArchivoPersona(){
        File registro = new File("./src/costazul/arbol/Personas.txt");
            if (!registro.exists()) {
                try {
                    registro.createNewFile();
                    System.out.println("se creo el archivo");
                } catch (IOException ex) {
                    Logger.getLogger(InicioEstacionamiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    //Eliminamos el archivo
    private void EliminarArchivoPersona(){
        File registro = new File("./src/costazul/arbol/Personas.txt");
            if (registro.exists()) {
                registro.delete();
                System.out.println("se borro el archivo");
            }
    }
    
    
    //Añadimos el nodo al arbol
    public void addPerson(){
        ArbolPersonas.raiz=ArbolPersonas.insertar(ArbolPersonas.raiz, nombre, apellido, cedula);
        ArbolPersonas.iniciarPreorden(ArbolPersonas.raiz);
        EliminarArchivoPersona();
        CrearArchivoPersona();
        ArbolPersonas.Registro(ArbolPersonas.raiz);
        
    }
    
    
    private void BtnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarseMouseClicked
       
    }//GEN-LAST:event_BtnRegistrarseMouseClicked

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
         //guardamos los cambios y pasamos a la siguiente pantalla
        cedula=Integer.parseInt(TFCedula.getText());
        nombre=TFNombre.getText();
        apellido=TFApellido.getText();
        addPerson();
        
        inicio.apellido=apellido;
        inicio.nombre=nombre;
        inicio.cedula=String.valueOf(cedula);
        
        Tien();
    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    
    //estos son los verificadores de tecleo
    private void TFCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCedulaKeyTyped
        if (TFCedula.getText().length() >= 8) {
            evt.consume();
            return;
        }
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_TFCedulaKeyTyped

    private void TFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNombreKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_TFNombreKeyTyped

    private void TFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFApellidoKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_TFApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrarse;
    public javax.swing.JComboBox<String> CBTiendas;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCedula;
    private javax.swing.JLabel LblCedula1;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PDatos;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTextField TFCedula;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
