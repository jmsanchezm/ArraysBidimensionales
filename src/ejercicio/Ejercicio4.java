package ejercicio;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creamos el array
		int num [][]= new int[3][6];
		
		//Introducimos los datos manualmente
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][0]=75;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		
		//For para recorrer filas
		for(int i =0;i<num.length;i++) {
			//For para recorrer columas
			for (int j =0; j<num[i].length;j++) {
				//Mostrará los valores del array
				System.out.print(num[i][j] + " ");
			}
			//Salto de línea
			System.out.println();
		}
	}

}
