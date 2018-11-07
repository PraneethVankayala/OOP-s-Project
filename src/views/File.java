package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;

public class File extends JFrame {

	private JPanel contentPane;
	private String s;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File frame = new File();
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
	public File() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fileChooser.showOpenDialog(null); 
		if(r==JFileChooser.APPROVE_OPTION) {
		   s=fileChooser.getSelectedFile().getAbsolutePath();
		   dispose();
		}
		else {
			fileChooser.setVisible(false);
			dispose();
		}
		fileChooser.setBounds(12, 0, 548, 326);
		contentPane.add(fileChooser);
	}
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
