package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class PanelAbajo extends JPanel
{
	private VentanaPrincipal padre; // I am your father.
	
	JLabel cantidadJugadas;

	public PanelAbajo(VentanaPrincipal padre)
	{
		this.padre = padre;

		GridLayout layout = new GridLayout(0, 4, 10, 0);
		this.setLayout(layout);

		Border borderPrincipal = BorderFactory.createTitledBorder("Actividades del juego activo");
		this.setBorder(borderPrincipal);

		Border border = BorderFactory.createLineBorder(Color.RED, 2);

		JLabel jugadasLabel = new JLabel("Jugadas");
		add(jugadasLabel);
		cantidadJugadas = new JLabel("0");
		cantidadJugadas.setBorder(border);
		add(cantidadJugadas);

		JLabel jugadorLabel = new JLabel("Jugador");
		add(jugadorLabel);
		JLabel nombreJugador = new JLabel("Null");
		nombreJugador.setBorder(border);
		add(nombreJugador);
	}
}
