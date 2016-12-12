package regPrototype;

//Creates a new window that will contains the classes the student is taking

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class studentClasses extends JFrame{
	//set private the JPanel
	private JPanel contentPane;
	
	public studentClasses() {
		setTitle("Student Classes");		//give name to the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		//set bounds
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));	//set color blue
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
}
