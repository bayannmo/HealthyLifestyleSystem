package project_280;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jana
 */
public class setting extends javax.swing.JFrame {

    /**
     * Creates new form Setting
     */
    public setting() {
        initComponents();
        this.set_AccountInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confirm_Editing = new javax.swing.JOptionPane();
        Back = new javax.swing.JLabel();
        Go_AboutUS = new javax.swing.JLabel();
        AccountName = new javax.swing.JTextField();
        AccountName_Edit = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        Email_Edit = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Password_Edit = new javax.swing.JButton();
        SingOut = new javax.swing.JButton();
        Remaind_Workout = new javax.swing.JToggleButton();
        Remaind_Water = new javax.swing.JToggleButton();
        Background = new javax.swing.JLabel();

        Confirm_Editing.setBackground(new java.awt.Color(255, 255, 255));
        Confirm_Editing.setForeground(new java.awt.Color(0, 0, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 20));

        Go_AboutUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Go_AboutUSMouseClicked(evt);
            }
        });
        getContentPane().add(Go_AboutUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 760, 140, 20));

        AccountName.setEnabled(false);
        AccountName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AccountNameCaretUpdate(evt);
            }
        });
        AccountName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountNameMouseClicked(evt);
            }
        });
        getContentPane().add(AccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 120, 30));

        AccountName_Edit.setBackground(new java.awt.Color(255, 255, 255));
        AccountName_Edit.setForeground(new java.awt.Color(0, 0, 102));
        AccountName_Edit.setText("Edit");
        AccountName_Edit.setEnabled(false);
        AccountName_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountName_EditActionPerformed(evt);
            }
        });
        getContentPane().add(AccountName_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 60, 20));

        Email.setEnabled(false);
        Email.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                EmailCaretUpdate(evt);
            }
        });
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 120, 30));

        Email_Edit.setBackground(new java.awt.Color(255, 255, 255));
        Email_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Email_Edit.setText("Edit");
        Email_Edit.setEnabled(false);
        Email_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Email_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 60, 20));

        Password.setEnabled(false);
        Password.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PasswordCaretUpdate(evt);
            }
        });
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 120, 30));

        Password_Edit.setBackground(new java.awt.Color(255, 255, 255));
        Password_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Password_Edit.setText("Edit");
        Password_Edit.setEnabled(false);
        Password_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Password_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 60, 20));

        SingOut.setBackground(new java.awt.Color(255, 255, 255));
        SingOut.setForeground(new java.awt.Color(0, 0, 102));
        SingOut.setText("Sing out");
        SingOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingOutActionPerformed(evt);
            }
        });
        getContentPane().add(SingOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 795, 100, 40));

        Remaind_Workout.setBackground(new java.awt.Color(255, 255, 255));
        Remaind_Workout.setText("OFF");
        Remaind_Workout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remaind_WorkoutActionPerformed(evt);
            }
        });
        getContentPane().add(Remaind_Workout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 70, 40));

        Remaind_Water.setBackground(new java.awt.Color(255, 255, 255));
        Remaind_Water.setText("OFF");
        Remaind_Water.setToolTipText("");
        Remaind_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remaind_WaterActionPerformed(evt);
            }
        });
        getContentPane().add(Remaind_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 70, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_setting.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Go_AboutUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Go_AboutUSMouseClicked
        new aboutUs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Go_AboutUSMouseClicked

    private void Remaind_WorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remaind_WorkoutActionPerformed
        if (Remaind_Workout.isSelected()) {
            Remaind_Workout.setText("ON");
            Remaind_Workout.setBackground(new Color(255, 119, 52));
        } else {
            Remaind_Workout.setText("OFF");
            Remaind_Workout.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Remaind_WorkoutActionPerformed

    private void Remaind_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remaind_WaterActionPerformed
        if (Remaind_Water.isSelected()) {
            Remaind_Water.setText("ON");
            Remaind_Water.setBackground(new Color(255, 119, 52));
        } else {
            Remaind_Water.setText("OFF");
            Remaind_Water.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Remaind_WaterActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void AccountName_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountName_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
                this,
                "Are You Sure?",
                "Confirm",
                Confirm_Editing.YES_NO_OPTION,
                Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newAccountName = AccountName.getText();
            setting n = new setting();
            n.setVisible(true);
            n.AccountName.setText(newAccountName);
            signUp.name.setText(newAccountName);
            this.dispose();
        } else {
            AccountName.setEnabled(false);
            AccountName_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_AccountName_EditActionPerformed

    private void AccountNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountNameMouseClicked
        if (AccountName.isEnabled() == false) {
            AccountName.setEnabled(true);
        }
    }//GEN-LAST:event_AccountNameMouseClicked

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
        if (Email.isEnabled() == false) {
            Email.setEnabled(true);
        }
    }//GEN-LAST:event_EmailMouseClicked

    private void Email_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
                this,
                "Are You Sure?",
                "Confirm",
                Confirm_Editing.YES_NO_OPTION,
                Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newEmail = Email.getText();
            setting n = new setting();
            n.setVisible(true);
            n.Email.setText(newEmail);
            if (welcome.here.equals("singUp")) {
                signUp.email.setText(newEmail);
            } else if (welcome.here.equals("logIn")) {
                logIn.email.setText(newEmail);
            }
            this.dispose();
        } else {
            Email.setEnabled(false);
            Email_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Email_EditActionPerformed

    private void Password_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
                this,
                "Are You Sure?",
                "Confirm",
                Confirm_Editing.YES_NO_OPTION,
                Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newPass = Password.getText();
            setting n = new setting();
            n.setVisible(true);
            n.Password.setText(newPass);
            if (welcome.here.equals("singUp")) {
                signUp.Password.setText(newPass);
            } else if (welcome.here.equals("logIn")) {
                logIn.password.setText(newPass);
            }
            this.dispose();
        } else {
            Password.setEnabled(false);
            Password_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Password_EditActionPerformed

    private void AccountNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AccountNameCaretUpdate
        if (AccountName.getText().length() > 0 && AccountName.isEnabled()) {
            AccountName_Edit.setEnabled(true);
        } else {
            AccountName_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_AccountNameCaretUpdate

    private void EmailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_EmailCaretUpdate
        if (Email.getText().length() > 0 && Email.isEnabled()) {
            Email_Edit.setEnabled(true);
        } else {
            Email_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_EmailCaretUpdate

    private void SingOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingOutActionPerformed
        int result = Confirm_Editing.showOptionDialog(
                this,
                "Are You Sure?",
                "Confirm",
                Confirm_Editing.YES_NO_OPTION,
                Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            new welcome().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_SingOutActionPerformed

    private void PasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PasswordCaretUpdate
        if (Password.getText().length() > 0 && Password.isEnabled()) {
            Password_Edit.setEnabled(true);
        } else {
            Password_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_PasswordCaretUpdate

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        if (Password.isEnabled() == false) {
            Password.setEnabled(true);
        }
    }//GEN-LAST:event_PasswordMouseClicked

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
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setting frame = new setting();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AccountName;
    private javax.swing.JButton AccountName_Edit;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JOptionPane Confirm_Editing;
    public static javax.swing.JTextField Email;
    private javax.swing.JButton Email_Edit;
    private javax.swing.JLabel Go_AboutUS;
    public static javax.swing.JPasswordField Password;
    private javax.swing.JButton Password_Edit;
    private javax.swing.JToggleButton Remaind_Water;
    private javax.swing.JToggleButton Remaind_Workout;
    private javax.swing.JButton SingOut;
    // End of variables declaration//GEN-END:variables

    public static void set_AccountInfo() {
        if (welcome.here.equals("signUp")) {
            AccountName.setText(signUp.name.getText() + "User");
            Email.setText(signUp.email.getText());
            Password.setText(signUp.Password.getText());
        } else if (welcome.here.equals("logIn")) {
            AccountName.setText(logIn.email.getText().replace("@gmail|.com|@|@hotmail", ""));
            Email.setText(logIn.email.getText());
            Password.setText(logIn.password.getText());
        } else if (welcome.here.equals("")) {
            AccountName.setText("bayanUser");
            Email.setText("bayan@gmail.com");
            Password.setText("bayan");
        }
    }

}
