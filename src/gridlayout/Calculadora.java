package gridlayout;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora miMarco=new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame{
	
	
	public MarcoCalculadora(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		JPanelCalculadora lamina=new JPanelCalculadora();
		
		add(lamina);
	
	}
	
}

class JPanelCalculadora extends JPanel{
		private JPanel numeros;
		private JButton pantalla;
		private JButton reset;
		private boolean comienzo;
		private String ultimaOperacion = "";
		private double resultado;
		private double ultimoValor;
		
		public JPanelCalculadora(){
			
			comienzo = true;
			
			setLayout(new BorderLayout());
			pantalla = new JButton("0");
			pantalla.setEnabled(false);
			reset = new JButton("c");
			
			add(pantalla, BorderLayout.NORTH);
			//add(reset, BorderLayout.NORTH);
			numeros= new JPanel();
			
			numeros.setLayout(new GridLayout(4,4));
			
			InsertarNumero insertar = new InsertarNumero();
			Operacion realizarOperacion = new Operacion();
			
			ponerBoton("7", insertar);
			ponerBoton("8", insertar);
			ponerBoton("9", insertar);
			ponerBotonOperaciones("x", realizarOperacion);
			
			ponerBoton("4", insertar);
			ponerBoton("5", insertar);
			ponerBoton("6", insertar);
			ponerBotonOperaciones("÷", realizarOperacion);
			ponerBoton("1", insertar);
			ponerBoton("2", insertar);
			ponerBoton("3", insertar);
			ponerBotonOperaciones("+", realizarOperacion);
			
			ponerBoton("0", insertar);
			ponerBoton(".", insertar);
			ponerBotonOperaciones("=", realizarOperacion);
			ponerBotonOperaciones("-", realizarOperacion);
			
			
			add(numeros, BorderLayout.CENTER);
			
		}
		
		private void ponerBoton(String textoBoton, InsertarNumero listener) {
			JButton boton= new JButton(textoBoton);
			
			boton.addActionListener(listener);
			numeros.add(boton);
					
		}
		
		private void ponerBotonOperaciones(String textoBoton, Operacion listener) {
			JButton boton= new JButton(textoBoton);
			
			boton.addActionListener(listener);
			numeros.add(boton);
					
		}
		
		private class InsertarNumero implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				String entrada=e.getActionCommand();
				
				if (comienzo) {
					pantalla.setText(entrada);
					comienzo = false;
				}
				else {
					pantalla.setText(pantalla.getText() + entrada);
				}
				
				ultimoValor=Double.parseDouble(pantalla.getText());
			}		
		}
		
		private class Operacion implements ActionListener{
			private String ultimaOperacion;
			private int contador;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String operacionPulsada= e.getActionCommand();
				
				
				if(operacionPulsada.equals("+")) {
					
					resultado+= ultimoValor;
					pantalla.setText("" + resultado);
					ultimaOperacion = "+";
					
				}
				else if(operacionPulsada.equals("x")) {
					
					double valor= Double.parseDouble(pantalla.getText());
					
					if(contador ==0) resultado=valor*1;
					else resultado*=ultimoValor;
					
					pantalla.setText("" + resultado);
					ultimaOperacion = "x";
					contador++;
					
				}
				else if(operacionPulsada.equals("-")) {
					double valor= Double.parseDouble(pantalla.getText());
					if(contador ==0) resultado=valor;
					else resultado-=ultimoValor;
					
					
					pantalla.setText("" + resultado);
					ultimaOperacion = "-";
					
					contador++;
				}
				else if(operacionPulsada.equals("÷")) {
					double valor= Double.parseDouble(pantalla.getText());
					if(contador ==0) resultado=valor*1;
					else resultado/=ultimoValor;
					
					
					pantalla.setText("" + resultado);
					ultimaOperacion = "÷";
					
					contador++;
				}
				else {
					if (ultimaOperacion.equals("+")) resultado+= ultimoValor;
					if(ultimaOperacion.equals("x")) resultado*= ultimoValor; contador=0;
					if(ultimaOperacion.equals("-")) resultado-= ultimoValor; contador=0;
					if(ultimaOperacion.equals("÷")) resultado/= ultimoValor; contador=0;
					
					pantalla.setText("" + resultado);
					ultimoValor = 0;
				}
				
				comienzo=true;	
				
			}
			
		}
		
		
		
}



