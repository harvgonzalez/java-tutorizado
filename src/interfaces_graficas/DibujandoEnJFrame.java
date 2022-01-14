package interfaces_graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
		
		MarcoDibujos miMarco = new MarcoDibujos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoDibujos extends JFrame{
	
	public MarcoDibujos() {
		
		setBounds(300, 300, 800, 450);
		
		LaminaDibujos miLamina = new LaminaDibujos();
		
		add(miLamina);
		
		setVisible(true);
		
		
	}
}


class LaminaDibujos extends JPanel{
	
	public LaminaDibujos() {
		setBackground(Color.YELLOW);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*g.drawRect(20, 20, 125, 75);
		g.drawLine(20, 20, 145, 95);
		g.fillRect(20, 200, 125, 75);*/
		
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200, 150);
		
		float[] midash = {10.9f}; 
		BasicStroke miLapiz = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, midash, 0);
		
		g2.setPaint(Color.BLUE);
		g2.setStroke(miLapiz);
		g2.draw(rectangulo);
		
		Color miColor = new Color(120, 188, 230);
		
		g2.setPaint(miColor);
		g2.fill(rectangulo);
		
		
	}
	
}