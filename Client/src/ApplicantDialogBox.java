/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;

/**
 *
 * @author near
 */
public class ApplicantDialogBox extends javax.swing.JDialog {

    /**
     * Creates new form ApplicantDialogBox
     */
    public ApplicantDialogBox(java.awt.Frame parent, boolean modal, SerializedApplicant applicant) {
        super(parent, modal);
        initComponents();
        this.applicant = applicant;
        render();
        addActionListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel2.setText("Applicant Details");

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel3.setText("Applicant ID:");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel6.setText("Unique ID:");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel8.setText("Contact: ");

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel9.setText("Entrance Details");

        jLabel11.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel11.setText("Reg No: ");

        jLabel12.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel12.setText("Score:");

        jLabel13.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel13.setText("Percentile:");

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel14.setText("HSC Details");

        jLabel15.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel15.setText("Board:");

        jLabel16.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel16.setText("Reg No: ");

        jLabel17.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel17.setText("Percentage:");

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel18.setText("Application Status");

        jLabel19.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel19.setText("Applied Branch:");

        jLabel20.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel20.setText("Staus:");

        jLabel21.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel21.setText("Enrollment Form:");

        jLabel22.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel22.setText("Enrollment ID: ");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("XXXXXXXXXXXXXXXX");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("XXXXXXXXXXXXXXXX");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("XXXXXXXXXXXXXXXX");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("XXXXXXXXXXXXXXXX");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel27.setText("XXXXXXXXXXXXXXXX");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel28.setText("XXXXXXXXXXXXXXXX");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel29.setText("XXXXXXXXXXXXXXXX");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel30.setText("XXXXXXXXXXXXXXXX");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel31.setText("XXXXXXXXXXXXXXXX");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel32.setText("XXXXXXXXXXXXXXXX");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel33.setText("XXXXXXXXXXXXXXXX");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel34.setText("XXXXXXXXXXXXXXXX");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel35.setText("XXXXXXXXXXXXXXXX");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel36.setText("XXXXXXXXXXXXXXXX");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel37.setText("XXXXXXXXXXXXXXXX");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel38.setText("XXXXXXXXXXXXXXXX");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setText("Photograph");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setText("Signature");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setText("ID Proof");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel34))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel23))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel25)
                                                                        .addComponent(jLabel24)
                                                                        .addComponent(jLabel26)
                                                                        .addComponent(jLabel27)
                                                                        .addComponent(jLabel28)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel33)
                                                        .addComponent(jLabel32)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel29)))
                                        .addComponent(jLabel11))
                                .addGap(122, 122, 122)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel18)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel19)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel20)
                                                                                .addGap(91, 91, 91)))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel35)
                                                                        .addComponent(jLabel36)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel38)
                                                                        .addComponent(jLabel37))))
                                                .addContainerGap(107, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(145, 145, 145))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel23))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel25))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel26))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel27))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel28))
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel30))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel31))
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel32))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel33)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel35))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabel36))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel38))
                                                .addGap(103, 103, 103)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel34))
                                .addGap(0, 163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setResizable(false);
    }// </editor-fold>

    private void render(){
        status = Main.Status.valueOf(applicant.getStatus());
        jLabel23.setText(applicant.getApplicantId());
        jLabel24.setText(applicant.getFirstName());
        jLabel25.setText(applicant.getLastName());
        jLabel26.setText(applicant.getUniqueId());
        jLabel27.setText(applicant.getEmail());
        jLabel28.setText(applicant.getContact());
        jLabel29.setText(applicant.getEntranceRegNo());
        jLabel30.setText(String.valueOf(applicant.getScore()));
        jLabel31.setText(String.valueOf(applicant.getPercentile()));
        jLabel32.setText(applicant.getHscBoard());
        jLabel33.setText(applicant.getHscRegNo());
        jLabel34.setText(String.valueOf(applicant.getHscPercentage()));
        jLabel35.setText(applicant.getBranchName());
        jLabel36.setText(applicant.getStatus());
        if(!applicant.hasEnrollmentForm())
            jLabel37.setText("Not Issued");
        else if(status == Main.Status.UNDER_VERIFICATION || status == Main.Status.ENROLLED)
            jLabel37.setText("Submitted");
        else
            jLabel37.setText("Not Submitted");
        if(applicant.getEnrollmentId()==null)
            jLabel38.setText("Not Assigned");
        else
            jLabel38.setText(applicant.getEnrollmentId());
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            String applicantId = applicant.getApplicantId();
            try{
                Main.dataOutputStream.writeInt(2);
                Main.dataOutputStream.writeUTF(applicantId+"_photograph.*");
                int status = Main.dataInputStream.readInt();
                if(status>=200 && status<=299){
                    String extension = Main.dataInputStream.readUTF();
                    Main.receiveFile("downloads/"+applicantId+"_photograph."+extension);
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File( "downloads/"+applicantId+"_photograph."+extension);
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            String message = "Saved to downloads/"+applicantId+"_photograph."+extension;
                            Dialog dialog = new DialogBox(Main.frame,true,message);
                            dialog.setLocationRelativeTo(Main.frame);
                            dialog.setVisible(true);
                        }
                    }
                }else{
                    String message = "Photograph for "+applicantId+" Not Found";
                    Dialog dialog = new DialogBox(Main.frame,true,message);
                    dialog.setLocationRelativeTo(Main.frame);
                    dialog.setVisible(true);
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton2.addActionListener(e -> {
            String applicantId = applicant.getApplicantId();
            try{
                Main.dataOutputStream.writeInt(2);
                Main.dataOutputStream.writeUTF(applicantId+"_signature.*");
                int status = Main.dataInputStream.readInt();
                if(status>=200 && status<=299){
                    String extension = Main.dataInputStream.readUTF();
                    Main.receiveFile("downloads/"+applicantId+"_signature."+extension);
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File( "downloads/"+applicantId+"_signature."+extension);
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            String message = "Saved to downloads/"+applicantId+"_signature."+extension;
                            Dialog dialog = new DialogBox(Main.frame,true,message);
                            dialog.setLocationRelativeTo(Main.frame);
                            dialog.setVisible(true);
                        }
                    }
                }else{
                    String message = "Signature for "+applicantId+" Not Found";
                    Dialog dialog = new DialogBox(Main.frame,true,message);
                    dialog.setLocationRelativeTo(Main.frame);
                    dialog.setVisible(true);
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton3.addActionListener(e -> {
            String applicantId = applicant.getApplicantId();
            try{
                Main.dataOutputStream.writeInt(2);
                Main.dataOutputStream.writeUTF(applicantId+"_id_proof.*");
                int status = Main.dataInputStream.readInt();
                if(status>=200 && status<=299){
                    String extension = Main.dataInputStream.readUTF();
                    Main.receiveFile("downloads/"+applicantId+"_id_proof."+extension);
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File( "downloads/"+applicantId+"_id_proof."+extension);
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            String message = "Saved to downloads/"+applicantId+"_id_proof."+extension;
                        }
                    }
                }else{
                    String message = "ID Proof for "+applicantId+" Not Found";
                    Dialog dialog = new DialogBox(Main.frame,true,message);
                    dialog.setLocationRelativeTo(Main.frame);
                    dialog.setVisible(true);
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private SerializedApplicant applicant;
    private Main.Status status;
    // End of variables declaration
}
