package ejercicio;

public class Ejercicio8 {

	public static void main(String[] args) {
		int matriz [][]= new int [5][5];
		
		
		
		int aux;
		
		for (int i =0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=(int)(Math.random()*11);
			}
		}
	
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				//Intercambiamos las posiciones
				aux=matriz[i][j];
				matriz[i][j]=matriz[j][i];
				matriz[j][i]=aux;
				
			}
		}
		

	}

}
