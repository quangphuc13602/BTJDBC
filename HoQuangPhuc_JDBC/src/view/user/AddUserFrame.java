package view.user;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import service.UserService;

public class AddUserFrame extends javax.swing.JFrame {

        UserService userService;
        User user;

        public AddUserFrame() {
                initComponents();
                userService = new UserService();
                user = new User();
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        musicCheckBox = new javax.swing.JCheckBox();
        movieCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        adminRadioButton = new javax.swing.JRadioButton();
        userRadioButton = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADD USER");

        jLabel2.setText("Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("UserName");

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        jLabel6.setText("Favourites");

        musicCheckBox.setText("Nghe Nhac");
        musicCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicCheckBoxActionPerformed(evt);
            }
        });

        movieCheckBox.setText("Xem Phim");

        jLabel7.setText("About");

        aboutTextArea.setColumns(20);
        aboutTextArea.setRows(5);
        jScrollPane1.setViewportView(aboutTextArea);

        jLabel8.setText("Role");

        buttonGroup1.add(adminRadioButton);
        adminRadioButton.setText("Admin");

        buttonGroup1.add(userRadioButton);
        userRadioButton.setSelected(true);
        userRadioButton.setText("User");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(musicCheckBox)
                                            .addGap(18, 18, 18)
                                            .addComponent(movieCheckBox))
                                        .addComponent(jScrollPane1)
                                        .addComponent(passwordField)
                                        .addComponent(userNameTextField)
                                        .addComponent(phoneTextField)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adminRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(userRadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(confirmButton)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(musicCheckBox)
                    .addComponent(movieCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRadioButton)
                    .addComponent(jLabel8)
                    .addComponent(userRadioButton))
                .addGap(18, 18, 18)
                .addComponent(confirmButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void musicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicCheckBoxActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_musicCheckBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            try {
                    // TODO add your handling code here:
                    new ListUserFrame().setVisible(true);
            } catch (SQLException ex) {
                    Logger.getLogger(AddUserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
            user.setName(nameTextField.getText());
            user.setPhone(phoneTextField.getText());
            user.setUsername(userNameTextField.getText());
            user.setPassword(String.valueOf(passwordField.getPassword()));
            user.setAbout(aboutTextArea.getText());

            String favourites = "";
            if (musicCheckBox.isSelected()) {
                    favourites += " Music";
            }
            if (movieCheckBox.isSelected()) {
                    favourites += " Movie";
            }
            user.setFavourites(favourites);

            String role = "ROLE_USER";
            if (adminRadioButton.isSelected()) {
                    role = "ROLE_ADMIN";
            }
            if (userRadioButton.isSelected()) {
                    role = "ROLE_USER";
            }
            user.setRole(role);

            try {
                    userService.addUser(user);
                    new ListUserFrame().setVisible(true);
            } catch (SQLException ex) {
                    Logger.getLogger(AddUserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

        /**
         * @param args the command line arguments
         */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutTextArea;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox movieCheckBox;
    private javax.swing.JCheckBox musicCheckBox;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JRadioButton userRadioButton;
    // End of variables declaration//GEN-END:variables
}
