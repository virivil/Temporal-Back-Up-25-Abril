import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class VentanaConversor extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEuros;
	private JLabel lblEuros;
	private JTextField tfDolares;
	private JButton btnNewButton;
	private JTextField Mensaje;
	private JComboBox comboBox;
	
	/**
	 * 
	 */
	//la variable valorConversion ya no necesita que le hagamos el paso de variable, su valor se definirá dentro de esta clase

	public VentanaConversor (String valorConversion) {
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 280);
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
		
		Mensaje = new JTextField();
		Mensaje.setEditable(false);
		Mensaje.setBounds(37, 209, 326, 28);
		contentPane.add(Mensaje);
		Mensaje.setColumns(10);
		
		//Etiquetas
		lblEuros = new JLabel("Euros");
		lblEuros.setBounds(37, 19, 61, 16);
		contentPane.add(lblEuros);
		
		lblIntroduzcaUnValor = new JLabel("Introduzca un valor entre 0 y 500");
		lblIntroduzcaUnValor.setBounds(110, 19, 212, 16);
		contentPane.add(lblIntroduzcaUnValor);
		
		
		//Combo
		comboBox = new JComboBox();
		
		comboBox.setBounds(37, 112, 134, 27);
		contentPane.add(comboBox);
		
		String monedas[]= new String[5];
		monedas[0]="Libras";
		monedas[1]="Dolares";
		monedas[2]="Euros";
		monedas[3]="Peseta";
		monedas[4]="Peso";
		comboBox.addItem(monedas[0]);
		comboBox.addItem(monedas[1]);
		comboBox.addItem(monedas[2]);
		comboBox.addItem(monedas[3]);
		comboBox.addItem(monedas[4]);
		
		//Evento del combo para mostrar mensaje.
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)comboBox.getSelectedItem())
				{
				//introducimos aquí en el switch el valor a la variable valorConversion
				case "Dolares":
					Mensaje.setText("Hemos seleccionado la moneda de EEUU");
					break;
				case "Libras":
					Mensaje.setText("Hemos seleccionado la moneda de UK");
					break;
				case "Euros":
					Mensaje.setText("Hemos seleccionado la moneda Europea");
					break;
				case "Peso":
					Mensaje.setText("Hemos seleccionado la moneda Mexicana");
					break;
				default:
					Mensaje.setText("Hemos seleccionado una moneda fuera de curso");
						break;
				
				}
				
				
			}
		});
		
		
		//Boton
		
		btnNewButton.setBounds(212, 91, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton= new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// hay que tener cuidado donde se pone el try, se estaba produciendo el error antes del catch
				try{
							float euros;
							euros=Float.parseFloat(tfEuros.getText());
							
							// If , else if , sustituyendo al doble condicional de la versión anterior
							
							if (0 > euros ){	Mensaje.setText("Debe introducir un número mayor que 0");	}
							
							else if ( euros>500 ) {Mensaje.setText("Debe introducir un número menor que 500");	}		
										
							else {
								//introducimos aquí en el switch el valor a la variable valorConversion
			
								comboBox.addItemListener(new ItemListener() {
									public void itemStateChanged(ItemEvent arg0) {
										switch((String)comboBox.getSelectedItem())
										{
										case "Dolares":
											valorConversion="1,25";
											break;
										case "Libras":
											valorConversion="0,7";
											break;
										case "Euros":
											valorConversion="1";
											break;
										case "Peso":
											valorConversion="15";
											break;
										default:
											Mensaje.setText("Hemos seleccionado una moneda fuera de curso");
												break;	
													}
													
												}
											}); // el del combo
									
								
								tfDolares.setText(String.valueOf(euros*valorConversion);					
									Mensaje.setText("Todo OK");					
							
									} // el del else
				}catch(Exception e){ //el del try
				 Mensaje.setText("La que has liado pollito! Debes poner un número"); 
				}
			}//cierre catch
				
			});
	}
}		
		
	
	
	
