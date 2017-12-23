/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DTO.condicionDTO;
import DTO.reservaDTO;
import Datos.aula;
import Datos.informatica;
import Datos.multimedios;
import Datos.sinRecursos;
import Logica.gestorReservas;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Alexis Mandracchia
 */
public class seleccionarAula extends javax.swing.JFrame {

    public List<aula[]> aulas;
    List<aula> aulasSeleccionadas = new ArrayList<>();
    List<Integer> elementosSeleccionado = new ArrayList<>();
    List<Object[]> fechas = new ArrayList<>();
    boolean elementosInicializados = false;
    public reservaDTO reserva;
    
    class FechasSelectionHandler implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();

        int firstIndex = e.getFirstIndex();
        int lastIndex = e.getLastIndex();
        boolean isAdjusting = e.getValueIsAdjusting();

        if (lsm.isSelectionEmpty()) {

        } else if(isAdjusting){
            // Find out which indexes are selected.
            cargarTablaAulas(jTableReservas.getSelectedRow());
            int aulaSeleccionada = elementosSeleccionado.get(jTableReservas.getSelectedRow());
            jTable1.setRowSelectionInterval(aulaSeleccionada, aulaSeleccionada);
        }
    }
    }
    class AulasSelectionHandler implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();

        int firstIndex = e.getFirstIndex();
        int lastIndex = e.getLastIndex();
        boolean isAdjusting = e.getValueIsAdjusting();

        if (lsm.isSelectionEmpty()) {

        } else if(isAdjusting){
            // Find out which indexes are selected.
            if(elementosInicializados){
                guardarAulaSeleccionada();
                elementosSeleccionado.set(jTableReservas.getSelectedRow(), jTable1.getSelectedRow());
            }
            
        }
    }

        private void guardarAulaSeleccionada() {
            int fechaSeleccionada = jTableReservas.getSelectedRow();
            int aulaSeleccionada = jTable1.getSelectedRow();
            aula Aula = aulas.get(fechaSeleccionada)[aulaSeleccionada];
            aulasSeleccionadas.set(fechaSeleccionada, Aula);
        }
    }
    /**
     * Creates new form menuBedel
     */
    public seleccionarAula() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //elementosSeleccionado.add(0);
        ListSelectionModel fechasSelectionModel = jTableReservas.getSelectionModel();
        fechasSelectionModel.addListSelectionListener(new FechasSelectionHandler());
        ListSelectionModel aulasSelectionModel = jTable1.getSelectionModel();
        aulasSelectionModel.addListSelectionListener(new AulasSelectionHandler());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccionar Aula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, 30));

        logoUTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoUTN_200px.png"))); // NOI18N
        getContentPane().add(logoUTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableReservas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 480, 190));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Aula", "Piso", "Capacidad", "Pizarron", "A/C", "Ventiladores", "PC", "Proyector", "TV", "DVD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 480, 90));

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
        getContentPane().add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 90, 30));

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
        getContentPane().add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/simple-blue-ii.jpg"))); // NOI18N
        fondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fondoKeyTyped(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseClicked

    }//GEN-LAST:event_aceptarButtonMouseClicked

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        System.out.println(aulasSeleccionadas.toString());
        List<Integer> listaId = new ArrayList<>();
        
        for(aula Aula:aulasSeleccionadas){
            listaId.add(Aula.idAula);
        }
        reserva.setIdAulas(listaId);
        try{
            gestorReservas.registrar(reserva);
            this.dispose();
        }
        catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void fondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fondoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        int selectedRow;
        if (key == KeyEvent.VK_ENTER){
            selectedRow = jTableReservas.getSelectedRow();
            selectedRow++;
            jTableReservas.setRowSelectionInterval(selectedRow, selectedRow);
        }
    }//GEN-LAST:event_fondoKeyTyped

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
            java.util.logging.Logger.getLogger(seleccionarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seleccionarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seleccionarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seleccionarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seleccionarAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTableReservas;
    private javax.swing.JLabel logoUTN;
    // End of variables declaration//GEN-END:variables

    List<Integer> obtenerAulas() {
        List<Integer> idAulas = new ArrayList<>();
        for(aula Aula:aulasSeleccionadas){
            idAulas.add(Aula.idAula);
        }
        
        return idAulas;
    }
    
    public void cargarTablaFechas(){
        DefaultTableModel modelo = (DefaultTableModel) jTableReservas.getModel();
        
        for(Object[] fecha:fechas){
            modelo.addRow(fecha);
            elementosSeleccionado.add(0);
            aulasSeleccionadas.add(new aula());
        }
        jTableReservas.setModel(modelo);
        jTableReservas.setRowSelectionInterval(0,0);
        elementosInicializados = true;  
    }
    
    public void cargarTablaAulas(int filaSeleccionada){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        Object[] aulaRow = new Object[10];
        
        for(int i=0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
        }
       
        if(filaSeleccionada >= 0){
            aula[] aulasPorDia = aulas.get(filaSeleccionada);
            
            for(aula Aula: aulasPorDia){
                aulaRow[0] = Aula.idAula;
                aulaRow[1] = Aula.piso;
                aulaRow[2] = Aula.capacidad;
                aulaRow[3] = Aula.pizarron;
                aulaRow[4] = Aula.ac;

                sinRecursos aulaSinRecursos;
                informatica aulaInformatica;
                multimedios aulaMultimedios;

                if(Aula instanceof sinRecursos){
                    aulaSinRecursos = (sinRecursos) Aula;
                    aulaRow[5] = aulaSinRecursos.ventiladores;
                }
                else if(Aula instanceof informatica){
                    aulaInformatica = (informatica) Aula;
                    aulaRow[6] = aulaInformatica.cantidadPc;
                    aulaRow[7] = aulaInformatica.proyector;
                }
                else if(Aula instanceof multimedios){
                    aulaMultimedios = (multimedios) Aula;
                    aulaRow[6] = aulaMultimedios.pc;
                    aulaRow[7] = aulaMultimedios.proyector;
                    aulaRow[8] = aulaMultimedios.televisor;
                    aulaRow[9] = aulaMultimedios.dvd;
                }

                modelo.addRow(aulaRow);
            }
            
        }
        
        jTable1.setModel(modelo);
        int seleccionado = elementosSeleccionado.get(jTableReservas.getSelectedRow());
        jTable1.setRowSelectionInterval(seleccionado, seleccionado);
    }
    
}
