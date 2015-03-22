import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCampo;
	private JLabel label;
	private JTextField textField_1;
	private JButton btnNewButton;


	public VentanaCopiado() {
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		
		//Caja de texto
		textField = new JTextField();
		textField.setBounds(37, 47, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(37, 151, 134, 28);
		contentPane.add(textField_1);
		
		//Etiquetas
		lblCampo = new JLabel("Origen");
		lblCampo.setBounds(37, 19, 61, 16);
		contentPane.add(lblCampo);
		
		label = new JLabel("Destino");
		label.setBounds(37, 123, 61, 16);
		contentPane.add(label);
		
		//Boton
		
		btnNewButton= new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText());
			}
		});
		btnNewButton.setBounds(212, 91, 117, 29);
		contentPane.add(btnNewButton);
		
		}
}
