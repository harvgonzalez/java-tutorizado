package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventoSencillo2 {

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

class LaminaBotonesColores extends JPanel {
	
	JButton botonAzul = new JButton("Azul");
	JButton botonVerde = new JButton("Verde");
	JButton botonAmarillo = new JButton("Amarillo");
	
	public LaminaBotonesColores () {
		//setBackground();
		
		add(botonAzul);
		add(botonVerde);
		add(botonAmarillo);
		
		ColorDeFondo Azul = new ColorDeFondo(Color.BLUE);
		ColorDeFondo Verde = new ColorDeFondo(Color.GREEN);
		ColorDeFondo Amarillo = new ColorDeFondo(Color.YELLOW);
		
		botonAzul.addActionListener(Azul);
		botonVerde.addActionListener(Verde);
		botonAmarillo.addActionListener(Amarillo);
	}
	private class ColorDeFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public ColorDeFondo(Color c) {
			this.colorDeFondo = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
	}
}


