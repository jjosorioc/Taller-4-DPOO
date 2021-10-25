package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class TableroPanel extends JPanel
{
	private VentanaPrincipal padre; // I am your father.
	
	
	public TableroPanel(VentanaPrincipal padre)
	{
		this.padre = padre;
		this.setOpaque(true);
		this.setBackground(Color.black);
		setMinimumSize(new Dimension(300, 300));
		
		
		
	}
	
	
	@Override
	public void paint(Graphics g)
	{
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillRect(0,0,getWidth(),getHeight()); //TODO

	}
}