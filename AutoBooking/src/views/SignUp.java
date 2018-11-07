package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SignupContol;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField usernamefield;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnSignup;
	private JLabel lblEnter;
	private JButton btnBrowse;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		
		initComponents();
		createEvents();
		
	}
	
	public void initComponents() {
		setTitle("AutoBooking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name:");
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		
		numberField = new JTextField();
		numberField.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName:");
		
		usernamefield = new JTextField();
		usernamefield.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		
		passwordField = new JPasswordField();
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password:");
		
		passwordField_1 = new JPasswordField();
		
		btnSignup = new JButton("SignUp");
		
		lblEnter = new JLabel("Enter the correct Password");
		lblEnter.setForeground(Color.RED);
		lblEnter.setVisible(false);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/resources/image.png")));

		
		btnBrowse = new JButton("Browse");
		
		JLabel lblx = new JLabel("100X100");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblReenterPassword)
								.addComponent(lblPassword)
								.addComponent(lblUsername)
								.addComponent(lblPhoneNumber)
								.addComponent(lblName))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addComponent(usernamefield)
									.addComponent(numberField)
									.addComponent(nameField)))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnSignup)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(12)
											.addComponent(lblx))
										.addComponent(btnBrowse)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(82)
							.addComponent(lblEnter)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPhoneNumber)
								.addComponent(numberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsername)
								.addComponent(usernamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReenterPassword)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblEnter))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBrowse)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblx)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnSignup)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void createEvents() {
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=nameField.getText().toString();
				String i=numberField.getText().toString();
				String user=usernamefield.getText().toString();
				String password=passwordField.getText().toString();
				String repass=passwordField_1.getText().toString();
				if(password.equals(repass)) {
					SignupContol su=new SignupContol();
					su.enterFields(s, i, user, password, repass);
					Login l=new Login();
					l.setVisible(true);
					dispose();
				}
				else {
					lblEnter.setVisible(true);
				}
			}
		});
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File f=new File();
				f.setVisible(true);
				f.dispose();
				if(f.getS()!=null) {
				lblNewLabel.setIcon(new ImageIcon(f.getS()));
				}
				else {
					lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/resources/account(1).png")));
				}
				}
		});
	}
}
