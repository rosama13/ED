import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

//ESTA ES LA VENTANA PRINCIPAL (MAIN) DESDE LA QUE LANZAREMOS LA APLICACION.
public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSocio = new JLabel("Socio");
		lblSocio.setBounds(10, 11, 422, 14);
		contentPane.add(lblSocio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 26, 422, 20);
		contentPane.add(comboBox);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos");
		lblNombreYApellidos.setBounds(10, 59, 422, 14);
		contentPane.add(lblNombreYApellidos);
		
		textField = new JTextField();
		textField.setBounds(10, 72, 422, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHoraDeEntrada = new JLabel("Hora de entrada");
		lblHoraDeEntrada.setBounds(10, 103, 110, 14);
		contentPane.add(lblHoraDeEntrada);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 100, 30, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHoraDeSalida = new JLabel("Hora de salida");
		lblHoraDeSalida.setBounds(10, 128, 110, 14);
		contentPane.add(lblHoraDeSalida);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 125, 30, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotalDeHoras = new JLabel("Total de horas");
		lblTotalDeHoras.setBounds(10, 153, 110, 14);
		contentPane.add(lblTotalDeHoras);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 150, 77, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Nuevo socio");
		btnGuardar.setBounds(22, 207, 112, 23);
		contentPane.add(btnGuardar);
		
		JButton btnModificar = new JButton("Registrar");
		btnModificar.setBounds(162, 203, 112, 31);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Borrar socio");
		btnEliminar.setBounds(304, 207, 112, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblH = new JLabel(":00 H");
		lblH.setBounds(162, 103, 46, 14);
		contentPane.add(lblH);
		
		JLabel lblH_1 = new JLabel(":00 H");
		lblH_1.setBounds(162, 128, 46, 14);
		contentPane.add(lblH_1);
	}
}
