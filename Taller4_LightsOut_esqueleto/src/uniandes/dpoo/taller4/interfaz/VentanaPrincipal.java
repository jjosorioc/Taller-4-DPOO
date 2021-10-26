package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener
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
	
	PanelArriba elDeArriba;
	PanelAbajo elDeAbajo;
	PanelDerecha elDeLaDerecha;
	TableroPanel izquierda;
	
	JButton Nuevo;
	JButton Reiniciar;
	JButton Top_10;
	JButton CambiarJugador;
	
	JRadioButton easy;
	JRadioButton medium;
	JRadioButton hard;
	
	JComboBox<String> cb;
	Integer size = 4;
	
	
	Top10Ventana ventanaTop10;
	Top10 top10;
	
	public VentanaPrincipal()
	{
		Tablero tablero = new Tablero(size);
		
		setLayout(new BorderLayout());
		pack();
		setTitle("Lights Out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(true);
		
		setSize(800,700);
		
		
		/*
		 * Se cargan los top 10
		 * 
		 * luego se crea la ventana de los top 10
		 */
		top10 = new Top10();
		this.cargarTop10();
		ventanaTop10 = new Top10Ventana(top10);
		
		// Panel de arriba
		elDeArriba = new PanelArriba(this);
		add(elDeArriba, BorderLayout.NORTH);
		
		elDeAbajo = new PanelAbajo(this);
		add(elDeAbajo, BorderLayout.SOUTH);
		
		elDeLaDerecha = new PanelDerecha(this);
		add(elDeLaDerecha,BorderLayout.EAST);
		
		izquierda = new TableroPanel(this);
		
		add(izquierda, BorderLayout.CENTER);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	/**
	 * Se cargan los top 10 del archivo en data.
	 */
	public void cargarTop10()
	{
		String dataDirectory =  System.getProperty("user.dir") + "/data/top10.csv";
		File archivoFile = new File(dataDirectory);
		top10.cargarRecords(archivoFile);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//Botones panel de la derecha 
		
		Nuevo = elDeLaDerecha.Nuevo;
		Reiniciar = elDeLaDerecha.Reiniciar;
		Top_10 = elDeLaDerecha.Top_10;
		CambiarJugador = elDeLaDerecha.CambiarJugador;
		
		//Botones panel de arriba
		
		easy = elDeArriba.easy;
		medium = elDeArriba.medium;
		hard = elDeArriba.hard;
		
		cb = elDeArriba.cb;
		
		//Panel de la derecha
		
		if (e.getSource() == Nuevo)
		{
			System.out.println("NUEVO");
		}
		
		else if (e.getSource() == Reiniciar)
		{
			System.out.println("REINICIAR");
		}
		
		else if (e.getSource() == Top_10)
		{
			System.out.println("TOP 10");
			ventanaTop10.changeVisibility();
		}
		
		else if (e.getSource() == CambiarJugador)
		{
			System.out.println("CAMBIAR JUGADOR");
		}
		
		//Panel de arriba
		
		
		else if (e.getSource() == easy)
		{
			System.out.println("Easy bitch");
		}
		
		else if (e.getSource() == medium)
		{
			System.out.println("Medium");
		}
		
		else if (e.getSource() == hard)
		{
			System.out.println("hard :)");
		}
		
		else if (e.getSource() == cb)
		{
			String selectedSize = (String) cb.getSelectedItem();
			if (selectedSize.equals("4x4"))
			{
				size = 4;
				System.out.println("El tablero es 4x4");
			}
			
			else if (selectedSize.equals("5x5"))
			{
				size = 5;
				System.out.println("El tablero es 5x5");
			}
			
			else if (selectedSize.equals("6x6"))
			{
				size = 6;
				System.out.println("El tablero es 6x6");
			}
			
			else if (selectedSize.equals("7x7"))
			{
				size = 7;
				System.out.println("El tablero es 7x7");
			}
			
			else if (selectedSize.equals("8x8"))
			{
				size = 8;
				System.out.println("El tablero es 8x8");
			}
			
			else if (selectedSize.equals("9x9"))
			{
				size = 9;
				System.out.println("El tablero es 9x9");
			}
			
		}
		
		
	}

}
