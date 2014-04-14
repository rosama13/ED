
public class Inventario_Objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String objeto[];

			//Inicializacion
			objeto=new String[10];

			//Ejemplos
			objeto[0]="Linterna";
			objeto[1]="Brujula";
			objeto[2]="Wombat";
			objeto[9]="Caña";
			
			//Imprimimos
			for (int i=0;i<objeto.length;i++)
	        {
				System.out.println(objeto[i]);
	        }

	}
}

