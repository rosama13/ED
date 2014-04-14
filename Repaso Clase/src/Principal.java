
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llamada ventana
		Equipo e=new Equipo();
		Liga l=new Liga();
				
		VentanaLiga frame = new VentanaLiga(l);
		frame.setVisible(true);
		
				
	}

}
