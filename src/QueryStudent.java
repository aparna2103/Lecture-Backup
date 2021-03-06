
import hib.dto.OperatorTable;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Achint Rawal
 */
public class QueryStudent extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public QueryStudent() {
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

        Footer = new javax.swing.JPanel();
        contactD = new javax.swing.JLabel();
        contactD1 = new javax.swing.JLabel();
        LeftSide = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        settingLabel = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        Query = new javax.swing.JPanel();
        queryLabel = new javax.swing.JLabel();
        Update = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        QueryT = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        LTime = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Footer.setBackground(new java.awt.Color(122, 79, 222));
        Footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactD.setBackground(new java.awt.Color(255, 255, 255));
        contactD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contactD.setForeground(new java.awt.Color(255, 255, 255));
        contactD.setText("Contact Number : +91 1234567890");
        Footer.add(contactD, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 290, 30));

        contactD1.setBackground(new java.awt.Color(255, 255, 255));
        contactD1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contactD1.setForeground(new java.awt.Color(255, 255, 255));
        contactD1.setText("Email Id : lecturebackup@collegename.in");
        Footer.add(contactD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 330, 30));

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1210, 50));

        LeftSide.setBackground(new java.awt.Color(53, 33, 89));
        LeftSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setBackground(new java.awt.Color(255, 255, 255));
        LOGO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N
        LeftSide.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 100));

        Settings.setBackground(new java.awt.Color(64, 43, 100));
        Settings.setPreferredSize(new java.awt.Dimension(500, 300));
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        settingLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingLabel.setText("Settings");
        Settings.add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 360, 50));

        Home.setBackground(new java.awt.Color(64, 43, 100));
        Home.setPreferredSize(new java.awt.Dimension(500, 300));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText(" Home");
        Home.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 360, 50));

        Query.setBackground(new java.awt.Color(85, 65, 118));
        Query.setPreferredSize(new java.awt.Dimension(500, 300));
        Query.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        queryLabel.setBackground(new java.awt.Color(255, 255, 255));
        queryLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        queryLabel.setForeground(new java.awt.Color(255, 255, 255));
        queryLabel.setText("Query");
        Query.add(queryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(Query, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 50));

        Update.setBackground(new java.awt.Color(64, 43, 100));
        Update.setPreferredSize(new java.awt.Dimension(500, 300));
        Update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateLabel.setBackground(new java.awt.Color(255, 255, 255));
        updateLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setText("Updates");
        Update.add(updateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 360, 50));

        getContentPane().add(LeftSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 640));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QueryT.setBackground(new java.awt.Color(255, 255, 255));
        QueryT.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        QueryT.setText("Query :");
        BG.add(QueryT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 160, 40));

        Header.setBackground(new java.awt.Color(122, 79, 222));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LTime.setBackground(new java.awt.Color(255, 255, 255));
        LTime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LTime.setForeground(new java.awt.Color(255, 255, 255));
        LTime.setText("Login Time : ");
        Header.add(LTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 330, 30));

        Welcome.setBackground(new java.awt.Color(255, 255, 255));
        Welcome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome,");
        Header.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 30));

        BG.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 900, 70));

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 690));

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel LTime;
    private javax.swing.JPanel LeftSide;
    private javax.swing.JPanel Query;
    private javax.swing.JLabel QueryT;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Update;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel contactD;
    private javax.swing.JLabel contactD1;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel queryLabel;
    private javax.swing.JLabel settingLabel;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables
}
