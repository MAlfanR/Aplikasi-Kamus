/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class MenuKata extends javax.swing.JFrame {

    /**
     * Creates new form MenuKata
     */
    public MenuKata() {
        initComponents();
        
        //Fungsi agar jendela menu kata tidak bisa di maximize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyPanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        iconLogOut = new javax.swing.JButton();
        iconProfile = new javax.swing.JButton();
        iconTambahKata = new javax.swing.JButton();
        iconHapusKata = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        PanelTambahKata = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        PanelHapusKata = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelProfile = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Kata");
        setPreferredSize(new java.awt.Dimension(643, 538));

        BodyPanel.setBackground(new java.awt.Color(26, 188, 156));

        menupanel.setBackground(new java.awt.Color(26, 188, 156));
        menupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        iconLogOut.setBackground(new java.awt.Color(85, 239, 196));
        iconLogOut.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        iconLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Webp.net-resizeimage (5).png"))); // NOI18N
        iconLogOut.setText("Log Out");
        iconLogOut.setIconTextGap(8);
        iconLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconLogOutActionPerformed(evt);
            }
        });

        iconProfile.setBackground(new java.awt.Color(85, 239, 196));
        iconProfile.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        iconProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Webp.net-resizeimage (7).png"))); // NOI18N
        iconProfile.setText("Profil Admin");
        iconProfile.setIconTextGap(8);
        iconProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconProfileActionPerformed(evt);
            }
        });

        iconTambahKata.setBackground(new java.awt.Color(85, 239, 196));
        iconTambahKata.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        iconTambahKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Webp.net-resizeimage (2).png"))); // NOI18N
        iconTambahKata.setText("Tambah Kata");
        iconTambahKata.setIconTextGap(8);
        iconTambahKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconTambahKataActionPerformed(evt);
            }
        });

        iconHapusKata.setBackground(new java.awt.Color(85, 239, 196));
        iconHapusKata.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        iconHapusKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Webp.net-resizeimage (4).png"))); // NOI18N
        iconHapusKata.setText("Hapus Kata");
        iconHapusKata.setIconTextGap(8);
        iconHapusKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconHapusKataActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Webp.net-resizeimage (1).png"))); // NOI18N

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(iconProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(iconHapusKata, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(iconTambahKata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap())
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconTambahKata, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconHapusKata, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.setBackground(new java.awt.Color(26, 188, 156));
        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainpanel.setLayout(new java.awt.CardLayout());

        PanelTambahKata.setBackground(new java.awt.Color(0, 206, 201));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TAMBAH KATA");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kata yang akan ditambahkan :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deskripsi kata :");

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Masukkan ke :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Elektro", "Arsitektur", "Biologi" }));

        javax.swing.GroupLayout PanelTambahKataLayout = new javax.swing.GroupLayout(PanelTambahKata);
        PanelTambahKata.setLayout(PanelTambahKataLayout);
        PanelTambahKataLayout.setHorizontalGroup(
            PanelTambahKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahKataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTambahKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTambahKataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addGroup(PanelTambahKataLayout.createSequentialGroup()
                        .addGroup(PanelTambahKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTambahKataLayout.setVerticalGroup(
            PanelTambahKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahKataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTambahKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        mainpanel.add(PanelTambahKata, "card2");

        PanelHapusKata.setBackground(new java.awt.Color(116, 185, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HAPUS KATA");

        javax.swing.GroupLayout PanelHapusKataLayout = new javax.swing.GroupLayout(PanelHapusKata);
        PanelHapusKata.setLayout(PanelHapusKataLayout);
        PanelHapusKataLayout.setHorizontalGroup(
            PanelHapusKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHapusKataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        PanelHapusKataLayout.setVerticalGroup(
            PanelHapusKataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHapusKataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );

        mainpanel.add(PanelHapusKata, "card3");

        PanelProfile.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PROFIL PENGGUNA");

        javax.swing.GroupLayout PanelProfileLayout = new javax.swing.GroupLayout(PanelProfile);
        PanelProfile.setLayout(PanelProfileLayout);
        PanelProfileLayout.setHorizontalGroup(
            PanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        PanelProfileLayout.setVerticalGroup(
            PanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );

        mainpanel.add(PanelProfile, "card4");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iconLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconLogOutActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar?", "PERINGATAN", dialogBtn);
        
        if (dialogResult==0) {
            loginadmin form = new loginadmin();
            form.setVisible(true);
            form.pack();
            form.setLocationRelativeTo(null);
            this.dispose();
        } else {
            
        }
    }//GEN-LAST:event_iconLogOutActionPerformed

    private void iconTambahKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconTambahKataActionPerformed
        // TODO add your handling code here:
        
        //REMOVE PANEL
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //ADD PANEL
        mainpanel.add(PanelTambahKata);
        mainpanel.repaint();
        mainpanel.revalidate();
        
    }//GEN-LAST:event_iconTambahKataActionPerformed

    private void iconHapusKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconHapusKataActionPerformed
        // TODO add your handling code here:
           //REMOVE PANEL
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //ADD PANEL
        mainpanel.add(PanelHapusKata);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_iconHapusKataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iconProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconProfileActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //ADD PANEL
        mainpanel.add(PanelProfile);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_iconProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MenuKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel PanelHapusKata;
    private javax.swing.JPanel PanelProfile;
    private javax.swing.JPanel PanelTambahKata;
    private javax.swing.JButton iconHapusKata;
    private javax.swing.JButton iconLogOut;
    private javax.swing.JButton iconProfile;
    private javax.swing.JButton iconTambahKata;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    // End of variables declaration//GEN-END:variables
}
