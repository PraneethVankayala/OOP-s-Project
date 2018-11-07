package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Tickets;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusTicket extends JFrame {

	private JPanel contentPane;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BusTicket frame = new BusTicket();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BusTicket(String from,String to,String date,int seats,String busNo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBusTicket = new JLabel("Bus Ticket");
		lblBusTicket.setFont(new Font("FreeSerif", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BusTicket.class.getResource("/resources/bus.jpeg")));
		
		JLabel lblFrom = new JLabel("From:");
		
		JLabel lblNewLabel_1 = new JLabel(from);
		
		JLabel lblTo = new JLabel("To:");
		
		JLabel lblNewLabel_2 = new JLabel(to);
		
		JLabel lblDate = new JLabel("Date:");
		
		JLabel lblNewLabel_3 = new JLabel(date);
		
		JLabel lblSeats = new JLabel("Seats:");
		String s=String.valueOf(seats);
		JLabel lblNewLabel_4 = new JLabel(s);
		
		JLabel lblBusNo = new JLabel("Bus No:");
		
		JLabel lblNewLabel_5 = new JLabel(busNo);
		
		btnOk = new JButton("Ok");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblSeats)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblTo)
												.addComponent(lblDate)))
										.addComponent(lblFrom))
									.addGap(20))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBusNo)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(btnOk)))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblBusTicket, Alignment.LEADING))
					.addGap(45))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBusTicket)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(41)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFrom)
										.addComponent(lblNewLabel_1))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(24)
											.addComponent(lblNewLabel_2))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(26)
											.addComponent(lblTo)))
									.addGap(19)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblDate)
											.addGap(26)
											.addComponent(lblSeats)
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblBusNo)
												.addComponent(lblNewLabel_5)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(38)
											.addComponent(lblNewLabel_4))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(113)
									.addComponent(lblNewLabel_3)))
							.addGap(18)
							.addComponent(btnOk)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		createEvents(from,to,date,s,busNo);
	}
	
	public void createEvents(String from,String to,String date,String seats,String busNo) {
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tickets t=new Tickets();
				t.add1(from,to,date,seats,busNo);
				dispose();
				HomePage h=new HomePage();
				h.setVisible(true);
				
			}
		});
	}
}
