
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class update_employee extends javax.swing.JFrame {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    String gender;
    public update_employee() {
        initComponents();
        con = DatabaseConnection.getConnection();
        show_user();
        Seticon();
    }
    public void show_user(){
    
    ArrayList<User> list = userList();
    DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
    Object[] row = new Object[9];
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getEmployeeID();
        row[1]=list.get(i).EmployeeDepartment();
        row[2]=list.get(i).NameOfEmployee();
        row[3]=list.get(i).DateOfBirth();
        row[4]=list.get(i).PhoneNumber();
        row[5]=list.get(i).Email();
        row[6]=list.get(i).EmployeeSalary();
        row[7]=list.get(i).Address();
        row[8]=list.get(i).Gender();
        model.addRow(row);
    
    }
    }
   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel9 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        EmployeeSalary = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        Refresh = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();

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
        jLabel1.setText("Update Employee ");
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel4.setText("Employee Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 175, 24));

        employeedepartment.setBackground(new java.awt.Color(0, 0, 0));
        employeedepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOC", "SOB", "SOE" }));
        getContentPane().add(employeedepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel5.setText("Name Of Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 175, 30));
        getContentPane().add(NameOfEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, 30));
        getContentPane().add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel9.setText("Phone Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 140, 30));

        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 30));

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        email.setText("Email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 70, 30));

        Email.setToolTipText("");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 330, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel13.setText("Employee Salary");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 190, 30));

        EmployeeSalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "2000", "3000", "4000" }));
        getContentPane().add(EmployeeSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 320, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel12.setText("Address");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 140, 20));
        getContentPane().add(Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 330, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel14.setText("Gender");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 70, 20));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 130, 40));

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 60, -1));

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 70, -1));

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Back");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, 140, 40));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg")));

        getContentPane().add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 390, 620));

        jTable_Display_User.setBackground(new java.awt.Color(175, 175, 175));
        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployID", "EmployeeDepartment", "NameOfEmployee", "DateOfBirth", "PhoneNumber", "Email", "EmployeeSalary", "Address", "Gender"
            }
        ));
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 980, 620));

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

                String setDateOfBirth = rs.getString("DateOfBirth");
                DateOfBirth.setText(setDateOfBirth);

                String setPhoneNumber = rs.getString("PhoneNumber");
                PhoneNumber.setText(setPhoneNumber);

                String setEmail = rs.getString("Email");
                Email.setText(setEmail);

                String salary = rs.getString("EmployeeSalary");
                switch(salary){
                    case "1000":
                    EmployeeSalary.setSelectedIndex(0);
                    break;
                    case "2000":
                    EmployeeSalary.setSelectedIndex(1);
                    break;
                    case "3000":
                    EmployeeSalary.setSelectedIndex(2);
                    break;
                    case "4000":
                    EmployeeSalary.setSelectedIndex(3);
                    break;
                }
                String setAddress = rs.getString("Address");
                Adress.setText(setAddress);

                String sex = rs.getString("Gender");
                if(sex.equals("male")){
                    male.setSelected(true);
                }
                else{
                    female.setSelected(true);
                }

            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void SearchdataKeyReleased(java.awt.event.KeyEvent evt) {
        
    }

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {
        Employees em = new Employees();
        em.setVisible(true);
        this.dispose();

    }

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {
       
        int i = jTable_Display_User.getSelectedRow();
        TableModel model = jTable_Display_User.getModel();
        EmployeeID.setText(model.getValueAt(i,0).toString());

        String course = model.getValueAt(i, 1).toString();
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

        NameOfEmployee.setText(model.getValueAt(i,2).toString());
        DateOfBirth.setText(model.getValueAt(i,3).toString());
        PhoneNumber.setText(model.getValueAt(i,4).toString());
        Email.setText(model.getValueAt(i,5).toString());
        String salary = model.getValueAt(i, 6).toString();
        switch(salary){
            case "1000":
            EmployeeSalary.setSelectedIndex(0);
            break;
            case "2000":
            EmployeeSalary.setSelectedIndex(1);
            break;
            case "3000":
            EmployeeSalary.setSelectedIndex(2);
            break;
            case "4000":
            EmployeeSalary.setSelectedIndex(3);
            break;
        }
        Adress.setText(model.getValueAt(i,7).toString());
        String sex = model.getValueAt(i,8).toString();
        if(sex.equals("male")){
            male.setSelected(true);
        }
        else{
            female.setSelected(true);
        }

    }

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {
        
         try{

            
            String value = EmployeeID.getText();
            String query = "UPDATE addemployee SET employeedepartment=?, NameOfEmployee=?, DateOfBirth=?, PhoneNumber=?, Email=?, EmployeeSalary=?, Address=?, Gender=? where EmployeeID="+value;
             PreparedStatement pst = con.prepareStatement(query);
            
            
            String course;
            course=employeedepartment.getSelectedItem().toString();
            pst.setString(1, course);
            pst.setString(2, NameOfEmployee.getText());
            pst.setString(3, DateOfBirth.getText());
            pst.setString(4, PhoneNumber.getText());
            pst.setString(5, Email.getText());
            String salary;
            salary=EmployeeSalary.getSelectedItem().toString();
            pst.setString(6, salary);
            pst.setString(7,Adress.getText());
            if(male.isSelected()){

                gender="male";

            }
            if(female.isSelected()){
                gender="female";
            }
            pst.setString(8, gender);
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Updated Sucessfully!");
            DefaultTableModel DefaultTableModel;
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();
            
            employeedepartment.setSelectedIndex(0);
            NameOfEmployee.setText(null);
            DateOfBirth.setText(null);
            PhoneNumber.setText(null);
            Email.setText(null);
            EmployeeSalary.setSelectedIndex(0);
            Adress.setText(null);
            buttonGroup1.clearSelection();
        
        
    }                                      
catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }

    }
    public static void main(String args[]) {
       
       try {
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(update_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_employee().setVisible(true);
            }
        });
    }

   
    private javax.swing.JTextField Adress;
    private javax.swing.JTextField DateOfBirth;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JComboBox<String> EmployeeSalary;
    private javax.swing.JTextField NameOfEmployee;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Searchdata;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel email;
    private javax.swing.JComboBox employeedepartment;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JRadioButton male;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private javax.swing.JButton update;
    

    private ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try{

            
            String query1="SELECT * FROM addemployee";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query1);
            User user;
            while(rs.next()){
            user=new User(rs.getInt("EmployeeID"), rs.getString("EmployeeDepartment"), rs.getString("NameOfEmployee"), rs.getString("DateOfBirth"), rs.getString("PhoneNumber"),  rs.getString("Email"),   rs.getString("EmployeeSalary"), rs.getString("Address"), rs.getString("Gender"));
            usersList.add(user);
            
            }
            
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
        return usersList;
    
    }

    private void Seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
    }
}
