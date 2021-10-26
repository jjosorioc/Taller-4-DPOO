package uniandes.dpoo.taller4.interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IngresarNombre extends JFrame implements ActionListener
{
	JButton b;
	JTextField t;
	String nombreJugador;
	public IngresarNombre() 
	{	 
        // create a label to display text
		JLabel l = new JLabel("Ingrese su nombre para iniciar el juego! :)");
 
        // create a new button
		b = new JButton("submit");
		b.addActionListener(this);
 
        // create a object of JTextField with 16 columns
        t = new JTextField(16);
        t.addActionListener(this);
 
        // create a panel to add buttons and textfield
        JPanel p = new JPanel();
 
        // add buttons and textfield to panel
        p.add(l);
        p.add(t);
        p.add(b);
        
 
        // add panel to frame
        add(p);
 
        // set the size of frame
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        
        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == b)
		{
			nombreJugador = t.getText();
			this.dispose();
		}
		
	}
	
}
