package uniandes.dpoo.taller4.interfaz;


import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
@SuppressWarnings("serial")
public class PanelAbajo extends JPanel
{
	private VentanaPrincipal padre; // I am your father.

	
	public PanelAbajo(VentanaPrincipal padre)
	{
		this.padre = padre;
		
		Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
		
		JLabel jugadasLabel = new JLabel("Jugadas");
		add(jugadasLabel);
		JLabel cantidadJugadas = new JLabel("0");
		cantidadJugadas.setBorder(border);
		add(cantidadJugadas);
		
		JLabel jugadorLabel = new JLabel("Jugador");
		add(jugadorLabel);
		JLabel nombreJugador = new JLabel("Null");
		nombreJugador.setBorder(border);
		add(nombreJugador);
	}
}
