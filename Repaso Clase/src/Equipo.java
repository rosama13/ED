import java.io.Serializable;
import java.util.ArrayList;



public class Equipo implements Serializable{
	//Inicializar varaibles
	private String nombreEquipo="";
	private int golesFavor=0;
	private int golesContra=0;
	private int partidosGanados=0;
	private int partidosPerdidos=0;
	private String jugadores[];
	private int posicion;
	private String nombreJugador="";
	
	
	public void modificarJugador(int posicionJugador, String nombreNuevo){
		
		jugadores[posicionJugador]=nombreNuevo;
	}
	// Devolver posicion Jugador
	
	public String devolverJugador(int posicionJugador){
		
		return jugadores[posicionJugador];
	}
	
	public Equipo() {
		// TODO Auto-generated constructor stub
		jugadores=new String[posicion];
	}
	
	//Sobrecarga clase Equipo
	public Equipo(String nom, int golesF, int golesC, int partidosG, int partidosP)
	{
		//Inicialización de variables
		 nombreEquipo=nom;
		 golesFavor=golesF;
		 golesContra=golesC;
		 partidosGanados=partidosG;
		 partidosPerdidos=partidosP;
	}
	
	//Creacion de valores
	
	public void setNombre(String a){
		nombreEquipo=a;
	}
	public void setGolesFavor(int a){
		golesFavor=a;
	}
	public void setGolesContra(int a){
		golesContra=a;
	}
	public void setPartidosGanados(int a){
		partidosGanados=a;
	}
	public void setPartidosPerdidos(int a){
		partidosPerdidos=a;
	}
	public String getNombre(){
		return nombreEquipo;
	}
	public int getGolesFavor(){
		return golesFavor;
	}
	public int getGolesContra(){
		return golesContra;
	}
	public int getPartidosGanados(){
		return partidosGanados;
	}
	public int getPartidosPerdidos(){
		return partidosPerdidos;
	}

	public void setposicion(int pos) {
		// TODO Auto-generated method stub
		
	}
}
