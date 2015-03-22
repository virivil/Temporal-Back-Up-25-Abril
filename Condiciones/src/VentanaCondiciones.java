import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCondiciones extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JLabel lblIntroduceUnNmero;
	private JTextField textField_1;

	
	public VentanaCondiciones() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 381);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel label2 = new JLabel("Mensaje");
	label2.setBounds(27, 156, 200, 50);
	contentPane.add(label2);
	
	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setBounds(27, 207, 200, 50);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	lblIntroduceUnNmero = new JLabel("Introduce un número positivo");
	lblIntroduceUnNmero.setBounds(27, 36, 200, 50);
	contentPane.add(lblIntroduceUnNmero);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(27, 81, 200, 50);
	contentPane.add(textField_1);
	
	JButton btnNewButton = new JButton("Comprobar");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String txtCja="";
			int numCaja=0;
			txtCja=textField_1.getText();
			numCaja=Integer.parseInt(txtCja);
			
			System.out.print(numCaja);
			
			if(numCaja>=0){
				textField_2.setText("OK");
								
			}else{ textField_2.setText("No es un número positivo");	
							
			}
			
			
			
		}
	});
	btnNewButton.setBounds(292, 93, 117, 29);
	contentPane.add(btnNewButton);
	}
}
