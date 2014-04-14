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


public class VentanaLiga extends JFrame {

	private JPanel contentPane;
	private Liga lig;
	private Equipo equipo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public VentanaLiga(Liga l) {
		
		// Asignacion de equipo
		lig=l;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de la Liga");
		lblNewLabel.setBounds(29, 25, 131, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumeroDeEquipos = new JLabel("Numero de equipos");
		lblNumeroDeEquipos.setBounds(233, 25, 148, 14);
		contentPane.add(lblNumeroDeEquipos);
		
		JLabel lblEquipoAModificar = new JLabel("Equipo a modificar");
		lblEquipoAModificar.setBounds(29, 94, 180, 14);
		contentPane.add(lblEquipoAModificar);
		
		textField = new JTextField();
		textField.setBounds(29, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(233, 50, 86, 20);
		
		//Añadir numeros
		textField_1.setText(String.valueOf(l.getNumEquipos()));
		contentPane.add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(29, 119, 86, 20);
		contentPane.add(textField_2);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEquipo frameEquipo = new VentanaEquipo(lig.getEquipo(Integer.valueOf(textField_2.getText())));
				frameEquipo.setVisible(true);
				frameEquipo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnModificar.setBounds(29, 175, 89, 23);
		contentPane.add(btnModificar);
	}

}
