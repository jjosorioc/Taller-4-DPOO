package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class PanelDerecha extends JPanel
{

	private VentanaPrincipal padre;

	JButton Nuevo;
	JButton Reiniciar;
	JButton Top_10;
	JButton CambiarJugador;

	public PanelDerecha(VentanaPrincipal padre)
	{

		this.padre = padre;
		// setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		GridLayout layout = new GridLayout(4, 1, 0, 0);
		this.setLayout(layout);
		Border border = BorderFactory.createTitledBorder("Menú");
		this.setBorder(border);

		Nuevo = new JButton("NUEVO");
		Reiniciar = new JButton("REINICIAR");
		Top_10 = new JButton("TOP 10");
		CambiarJugador = new JButton("CAMBIAR JUGADOR");

		Nuevo.addActionListener(padre);
		Reiniciar.addActionListener(padre);
		Top_10.addActionListener(padre);
		CambiarJugador.addActionListener(padre);

		this.add(Nuevo);
		this.add(Reiniciar);
		this.add(Top_10);
		this.add(CambiarJugador);
	}

}
