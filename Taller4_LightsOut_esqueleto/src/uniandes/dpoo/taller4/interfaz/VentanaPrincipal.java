package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import uniandes.dpoo.taller4.modelo.Tablero;

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
	
	public VentanaPrincipal()
	{
		Tablero tablero = new Tablero(size);
		
		setLayout(new BorderLayout());
		pack();
		setTitle("Lights Out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(true);
		
		setSize(800,700);
		
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
