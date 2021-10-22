package uniandes.dpoo.taller4.interfaz;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame
{
	/**
	 * Empieza la ejecución de la aplicación
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		new VentanaPrincipal();

	}
	
	/*
	 * CONSTRUCTOR
	 */
	
	public VentanaPrincipal()
	{
		pack();
		setTitle("Lights Out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setResizable(false);
		setVisible(true);
	}

}
