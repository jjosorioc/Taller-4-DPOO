package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class PanelArriba extends JPanel
{
	private VentanaPrincipal padre; // I am your father.

	JRadioButton easy;
	JRadioButton medium;
	JRadioButton hard;

	JComboBox<String> cb;

	public PanelArriba(VentanaPrincipal padre)
	{

		this.padre = padre;
		GridLayout layout = new GridLayout(0, 6, 10, 0);
		this.setLayout(layout);
		// this.getPreferredSize(new Dimension());

		Border border = BorderFactory.createTitledBorder("Opciones de juego");
		this.setBorder(border);

		JLabel lbl = new JLabel("Tamaño:");
		lbl.setAlignmentX(LEFT_ALIGNMENT);
		this.add(lbl);

		String[] opciones = { "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" };

		cb = new JComboBox<String>(opciones);
		cb.setMaximumSize(getPreferredSize());
		cb.setAlignmentX(LEFT_ALIGNMENT);

		cb.addActionListener(padre);

		this.add(cb);

		JLabel dificultadLbl = new JLabel("Dificultad: ");
		this.add(dificultadLbl);

		easy = new JRadioButton("Fácil", true); // Default es fácil
		medium = new JRadioButton("Medio", false);
		hard = new JRadioButton("Difícil", false);

		ButtonGroup group = new ButtonGroup();
		group.add(easy);
		group.add(medium);
		group.add(hard);

		easy.addActionListener(padre);
		medium.addActionListener(padre);
		hard.addActionListener(padre);

		this.add(easy);
		this.add(medium);
		this.add(hard);
	}

}
