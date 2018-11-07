package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seats extends JFrame {

	private JPanel contentPane;
    ImageIcon ic=new ImageIcon(Seats.class.getResource("/resources/seat.png"));;
    ImageIcon ic1=new ImageIcon(Seats.class.getResource("/resources/filled2.png"));
    private static int seats=Bus.getTickets();
    private static String from=Bus.getFrom();
    private static String to=Bus.getTo();
    private static String date=Bus.getDate();
    private static String busno=Bus.getBusNumber();
    private static int cnt=0;
   JLabel[] label=new JLabel[32];
   private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seats frame = new Seats();
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
	public Seats() {
		System.out.println(seats);
		System.out.println(Bus.getTickets());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(ic);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(lblNewLabel.getIcon()==ic);
				if(lblNewLabel.getIcon()==ic && cnt<seats) {
					lblNewLabel.setIcon(ic1);
					cnt++;
					label[0]=lblNewLabel;
					System.out.println(cnt);
					}
				else if(lblNewLabel.getIcon()==ic1) {
					
					lblNewLabel.setIcon(ic);
					cnt--;
					label[0]=null;
					System.out.println(cnt);
					
				}
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(ic);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lblNewLabel_1.getIcon()==ic && cnt<seats) {
					lblNewLabel_1.setIcon(ic1);
					cnt++;
					label[1]=lblNewLabel_1;
					System.out.println(cnt);
				}
				else  if(lblNewLabel_1.getIcon()==ic1) {
					
					lblNewLabel_1.setIcon(ic);
					cnt--;
					label[1]=null;
					System.out.println(cnt);
					
				}
			}
		});
		JLabel label_0 = new JLabel("");
		label_0.setIcon(ic);
		label_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_0.getIcon()==ic&&cnt<seats) {
					label_0.setIcon(ic1);
					cnt++;
					label[2]=label_0;
				}
				else if(label_0.getIcon()==ic1) {
					if(cnt>0) {
					label_0.setIcon(ic);
					cnt--;
					}
				}
			}
		});
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(ic);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_1.getIcon()==ic && cnt<seats) {
					label_1.setIcon(ic1);
					cnt++;
				}
				else if(label_1.getIcon()==ic1) {
					if(cnt>0) {
					label_1.setIcon(ic);
					cnt--;
					}
				}
			}
		});
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(ic);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_2.getIcon()==ic&&cnt<seats) {
					label_2.setIcon(ic1);
					cnt++;
					
				}
				else if(label_2.getIcon()==ic1) {
					if(cnt>0) {
					label_2.setIcon(ic);
					cnt--;
					}
				}
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(ic);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_3.getIcon()==ic&&cnt<seats) {
					label_3.setIcon(ic1);
					cnt++;
				}
				else if(label_3.getIcon()==ic1){
					label_3.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(ic);
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_4.getIcon()==ic&&cnt<seats) {
					label_4.setIcon(ic1);
					cnt++;
				}
				else if(label_4.getIcon()==ic1) {
					label_4.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(ic);
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_5.getIcon()==ic&&cnt<seats) {
					label_5.setIcon(ic1);
					cnt++;
				}
				else if(label_5.getIcon()==ic1){
					label_5.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(ic);
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_6.getIcon()==ic&&cnt<seats) {
					label_6.setIcon(ic1);
					cnt++;
				}
				else if(label_6.getIcon()==ic1) {
					label_6.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(ic);
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_7.getIcon()==ic&&cnt<seats) {
					label_7.setIcon(ic1);
					cnt++;
				}
				else if(label_7.getIcon()==ic1) {
					label_7.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(ic);
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_8.getIcon()==ic&&cnt<seats) {
					label_8.setIcon(ic1);
					cnt++;
				}
				else if(label_8.getIcon()==ic1){
					label_8.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(ic);
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_9.getIcon()==ic&&cnt<seats) {
					label_9.setIcon(ic1);
					cnt++;
				}
				else  if(label_9.getIcon()==ic1){
					label_9.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(ic);
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_10.getIcon()==ic&&cnt<seats) {
					label_10.setIcon(ic1);
					cnt++;
					
				}
				else if(label_10.getIcon()==ic1) {
					label_10.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(ic);
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_11.getIcon()==ic&&cnt<seats) {
					label_11.setIcon(ic1);
					cnt++;
				}
				else if(label_11.getIcon()==ic1) {
					label_11.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(ic);
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_12.getIcon()==ic&&cnt<seats) {
					label_12.setIcon(ic1);
					cnt++;
				}
				else if(label_12.getIcon()==ic1) {
					label_12.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(ic);
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_13.getIcon()==ic&&cnt<seats) {
					label_13.setIcon(ic1);
					cnt++;
				}
				else if(label_13.getIcon()==ic1) {
					label_13.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(ic);
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_14.getIcon()==ic&&cnt<seats) {
					label_14.setIcon(ic1);
					cnt++;
				}
				else if(label_14.getIcon()==ic1) {
					label_14.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(ic);
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_15.getIcon()==ic&&cnt<seats) {
					label_15.setIcon(ic1);
					cnt++;
				}
				else if(label_15.getIcon()==ic1) {
					label_15.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(ic);
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_16.getIcon()==ic&cnt<seats) {
					label_16.setIcon(ic1);
					cnt++;
				}
				else if(label_16.getIcon()==ic1) {
					label_16.setIcon(ic);
					cnt--;
				}
			}
		});
		btnNewButton = new JButton("Book");
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(ic);
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_17.getIcon()==ic && cnt<seats) {
					label_17.setIcon(ic1);
					cnt++;
				}
				else if(label_17.getIcon()==ic1) {
					label_17.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(ic);
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_18.getIcon()==ic && cnt<seats) {
					label_18.setIcon(ic1);
					cnt++;
				}
				else if(label_18.getIcon()==ic1) {
					label_18.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(ic);
		label_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_19.getIcon()==ic && cnt<seats) {
					label_19.setIcon(ic1);
					cnt++;
				}
				else if(label_19.getIcon()==ic1) {
					label_19.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(ic);
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_20.getIcon()==ic && cnt<seats) {
					label_20.setIcon(ic1);
					cnt++;
				}
				else if(label_20.getIcon()==ic1) {
					label_20.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(ic);
		label_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_21.getIcon()==ic && cnt<seats) {
					label_21.setIcon(ic1);
					cnt++;
				}
				else if(label_21.getIcon()==ic1) {
					label_21.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(ic);
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_22.getIcon()==ic && cnt<seats) {
					label_22.setIcon(ic1);
					cnt++;
				}
				else if(label_22.getIcon()==ic1) {
					label_22.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(ic);
		label_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_23.getIcon()==ic && cnt<seats) {
					label_23.setIcon(ic1);
					cnt++;
				}
				else if(label_23.getIcon()==ic1) {
					label_23.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(ic);
		label_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_24.getIcon()==ic && cnt<seats) {
					label_24.setIcon(ic1);
					cnt++;
				}
				else if(label_24.getIcon()==ic1) {
					label_24.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(ic);
		label_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_25.getIcon()==ic && cnt<seats) {
					label_25.setIcon(ic1);
					cnt++;
				}
				else if(label_25.getIcon()==ic1) {
					label_25.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(ic);
		label_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_26.getIcon()==ic && cnt<seats) {
					label_26.setIcon(ic1);
					cnt++;
				}
				else if(label_26.getIcon()==ic1) {
					label_26.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(ic);
		label_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_27.getIcon()==ic &&cnt<seats) {
					label_27.setIcon(ic1);
					cnt++;
				}
				else if(label_27.getIcon()==ic1) {
					label_27.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(ic);
		label_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_28.getIcon()==ic && cnt<seats) {
					label_28.setIcon(ic1);
					cnt++;
				}
				else if(label_28.getIcon()==ic1) {
					label_28.setIcon(ic);
					cnt--;
				}
			}
		});
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(ic);
		label_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_29.getIcon()==ic && cnt<seats) {
					label_29.setIcon(ic1);
					cnt++;
				}
				else if(label_29.getIcon()==ic1) {
					label_29.setIcon(ic);
					cnt--;
				}
			}
		});
		JLabel label_30 = new JLabel("");
		label_30.setIcon(ic);
		label_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_30.getIcon()==ic && cnt<seats) {
					label_30.setIcon(ic1);
					cnt++;
				}
				else if(label_30.getIcon()==ic1) {
					label_30.setIcon(ic);
					cnt--;
				}
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_6)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_0)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_5))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_8)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_9)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
									.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
									.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(label_0)
						.addComponent(label_1)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label_4)
						.addComponent(label_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6)
						.addComponent(label_7)
						.addComponent(label_8)
						.addComponent(label_9)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		createEvents();
	}
	
	public void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BusTicket b=new BusTicket(from,to,date,seats,busno);
				b.setVisible(true);
				dispose();
			}
		});
		
	}
	
	

}
