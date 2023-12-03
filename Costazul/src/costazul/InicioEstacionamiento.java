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
        EliminarArchivo();
        System.out.println("-----------------------------------------------------------------");
        ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
    }

    public void cargarNodos(){
        try {
            Path ruta= Paths.get("F:\\Users\\Guillermo\\Documents\\Universidad\\Estructura de Datos\\Proyectos\\Costaazul\\Costazul\\Costazul\\src\\costazul\\arbol\\Parking.txt");
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
                colorVehiculo=atributos[4];
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
        LblTitulo.setText("Registro de Estacionamiento");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1920, -1));

        TFCedula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        LblCedula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula.setText("Cédula");

        LblCedula1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula1.setText("Nombre");

        TFNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        LblApellido.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblApellido.setText("Apellido");

        TFApellido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        LblMarca.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMarca.setText("Marca");

        TFMarca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        LblMatricula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMatricula.setText("Matrícula");

        TFMatricula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        TFColor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        LblColor.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblColor.setText("Color");

        javax.swing.GroupLayout PDatosLayout = new javax.swing.GroupLayout(PDatos);
        PDatos.setLayout(PDatosLayout);
        PDatosLayout.setHorizontalGroup(
            PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDatosLayout.createSequentialGroup()
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PDatosLayout.createSequentialGroup()
                                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblCedula)
                                    .addComponent(LblCedula1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(TFCedula)))
                            .addGroup(PDatosLayout.createSequentialGroup()
                                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblApellido)
                                    .addComponent(LblMarca)
                                    .addComponent(LblMatricula))
                                .addGap(46, 46, 46)
                                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(TFMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TFMatricula, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(PDatosLayout.createSequentialGroup()
                        .addComponent(LblColor)
                        .addGap(115, 115, 115)
                        .addComponent(TFColor)))
                .addContainerGap())
        );
        PDatosLayout.setVerticalGroup(
            PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFCedula)
                    .addComponent(LblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblCedula1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(TFNombre))
                .addGap(95, 95, 95)
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMarca)
                    .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMatricula)
                    .addComponent(TFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(PDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        add(PDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 251, -1, -1));

        Grupo1.add(RBSmall);
        RBSmall.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        RBSmall.setText("Pequeño");
        RBSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSmallActionPerformed(evt);
            }
        });

        Grupo1.add(RBBann);
        RBBann.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        RBBann.setText("Camioneta");

        Grupo1.add(RBBike);
        RBBike.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        RBBike.setText("Moto");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO DE VEHÍCULO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RBBike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RBBann, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RBSmall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RBSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBBann, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBBike, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 385, -1, 455));

        BtnLugar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
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
        add(BtnLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 846, 702, 172));
    }// </editor-fold>//GEN-END:initComponents

    public void Esta(){
        Estacionamiento Esta = new Estacionamiento(this);
        inicio.PanelSetter(Esta);
    }
    
    private void CrearArchivo(){
        File registro = new File("F:\\Users\\Guillermo\\Documents\\Universidad\\Estructura de Datos\\Proyectos\\Costaazul\\Costazul\\Costazul\\src\\costazul\\arbol\\Parking.txt");
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
        File registro = new File("F:\\Users\\Guillermo\\Documents\\Universidad\\Estructura de Datos\\Proyectos\\Costaazul\\Costazul\\Costazul\\src\\costazul\\arbol\\Parking.txt");
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
