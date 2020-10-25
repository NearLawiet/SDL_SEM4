
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LandingPage extends javax.swing.JPanel{
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private DefaultTableModel model;
    private int status;

    public LandingPage() {
        initComponents();
        render();
        addEventListeners();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        model = new DefaultTableModel();

        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton1.setText("Admin Login");

        jButton2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton2.setText("Registered Applicant");

        jButton3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton3.setText("New Applicant");

        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton4.setText("Help and Support");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel2.setText("Sat Oct 24 09:22:23 IST 2020");

        jTable1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTable1.setRowHeight(20);
        jTable1.setEnabled(false);
        jTable1.setModel(model);
        model.addColumn("Event");
        model.addColumn("Date");
        jTable1.setCellSelectionEnabled(false);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setForeground(Color.GRAY);
                return cell;
            }
        });
        jTable1.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setForeground(Color.GRAY);
                return cell;
            }
        });
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(650);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        for(int i=0;i<10;i++)
            model.insertRow(0,new Object[]{"",""});
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56))))
        );
        ImageIcon image = new ImageIcon("static/banner.png");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(1250,320, Image.SCALE_SMOOTH));
        jLabel1.setIcon(icon);
    }

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

        jButton4.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(4);
                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new HelpAndSupport());
                Main.frame.setSize(new HelpAndSupport().getPreferredSize());
                Main.frame.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

    private void render(){
        int n = Main.events.size();
        for(int i=0;i<n;){
            model.insertRow(0,new Object[]{Main.events.get(i++),Main.events.get(i++)});
        }
        Date date = new Date();
        jLabel2.setText(date.toString());

        ScheduledExecutorService timer = Executors.newScheduledThreadPool(1);
        timer.scheduleAtFixedRate(this::updateTime,1,1, TimeUnit.SECONDS);
    }

    private void updateTime(){
        Date date = new Date();
        jLabel2.setText(date.toString());
    }
}
