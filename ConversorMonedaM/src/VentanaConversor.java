import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 */

public class VentanaConversor extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEuros;
	private JLabel lblEuros;
	private JLabel lblDolares;
	private JTextField tfDolares;
	private JButton btnNewButton;
	private JTextField Mensaje;
	
	/**
	 * 
	 */

	public VentanaConversor (float valorConversion) {
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblIntroduzcaUnValor;
		

		
		
		//Caja de texto
		tfEuros = new JTextField();
		tfEuros.setBounds(37, 47, 134, 28);
		contentPane.add(tfEuros);
		tfEuros.setColumns(10);
		
		tfDolares = new JTextField();
		tfDolares.setColumns(10);
		tfDolares.setBounds(37, 151, 134, 28);
		contentPane.add(tfDolares);
		
		//Etiquetas
		lblEuros = new JLabel("Euros");
		lblEuros.setBounds(37, 19, 61, 16);
		contentPane.add(lblEuros);
		
		lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(37, 123, 61, 16);
		contentPane.add(lblDolares);
		
		lblIntroduzcaUnValor = new JLabel("Introduzca un valor entre 0 y 500");
		lblIntroduzcaUnValor.setBounds(110, 19, 212, 16);
		contentPane.add(lblIntroduzcaUnValor);
		
		
		//Boton
		
		btnNewButton= new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// hay que tener cuidado donde se pone el try, se estaba produciendo el error antes del catch
				try{
					float euros;
					euros=Float.parseFloat(tfEuros.getText());

				//debe de haber una forma más sencilla que hacer un doble if...
					if (0 < euros ){
							if ( euros<500 ){
						
	
								tfDolares.setText(String.valueOf(euros*valorConversion));
					
								Mensaje.setText("Todo OK");}
								else { Mensaje.setText("Debe introducir un número entre 0 y 500"); }
						}
						else { Mensaje.setText("Debe introducir un número entre 0 y 500");}					
					}catch(Exception e){
				 Mensaje.setText("La que has liado pollito!pon un número"); 
				}
			
			}
			
		});
		btnNewButton.setBounds(212, 91, 117, 29);
		contentPane.add(btnNewButton);
		
		
		
		Mensaje = new JTextField();
		Mensaje.setEditable(false);
		Mensaje.setBounds(37, 209, 326, 28);
		contentPane.add(Mensaje);
		Mensaje.setColumns(10);
		
		}
}
