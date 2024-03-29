
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Marsha
 */
public class Registration_Form extends javax.swing.JFrame {

    /**
     * Creates new form Registration_Form
     */
    public Registration_Form() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_userpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nationality = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_fullname = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_select = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_checkavailability = new javax.swing.JButton();
        cbox_sex = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel2.setText("Registration Form");

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Fullname");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Sex");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Nationality");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Userpassword");

        btn_delete.setBackground(new java.awt.Color(153, 255, 204));
        btn_delete.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(153, 255, 204));
        btn_update.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_select.setBackground(new java.awt.Color(153, 255, 204));
        btn_select.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_select.setText("Select");
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        btn_insert.setBackground(new java.awt.Color(153, 255, 204));
        btn_insert.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(204, 0, 0));
        btn_exit.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_checkavailability.setBackground(new java.awt.Color(204, 255, 204));
        btn_checkavailability.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btn_checkavailability.setText("Check Availability");
        btn_checkavailability.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkavailabilityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_checkavailabilityMouseEntered(evt);
            }
        });
        btn_checkavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkavailabilityActionPerformed(evt);
            }
        });

        cbox_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbox_sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_checkavailability)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_username)
                            .addComponent(txt_fullname)
                            .addComponent(txt_age)
                            .addComponent(txt_nationality)
                            .addComponent(txt_userpassword)
                            .addComponent(cbox_sex, 0, 120, Short.MAX_VALUE))
                        .addGap(52, 52, 52)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_update))
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(btn_exit))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbox_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_checkavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_insert)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_select)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       this.dispose();
       new log_in().show();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_checkavailabilityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkavailabilityMouseEntered
        
        
    }//GEN-LAST:event_btn_checkavailabilityMouseEntered

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
      String username = txt_username.getText();
      String fullname = txt_fullname.getText();
      String sex      = (String) cbox_sex.getSelectedItem();      
      String age      = txt_age.getText();
      String nationality = txt_nationality.getText();
      String userpassword = txt_userpassword.getText();
      if (txt_username.getText().isEmpty()||txt_fullname.getText().isEmpty()||cbox_sex.getSelectedItem().toString().isEmpty()||
              txt_age.getText().isEmpty()||txt_nationality.getText().isEmpty()||txt_userpassword.getText().isEmpty()){
      JOptionPane.showMessageDialog(null, "All data is required");
      }else{
         try {
             Class.forName("org.postgresql.Driver");
             Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "admin", "geonzon");
             String sqlquery = "INSERT  INTO \"UserInfos\".log_credential(\"Username\", \"Fullname\", \"Sex\", \"Age\", \"Nationality\", \"Userpassword\") VALUES ('" +username+ "','" +fullname+ "','"
                     +sex+ "','" +age+ "','" +nationality+ "','" +userpassword+ "')";
                                                                                         
             PreparedStatement pst = conn.prepareStatement(sqlquery);
             pst.execute();
             JOptionPane.showMessageDialog(null,"Data Saved");
             txt_username.setText("");
             txt_fullname.setText("");
             String cbox = cbox_sex.getSelectedItem().toString();
             txt_age.setText("");
             txt_nationality.setText("");
             txt_userpassword.setText("");
             
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
         
              
          }
      }
              
    
        
        
        
    
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_checkavailabilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkavailabilityMouseClicked
        String username = txt_username.getText();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "admin", "geonzon");
            String sqlquery = "SELECT * FROM \"UserInfos\".log_credential WHERE \"Username\" ='"+username+"'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Username available");
            } else {
                JOptionPane.showMessageDialog(null,"Username already exist");
                

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
            
            
        
    }//GEN-LAST:event_btn_checkavailabilityMouseClicked

    private void btn_checkavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkavailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkavailabilityActionPerformed

    private void cbox_sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sexActionPerformed
       
        cbox_sex = new JComboBox<>(new String[]{"Male", "Female"});


    }//GEN-LAST:event_cbox_sexActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String usernameToDelete = txt_username.getText();
        String fullnameToDelete = txt_fullname.getText();
        String sexToDelete = (String) cbox_sex.getSelectedItem();
        String ageToDelete = txt_age.getText();
        String nationalityToDelete = txt_nationality.getText();
        String userpasswordToDelete = txt_userpassword.getText();

     if (usernameToDelete.isEmpty() || fullnameToDelete.isEmpty() || sexToDelete == null || sexToDelete.isEmpty() ||
        ageToDelete.isEmpty() || nationalityToDelete.isEmpty() || userpasswordToDelete.isEmpty()) {
    JOptionPane.showMessageDialog(null, "All data is required");
   } else {
      int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
    try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "admin", "geonzon");

        String deleteQuery = "DELETE FROM \"UserInfos\".log_credential WHERE \"Username\" = ? AND \"Fullname\" = ? AND \"Sex\" = ? AND \"Age\" = ? AND \"Nationality\" = ? AND \"Userpassword\" = ?";
        try (PreparedStatement deletePst = conn.prepareStatement(deleteQuery)) {
            deletePst.setString(1, usernameToDelete);
            deletePst.setString(2, fullnameToDelete);
            deletePst.setString(3, sexToDelete);
            
            
            try {
                int ageInt = Integer.parseInt(ageToDelete);
                deletePst.setInt(4, ageInt);
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Age must be a valid integer");
                return; 
            }

            deletePst.setString(5, nationalityToDelete);
            deletePst.setString(6, userpasswordToDelete);

            int rowsAffected = deletePst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User information deleted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No matching user information found or could not be deleted");
            }

            
            txt_username.setText("");
            txt_fullname.setText("");
            cbox_sex.setSelectedItem(null);
            txt_age.setText("");
            txt_nationality.setText("");
            txt_userpassword.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
    }
        
     }
        
    

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        String username = txt_username.getText();

if (username.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username is required");
} else {
    try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "admin", "geonzon");

        // Change the SQL query to SELECT based on the username
        String selectQuery = "SELECT * FROM \"UserInfos\".log_credential WHERE \"Username\" = ?";
        try (PreparedStatement selectPst = conn.prepareStatement(selectQuery)) {
            // Set the parameter for the WHERE clause
            selectPst.setString(1, username);

            // Execute the SELECT query
            ResultSet resultSet = selectPst.executeQuery();

            if (resultSet.next()) {
                // Data found, display or process the retrieved data
                String retrievedUsername = resultSet.getString("Username");
                String retrievedFullname = resultSet.getString("Fullname");
                String retrievedSex = resultSet.getString("Sex");
                int retrievedAge = resultSet.getInt("Age");
                String retrievedNationality = resultSet.getString("Nationality");
                String retrievedUserpassword = resultSet.getString("Userpassword");

                // Display or process the retrieved data as needed
                JOptionPane.showMessageDialog(null,
                        "Username: " + retrievedUsername +
                                "\nFullname: " + retrievedFullname +
                                "\nSex: " + retrievedSex +
                                "\nAge: " + retrievedAge +
                                "\nNationality: " + retrievedNationality +
                                "\nUserpassword: " + retrievedUserpassword,
                        "User Information",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No matching user information found");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}


    }//GEN-LAST:event_btn_selectActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String username = txt_username.getText();
        String fullname = txt_fullname.getText();
        String sex = (String) cbox_sex.getSelectedItem();
        String age = txt_age.getText();
        String nationality = txt_nationality.getText();
        String userpassword = txt_userpassword.getText();

if (username.isEmpty() || fullname.isEmpty() || sex == null || sex.isEmpty() ||
        age.isEmpty() || nationality.isEmpty() || userpassword.isEmpty()) {
    JOptionPane.showMessageDialog(null, "All data is required");
} else {
    try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "admin", "geonzon");

        String sqlquery = "UPDATE \"UserInfos\".log_credential SET \"Fullname\" = ?, \"Sex\" = ?, \"Age\" = ?, \"Nationality\" = ?, \"Userpassword\" = ? WHERE \"Username\" = ?";
        try (PreparedStatement updatePst = conn.prepareStatement("")) {
            updatePst.setString(1, "");
            updatePst.setString(2, "");
            
            try {
                int ageInt = Integer.parseInt(age);
                updatePst.setInt(3, ageInt);
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Age must be a valid integer");
                return; 
            }
            
            updatePst.setString(4, nationality);
            updatePst.setString(5, userpassword);
            updatePst.setString(6, username);

            int rowsAffected = updatePst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User information updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No matching user information found or could not be updated");
            }

            // Clearing text fields
            txt_username.setText("");
            txt_fullname.setText("");
            cbox_sex.setSelectedItem(null);
            txt_age.setText("");
            txt_nationality.setText("");
            txt_userpassword.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_checkavailability;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbox_sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_nationality;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_userpassword;
    // End of variables declaration//GEN-END:variables
}





