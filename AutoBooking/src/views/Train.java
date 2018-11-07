package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import com.toedter.calendar.JDateChooser;

import controller.ListTrains;
import model.Code;
import model.TrainCode;
import model.TrainDetails;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JSpinner;

public class Train extends JFrame {

	private JPanel contentPane;
	private JTextField fromtxtfield;
	private JTextField totxtfield;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;
	private String city;
	private JButton btnNewButton;
	static JDateChooser dateChooser;
	private JButton btnOk;
	String s;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Train frame = new Train();
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
	public Train() {
		
		initComponents();
		createEvents();
		
	}
	
	public void initComponents() {
		setTitle("TravelApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFrom = new JLabel("From:");
		
		JLabel lblTo = new JLabel("To:");
		
		fromtxtfield = new JTextField();
		
		
		fromtxtfield.setColumns(10);
		
		totxtfield = new JTextField();
		
		
		totxtfield.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		
		dateChooser = new JDateChooser();
		
		JLabel lblTrainNo = new JLabel("Train No:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblCoach = new JLabel("Coach:");
		
		JRadioButton rdbtna = new JRadioButton("1A");
		buttonGroup.add(rdbtna);
		
		JRadioButton rdbtna_1 = new JRadioButton("2A");
		buttonGroup.add(rdbtna_1);
		
		JRadioButton rdbtna_2 = new JRadioButton("3A");
		buttonGroup.add(rdbtna_2);
		
		JRadioButton rdbtnSl = new JRadioButton("SL");
		buttonGroup.add(rdbtnSl);
		
		btnOk = new JButton("OK");
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Button used to exchange the inputs");
		
		lblNewLabel.setIcon(new ImageIcon(Train.class.getResource("/resources/baseline_swap_vertical_circle_black_18dp.png")));
		
		JLabel lblPreference = new JLabel("Preference:");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("UB");
		
		JCheckBox chckbxMb = new JCheckBox("MB");
		
		JCheckBox chckbxLb = new JCheckBox("LB");
		
		JCheckBox chckbxSu = new JCheckBox("SU");
		
		JCheckBox chckbxSl = new JCheckBox("SL");
		
		btnNewButton = new JButton("ShowTrains");
		
		JLabel lblNoofSeats = new JLabel("No.of Seats:");
		
		spinner = new JSpinner();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCoach)
								.addComponent(lblPreference)
								.addComponent(lblTrainNo)
								.addComponent(lblDate)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblFrom)
										.addComponent(lblTo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(13)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(1)
											.addComponent(rdbtna)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtna_1)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtna_2)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtnSl))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(fromtxtfield, Alignment.LEADING)
												.addComponent(totxtfield, Alignment.LEADING)
												.addComponent(dateChooser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(textField_2))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnNewButton)
												.addComponent(lblNoofSeats)))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(chckbxNewCheckBox)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxMb)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxLb)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxSu)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxSl)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnOk)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(fromtxtfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNoofSeats)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblFrom))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(totxtfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTo))
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDate)))
						.addComponent(btnNewButton))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTrainNo)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCoach)
								.addComponent(rdbtna)
								.addComponent(rdbtna_1)
								.addComponent(rdbtna_2)
								.addComponent(rdbtnSl))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPreference)
									.addComponent(chckbxNewCheckBox)
									.addComponent(chckbxMb))
								.addComponent(chckbxLb)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(chckbxSu)
									.addComponent(chckbxSl)))
							.addContainerGap(41, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOk)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void createEvents() {
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s=fromtxtfield.getText().toString();
				fromtxtfield.setText(totxtfield.getText().toString());
				totxtfield.setText(s);
			}
		});
		
		fromtxtfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		      TrainCode tr=new TrainCode(fromtxtfield.getText().toString().toUpperCase());
		      tr.start();
		     
			}
		});
	
		totxtfield.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent arg0) {
				TrainCode tr1=new TrainCode(totxtfield.getText().toString().toUpperCase());
			     tr1.start();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Code.getCode1());
				System.out.println(Code.getCode2());
				int date=dateChooser.getDate().getDate();
				int month=dateChooser.getDate().getMonth()+1;
				int year=dateChooser.getDate().getYear()-100+2000;
			    s=date+"-"+month+"-"+year;
				TrainListView t=new TrainListView();
				t.createTable(s);
				t.setVisible(true);
			}
		});
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=(Integer)spinner.getValue();
				
				PrintTicket p = new PrintTicket(Code.getCode2(),Code.getCode1(),s,i,textField_2.getText().toString());
				p.setVisible(true);
				dispose();
			}
		});
		
		
	}
}
