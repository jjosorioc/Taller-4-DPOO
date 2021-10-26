package uniandes.dpoo.taller4.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaFinal extends JFrame implements ActionListener
{
	private VentanaPrincipal ventana;
	JButton empezar;
	JButton salir;
	
	public static void main(String[] args)
	{
		
		new VentanaFinal(3,4);
		
	}
	
	public VentanaFinal(int jugadas, int puntaje)
	{
		JLabel texto1 = new JLabel("Fin del juego!");
		JLabel texto2 = new JLabel("Ha terminado el juego en: " + jugadas + " jugadas.");
		JLabel texto3 = new JLabel("Su puntaje ha sido: " + puntaje + " puntos.");
		
		empezar = new JButton("Volver a empezar");
		empezar.addActionListener(this);
		salir = new JButton("Salir");
		salir.addActionListener(this);
		
		add(texto1);
		add(texto2);
		add(texto3);
		add(empezar);
		add(salir);
		
		setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == empezar)
		{
			new IngresarNombre();
		}
		else if(e.getSource()==salir)
		{
			System.exit(0);
		}
		
	}

}
