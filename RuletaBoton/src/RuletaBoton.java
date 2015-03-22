import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RuletaBoton extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuletaBoton frame = new RuletaBoton();
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
	public RuletaBoton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
// Textfield
		
		textField1 = new JTextField();
		textField1.setBounds(24, 43, 134, 28);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(331, 43, 134, 28);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(331, 211, 134, 28);
		contentPane.add(textField3);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(24, 211, 134, 28);
		contentPane.add(textField4);
		
//Buttons
		
		//button1
		JButton button1 = new JButton("Copiar");
			//button1 action
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textF1 ="";
				textF1=textField1.getText();
				textField2.setText(textF1);
				
			}
		});
		button1.setBounds(188, 44, 117, 29);
		contentPane.add(button1);
		
		//button2
		button2 = new JButton("Copiar");
			//button2 action		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textF2 ="";
				textF2=textField2.getText();
				textField3.setText(textF2);
				
				
			}
		});
		button2.setBounds(347, 127, 117, 29);
		contentPane.add(button2);
		
		//button3
		button3 = new JButton("Copiar");
			//button3 action
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//la declaro y pongo valor directamente
				String textF3 =textField3.getText();
				textField4.setText(textF3);
				
				
				
			}
		});
		button3.setBounds(188, 212, 117, 29);
		contentPane.add(button3);
		
		//button4
		button4 = new JButton("Copiar");
			//button4 action 
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 
				String textF4 =textField4.getText();
				textField1.setText(textF4);	
						}
		});
		button4.setBounds(24, 127, 117, 29);
		contentPane.add(button4);
	}
}
