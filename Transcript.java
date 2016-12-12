package regPrototype;

//Creates a new window that will contains the transcript of the student 

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Transcript extends JFrame {
private JPanel contentPane;
	
	public Transcript() {
		setTitle("Transcript");		//give the name
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	//set bounds
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));	//set the color
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
}
