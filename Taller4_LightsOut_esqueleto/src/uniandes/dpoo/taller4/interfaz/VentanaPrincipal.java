package uniandes.dpoo.taller4.interfaz;

import javax.swing.JFrame;
import java.awt.*;

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
	 * s
	 */
	
	public VentanaPrincipal()
	{
		setLayout(new BorderLayout());
		pack();
		setTitle("Lights Out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(true);
		
		setSize(500,500);
		
		// Panel de arriba
		PanelArriba elDeArriba = new PanelArriba(this);
		
		add(elDeArriba, BorderLayout.NORTH);
		
		PanelAbajo elDeAbajo = new PanelAbajo(this);
		add(elDeAbajo, BorderLayout.SOUTH);
		
		setVisible(true);
	}

}
