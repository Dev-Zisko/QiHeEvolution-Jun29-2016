/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Persistencia.BeneficiariosXml;
import controller.Controladora;
import dominio.Beneficiario;
import javax.swing.JTable;
import interfaz.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian D
 */
public class VentanaRegistrarBeneficiario extends javax.swing.JFrame {

    Controladora control;
    Beneficiario beneficiariop; 
    ArrayList<Beneficiario> beneficiarios;
    BeneficiariosXml datos = new BeneficiariosXml ();
    String nombreTemporal;
    String nombre = "Nombre Completo:",correo = "Dirección de Correo Electrónico:",telefono = "Numero de Telefono:";
    public VentanaRegistrarBeneficiario() {
        initComponents();
        control = new Controladora (this,panelRegistrar);
        control.IconoVentana(this);
        control.IniciarCursor(this);
        registrar.setVisible(true);
        atras.setVisible(true);
        guardar.setVisible(false);
        
    }

    public VentanaRegistrarBeneficiario(String nombre) {
        initComponents();
        control = new Controladora (this,panelRegistrar);
        control.IconoVentana(this);
        control.IniciarCursor(this);
        control.TraerDatosBeneficiario(nombreBeneficiario,telefonoBeneficiario, correoBeneficiario, fechaRegistro, observacionesBeneficiario, nombre, datos, registrar);
        control.activarDesactivar(true, guardar);
        this.nombreTemporal=nombreBeneficiario.getText();
        
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistrar = new interfaz.personalizados.PanelFondo();
        nombreBeneficiario = new javax.swing.JTextField();
        telefonoBeneficiario = new javax.swing.JTextField();
        correoBeneficiario = new javax.swing.JTextField();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        registrar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionesBeneficiario = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Beneficiario");
        getContentPane().setLayout(new java.awt.CardLayout());

        nombreBeneficiario.setText("Nombre Completo:");
        nombreBeneficiario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreBeneficiarioFocusLost(evt);
            }
        });
        nombreBeneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreBeneficiarioKeyTyped(evt);
            }
        });

        telefonoBeneficiario.setText("Numero de Telefono:");
        telefonoBeneficiario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoBeneficiarioFocusLost(evt);
            }
        });
        telefonoBeneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoBeneficiarioKeyTyped(evt);
            }
        });

        correoBeneficiario.setText("Dirección de Correo Electrónico:");
        correoBeneficiario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoBeneficiarioFocusLost(evt);
            }
        });
        correoBeneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoBeneficiarioKeyTyped(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(51, 153, 0));
        registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.setBorder(null);
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        atras.setBackground(new java.awt.Color(51, 153, 0));
        atras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atrás");
        atras.setBorder(null);
        atras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        fecha.setText("Seleccione la Fecha de ingreso del beneficiario:");

        observacionesBeneficiario.setColumns(20);
        observacionesBeneficiario.setRows(5);
        jScrollPane1.setViewportView(observacionesBeneficiario);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel1.setText("Observaciones:");

        guardar.setBackground(new java.awt.Color(51, 153, 0));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar Cambios");
        guardar.setBorder(null);
        guardar.setEnabled(false);
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoBeneficiario)
                    .addComponent(nombreBeneficiario)
                    .addComponent(correoBeneficiario)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addComponent(nombreBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarLayout.createSequentialGroup()
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(panelRegistrar, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.tablaBeneficiarios.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {"Nombre", "Correo", "Teléfono", "Fecha de Ingreso"}){public boolean isCellEditable(int row, int column){return false;}});
        control.LlenarTablaBeneficiarios(ventana.tablaBeneficiarios, datos.todosLosBeneficiarios());
        control.ActivarVentana(ventana,this);
    }//GEN-LAST:event_atrasMouseClicked

    private void nombreBeneficiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreBeneficiarioKeyTyped
        control.EscribirTextfield(nombreBeneficiario, nombre);
       // control.ValidarLetras(evt);
    }//GEN-LAST:event_nombreBeneficiarioKeyTyped

    private void telefonoBeneficiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoBeneficiarioKeyTyped
         control.EscribirTextfield(telefonoBeneficiario, telefono);
        // control.ValidarEntero(evt);
    }//GEN-LAST:event_telefonoBeneficiarioKeyTyped

    private void correoBeneficiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoBeneficiarioKeyTyped
         control.EscribirTextfield(correoBeneficiario, correo);
         
    }//GEN-LAST:event_correoBeneficiarioKeyTyped

    private void nombreBeneficiarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreBeneficiarioFocusLost
       control.VacioTextfield(nombreBeneficiario, nombre);
       if(control.validarNombres(nombreBeneficiario.getText())!=true && !nombreBeneficiario.getText().equals(nombre)){ //Si el nombre  no es valido o es el texto predeterminado
            JOptionPane.showMessageDialog(this, "Formato de Nombre invalido. Ingrese nuevamente.");
            control.BorrarTextfield(nombreBeneficiario);
            control.VacioTextfield(nombreBeneficiario, nombre);
            nombreBeneficiario.grabFocus();
         }
    }//GEN-LAST:event_nombreBeneficiarioFocusLost

    private void telefonoBeneficiarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoBeneficiarioFocusLost
        control.VacioTextfield(telefonoBeneficiario, telefono);
         if(control.validarTelefono(telefonoBeneficiario.getText())!=true && !telefonoBeneficiario.getText().equals(telefono) ){ //Si el telefono  no es valido o es el texto predeterminado
            JOptionPane.showMessageDialog(this, "Formato de telefono invalido. Ingrese nuevamente.");
            control.BorrarTextfield(telefonoBeneficiario);
            control.VacioTextfield(telefonoBeneficiario, telefono);
            telefonoBeneficiario.grabFocus();
         }
    }//GEN-LAST:event_telefonoBeneficiarioFocusLost

    private void correoBeneficiarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoBeneficiarioFocusLost
        control.VacioTextfield(correoBeneficiario, correo);
        if(control.validarEmail(correoBeneficiario.getText())!=true && !correoBeneficiario.getText().equals(correo)){ //Si la direccion de correo no es valida
            JOptionPane.showMessageDialog(this, "Correo invalido.");
            control.BorrarTextfield(correoBeneficiario);
            control.VacioTextfield(correoBeneficiario, correo);
            correoBeneficiario.grabFocus();
             
        }
    }//GEN-LAST:event_correoBeneficiarioFocusLost

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        control.GuardarBeneficiario(nombreTemporal,nombreBeneficiario,telefonoBeneficiario,correoBeneficiario,fechaRegistro,observacionesBeneficiario, datos);
        control.activarDesactivar(true, registrar);
        control.activarDesactivar(false, guardar);
        VentanaPrincipal ventana = new VentanaPrincipal();
        control.ActivarVentana(ventana, this);
    }//GEN-LAST:event_guardarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        boolean x = control.ValidarFecha(fechaRegistro);
     
       if(x==false){ 
              if( control.ValidarRegistroBeneficiario(this, nombreBeneficiario, telefonoBeneficiario, correoBeneficiario, fechaRegistro)){
                beneficiariop= new Beneficiario(control.ValidarMayusculas(nombreBeneficiario.getText()), telefonoBeneficiario.getText(),correoBeneficiario.getText() ,observacionesBeneficiario.getText() ,fechaRegistro.getDate() ); 
           
                if(datos.agregarBeneficiario(beneficiariop)==true){
                    control.ActualizarListaBeneficiarios(beneficiariop);     
                    control.RestablecerCamposBeneficiario(nombreBeneficiario, correoBeneficiario, telefonoBeneficiario, observacionesBeneficiario, fechaRegistro);
                } 
                else
                    JOptionPane.showMessageDialog(null, "Pesona ya existente. No se ha registro.");   
              
              
            }
            else{
              JOptionPane.showMessageDialog(this, "Rellene los campos correctamente.");
           }
       }
       
     
    }//GEN-LAST:event_registrarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrarBeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarBeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarBeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarBeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarBeneficiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField correoBeneficiario;
    private javax.swing.JLabel fecha;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreBeneficiario;
    private javax.swing.JTextArea observacionesBeneficiario;
    private interfaz.personalizados.PanelFondo panelRegistrar;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField telefonoBeneficiario;
    // End of variables declaration//GEN-END:variables
}
