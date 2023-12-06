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
import javax.swing.JOptionPane;
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
    
    public Entrada entrada;
    public Inicio inicio;
    private RegistroPersonal persona;
    public InicioEstacionamiento(Inicio inicio, RegistroPersonal persona) {
        initComponents();
        this.inicio=inicio;
        this.persona=persona;
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
    //le decimos al panel principal que abra las tiendas
    public void Tien(){
        InterfazTienda Tien = new InterfazTienda(inicio);
        inicio.PanelSetter(Tien);
    }
    //Cargamos nodos del txt
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
        LblMatricula = new javax.swing.JLabel();
        TFMatricula = new javax.swing.JTextField();
        TFColor = new javax.swing.JTextField();
        LblColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RBSmall = new javax.swing.JRadioButton();
        RBBann = new javax.swing.JRadioButton();
        RBBike = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        BtnLugar = new javax.swing.JButton();
        LblMarca = new javax.swing.JLabel();
        CBMarcas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
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

        TFCedula.setBackground(new java.awt.Color(105, 178, 178));
        TFCedula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCedulaKeyTyped(evt);
            }
        });
        PDatos.add(TFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 6, 309, 47));

        LblCedula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula.setText("Cédula");
        PDatos.add(LblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        LblCedula1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblCedula1.setText("Nombre");
        PDatos.add(LblCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 142, -1, 53));

        TFNombre.setBackground(new java.awt.Color(105, 178, 178));
        TFNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNombreKeyTyped(evt);
            }
        });
        PDatos.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 142, 309, 53));

        LblApellido.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblApellido.setText("Apellido");
        PDatos.add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 290, -1, 57));

        TFApellido.setBackground(new java.awt.Color(105, 178, 178));
        TFApellido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFApellidoKeyTyped(evt);
            }
        });
        PDatos.add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 290, 309, 49));

        LblMatricula.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMatricula.setText("Matrícula");
        PDatos.add(LblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        TFMatricula.setBackground(new java.awt.Color(105, 178, 178));
        TFMatricula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFMatricula.setMaximumSize(new java.awt.Dimension(14, 40));
        TFMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFMatriculaKeyTyped(evt);
            }
        });
        PDatos.add(TFMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 309, 47));

        TFColor.setBackground(new java.awt.Color(105, 178, 178));
        TFColor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TFColor.setMaximumSize(new java.awt.Dimension(14, 40));
        TFColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFColorKeyTyped(evt);
            }
        });
        PDatos.add(TFColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 320, 50));

        LblColor.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblColor.setText("Color");
        PDatos.add(LblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 56));

        add(PDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 540, 650));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grupo1.add(RBSmall);
        RBSmall.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBSmall.setText("Sedan");
        RBSmall.setOpaque(false);
        RBSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSmallActionPerformed(evt);
            }
        });
        jPanel1.add(RBSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 84, 217, 110));

        Grupo1.add(RBBann);
        RBBann.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBBann.setText("Camioneta");
        RBBann.setOpaque(false);
        RBBann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBannActionPerformed(evt);
            }
        });
        jPanel1.add(RBBann, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, -1, 110));

        Grupo1.add(RBBike);
        RBBike.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        RBBike.setText("Motocicleta");
        RBBike.setOpaque(false);
        RBBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBikeActionPerformed(evt);
            }
        });
        jPanel1.add(RBBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 316, 290, 110));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO DE VEHÍCULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 360, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 360, 455));

        BtnVolver.setBackground(new java.awt.Color(51, 51, 51));
        BtnVolver.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVolver.setLabel("VOLVER");
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
        add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 970, 230, 80));

        BtnLugar.setBackground(new java.awt.Color(51, 51, 51));
        BtnLugar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnLugar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoBoton.jpg"))); // NOI18N
        BtnLugar.setText("SELECCIONAR LUGAR");
        BtnLugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        add(BtnLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 960, 320, 80));

        LblMarca.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblMarca.setText("Marca");
        add(LblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        CBMarcas.setBackground(new java.awt.Color(0, 153, 153));
        CBMarcas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CBMarcas.setForeground(new java.awt.Color(255, 255, 255));
        CBMarcas.setEnabled(false);
        add(CBMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, 510, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costazul/FondoRegistroEstacionamiento.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    
    //Le decimos al panel principal que pase a la siguienet pantalla
    public void Esta(){
        Estacionamiento Esta = new Estacionamiento(this);
        inicio.PanelSetter(Esta);
    }
    
    
    //creamos el archivo enc aso de no existir
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
    //eliminamos el archivo
    private void EliminarArchivo(){
        File registro = new File("./src/costazul/arbol/Parking.txt");
            if (registro.exists()) {
                registro.delete();
                System.out.println("se borro el archivo");
            }
    }
    //Añadimos el nodo al arbol
    public void addVehicle(){
        ArbolVehiculos.raiz=ArbolVehiculos.insertar(ArbolVehiculos.raiz, nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
        ArbolVehiculos.iniciarPreorden(ArbolVehiculos.raiz);
        EliminarArchivo();
        CrearArchivo();
        ArbolVehiculos.Registro(ArbolVehiculos.raiz);
        //////////
        persona.cedula=Integer.parseInt(cedula);
        persona.nombre=nombre;
        persona.apellido=apellido;
        persona.addPerson();
        persona.vehiculo=true;
        ////////////////
        Usuario.apellido=apellido;
        Usuario.cedula=cedula;
        Usuario.colorVehiculo= colorVehiculo;
        Usuario.marcaVehiculo=marcaVehiculo;
        Usuario.matricula=matricula;
        Usuario.nombre=nombre;
        Usuario.puesto=puesto;
        Usuario.seccion=seccion;
        Usuario.tipoDeVehiculo=tipoDeVehiculo;
        Usuario.horaEntrada=horaEntrada;
        Usuario.horaSalida=horaSalida;
    }
    
    
    //añadimos marcas al Combo box
    private void RBSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSmallActionPerformed
        CBMarcas.removeAllItems();
        CBMarcas.addItem("Toyota");
        CBMarcas.addItem("Hyundai");
        CBMarcas.addItem("Chevrolet");
        CBMarcas.addItem("Ford");
        CBMarcas.addItem("Nissan");
        CBMarcas.addItem("Honda");
        CBMarcas.addItem("Volkswagen");
        CBMarcas.addItem("Kia");
        CBMarcas.addItem("Mazda ");
        CBMarcas.addItem("Mercedes-Benz");
        CBMarcas.addItem("Chery");
        CBMarcas.addItem("Reunaul");
        CBMarcas.addItem("Mitsubishi");
        CBMarcas.addItem("Ford");
        CBMarcas.addItem("Tesla");
        CBMarcas.addItem("Ferrari");
        CBMarcas.addItem("Lamborghini");
        CBMarcas.addItem("Volvo");
        CBMarcas.addItem("Alfa Romeo");
        CBMarcas.addItem("Audi");
        CBMarcas.addItem("Subaru");
        CBMarcas.addItem("BMW");
        CBMarcas.addItem("Citroen");
        CBMarcas.addItem("Otro");
        CBMarcas.enable(true);
    }//GEN-LAST:event_RBSmallActionPerformed

    private void BtnLugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLugarMouseClicked
       
    }//GEN-LAST:event_BtnLugarMouseClicked

    private void BtnLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLugarActionPerformed
         
        cedula=TFCedula.getText();
        nombre=TFNombre.getText();
        apellido=TFApellido.getText();
        marcaVehiculo=(String)CBMarcas.getSelectedItem();
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
        
        if (cedula.trim().length() == 0 || nombre.trim().length() == 0 || apellido.trim().length() == 0 || marcaVehiculo.trim().length() == 0 || colorVehiculo.trim().length() == 0){
            //JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            FaltaDeDatos falta = new FaltaDeDatos();
            falta.setLocationRelativeTo(null);
            falta.setResizable(false);
            //falta.setUndecorated(false);
            falta.setVisible(true);
            return;
        }
        Esta();
    }//GEN-LAST:event_BtnLugarActionPerformed

    
    //Verificadores de tecleo
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

    private void TFMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMatriculaKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar()) && (!Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
        if (TFMatricula.getText().length() >= 6) {
            evt.consume();
            return;
        }
    }//GEN-LAST:event_TFMatriculaKeyTyped

    private void TFColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFColorKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_TFColorKeyTyped
//añadimos marcas al Combo box
    private void RBBannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBannActionPerformed
        CBMarcas.removeAllItems();
        CBMarcas.addItem("Ford");
        CBMarcas.addItem("Toyota");
        CBMarcas.addItem("Chevrolet");
        CBMarcas.addItem("Nissan");
        CBMarcas.addItem("Dodge");
        CBMarcas.addItem("Mitsubishi");
        CBMarcas.addItem("Volkswagen");
        CBMarcas.addItem("Hyundai");
        CBMarcas.addItem("Renault ");
        CBMarcas.addItem("Fiat");
        CBMarcas.addItem("Jeep");
        CBMarcas.addItem("Isuzu");
        CBMarcas.addItem("Maxus");
        CBMarcas.addItem("RAM");
        CBMarcas.addItem("Mazda");
        CBMarcas.addItem("Citroen");
        CBMarcas.addItem("Otro");
        CBMarcas.enable(true);
    }//GEN-LAST:event_RBBannActionPerformed
//añadimos marcas al Combo box
    private void RBBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBikeActionPerformed
        CBMarcas.removeAllItems();
        CBMarcas.addItem("Honda");
        CBMarcas.addItem("Yamaha");
        CBMarcas.addItem("BMW");
        CBMarcas.addItem("Piaggio");
        CBMarcas.addItem("Kymco");
        CBMarcas.addItem("Ducati");
        CBMarcas.addItem("Harley-Davidson");
        CBMarcas.addItem("Kawasaki");
        CBMarcas.addItem("Suzuki ");
        CBMarcas.addItem("Triumph1");
        CBMarcas.addItem("Guzzi");
        CBMarcas.addItem("Aprilia");
        CBMarcas.addItem("Benelli");
        CBMarcas.addItem("Bimota");
        CBMarcas.addItem("Brixton");
        CBMarcas.addItem("Can-Am");
        CBMarcas.addItem("CF");
        CBMarcas.addItem("Daelim");
        CBMarcas.addItem("Derbi");
        CBMarcas.addItem("Energica");
        CBMarcas.addItem("Fantic");
        CBMarcas.addItem("Gas Gas");
        CBMarcas.addItem("Hanway");
        CBMarcas.addItem("Husqvarna");
        CBMarcas.addItem("Hyosung");
        CBMarcas.addItem("Keeway");
        CBMarcas.addItem("KTM");
        CBMarcas.addItem("Otro");
        CBMarcas.enable(true);
    }//GEN-LAST:event_RBBikeActionPerformed

    private void BtnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVolverMouseClicked

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        inicio.volverEsta();
        
    }//GEN-LAST:event_BtnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLugar;
    private javax.swing.JButton BtnVolver;
    public javax.swing.JComboBox<String> CBMarcas;
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
    private javax.swing.JTextField TFMatricula;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
