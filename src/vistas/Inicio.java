/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author danie
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jLabel4 = new javax.swing.JLabel();
        panelBtns = new javax.swing.JPanel();
        establecimientoBtn = new javax.swing.JButton();
        especialidadesBtn = new javax.swing.JButton();
        cursosBtn = new javax.swing.JButton();
        profesoresBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CONTROL ESPECIALIDADES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 620, 70));

        establecimientoBtn.setBackground(new java.awt.Color(197, 197, 197));
        establecimientoBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        establecimientoBtn.setForeground(new java.awt.Color(0, 0, 0));
        establecimientoBtn.setText("ESTABLECIMIENTOS");
        establecimientoBtn.setFocusPainted(false);
        panelBtns.add(establecimientoBtn);

        especialidadesBtn.setBackground(new java.awt.Color(197, 197, 197));
        especialidadesBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        especialidadesBtn.setForeground(new java.awt.Color(0, 0, 0));
        especialidadesBtn.setText("ESPECIALIDADES");
        especialidadesBtn.setFocusPainted(false);
        panelBtns.add(especialidadesBtn);

        cursosBtn.setBackground(new java.awt.Color(197, 197, 197));
        cursosBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cursosBtn.setForeground(new java.awt.Color(0, 0, 0));
        cursosBtn.setText("CURSOS");
        cursosBtn.setFocusPainted(false);
        panelBtns.add(cursosBtn);

        profesoresBtn.setBackground(new java.awt.Color(197, 197, 197));
        profesoresBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        profesoresBtn.setForeground(new java.awt.Color(0, 0, 0));
        profesoresBtn.setText("PROFESORES");
        profesoresBtn.setFocusPainted(false);
        panelBtns.add(profesoresBtn);

        getContentPane().add(panelBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 60));

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cursosBtn;
    public javax.swing.JButton especialidadesBtn;
    public javax.swing.JButton establecimientoBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelBtns;
    public javax.swing.JButton profesoresBtn;
    // End of variables declaration//GEN-END:variables
}
