package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class PanelDerecha extends JPanel
{

	private VentanaPrincipal padre;

	public JButton Nuevo;
	public JButton Reiniciar;
	public JButton Top_10;
	public JButton CambiarJugador;

	public PanelDerecha(VentanaPrincipal padre)
	{

		this.padre = padre;
		// setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		GridLayout layout = new GridLayout(4, 1, 0, 0);
		this.setLayout(layout);
		Border border = BorderFactory.createTitledBorder("Menú");
		this.setBorder(border);
		ImageIcon nuevoImage = new ImageIcon(new ImageIcon("./data/nuevo.png").getImage().getScaledInstance(200, 112, Image.SCALE_DEFAULT));
		Nuevo = new JButton();
		Nuevo.setIcon(nuevoImage);
		ImageIcon reiniciarImage = new ImageIcon(new ImageIcon("./data/reiniciar.png").getImage().getScaledInstance(200, 112, Image.SCALE_DEFAULT));
		Reiniciar = new JButton();
		Reiniciar.setIcon(reiniciarImage);
		ImageIcon top10Image = new ImageIcon(new ImageIcon("./data/top10.png").getImage().getScaledInstance(200, 112, Image.SCALE_DEFAULT));
		Top_10 = new JButton();
		Top_10.setIcon(top10Image);
		ImageIcon cambiarJugadorImage = new ImageIcon(new ImageIcon("./data/cambiarJugador.png").getImage().getScaledInstance(200, 112, Image.SCALE_DEFAULT));
		CambiarJugador = new JButton();
		CambiarJugador.setIcon(cambiarJugadorImage);

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
