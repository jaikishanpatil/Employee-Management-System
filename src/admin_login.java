
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class admin_login extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public admin_login() {
		initComponents();
		con = DatabaseConnection.getConnection();
		Seticon();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		kGradientPanel1 = new keeptoo.KGradientPanel();
		rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
		rSLabelImage1 = new rojerusan.RSLabelImage();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		btnLogin = new rojerusan.RSButtonHover();
		Username = new javax.swing.JTextField();
		Password = new javax.swing.JPasswordField();
		lblusername = new javax.swing.JLabel();
		lblpassword = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		rSLabelImage2 = new rojerusan.RSLabelImage();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMaximumSize(new java.awt.Dimension(1368, 806));
		setMinimumSize(new java.awt.Dimension(1368, 806));
		setUndecorated(true);
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
		kGradientPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 0));
		kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 51));
		kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		rSPanelCircleImage1.setColorBorde(new java.awt.Color(0, 0, 0));
		rSPanelCircleImage1
				.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/employee-of-the-month.png"))); // NOI18N

		javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
		rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
		rSPanelCircleImage1Layout.setHorizontalGroup(rSPanelCircleImage1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 70, Short.MAX_VALUE));
		rSPanelCircleImage1Layout.setVerticalGroup(rSPanelCircleImage1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 70, Short.MAX_VALUE));

		kGradientPanel1.add(rSPanelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

		rSLabelImage1
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-avatar-with-check-mark.png"))); // NOI18N
		kGradientPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 180, 180));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
		jLabel1.setText("Admin Login");
		kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

		getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 810));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20));
		jLabel2.setText("User Name");
		jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20));
		jLabel3.setText("Password");
		jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

		btnLogin.setBackground(new java.awt.Color(255, 0, 0));
		btnLogin.setText("Login");
		btnLogin.setColorHover(new java.awt.Color(255, 204, 51));
		btnLogin.setFont(new java.awt.Font("Tahoma", 1, 20));
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoginActionPerformed(evt);
			}
		});
		jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 410, 60));

		Username.setFont(new java.awt.Font("Tahoma", 1, 14));
		Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		Username.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
		jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 390, 50));

		Password.setFont(new java.awt.Font("Tahoma", 1, 14));
		Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		Password.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
		jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 400, 50));

		lblusername.setFont(new java.awt.Font("Tahoma", 1, 13));
		lblusername.setForeground(new java.awt.Color(255, 0, 0));
		lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 390, 30));

		lblpassword.setFont(new java.awt.Font("Tahoma", 1, 13));
		lblpassword.setForeground(new java.awt.Color(255, 0, 0));
		lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 400, 30));

		jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 15));
		jCheckBox1.setText("Show Password");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});
		jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 230, 30));

		rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4853433.jpg")));
		jPanel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 810));

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 890, 810));

		pack();
		setLocationRelativeTo(null);
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

		if (jCheckBox1.isSelected()) {
			Password.setEchoChar((char) 0);
		} else {
			Password.setEchoChar('*');
		}
	}

	private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
		if (Username.getText().trim().isEmpty() && Password.getText().trim().isEmpty()) {
			lblusername.setText("User Name is Empty");
			lblpassword.setText("Password is Empty");
		}

		else if (Username.getText().trim().isEmpty()) {
			lblusername.setText("Username is Empty");

		} else if (Password.getText().trim().isEmpty()) {

			lblpassword.setText("Password is Empty");
		} else {
		}
		if (Username == null || Password == null) {

			JOptionPane.showMessageDialog(null, "Some Fields are empty !");

		} else {

			String sql = "select * from admin_login where username=? and password=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, Username.getText());
				ps.setString(2, Password.getText());
				rs = ps.executeQuery();
				if (rs.next()) {
					rs.close();
					ps.close();
					admin_home lod = new admin_home();
					lod.setVisible(true);
					this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}

		}
	}

	public static void main(String args[]) {

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new admin_login().setVisible(true);
			}
		});
	}

	private javax.swing.JPasswordField Password;
	private javax.swing.JTextField Username;
	private rojerusan.RSButtonHover btnLogin;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private keeptoo.KGradientPanel kGradientPanel1;
	private javax.swing.JLabel lblpassword;
	private javax.swing.JLabel lblusername;
	private rojerusan.RSLabelImage rSLabelImage1;
	private rojerusan.RSLabelImage rSLabelImage2;
	private rojerusan.RSPanelCircleImage rSPanelCircleImage1;

	private void Seticon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images\\employee-of-the-month.png")));
	}
}
