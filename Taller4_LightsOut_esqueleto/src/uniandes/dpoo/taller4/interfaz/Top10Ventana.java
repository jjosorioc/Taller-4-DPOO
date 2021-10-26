package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

@SuppressWarnings("serial")
public class Top10Ventana extends JFrame
{
	Top10 losTop10 = null;

	boolean esVisible = false;

	public Top10Ventana(Top10 cola)
	{
		this.losTop10 = cola;
		setTitle("Top 10");
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		setSize(300, 500);

		/*
		 * Window listener para cuando se cierre la ventana.
		 */
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				changeVisibility(); // se cambia a falso para que no toque espichar el botón dos veces
			}
		});

		JPanel panel = new JPanel();
		//TODO hacer panel para el HEADER
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

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

		for (RegistroTop10 i : losTop10.darRegistros())
		{
			lista10 += i.toString();
			lista10 += ",";
		}

		String[] arrayLista = lista10.split(",");

		
		// Lista (JList)
		JList<String> listaTop10 = new JList<String>(arrayLista);
		listaTop10.setVisibleRowCount(10);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) listaTop10.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//renderer.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		
		listaTop10.setFixedCellHeight(50);
		
		
		JScrollPane scrollPane = new JScrollPane(listaTop10);
		scrollPane.setPreferredSize(new Dimension(300, 300));
		panel.add(scrollPane);

		add(panel);
		setLocationRelativeTo(null);
		setVisible(true); // Inicialmente no se debe poder ver
		this.revalidate();
	}

	public static void main(String[] args) //TODO Borrar al terminar con la implementación
	{
		new Top10Ventana(new Top10());
	}

	public void changeVisibility()
	{
		this.esVisible = !esVisible;
		this.setVisible(esVisible);
	}

}
