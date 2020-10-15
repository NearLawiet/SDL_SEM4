/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author near
 */
public class LandingPage extends javax.swing.JPanel{

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
        addEventListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton1.setText("Admin Login");

        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton2.setText("Registered Applicant");

        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton3.setText("New Applicant");

        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton4.setText("Help and Support");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 978, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        ImageIcon image = new ImageIcon("static/banner.png");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(1250,320, Image.SCALE_SMOOTH));
        jLabel1.setIcon(icon);
    }// </editor-fold>

    private void addEventListeners(){
        // Admin Login
        jButton1.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new AdminLogin());
            Main.frame.setSize(new AdminLogin().getPreferredSize());
            Main.frame.setVisible(true);
        });

        // Applicant Login
        jButton2.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new ApplicantLogin());
            Main.frame.setSize(new ApplicantLogin().getPreferredSize());
            Main.frame.setVisible(true);
        });

        jButton3.addActionListener(e->{
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new ApplicationForm());
            Main.frame.setSize(new ApplicationForm().getPreferredSize());
            Main.frame.setVisible(true);
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private int status;
    // End of variables declaration
}
