package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDateChooser;

public class Bus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JButton btnBookSeats;
	private static int tickets;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JButton btnShowBuses;
	int count=0;
	private static String from;
	private static String to;
	private static String dat;
	private static String busNumber;
	private JTextField textField_4;
	private JDateChooser dateChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bus frame = new Bus();
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
	public Bus() {
		initComponents();
		createEvents();
		}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = 
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFrom = new JLabel("From:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblTo = new JLabel("To:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		
		btnShowBuses = new JButton("Show Buses");
		
		
		btnBookSeats = new JButton("Book Seats");
		
		
		JLabel lblTravelsName = new JLabel("Bus Name:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblAdults = new JLabel("Adults:");
		
		spinner = new JSpinner();
		
		JLabel lblChildren = new JLabel("Children:");
		
		spinner_1 = new JSpinner();
		
		JLabel lblBusNo = new JLabel("Bus No:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		dateChooser = new JDateChooser();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblBusNo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblAdults)
								.addComponent(lblTravelsName)
								.addComponent(lblDate)
								.addComponent(lblTo)
								.addComponent(lblFrom))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblChildren)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnBookSeats)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
											.addComponent(btnShowBuses)))))
							.addContainerGap())
						.addComponent(textField_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFrom))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTo)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDate)
							.addComponent(btnShowBuses))
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTravelsName)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAdults)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblChildren)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBusNo)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBookSeats))
					.addGap(18))
		);
		contentPane.setLayout(gl_contentPane);
	}
	


	public static int getTickets() {
		return tickets;
	}

	public static void setTickets(int tickets) {
		Bus.tickets = tickets;
	}

	public void createEvents() {
		btnBookSeats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tickets = (Integer) spinner.getValue()+(Integer) spinner_1.getValue();
				System.out.println(tickets);
				String same=textField_3.getText().toString();
		        from=textField.getText().toString();
		        to=textField_1.getText().toString();
		        int date=dateChooser.getDate().getDate();
				int month=dateChooser.getDate().getMonth()+1;
				int year=dateChooser.getDate().getYear()-100+2000;
				dat=date+"-"+month+"-"+year;
				busNumber=textField_4.getText().toString();
				Seats seats=new Seats();
				seats.setVisible(true);
				dispose();
				try {
				    spinner.commitEdit();
				} catch ( java.text.ParseException e ) { 
					e.printStackTrace();
				}
				
			}
		});
		
		
		btnShowBuses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BusList b=new BusList();
				b.setVisible(true);
			}
		});
	}
	public static String getFrom() {
		return from;
	}

	public static String getTo() {
		return to;
	}

	public static String getDate() {
		return dat;
	}

	public static String getBusNumber() {
		return busNumber;
	}

}
