/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rol;

/**
 *
 * @author jomac
 */
public class Tabla_interface_contundentes extends javax.swing.JFrame {

    /**
     * Creates new form Tabla_interface_contundentes
     */
    public Tabla_interface_contundentes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_defilo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla de ataque con armas contundentes");
        setPreferredSize(new java.awt.Dimension(450, 520));
        setResizable(false);

        tabla_defilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01-08", "------", "Posible", "pifia", "-------", "-------"},
                {"09-35", "0", "0", "0", "0", "0"},
                {"36-40", "1", "0", "0", "0", "0"},
                {"41-45", "1", "1", "0", "0", "0"},
                {"46-50", "2", "2", "0", "0", "0"},
                {"51-55", "3", "3", "0", "0", "0"},
                {"56-60", "3", "4", "0", "0", "0"},
                {"61-65", "4", "5", "0", "0", "0"},
                {"66-70", "5", "6", "2", "3", "0"},
                {"71-75", "5", "7", "3", "5", "0"},
                {"76-80", "6", "8", "4", "6", "0"},
                {"81-85", "7", "9", "6", "7A", "6"},
                {"86-90", "8", "10", "7A", "8A", "8"},
                {"91-95", "8", "11", "8A", "9A", "9A"},
                {"96-100", "9", "12A", "9B", "10B", "10B"},
                {"101-105", "10", "13A", "10B", "11B", "12C"},
                {"106-110", "10A", "14B", "11B", "12B", "13C"},
                {"111-115", "11A", "15B", "12C", "13C", "14D"},
                {"116-120", "12B", "16C", "13C", "14C", "15D"},
                {"121-125", "13B", "17C", "15C", "15C", "17D"},
                {"126-130", "13C", "18C", "16C", "16D", "18E"},
                {"131-135", "14C", "19D", "17D", "17D", "19E"},
                {"136-140", "15D", "20D", "18D", "18E", "21E"},
                {"141-145", "16D", "21E", "19E", "19E", "22E"},
                {"146-150", "16E", "22E", "20E", "20E", "23E"}
            },
            new String [] {
                "Tirada", "Coraza", "C. de malla", "Cuero end.", "Cuero", "Sin armad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_defilo);

        jButton1.setText("Cerrar1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(133, 133, 133))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla_interface_contundentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_interface_contundentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_interface_contundentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_interface_contundentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_interface_contundentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_defilo;
    // End of variables declaration//GEN-END:variables
}
