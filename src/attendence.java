
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class attendence extends javax.swing.JFrame {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public attendence() {
        initComponents();
        con = DatabaseConnection.getConnection();
        Seticon();
        show_user();
    }
     public ArrayList<Atten> attenList(){
       ArrayList<Atten> attenList = new ArrayList<>();
        try{

            
            String query1="SELECT * FROM attendence";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query1);
            Atten atten;
            while(rs.next()){
            atten=new Atten(rs.getInt("EmployeeID"), rs.getString("EmployeeDepartment"), rs.getString("NameOfEmployee"), rs.getString("DateOfBirth"), rs.getString("Date"));
            attenList.add(atten);
            
            }
            
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
        return attenList;
    

      }
    public void show_user(){
    
    ArrayList<Atten> list = attenList();
    DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
    Object[] row = new Object[5];
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getEmployeeID();
        row[1]=list.get(i).EmployeeDepartment();
        row[2]=list.get(i).NameOfEmployee();
        row[3]=list.get(i).DateOfBirth();
        row[4]=list.get(i).Date();
       
        model.addRow(row);
    
    }
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
        jLabel4 = new javax.swing.JLabel();
        employeedepartment = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        NameOfEmployee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateOfBirth = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        Refresh2 = new javax.swing.JButton();
        Refresh1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rSLabelImage2 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1368, 806));
        setMinimumSize(new java.awt.Dimension(1368, 806));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar1.png"))); // NOI18N
        kGradientPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Attendence");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 40));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-avatar-with-check-mark.png"))); // NOI18N
        rSLabelImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, 50, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@Copyright 2022 TCR Innovation Jaikishan");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 60));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Employee ID ");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        EmployeeID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        Searchdata.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Employee Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 175, 24));

        employeedepartment.setBackground(new java.awt.Color(0, 0, 0));
        employeedepartment.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        employeedepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOC", "SOB", "SOE" }));
        employeedepartment.setEnabled(false);
        getContentPane().add(employeedepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 330, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name Of Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 175, 30));

        NameOfEmployee.setEditable(false);
        NameOfEmployee.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NameOfEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(NameOfEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 330, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 110, 30));

        DateOfBirth.setEditable(false);
        DateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DateOfBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 330, 30));

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Add Attendence");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 210, 40));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 470, 420));

        Refresh2.setBackground(new java.awt.Color(0, 0, 0));
        Refresh2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh2.setForeground(new java.awt.Color(255, 255, 255));
        Refresh2.setText("Print Attendence Chart");
        Refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh2ActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 250, 40));

        Refresh1.setBackground(new java.awt.Color(0, 0, 0));
        Refresh1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh1.setForeground(new java.awt.Color(255, 255, 255));
        Refresh1.setText("Back");
        Refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh1ActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, 500, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Attendence Chart");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "EmployeeDepartment", "NameofEmployee", "DateOfBirth", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable_Display_User);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 500, 420));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 330, 40));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg"))); // NOI18N
        getContentPane().add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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

                String setDateOfBirth = rs.getString("DateOfBirth");
                DateOfBirth.setText(setDateOfBirth);

                

            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void SearchdataKeyReleased(java.awt.event.KeyEvent evt) {
        
    }

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {
       try{

           
            String query = "insert into attendence(EmployeeID,EmployeeDepartment,NameOfEmployee,DateOfBirth,date)values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            
             String course;
            pst.setString(1,EmployeeID.getText());   
            course=employeedepartment.getSelectedItem().toString();
            pst.setString(2, course);
            pst.setString(3, NameOfEmployee.getText());
            pst.setString(4, DateOfBirth.getText());
            pst.setString(5, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Attendence Marked Sucessfully!");
             DefaultTableModel DefaultTableModel;
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();
          area.setText("********************************************************************\n");
        area.setText(area.getText()+"*                                     Attendence Receipt                                  *\n");
        area.setText(area.getText()+"********************************************************************\n");
        
        Date obj = new Date();
        
        String date = obj.toString();
        area.setText(area.getText()+""+date+"\n\n\n");
        area.setText(area.getText()+"Employee ID : "+EmployeeID.getText()+"\n\n\n");
        area.setText(area.getText()+"********************************************************************\n");
        area.setText(area.getText()+"Employee Name : "+NameOfEmployee.getText()+"\n\n\n");
        area.setText(area.getText()+"Employee Department : "+employeedepartment.getSelectedItem()+"\n\n\n");
        area.setText(area.getText()+"Date : "+jDateChooser1.getDate()+"\n\n\n");
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void Refresh2ActionPerformed(java.awt.event.ActionEvent evt) {
        try
{
area.print();
}
catch(Exception e)
{
}

    }

    private void Refresh1ActionPerformed(java.awt.event.ActionEvent evt) {
        admin_home em = new admin_home();
        em.setVisible(true);
        this.dispose();

    }
    public static void main(String args[]) {
       
       try {
           
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendence().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField DateOfBirth;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField NameOfEmployee;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Refresh1;
    private javax.swing.JButton Refresh2;
    private javax.swing.JButton Searchdata;
    private javax.swing.JTextArea area;
    private javax.swing.JComboBox employeedepartment;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_User;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;


    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
    }
}
