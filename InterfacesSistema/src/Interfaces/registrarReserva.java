/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Alexis Mandracchia
 */
public class registrarReserva extends javax.swing.JFrame {

    /**
     * Creates new form menuBedel
     */
    public registrarReserva() {
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
        logoUTN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoReserva = new javax.swing.JComboBox<>();
        deEspo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        horarioEspo = new javax.swing.JLabel();
        horariosEspo = new javax.swing.JFormattedTextField();
        duracionEspo = new javax.swing.JFormattedTextField();
        horarioEspo1 = new javax.swing.JLabel();
        horarioEspo2 = new javax.swing.JLabel();
        horarioEspo3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        agregarEspo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Reserva");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 230, 40));

        logoUTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoUTN_200px.png"))); // NOI18N
        getContentPane().add(logoUTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione tipo de reserva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        tipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esporádica", "Periodica" }));
        getContentPane().add(tipoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, 20));

        deEspo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deEspo.setForeground(new java.awt.Color(255, 255, 255));
        deEspo.setText("Escriba la fecha deseada:");
        getContentPane().add(deEspo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 470, 10));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 20));

        horarioEspo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        horarioEspo.setForeground(new java.awt.Color(255, 255, 255));
        horarioEspo.setText("hs");
        getContentPane().add(horarioEspo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 20));

        try {
            horariosEspo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horariosEspo.setText("09:00  ");
        getContentPane().add(horariosEspo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, -1));

        try {
            duracionEspo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        duracionEspo.setText("02:00");
        getContentPane().add(duracionEspo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 50, -1));

        horarioEspo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        horarioEspo1.setForeground(new java.awt.Color(255, 255, 255));
        horarioEspo1.setText("Horario:");
        getContentPane().add(horarioEspo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        horarioEspo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        horarioEspo2.setForeground(new java.awt.Color(255, 255, 255));
        horarioEspo2.setText("Duración:");
        getContentPane().add(horarioEspo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 20));

        horarioEspo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        horarioEspo3.setForeground(new java.awt.Color(255, 255, 255));
        horarioEspo3.setText("hs");
        getContentPane().add(horarioEspo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Horario", "Duración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 80));

        agregarEspo.setText("Agregar");
        agregarEspo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(agregarEspo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 10));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/simple-blue-ii.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

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
            java.util.logging.Logger.getLogger(registrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEspo;
    private javax.swing.JLabel deEspo;
    private javax.swing.JFormattedTextField duracionEspo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel horarioEspo;
    private javax.swing.JLabel horarioEspo1;
    private javax.swing.JLabel horarioEspo2;
    private javax.swing.JLabel horarioEspo3;
    private javax.swing.JFormattedTextField horariosEspo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoUTN;
    private javax.swing.JComboBox<String> tipoReserva;
    // End of variables declaration//GEN-END:variables
}
