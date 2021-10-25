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
		
		setSize(800,700);
		
		// Panel de arriba
		PanelArriba elDeArriba = new PanelArriba(this);
		
		add(elDeArriba, BorderLayout.NORTH);
		
		PanelAbajo elDeAbajo = new PanelAbajo(this);
		add(elDeAbajo, BorderLayout.SOUTH);
		
		PanelDerecha elDeLaDerecha = new PanelDerecha(this);
		add(elDeLaDerecha,BorderLayout.EAST);
		
		TableroPanel izquierda = new TableroPanel(this);
		
		add(izquierda, BorderLayout.CENTER);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
