
	import javax.swing.JComboBox;

public class Registro {
	
	private String Socio;
	private int HoraIn;
	private int HoraOut;
	private int TotalHoras;

	public Registro(JComboBox R) {
		Socio="";
		HoraIn=0;
		HoraOut=0;
		TotalHoras=0;
	}
	public void setSocio(String s){Socio=s;}
	public void setHoraIn(int i){HoraIn=i;}
	public void setHoraOut(int o){HoraOut=o;}
	public void setTotalHoras(int t){TotalHoras=t;}
	public String getSocio(){return Socio;}
	public int getHoraIn(){return HoraIn;}
	public int getHoraOut(){return HoraOut;}
	public int getTotalHoras(){return TotalHoras;}
	public String toString(){return Socio;}
	
}
