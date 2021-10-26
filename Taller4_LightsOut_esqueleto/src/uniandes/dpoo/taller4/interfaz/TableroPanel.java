package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

@SuppressWarnings("serial")
public class TableroPanel extends JPanel implements MouseListener
{
	private VentanaPrincipal padre;
    private int[][] cantidades;
    private int largo;
    private boolean[][] tablero;



    public TableroPanel(VentanaPrincipal padre){
        setSize(600,600);
        this.padre = padre;
        this.addMouseListener(this);
    }

    public void nuevoPanel(Tablero tableroC){
        this.removeAll();
        this.tablero = tableroC.darTablero();
        this.largo = tablero.length;
        this.cantidades = new int[largo][largo];
        GridLayout gl = new GridLayout(largo,largo);
        setLayout(gl);

        actulizarPanel();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int la = Math.min(this.getWidth()/largo, this.getHeight()/largo);
        int sdisx = (getWidth()-la*largo)/2;
        int disy = (getHeight()-la*largo)/2;
        for (int i = 0; i < largo; i++) {
            int disx = sdisx;
            for (int ii = 0; ii < largo; ii++) {
                GradientPaint gp;
                Color colorT;
                if (tablero[i][ii]) {
                    gp = new GradientPaint(disx, disy, new java.awt.Color(113, 164, 201), disx + la, disy + la, Color.WHITE);
                    colorT = Color.BLACK;
                }else{
                    gp = new GradientPaint(disx, disy, Color.GRAY, disx + la, disy + la, new java.awt.Color(25, 40, 50));
                    colorT = Color.green;
                }

                g2d.setPaint(gp);
                g2d.fillRoundRect(disx,disy,la,la,20,20);
                g2d.setColor(colorT);
                g2d.drawString(String.valueOf(cantidades[i][ii]),disx +(int)(la*0.1),disy+(int)(la*0.1));

                disx += la;
            }
            disy += la;
        }
    }
    public void actulizarPanel(){
        repaint();
    }
@Override
    public void mouseClicked(MouseEvent e) {
         int click_x = e.getX();
         int click_y = e.getY();
         int[] casilla = convertirCoordenadasACasilla(click_x, click_y);

         cantidades[casilla[0]][casilla[1]]++;
         padre.Jugar(casilla[0], casilla[1]);
         repaint();
    }

	private int[] convertirCoordenadasACasilla(int x, int y)
	{

		int ladoTablero = tablero.length; int altoPanelTablero = getHeight(); int anchoPanelTablero = getWidth();
		int altoCasilla = altoPanelTablero / ladoTablero; int anchoCasilla = anchoPanelTablero / ladoTablero; int fila = (int) (y / altoCasilla);
		int columna = (int) (x / anchoCasilla);
		return new int[] { fila, columna };
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
