package uniandes.dpoo.taller4.interfaz;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.Color;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

@SuppressWarnings("serial")
public class Top10Ventana extends JFrame
{
	Top10 losTop10 = null;
	
	
	public Top10Ventana(Top10 cola)
	{
		this.losTop10 = cola;
		setTitle("Top 10");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(300, 500);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Header
		JLabel header = new JLabel("#   Nombre");
		header.setBackground(Color.blue);
		header.setOpaque(true);
		header.setForeground(Color.white);
		header.setVerticalAlignment(JLabel.TOP);
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setVisible(true);
		panel.add(header);
		
		// Lista
		
		String lista10 = "";
		
		
		for (RegistroTop10 i: losTop10.darRegistros())
		{
			lista10 += i.toString();
			lista10 += ",";
		}
		
		String[] arrayLista = lista10.split(",");
		
		JList listaTop10 = new JList<String>(arrayLista);
		panel.add(listaTop10, BoxLayout.Y_AXIS);
		
		add(panel);
		setVisible(true); // Inicialmente no se debe poder ver
		this.revalidate();
	}
	
	
	public static void main(String[] args)
	{
		new Top10Ventana(new Top10());
	}
}
