

public class Principal  {


	// Metodo principal de nuestro programa
	static float valorConversion=1.25f;
	
	public static void main(String[] args) {
		VentanaConversor ventana=new VentanaConversor(valorConversion);
		ventana.setVisible(true);
	}

	

}
