
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.UIManager;

public class emp_details extends javax.swing.JFrame {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
   
    public emp_details() {
        initComponents();
        con = DatabaseConnection.getConnection();
        Seticon();
        show_user();
        
         jTable_Display_User.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable_Display_User.getTableHeader().setOpaque(false);
        jTable_Display_User.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable_Display_User.getTableHeader().setForeground(new Color(0,0,0));
        jTable_Display_User.setRowHeight(25);
    }
    
       public ArrayList<User> userList(){
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();

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

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); // NOI18N
        kGradientPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee Details");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Display_User.setBackground(new java.awt.Color(175, 175, 175));
        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployID", "EmployeeDepartment", "NameOfEmployee", "DateOfBirth", "PhoneNumber", "Email", "EmployeeSalary", "Address", "Gender"
            }
        ));
        jTable_Display_User.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 580));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 51));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@TCR 2022 All Right Reserved");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1370, 60));

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Back");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1370, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 680));

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

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {
        
    }

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {
        Employees em = new Employees();
        em.setVisible(true);
        this.dispose();
    }
    public static void main(String args[]) {
       
      try {
           
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_details().setVisible(true);
            }
        });
    }
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage3;

    private void Seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
}

   
}
