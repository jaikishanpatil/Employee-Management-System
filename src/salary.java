
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class salary extends javax.swing.JFrame {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public salary() {
        initComponents();
        con = DatabaseConnection.getConnection();
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
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        Searchdata = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameOfEmployee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pfamount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EmployeeSalary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        employeedepartment = new javax.swing.JComboBox();
        Refresh = new javax.swing.JButton();
        Refresh1 = new javax.swing.JButton();
        Refresh2 = new javax.swing.JButton();
        Refresh3 = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();

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
        jLabel1.setText("Employee Salary");
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

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@TCR 2022 All Right Reserved");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 60));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel15.setText("Employee ID ");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        EmployeeID.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                EmployeeIDComponentRemoved(evt);
            }
        });
        EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });
        EmployeeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmployeeIDKeyReleased(evt);
            }
        });
        jPanel5.add(EmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, 30));

        Searchdata.setBackground(new java.awt.Color(0, 0, 0));
        Searchdata.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Searchdata.setForeground(new java.awt.Color(255, 255, 255));
        Searchdata.setText("Search");
        Searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchdataActionPerformed(evt);
            }
        });
        Searchdata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchdataKeyReleased(evt);
            }
        });
        jPanel5.add(Searchdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel6.setText("Employee Department");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 229, 31));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 340, 60));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel5.setText("Name Of Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 229, 31));

        NameOfEmployee.setEditable(false);
        NameOfEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameOfEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(NameOfEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel4.setText("Employee Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 229, 31));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel7.setText("Bonus");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 120, 30));

        pfamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfamountKeyReleased(evt);
            }
        });
        getContentPane().add(pfamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel8.setText("Basic Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 30));

        EmployeeSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(EmployeeSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel9.setText("Total Salary");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 110, 30));

        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 320, 30));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); 
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 470, 530));

        employeedepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOC", "SOB", "SOE" }));
        getContentPane().add(employeedepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 330, 30));

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Print");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 140, 40));

        Refresh1.setBackground(new java.awt.Color(0, 0, 0));
        Refresh1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh1.setForeground(new java.awt.Color(255, 255, 255));
        Refresh1.setText("Back");
        Refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh1ActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 140, 40));

        Refresh2.setBackground(new java.awt.Color(0, 0, 0));
        Refresh2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh2.setForeground(new java.awt.Color(255, 255, 255));
        Refresh2.setText("Generate Receipt");
        Refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh2ActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 440, 40));

        Refresh3.setBackground(new java.awt.Color(0, 0, 0));
        Refresh3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh3.setForeground(new java.awt.Color(255, 255, 255));
        Refresh3.setText("Clear");
        Refresh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh3ActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 670, 140, 40));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg"))); 
        getContentPane().add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 640));

        pack();
        setLocationRelativeTo(null);
    }
private JFrame frame1;

    private void rSLabelImage3MouseClicked(java.awt.event.MouseEvent evt) {
        frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Employee details",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };;
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Employee details",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new admin_login().setVisible(true);
        };;
    }

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {
        
    }

    private void EmployeeIDComponentRemoved(java.awt.event.ContainerEvent evt) {
       
    }

    private void EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void EmployeeIDKeyReleased(java.awt.event.KeyEvent evt) {
       
    }

    private void SearchdataActionPerformed(java.awt.event.ActionEvent evt) {
        try{

           
            String query = "Select * from addemployee where EmployeeID =? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, EmployeeID.getText());

              ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String setid = rs.getString("EmployeeID");
                EmployeeID.setText(setid);

                String course = rs.getString("employeedepartment");
                switch(course){
                    case "SOC":
                    employeedepartment.setSelectedIndex(0);
                    break;
                    case "SOB":
                    employeedepartment.setSelectedIndex(1);
                    break;
                    case "SOE":
                    employeedepartment.setSelectedIndex(2);
                    break;
                }
            

                String setNameOfEmployee = rs.getString("NameOfEmployee");
                NameOfEmployee.setText(setNameOfEmployee);

                String setEmployeeSalary = rs.getString("EmployeeSalary");
                EmployeeSalary.setText(setEmployeeSalary);

            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }  

    }

    private void SearchdataKeyReleased(java.awt.event.KeyEvent evt) {
        
    }

    private void NameOfEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void pfamountKeyReleased(java.awt.event.KeyEvent evt) {
        int d=Integer.parseInt(pfamount.getText());
        int e=Integer.parseInt(EmployeeSalary.getText());
        int f=d+e;
        total.setText(f+"");        
    }

    private void EmployeeSalaryActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {
         try
        {
            area.print();
        }
        catch(Exception e)
        {
        }
    }

    private void Refresh1ActionPerformed(java.awt.event.ActionEvent evt) {
        admin_home sa = new admin_home();
        sa.setVisible(true);
        this.dispose();
    }

    private void Refresh2ActionPerformed(java.awt.event.ActionEvent evt) {
         try{

           
            String query = "insert into salary(EmployeeID,NameOfEmployee,EmployeeDepartment,Bonus,Basic_salary,Total_salary)values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1,EmployeeID.getText());
            pst.setString(2, NameOfEmployee.getText());
            String course;
            course=employeedepartment.getSelectedItem().toString();
            pst.setString(3, course);
            pst.setString(4, pfamount.getText());
            pst.setString(5, EmployeeSalary.getText());
            pst.setString(6, total.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Sallary Saved Sucessfully!");
         
          
            
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
        area.setText("********************************************************************\n");
        area.setText(area.getText()+"*                                     salary Receipt                                  *\n");
        area.setText(area.getText()+"********************************************************************\n");

        Date obj = new Date();

        String date = obj.toString();
        area.setText(area.getText()+""+date+"\n\n\n");
        area.setText(area.getText()+"Employee ID : "+EmployeeID.getText()+"\n\n\n");
        area.setText(area.getText()+"Employee Name : "+NameOfEmployee.getText()+"\n\n\n");
        area.setText(area.getText()+"Employee Department : "+employeedepartment.getSelectedItem()+"\n\n\n");
        area.setText(area.getText()+"PF Amount : Rs. "+pfamount.getText()+"\n\n\n");
        area.setText(area.getText()+"Employee Salary : Rs. "+EmployeeSalary.getText()+"\n\n\n");
        area.setText(area.getText()+"Total Salary : Rs. "+total.getText()+"");
    }

    private void Refresh3ActionPerformed(java.awt.event.ActionEvent evt) {
         EmployeeID.setText("");
        employeedepartment.setSelectedIndex(0);
        NameOfEmployee.setText("");
        EmployeeSalary.setText("");
        pfamount.setText("");
        area.setText("");
        total.setText("");
    }
    public static void main(String args[]) {
        
       try {
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

   
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField EmployeeSalary;
    private javax.swing.JTextField NameOfEmployee;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Refresh1;
    private javax.swing.JButton Refresh2;
    private javax.swing.JButton Refresh3;
    private javax.swing.JButton Searchdata;
    private javax.swing.JTextArea area;
    private javax.swing.JComboBox employeedepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField pfamount;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private javax.swing.JTextField total;
    

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
    }
}
