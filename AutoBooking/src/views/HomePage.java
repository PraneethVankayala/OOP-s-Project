package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Account;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JMenuBar menuBar;
	private JMenu mnAccount;
	private JMenuItem mntmSignout;
	private JMenuItem mntmChangePassword;
	private JMenu mnTickets;
	private JMenuItem mntmMyTickets;
	private JMenuItem mntmCancelTickets;
	private JMenuItem mntmDeactivateAccount;
	private JMenuItem mntmDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		
		initComponents();
		createEvents();
		
	}
	
	public void initComponents() {
		setTitle("TravelApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnTickets = new JMenu("Tickets");
		menuBar.add(mnTickets);
		
		mntmMyTickets = new JMenuItem("My Tickets");
		mnTickets.add(mntmMyTickets);
		
		mntmCancelTickets = new JMenuItem("Cancel Tickets");
		
		mnTickets.add(mntmCancelTickets);
		
		mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		mntmDetails = new JMenuItem("Details");
		mnAccount.add(mntmDetails);
		
		mntmChangePassword = new JMenuItem("Change Password");
		
		mnAccount.add(mntmChangePassword);
		
		mntmDeactivateAccount = new JMenuItem("Deactivate Account");
		mnAccount.add(mntmDeactivateAccount);
		
		mntmSignout = new JMenuItem("SignOut");
		
		mnAccount.add(mntmSignout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("BusBooking");
		
		
		btnNewButton_1 = new JButton("TrainBooking");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(149, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addComponent(btnNewButton)
					.addGap(44)
					.addComponent(btnNewButton_1)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void createEvents() {
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Train t=new Train();
				t.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Bus b=new Bus();
				b.setVisible(true);
				dispose();
			}
		});
		
		mntmSignout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l=new Login();
				l.setVisible(true);
				dispose();
			}
		});
		
		mntmMyTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyTickets t=new MyTickets();
				t.setVisible(true);
			}
		});
		
		mntmCancelTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CancelTicket c=new CancelTicket();
				c.setVisible(true);
			}
		});
		
		mntmDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Details d=new Details();
				d.setVisible(true);
			}
		});
		
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Account a=new Account();
				String password=JOptionPane.showInputDialog(contentPane,"Password:","Change Password",JOptionPane.PLAIN_MESSAGE);
				a.changePassword(password);
			}
		});
		
		mntmDeactivateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Account a=new Account();
				a.DeleteAccount();
				Login l=new Login();
				l.setVisible(true);
				dispose();
			}
		});
	}
}
