package uniandes.dpoo.taller4.interfaz;

import javax.swing.BoxLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelArriba extends JPanel
{
	private VentanaPrincipal padre; // I am your father.
	
	public PanelArriba(VentanaPrincipal padre)
	{
		
		this.padre = padre;
		GridLayout layout = new GridLayout(0, 6, 10, 0);
		this.setLayout(layout);
		//this.getPreferredSize(new Dimension());
		
		Border border = BorderFactory.createTitledBorder("Opciones de juego");
		this.setBorder(border);
		
		JLabel lbl = new JLabel("Tama�o:");
		lbl.setAlignmentX(LEFT_ALIGNMENT);
		this.add(lbl);
		
		String[] opciones = {
				"4x4",
				"5x5",
				"6x6",
				"7x7",
				"8x8",
				"9x9"
		};
		
		final JComboBox<String> cb = new JComboBox<String>(opciones);
		cb.setMaximumSize(getPreferredSize());
		cb.setAlignmentX(LEFT_ALIGNMENT);
		
		this.add(cb);
		
		
		JLabel dificultadLbl = new JLabel("Dificultad: ");
		this.add(dificultadLbl);
		
		
		
		JRadioButton easy = new JRadioButton("F�cil", true);//TODO: Solo se puede uno al mismo tiempo.
		JRadioButton medium = new JRadioButton("Medio", false);
		JRadioButton hard = new JRadioButton("Dif�cil", false);
		
		this.add(easy);
		this.add(medium);
		this.add(hard);
		
	}
	//TODO
}
