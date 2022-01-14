package interfaces_graficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame {
	public MarcoTexto() {
		setBounds(400, 200, 600, 450);
		
		setTitle("Escritura en JFrame");
		PrimerPanel milamina = new PrimerPanel();
		add(milamina);
		
		setVisible(true);
		
		
	}
}

class PrimerPanel extends JPanel {
	
	public PrimerPanel() {
		setBackground(new Color(195));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color miColor = new Color( 35, 128, 100);
		g.setColor(miColor);
		
		Font miLetra = new Font("Courier", 3, 30);	// si sumas lo que vale F
		g.setFont(miLetra);
		
		
		
		
		g.drawString("Primer panel", 120, 120);
		
			
		
	}
}