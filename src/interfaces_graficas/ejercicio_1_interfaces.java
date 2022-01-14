package interfaces_graficas;
import java.awt.Frame;

import javax.swing.*;


public class ejercicio_1_interfaces {

	public static void main(String[] args) {
		MiFrame miVentana1 = new MiFrame("ventana 1", 650, 350, 430, 430 );
		MiFrame miVentana2 = new MiFrame("ventana 2", 620, 320, 430, 430 );
		MiFrame miVentana3 = new MiFrame("ventana 3", 600, 300, 430, 430);

	}

}

class MiFrame extends JFrame{
	
	public MiFrame(String title, int posX, int posY, int width, int height ){
		setTitle(title);
		setSize(width,height);
		setLocation(posX, posY); 				
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}