package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Account;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Details extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnEdit;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	String nam,phn,usr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
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
	public Details() {
		Account a=new Account();
		a.details();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAccountDetails = new JLabel("Account Details");
		lblAccountDetails.setBounds(157, 17, 109, 20);
		lblAccountDetails.setFont(new Font("FreeSerif", Font.BOLD, 16));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(85, 64, 44, 15);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(22, 117, 107, 15);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(54, 176, 75, 15);
		contentPane.setLayout(null);
		contentPane.add(lblAccountDetails);
		contentPane.add(lblName);
		contentPane.add(lblPhoneNumber);
		contentPane.add(lblUsername);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(157, 64, 137, 15);
		System.out.println(a.getName());
		lblNewLabel.setText(a.getName());
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(157, 117, 109, 15);
		lblNewLabel_1.setText(a.getPhonenumber());
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(157, 176, 109, 15);
		lblNewLabel_2.setText(a.getUsername());
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Details.class.getResource("/resources/image.png")));
		if(a.getImage()==null) {
			lblNewLabel_3.setIcon(new ImageIcon(Details.class.getResource("/resources/account(1).png")));
		}
		else {
		lblNewLabel_3.setIcon(new ImageIcon(a.getImage()));
		}
		lblNewLabel_3.setBounds(312, 95, 109, 96);
		contentPane.add(lblNewLabel_3);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(207, 233, 114, 25);
		contentPane.add(btnEdit);
		
		btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(333, 233, 114, 25);
		contentPane.add(btnNewButton);
		createEvents(a.getName(),a.getPhonenumber(),a.getUsername());
	}
	
	public void createEvents(String na,String ph,String usern) {
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Account a= new Account();
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String name=JOptionPane.showInputDialog(contentPane, "Enter name you want to change:", "Change Name", JOptionPane.PLAIN_MESSAGE);
						System.out.println(name);
						if(name==null) {
							nam=na;
						}
						else {
							nam=name;
						}
						a.changeName(nam);
					}
				});
				
				lblNewLabel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String phone=JOptionPane.showInputDialog(contentPane, "Enter phonenumber you want to change:", "Change Number", JOptionPane.PLAIN_MESSAGE);
						System.out.println(phone);
						if(phone==null) {
							phn=ph;
						}
						else {
							phn=phone;
						}
						a.changeNumber(phn);
					}
				});
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}
