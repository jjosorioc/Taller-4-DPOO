package uniandes.dpoo.taller4.interfaz;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PanelArriba extends JPanel
{
	private VentanaPrincipal padre; // I am your father.
	
	public PanelArriba(VentanaPrincipal padre)
	{
		
		this.padre = padre;
		
		
		JLabel lbl = new JLabel("Tamaño:");
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
		
		
		
		JRadioButton easy = new JRadioButton("Fácil", true);//TODO: Solo se puede uno al mismo tiempo.
		JRadioButton medium = new JRadioButton("Medio", false);
		JRadioButton hard = new JRadioButton("Difícil", false);
		
		this.add(easy);
		this.add(medium);
		this.add(hard);
		
	}
	//TODO
}
