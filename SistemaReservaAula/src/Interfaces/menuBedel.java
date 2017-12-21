/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Datos.bedel;
import Datos.usuario;

/**
 *
 * @author Alexis Mandracchia
 */
public class menuBedel extends javax.swing.JFrame {

    /**
     * Creates new form menuBedel
     */
    public static usuario bedelOnline;
    
    public menuBedel() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        nombreUsuario = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        irReserva = new javax.swing.JButton();
        irBuscarAula = new javax.swing.JButton();
        irReservasDia = new javax.swing.JButton();
        irReservasCurso = new javax.swing.JButton();
        logoUTN = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú Bedel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 30));

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreUsuario.setText("nombreUsuario");
        getContentPane().add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        cerrarSesion.setBackground(new java.awt.Color(51, 51, 255));
        cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorderPainted(false);
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setOpaque(true);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 120, 30));

        irReserva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        irReserva.setText("NUEVA RESERVA");
        irReserva.setBorder(null);
        irReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irReserva.setOpaque(true);
        irReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irReservaActionPerformed(evt);
            }
        });
        getContentPane().add(irReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 50));

        irBuscarAula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        irBuscarAula.setText("BUSCAR AULA");
        irBuscarAula.setBorder(null);
        irBuscarAula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irBuscarAula.setOpaque(true);
        getContentPane().add(irBuscarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 170, 50));

        irReservasDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        irReservasDia.setText("RESERVAS POR DIA");
        irReservasDia.setBorder(null);
        irReservasDia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irReservasDia.setOpaque(true);
        getContentPane().add(irReservasDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 170, 50));

        irReservasCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        irReservasCurso.setText("RESERVAS POR CURSO");
        irReservasCurso.setBorder(null);
        irReservasCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irReservasCurso.setOpaque(true);
        getContentPane().add(irReservasCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 170, 50));

        logoUTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoUTN_200px.png"))); // NOI18N
        getContentPane().add(logoUTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/simple-blue-ii.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irReservaActionPerformed
        // TODO add your handling code here:
        registrarReserva menuRegistrar = new registrarReserva();
        menuRegistrar.setVisible(true);
    }//GEN-LAST:event_irReservaActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(menuBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuBedel().setVisible(true);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton irBuscarAula;
    private javax.swing.JButton irReserva;
    private javax.swing.JButton irReservasCurso;
    private javax.swing.JButton irReservasDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoUTN;
    public static javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
