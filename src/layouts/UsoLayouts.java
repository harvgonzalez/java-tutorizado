package layouts;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UsoLayouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConLayout miMarco=new MarcoConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoConLayout extends JFrame{
	
	
	public MarcoConLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		PanelconLayout lamina=new PanelconLayout();
		PanelConLayout2 lamina2 =new PanelConLayout2();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		
		//lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(lamina, BorderLayout.SOUTH);
		add(lamina2,  BorderLayout.NORTH);
	
	}
	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
			
			//setLayout(new FlowLayout(FlowLayout.LEFT, 50, 150));
			setLayout(new BorderLayout());
			
			
			add(new JButton("Azul"), BorderLayout.EAST);	
			
			add(new JButton("Verde"), BorderLayout.WEST);	
			
			add(new JButton("Morado"), BorderLayout.CENTER);	
			
			
			
			
		}
}


class PanelConLayout2 extends JPanel{
	public PanelConLayout2() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));	
		
	}
}
