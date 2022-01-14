package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventoSencillo {

	public static void main(String[] args) {
		MarcoBotonesColores miMarco = new MarcoBotonesColores();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.setVisible(true);
	}

}

class MarcoBotonesColores extends JFrame{
	
	public MarcoBotonesColores() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotonesColores miLamina = new LaminaBotonesColores();
		add(miLamina);
		setVisible(true);
		
	}
}

class LaminaBotonesColores extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonVerde = new JButton("Verde");
	JButton botonAmarillo = new JButton("Amarillo");
	
	public LaminaBotonesColores () {
		//setBackground();
		
		add(botonAzul);
		add(botonVerde);
		add(botonAmarillo);
		
		botonAzul.addActionListener(this);
		botonVerde.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == botonAmarillo) {
			setBackground(Color.YELLOW);
		} else if(e.getSource() == botonAzul) {
			setBackground(Color.BLUE);
		} else {
			setBackground(Color.GREEN);
		}
		
	}
	
	/*public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}*/
}
