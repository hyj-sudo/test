package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		JFrame frame =new JFrame("GUI");
		frame.setLayout(new BorderLayout());
		
		
		JPanel panel2=new JPanel(new GridLayout(2,2));
		JLabel label1 =new JLabel("ÕËºÅ£º");
		JTextArea text1=new JTextArea();
		panel2.add(label1);
		panel2.add(text1);
		
		JLabel label2 =new JLabel("ÃÜÂë£º");
		JPasswordField text2=new JPasswordField();
		panel2.add(label2);
		panel2.add(text2);
		frame.add(panel2,BorderLayout.CENTER);
		
		JPanel panel1=new JPanel(new GridLayout(1,1));
		panel1.add(new JButton("µÇÂ¼"));
		panel1.add(new JButton("×¢²á"));
		frame.add(panel1,BorderLayout.SOUTH );
		
		frame.pack();
		
		frame.setSize(200,200);
		frame.setLocation(250,250);
		frame.setVisible(true);
//		JLabel label =new JLabel("hello");
//		frame.getContentPane().add(label);
//		frame.setSize(300,300);
	}
}
