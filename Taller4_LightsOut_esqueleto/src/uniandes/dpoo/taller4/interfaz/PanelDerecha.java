package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PanelDerecha extends JPanel{
	
	private VentanaPrincipal padre;
	
	public PanelDerecha (VentanaPrincipal padre)
	{
		
		this.padre = padre;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton Nuevo = new JButton("NUEVO");//TODO: Solo se puede uno al mismo tiempo.
		JButton Reiniciar = new JButton("REINICIAR");
		JButton Top_10 = new JButton("TOP 10");
		JButton CambiarJugador = new JButton("CAMBIAR JUGADOR");
		
		this.add(Nuevo);
		this.add(Reiniciar);
		this.add(Top_10);
		this.add(CambiarJugador);
	}

}
