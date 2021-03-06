package project_280;

import javax.swing.JOptionPane;

/**
 * @author Galawi
 */
public class resetByEmail extends javax.swing.JFrame {

    /**
     * Creates new form ResetByEmail
     */
    public resetByEmail() {
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

        back = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        white = new javax.swing.JLabel();
        send = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 60, 50));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 270, 290, 40));

        white.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screenwhitee.png"))); // NOI18N
        getContentPane().add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 240, 60));

        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 310, 50));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/ScreenResetByemail.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new reset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
        String em = email.getText();
        signUp s = new signUp();
        if (em.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill the field.");
        } else if (s.isValid(em) == false) {
            JOptionPane.showMessageDialog(this, "InValid Email try anothr one");
        } else {
            white.setVisible(false);
            new logIn().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_sendMouseClicked

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
            java.util.logging.Logger.getLogger(resetByEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetByEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetByEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetByEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetByEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField email;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel send;
    private javax.swing.JLabel white;
    // End of variables declaration//GEN-END:variables
}
