package regPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentHome frame = new studentHome();
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
	public studentHome() {
		setTitle("Student Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentPicture = new JLabel("Student Picture");
		lblStudentPicture.setBackground(new Color(0, 102, 153));
		lblStudentPicture.setBounds(10, 10, 177, 120);
		contentPane.add(lblStudentPicture);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setForeground(new Color(255, 255, 255));
		lblStudentName.setBounds(10, 146, 83, 14);
		contentPane.add(lblStudentName);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setForeground(new Color(255, 255, 255));
		lblMajor.setBounds(10, 166, 142, 14);
		contentPane.add(lblMajor);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(255, 255, 255));
		lblDepartment.setBounds(10, 186, 142, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setForeground(new Color(255, 255, 255));
		lblStudentId.setBounds(103, 146, 84, 14);
		contentPane.add(lblStudentId);
		
		JLabel lblClasification = new JLabel("Clasification");
		lblClasification.setForeground(new Color(255, 255, 255));
		lblClasification.setBounds(10, 206, 142, 14);
		contentPane.add(lblClasification);
		
		JButton btnViewClasses = new JButton("View Classes");
		btnViewClasses.setBounds(274, 30, 122, 23);
		contentPane.add(btnViewClasses);
		
		JButton btnViewHolds = new JButton("View Holds");
		btnViewHolds.setBounds(274, 86, 122, 23);
		contentPane.add(btnViewHolds);
		
		JButton btnViewTranscript = new JButton("View Transcript");
		btnViewTranscript.setBounds(274, 142, 122, 23);
		contentPane.add(btnViewTranscript);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegister.setBounds(274, 202, 122, 23);
		contentPane.add(btnRegister);
	}

}
