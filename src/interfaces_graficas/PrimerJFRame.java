package interfaces_graficas;
import javax.swing.*;
import java.awt.Frame;

	
public class PrimerJFRame {
	
	//public PrimerJFRame

	public static void main(String[] args) {
		
		/*JFrame miVentana = new JFrame(); // crea venta
		
		miVentana.setSize(600, 350); // para darle dimensiones
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // parametro es un int que indica qué acción hacer
		
		miVentana.setLocation(600, 350);
		miVentana.setVisible(true); // para hacer visible la aplicación (siempre último lugar)*/
		
		MiJFrame miVentana = new MiJFrame();
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MiJFrame extends JFrame{
	
	public MiJFrame() {
		//setSize(600, 350);
		
		//setLocation(600, 350); 
		
		setBounds(600, 350, 450, 450);
		setTitle("Ventana pruebas");
		//setResizable(false);
		//setLocationRelativeTo(null);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}