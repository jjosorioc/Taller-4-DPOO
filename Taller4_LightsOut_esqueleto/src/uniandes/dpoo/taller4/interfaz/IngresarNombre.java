package uniandes.dpoo.taller4.interfaz;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.formdev.flatlaf.FlatLightLaf;

@SuppressWarnings("serial")
public class IngresarNombre extends JFrame implements ActionListener
{
	JButton b;
	JTextField t;
	String nombreJugador;

	public IngresarNombre()
	{
		this.setTitle("Sign in!");
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
		JLabel imagen = new JLabel();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("./data/logo.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
		imagen.setIcon(imageIcon);

		// add buttons and textfield to panel
		p.add(imagen);
		p.add(l);
		p.add(t);
		p.add(b);

		// add panel to frame
		add(p);

		// set the size of frame
		setSize(350, 350);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b)
		{
			nombreJugador = t.getText();
			new VentanaPrincipal(nombreJugador);
			this.dispose();
		}

	}

	public static void main(String[] args)
	{
		FlatLightLaf.install();
		new IngresarNombre();

	}

}
