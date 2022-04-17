
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Employees extends javax.swing.JFrame {

   
    public Employees() {
        initComponents();
        Seticon();
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        rSLabelImage8 = new rojerusan.RSLabelImage();
        jLabel8 = new javax.swing.JLabel();
        rSLabelImage13 = new rojerusan.RSLabelImage();
        jPanel6 = new javax.swing.JPanel();
        rSLabelImage9 = new rojerusan.RSLabelImage();
        jLabel9 = new javax.swing.JLabel();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        jPanel5 = new javax.swing.JPanel();
        rSLabelImage10 = new rojerusan.RSLabelImage();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rSLabelImage7 = new rojerusan.RSLabelImage();
        jLabel7 = new javax.swing.JLabel();
        rSLabelImage12 = new rojerusan.RSLabelImage();
        jPanel2 = new javax.swing.JPanel();
        rSLabelImage6 = new rojerusan.RSLabelImage();
        jLabel6 = new javax.swing.JLabel();
        rSLabelImage14 = new rojerusan.RSLabelImage();
        jPanel1 = new javax.swing.JPanel();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        jLabel5 = new javax.swing.JLabel();
        rSLabelImage11 = new rojerusan.RSLabelImage();
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

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); 
        kGradientPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setText("Employees");
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 240, 240));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 130));

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); 
        rSLabelImage8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage8MouseClicked(evt);
            }
        });
        jPanel7.add(rSLabelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Search Employee");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        rSLabelImage13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying-glass.png"))); 
        jPanel7.add(rSLabelImage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 50));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 240, 240));

        jPanel6.setBackground(new java.awt.Color(255, 204, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); 
        rSLabelImage9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage9MouseClicked(evt);
            }
        });
        jPanel6.add(rSLabelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Delete Employee");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (1).png"))); 
        jPanel6.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 50));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 240, 240));

        jPanel5.setBackground(new java.awt.Color(255, 204, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); 
        rSLabelImage10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage10MouseClicked(evt);
            }
        });
        jPanel5.add(rSLabelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 240, 240));

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); 
        rSLabelImage7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage7MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Update Employee");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        rSLabelImage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-button (1).png"))); 
        jPanel4.add(rSLabelImage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 240, 240));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); 
        rSLabelImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage6MouseClicked(evt);
            }
        });
        jPanel2.add(rSLabelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Add Employee");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        rSLabelImage14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png")));
        jPanel2.add(rSLabelImage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 240, 240));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); 
        rSLabelImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage5MouseClicked(evt);
            }
        });
        jPanel1.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Employee Details");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        rSLabelImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details (1).png"))); 
        jPanel1.add(rSLabelImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 240, 240));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg"))); 
        getContentPane().add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 620));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@TCR 2022 All Right Reserved");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 60));

        pack();
        setLocationRelativeTo(null);
    }
private JFrame frame1;
    private void rSLabelImage3MouseClicked(java.awt.event.MouseEvent evt) {
           frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Employees",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };;
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
         frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Employees",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };;
 
    }

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {
        
        emp_details emp = new emp_details();
        emp.setVisible(true);
        this.dispose();
    }

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {
      
        add_employee ne = new add_employee();
        ne.setVisible(true);
        this.dispose();
    }

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {
        
    }

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {
        update_employee up = new update_employee();
        up.setVisible(true);
        this.dispose();
    }

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {
        admin_home ad = new admin_home();
        ad.setVisible(true);
        this.dispose();
    }

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {
        delete_employee bb = new delete_employee();
        bb.setVisible(true);
        this.dispose();
    }

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {
        search_employee ne = new search_employee();
        ne.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage5MouseClicked(java.awt.event.MouseEvent evt) {
        emp_details emp = new emp_details();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage6MouseClicked(java.awt.event.MouseEvent evt) {
        add_employee emp = new add_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage7MouseClicked(java.awt.event.MouseEvent evt) {
        update_employee emp = new update_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage8MouseClicked(java.awt.event.MouseEvent evt) {
        search_employee emp = new search_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage9MouseClicked(java.awt.event.MouseEvent evt) {
        delete_employee emp = new delete_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void rSLabelImage10MouseClicked(java.awt.event.MouseEvent evt) {
        admin_home emp = new admin_home();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
        emp_details emp = new emp_details();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        add_employee emp = new add_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        update_employee emp = new update_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
        search_employee emp = new search_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {
        delete_employee emp = new delete_employee();
        emp.setVisible(true);
        this.dispose();
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        admin_home emp = new admin_home();
        emp.setVisible(true);
        this.dispose();
    }
    public static void main(String args[]) {
       
        try {
           
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage10;
    private rojerusan.RSLabelImage rSLabelImage11;
    private rojerusan.RSLabelImage rSLabelImage12;
    private rojerusan.RSLabelImage rSLabelImage13;
    private rojerusan.RSLabelImage rSLabelImage14;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private rojerusan.RSLabelImage rSLabelImage6;
    private rojerusan.RSLabelImage rSLabelImage7;
    private rojerusan.RSLabelImage rSLabelImage8;
    private rojerusan.RSLabelImage rSLabelImage9;
    

    private void Seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
       
    }

   
}
