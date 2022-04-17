
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class admin_home extends javax.swing.JFrame {

    public admin_home() {
        initComponents();
        Seticon();
    }
private JFrame frame1;
    @SuppressWarnings("unchecked")
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        rSLabelImage6 = new rojerusan.RSLabelImage();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSLabelImage7 = new rojerusan.RSLabelImage();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        jLabel4 = new javax.swing.JLabel();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1368, 806));
        setMinimumSize(new java.awt.Dimension(1368, 806));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); 
        kGradientPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setText("Home");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 40));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-avatar-with-check-mark.png"))); 
        rSLabelImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, 50, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 80, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 130));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); 
        rSLabelImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage5MouseClicked(evt);
            }
        });
        jPanel1.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        rSLabelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man (1).png"))); 
        jPanel1.add(rSLabelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Employees");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 240, 240));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar1.png"))); 
        rSLabelImage7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage7MouseClicked(evt);
            }
        });
        jPanel2.add(rSLabelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 150));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Attendence");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 240, 240));

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commission.png"))); 
        rSLabelImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage4MouseClicked(evt);
            }
        });
        jPanel3.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Salary Slip");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 240, 240));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg"))); 
        getContentPane().add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 620));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@Copyright 2022 TCR Innovation Jaikishan");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 60));

        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
          frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Home",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };
    }

    private void rSLabelImage3MouseClicked(java.awt.event.MouseEvent evt) {
      
           frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Home",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };
    }

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {
        
        Employees emp = new Employees();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage5MouseClicked(java.awt.event.MouseEvent evt) {
         Employees emp = new Employees();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
         Employees emp = new Employees();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage7MouseClicked(java.awt.event.MouseEvent evt) {
        attendence att = new attendence();
        att.setVisible(true);
        this.dispose();
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
         attendence att = new attendence();
        att.setVisible(true);
        this.dispose();
    }

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {
         attendence att = new attendence();
        att.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage4MouseClicked(java.awt.event.MouseEvent evt) {
       
        salary sa = new salary();
        sa.setVisible(true);
        this.dispose();
        
    }

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {
        salary sa = new salary();
        sa.setVisible(true);
        this.dispose();
    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        salary sa = new salary();
        sa.setVisible(true);
        this.dispose();
    }
    public static void main(String args[]) {
     
           
     try {
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private rojerusan.RSLabelImage rSLabelImage6;
    private rojerusan.RSLabelImage rSLabelImage7;
  

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
    }
}
