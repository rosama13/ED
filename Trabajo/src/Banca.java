import java.io.Serializable;


public class Banca implements Serializable{

	private int cogerCarta;
	private int devolverCarta;
	//Array de numeros
	private int arrayNumeros[]=new int[40];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void dameCarta(int recibir,int devolver) {
		cogerCarta=recibir;
		devolverCarta=devolver;
	}
	public void setCarta(int a){
		
		arrayNumeros[40]=a;
	}
	
	public int getCarta(){
		
		return arrayNumeros[40];
	}
}
