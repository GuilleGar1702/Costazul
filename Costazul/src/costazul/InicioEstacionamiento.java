/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.io.IOException;


import costazul.arbol.ArbolEstacionamiento;
import costazul.arbol.NodoArbol;
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
public class InicioEstacionamiento extends javax.swing.JPanel {

    /**
     * Creates new form InicioEstacionamiento
     */
    String nombre;
    String apellido;
    String cedula;
    String matricula;
    String tipoDeVehiculo;
    String marcaVehiculo;
    String colorVehiculo;
    String horaEntrada;
    String horaSalida;
    public char seccion;
    public int puesto;
    
    //public ListaEstacionamiento listaVehiculos=new ListaEstacionamiento();
    public ArbolEstacionamiento ArbolVehiculos = new ArbolEstacionamiento();
    
    private Inicio inicio;
    public InicioEstacionamiento(Inicio inicio) {
        initComponents();
        this.inicio=inicio;
        CrearArchivo();
        cargarNodos();
        //ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
        //EliminarArchivo();
        System.out.println("-----------------------------------------------------------------");
        ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
        //ArbolVehiculos.borrar(10);
        //RefrescarEliminacion();
    }
    
    
    private void RefrescarEliminacion(){
        EliminarArchivo();
        CrearArchivo();
        ArbolVehiculos.Registro(ArbolVehiculos.raiz);
    }
    
    

    public void cargarNodos(){
        try {
            Path ruta= Paths.get("./src/costazul/arbol/Parking.txt");
            List<String> listaPajuaTiendas=Files.readAllLines(ruta);
            String[] xd= new String[listaPajuaTiendas.size()];
            listaPajuaTiendas.toArray(xd);
            //nodo.puesto+"-"+nodo.seccion+"-"+nodo.nombre+"-"+nodo.apellido+"-"+nodo.cedula+"-"+nodo.colorVehiculo+"-"+nodo.marcaVehiculo+"-"+nodo.matricula+"-"+nodo.horaEntrada+"-"+nodo.horaSalida+"-"+nodo.tipoDeVehiculo+"\n";
            for (String x:xd){
                String[] atributos = x.split("-");
                nombre=atributos[2];
                apellido=atributos[3];
                cedula=atributos[4];
                matricula=atributos[7];
                tipoDeVehiculo=atributos[10];
                marcaVehiculo=atributos[6];
                colorVehiculo=atributos[5];
                horaEntrada=atributos[8];
                horaSalida=atributos[9];
                seccion=atributos[1].charAt(0);
                puesto=Integer.parseInt(atributos[0]);
                ArbolVehiculos.raiz=ArbolVehiculos.insertar(ArbolVehiculos.raiz, nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
                ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
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
        LblMarca = new javax.swing.JLabel();
        TFMarca = new javax.swing.JTextField();
        LblMatricula = new javax.swing.JLabel();
        TFMatricula = new javax.swing.JTextField();
        TFColor = new javax.swing.JTextField();
        LblColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RBSmall = new javax.swing.JRadioButton();
        RBBann = new javax.swing.JRadioButton();
        RBBike = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        BtnLugar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("REGISTRO DE ESTACIONAMIENTO");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1920, -1));

        PDatos.setOpaque(false);
        PDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFCedula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PDatos.add(TFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 6, 309, 47));

        LblCedula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula.setText("Cédula");
        PDatos.add(LblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        LblCedula1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula1.setText("Nombre");
        PDatos.add(LblCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 142, -1, 53));

        TFNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PDatos.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 142, 309, 53));

        LblApellido.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblApellido.setText("Apellido");
        PDatos.add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 290, -1, 57));

        TFApellido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PDatos.add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 290, 309, 49));

        LblMarca.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMarca.setText("Marca");
        PDatos.add(LblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 439, -1, -1));

        TFMarca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PDatos.add(TFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 444, 309, 47));

        LblMatricula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMatricula.setText("Matrícula");
        PDatos.add(LblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 571, -1, -1));

        TFMatricula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFMatricula.setMaximumSize(new java.awt.Dimension(14, 40));
        PDatos.add(TFMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 576, 309, 47));

        TFColor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFColor.setMaximumSize(new java.awt.Dimension(14, 40));
        PDatos.add(TFColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 320, 50));

        LblColor.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblColor.setText("Color");
        PDatos.add(LblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 696, -1, 56));

        add(PDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 540, 780));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grupo1.add(RBSmall);
        RBSmall.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBSmall.setText("Sedan");
        RBSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSmallActionPerformed(evt);
            }
        });
        jPanel1.add(RBSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 84, 217, 110));

        Grupo1.add(RBBann);
        RBBann.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBBann.setText("Camioneta");
        jPanel1.add(RBBann, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, -1, 110));

        Grupo1.add(RBBike);
        RBBike.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBBike.setText("Motocicleta");
        jPanel1.add(RBBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 316, 290, 110));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO DE VEHÍCULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 360, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 390, 360, 455));

        BtnLugar.setBackground(new java.awt.Color(51, 51, 51));
        BtnLugar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnLugar.setText("SELECCIONAR LUGAR");
        BtnLugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLugarMouseClicked(evt);
            }
        });
        BtnLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLugarActionPerformed(evt);
            }
        });
        add(BtnLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 850, 320, 80));
    }// </editor-fold>//GEN-END:initComponents

    public void Esta(){
        Estacionamiento Esta = new Estacionamiento(this);
        inicio.PanelSetter(Esta);
    }
    
    private void CrearArchivo(){
        File registro = new File("./src/costazul/arbol/Parking.txt");
            if (!registro.exists()) {
                try {
                    registro.createNewFile();
                    System.out.println("se creo el archivo");
                } catch (IOException ex) {
                    Logger.getLogger(InicioEstacionamiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    private void EliminarArchivo(){
        File registro = new File("./src/costazul/arbol/Parking.txt");
            if (registro.exists()) {
                registro.delete();
                System.out.println("se borro el archivo");
            }
    }
    
    public void addVehicle(){
        ArbolVehiculos.raiz=ArbolVehiculos.insertar(ArbolVehiculos.raiz, nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
        ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
        EliminarArchivo();
        CrearArchivo();
        ArbolVehiculos.Registro(ArbolVehiculos.raiz);
        
    }
    
    private void RBSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBSmallActionPerformed

    private void BtnLugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLugarMouseClicked
        cedula=TFCedula.getText();
        nombre=TFNombre.getText();
        apellido=TFApellido.getText();
        marcaVehiculo=TFMarca.getText();
        matricula=TFMatricula.getText();
        colorVehiculo=TFColor.getText();
        if(RBSmall.isSelected()==true){
            tipoDeVehiculo="Sedan";
        }else if(RBBann.isSelected()==true){
            tipoDeVehiculo="Camioneta";
        }else if(RBBike.isSelected()==true){
            tipoDeVehiculo="Motocicleta";
        }else{
            tipoDeVehiculo="Sedan";
        }
        Esta();
    }//GEN-LAST:event_BtnLugarMouseClicked

    private void BtnLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLugar;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCedula;
    private javax.swing.JLabel LblCedula1;
    private javax.swing.JLabel LblColor;
    private javax.swing.JLabel LblMarca;
    private javax.swing.JLabel LblMatricula;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PDatos;
    private javax.swing.JRadioButton RBBann;
    private javax.swing.JRadioButton RBBike;
    private javax.swing.JRadioButton RBSmall;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTextField TFCedula;
    private javax.swing.JTextField TFColor;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFMatricula;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
