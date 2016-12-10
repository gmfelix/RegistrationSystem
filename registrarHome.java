package regPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class registrarHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrarHome frame = new registrarHome();
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
	public registrarHome() {
		setTitle("Registrar Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrarPicture = new JLabel("Registrar Picture");
		lblRegistrarPicture.setBounds(10, 10, 177, 120);
		contentPane.add(lblRegistrarPicture);
		
		JLabel lblRegistrarName = new JLabel("Registrar Name");
		lblRegistrarName.setForeground(new Color(255, 255, 255));
		lblRegistrarName.setBounds(10, 140, 131, 14);
		contentPane.add(lblRegistrarName);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(255, 255, 255));
		lblDepartment.setBounds(10, 160, 131, 14);
		contentPane.add(lblDepartment);
		
		JButton btnRegisterStudent = new JButton("Register Student");
		btnRegisterStudent.setBounds(274, 30, 122, 23);
		contentPane.add(btnRegisterStudent);
		
		JButton btnManageStudent = new JButton("Manage Student");
		btnManageStudent.setBounds(274, 110, 122, 23);
		contentPane.add(btnManageStudent);
		
		JButton btnLookUpClasses = new JButton("Look up Classes");
		btnLookUpClasses.setBounds(274, 183, 122, 23);
		contentPane.add(btnLookUpClasses);
	}

}
