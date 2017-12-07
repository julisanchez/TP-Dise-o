/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DTO.bedelDTO;
import Logica.gestorUsuario;
import javax.swing.JOptionPane;


/**
 *
 * @author Alexis Mandracchia
 */
public class registrarBedel extends javax.swing.JFrame{

    /**
     * Creates new form menuBedel
     */
    public registrarBedel() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.vacioApellido.setVisible(false);
        this.vacioNombres.setVisible(false);
        this.vacioUsuario.setVisible(false);
        this.vacioPass.setVisible(false);
        this.vacioConfPass.setVisible(false);
        this.creando.setVisible(false);
    }
 
    
    private boolean validaDatos(String sApellido, String sNombres, String sUsuario, String sPass, String sConfPass, String sTurno){
        boolean vacio=false;
        if(sNombres.equals("")){
            this.vacioNombres.setVisible(true);
            vacio=true;
        }
        else{
            this.vacioNombres.setVisible(false);
        }
        if(sApellido.equals("")){
            this.vacioApellido.setVisible(true);
            vacio=true;
        }
        else{
            this.vacioApellido.setVisible(false);
        }
        if(sUsuario.equals("")){
            this.vacioUsuario.setVisible(true);
            vacio=true;
        }else{
            this.vacioUsuario.setVisible(false);
        }
        if(sPass.equals("")){
            this.vacioPass.setVisible(true);
            vacio=true;
        }else{
            this.vacioPass.setVisible(false);
        }
        if(sConfPass.equals("")){
            this.vacioConfPass.setVisible(true);
            vacio=true;
        }else{
            this.vacioConfPass.setVisible(false);
        }
        if(sTurno.equals("")){
            vacio=true;
        }
        
        if(vacio){
             JOptionPane.showMessageDialog(null,"Apa... dejaste campos vacios.","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
        if(!sPass.equals(sConfPass)){
            vacio=true;
            this.vacioPass.setVisible(true);
            this.vacioConfPass.setVisible(true);
            JOptionPane.showMessageDialog(null,"Los campos de contraseña no coinciden","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }else{
            this.vacioConfPass.setVisible(false);
            this.vacioPass.setVisible(false);
        }
        
        return vacio;
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
        logoUTN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        apellidoText = new javax.swing.JTextField();
        nombresText = new javax.swing.JTextField();
        turnoCombo = new javax.swing.JComboBox<>();
        usuarioText = new javax.swing.JTextField();
        pwText = new javax.swing.JPasswordField();
        pwConfirText = new javax.swing.JPasswordField();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        vacioApellido = new javax.swing.JLabel();
        vacioNombres = new javax.swing.JLabel();
        vacioUsuario = new javax.swing.JLabel();
        vacioPass = new javax.swing.JLabel();
        vacioConfPass = new javax.swing.JLabel();
        creando = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Bedel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 230, 40));

        logoUTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoUTN_200px.png"))); // NOI18N
        getContentPane().add(logoUTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese los datos del nuevo Bedel:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmar contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, 20));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombres:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre de usuario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        apellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextActionPerformed(evt);
            }
        });
        apellidoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoTextKeyTyped(evt);
            }
        });
        getContentPane().add(apellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 270, -1));

        nombresText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresTextKeyTyped(evt);
            }
        });
        getContentPane().add(nombresText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, -1));

        turnoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Tarde-Noche", "Noche" }));
        getContentPane().add(turnoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        usuarioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTextKeyTyped(evt);
            }
        });
        getContentPane().add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 200, -1));

        pwText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwTextActionPerformed(evt);
            }
        });
        pwText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwTextKeyTyped(evt);
            }
        });
        getContentPane().add(pwText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, -1));

        pwConfirText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwConfirTextActionPerformed(evt);
            }
        });
        pwConfirText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwConfirTextKeyTyped(evt);
            }
        });
        getContentPane().add(pwConfirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, -1));

        aceptarButton.setBackground(new java.awt.Color(0, 204, 0));
        aceptarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aceptarButton.setForeground(new java.awt.Color(255, 255, 255));
        aceptarButton.setText("Aceptar");
        aceptarButton.setBorderPainted(false);
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarButton.setOpaque(true);
        aceptarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarButtonMouseClicked(evt);
            }
        });
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 90, 30));

        cancelarButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarButton.setText("Cancelar");
        cancelarButton.setBorderPainted(false);
        cancelarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarButton.setOpaque(true);
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, 30));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 90, 20));

        vacioApellido.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vacioApellido.setForeground(new java.awt.Color(255, 0, 0));
        vacioApellido.setText("(*)");
        getContentPane().add(vacioApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 30));

        vacioNombres.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vacioNombres.setForeground(new java.awt.Color(255, 0, 0));
        vacioNombres.setText("(*)");
        getContentPane().add(vacioNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 30));

        vacioUsuario.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vacioUsuario.setForeground(new java.awt.Color(255, 0, 0));
        vacioUsuario.setText("(*)");
        getContentPane().add(vacioUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 30));

        vacioPass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vacioPass.setForeground(new java.awt.Color(255, 0, 0));
        vacioPass.setText("(*)");
        getContentPane().add(vacioPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 30));

        vacioConfPass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vacioConfPass.setForeground(new java.awt.Color(255, 0, 0));
        vacioConfPass.setText("(*)");
        getContentPane().add(vacioConfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 30));

        creando.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        creando.setForeground(new java.awt.Color(255, 255, 255));
        creando.setText("Creando Bedel, por favor espere...");
        getContentPane().add(creando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 360, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/simple-blue-ii.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwTextActionPerformed

    private void pwConfirTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwConfirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwConfirTextActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        menuAdmin obj = new menuAdmin(); 
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarButtonMouseClicked

    
    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        String sApellido;
        String sNombre;
        String sUsuario;
        String sPass;
        String sConfPass;
        String sTurno;
        
        sApellido = this.apellidoText.getText();
        sNombre = this.nombresText.getText();
        sUsuario = this.usuarioText.getText();
        sPass = new String(this.pwText.getPassword());
        sConfPass = new String(this.pwConfirText.getPassword());
        sTurno = (String) this.turnoCombo.getSelectedItem();
        
        
        
        if(!(this.validaDatos(sApellido, sNombre, sUsuario, sPass, sConfPass, sTurno))){
            //JOptionPane.showMessageDialog(null,"Todo es correcto","Todo OK",JOptionPane.INFORMATION_MESSAGE);
            bedelDTO Bedel = new bedelDTO();
            //bedel.setId();
            Bedel.setApellido(sApellido);
            Bedel.setNombre(sNombre);
            Bedel.setUsername(sUsuario);
            Bedel.setPass(sPass);
            Bedel.setTurno(sTurno);         
            
            
            this.creando.setVisible(true);
            gestorUsuario gestor = new gestorUsuario();
            int salida = gestor.registrar(Bedel);
            
            if(salida==0){
                JOptionPane.showMessageDialog(null,"El usuario se creo correctamente","Usuario creado",JOptionPane.PLAIN_MESSAGE);
            }else{
                if(salida==1){
                    JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese nombre","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    if(salida==2){
                       JOptionPane.showMessageDialog(null,"La contraseña no respeta las politicas","Mensaje de Error",JOptionPane.ERROR_MESSAGE); 
                    }
                    else if(salida==3){
                        JOptionPane.showMessageDialog(null,"El usuario no se a podido crear","Mensaje de Error",JOptionPane.ERROR_MESSAGE); 

                    } else{
                        JOptionPane.showMessageDialog(null,"Error en el metodo crear bedel","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            this.creando.setVisible(false);
        }
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void aceptarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseClicked
       
       
    }//GEN-LAST:event_aceptarButtonMouseClicked

    private void apellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextActionPerformed

    private void apellidoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTextKeyTyped
        int num_car=20;
        if (apellidoText.getText().length()>=num_car){
            evt.consume();
        }
    }//GEN-LAST:event_apellidoTextKeyTyped

    private void nombresTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresTextKeyTyped
        int num_car=20;
        if (nombresText.getText().length()>=num_car){
            evt.consume();
        }
    }//GEN-LAST:event_nombresTextKeyTyped

    private void usuarioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextKeyTyped
        int num_car=20;
        if (usuarioText.getText().length()>=num_car){
            evt.consume();
        }
    }//GEN-LAST:event_usuarioTextKeyTyped

    private void pwTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwTextKeyTyped
        int num_car=20;
        if (pwText.getText().length()>=num_car){
            evt.consume();
        }
    }//GEN-LAST:event_pwTextKeyTyped

    private void pwConfirTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwConfirTextKeyTyped
        int num_car=20;
        if (pwConfirText.getText().length()>=num_car){
            evt.consume();
        }
    }//GEN-LAST:event_pwConfirTextKeyTyped

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
            java.util.logging.Logger.getLogger(registrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarBedel().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel creando;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logoUTN;
    private javax.swing.JTextField nombresText;
    private javax.swing.JPasswordField pwConfirText;
    private javax.swing.JPasswordField pwText;
    private javax.swing.JComboBox<String> turnoCombo;
    private javax.swing.JTextField usuarioText;
    private javax.swing.JLabel vacioApellido;
    private javax.swing.JLabel vacioConfPass;
    private javax.swing.JLabel vacioNombres;
    private javax.swing.JLabel vacioPass;
    private javax.swing.JLabel vacioUsuario;
    // End of variables declaration//GEN-END:variables
}
