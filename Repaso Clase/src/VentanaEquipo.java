import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class VentanaEquipo extends JFrame {
	
	private Equipo equipo;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	//Creamos la clase que guarde nuestros datos
	private void guardarEnFichero(){
		ObjectOutputStream salida;
		try //abre el fichero
		{
			salida = new ObjectOutputStream(new FileOutputStream("clientes.ser"));
			salida.writeObject(equipo); //envía el registro como salida
			if (salida != null)
				salida.close();
		}//fin de try
		catch(IOException ioException)
		{
			System.err.println("Error al abrir el archivo.");
		}//fin de catch
	}//finalización de try
	
	//Creamos la clase que devuelva datos
	private void recogerdeFichero(){
		
		ObjectInputStream entrada;
		
		try{
			entrada=new ObjectInputStream(new FileInputStream("clientes.ser"));
			equipo=(Equipo)entrada.readObject();
			if (entrada != null)
				entrada.close();
		}catch ( Exception e )
		{
			System.err.println("Error al abrir el archivo");
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public VentanaEquipo(Equipo e) {
		equipo=e;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Equipo");
		lblNewLabel.setBounds(27, 25, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGolesAFavor = new JLabel("Goles a Favor");
		lblGolesAFavor.setBounds(27, 66, 100, 14);
		contentPane.add(lblGolesAFavor);
		
		JLabel lblGolesEnContra = new JLabel("Goles en Contra");
		lblGolesEnContra.setBounds(27, 91, 100, 14);
		contentPane.add(lblGolesEnContra);
		
		JLabel lblPartidosGanados = new JLabel("Partidos Ganados");
		lblPartidosGanados.setBounds(27, 122, 122, 14);
		contentPane.add(lblPartidosGanados);
		
		JLabel lblPartidosPerdidos = new JLabel("Partidos Perdidos");
		lblPartidosPerdidos.setBounds(27, 147, 122, 14);
		contentPane.add(lblPartidosPerdidos);
		
		JButton btnGuardarDatos = new JButton("Guardar Datos");
		btnGuardarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Inicializar variables
				String equip="";
				int a=0;
				int b=0;
				int c=0;
				int d=0;
					
					
				equip=String.valueOf(textField.getText());
				a=Integer.parseInt(textField_1.getText());
				b=Integer.parseInt(textField_2.getText());
				c=Integer.parseInt(textField_3.getText());
				d=Integer.parseInt(textField_4.getText());
				
				
				equipo.setNombre(equip);
				equipo.setGolesFavor(a);
				equipo.setGolesContra(b);
				equipo.setPartidosGanados(c);
				equipo.setPartidosPerdidos(d);
				
				//Guardar datos en archivo
				guardarEnFichero();
			}
		});
		btnGuardarDatos.setBounds(321, 25, 103, 72);
		contentPane.add(btnGuardarDatos);
		
		textField = new JTextField();
		textField.setBounds(147, 22, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 63, 147, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 88, 147, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 119, 147, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 147, 147, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(147, 188, 40, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPosicinDelJugador = new JLabel("Posicion del Jugador");
		lblPosicinDelJugador.setBounds(197, 191, 103, 14);
		contentPane.add(lblPosicinDelJugador);
		
		JButton btnMostrarJugador = new JButton("Mostrar Jugador");
		btnMostrarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Mostrar nombre del jugador
				
				String nombre="";
				int pos=0;
				
				
				equipo.setNombre(nombre);
				equipo.setposicion(pos);
				
				
				textField_6.setText(String.valueOf(equipo.getNombre()));
				textField_5.setText(equipo.getNombre());
				
				nombre=String.valueOf(textField_6.getText());
				pos=Integer.parseInt(textField_5.getText());
				
			}
		});
		btnMostrarJugador.setBounds(27, 187, 111, 23);
		contentPane.add(btnMostrarJugador);
		
		JButton btnModificarJugador = new JButton("Modificar Jugador");
		btnModificarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre="";
				int pos=0;
				
				
				nombre=String.valueOf(textField_6.getText());
				pos=Integer.parseInt(textField_5.getText());
				
				
				equipo.setNombre(nombre);
				equipo.setposicion(pos);
								
			}
		});
		btnModificarJugador.setBounds(296, 187, 128, 23);
		contentPane.add(btnModificarJugador);
		
		JLabel lblNombreDelJugador = new JLabel("Nombre del Jugador");
		lblNombreDelJugador.setBounds(197, 216, 100, 14);
		contentPane.add(lblNombreDelJugador);
		
		textField_6 = new JTextField();
		textField_6.setBounds(197, 231, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
