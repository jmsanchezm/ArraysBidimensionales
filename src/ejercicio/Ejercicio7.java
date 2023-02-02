package ejercicio;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Tabla inicializada con los valores por defecto
		int matrizA [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		//Variable aux intermedia
		int aux;
		
		for (int i=0; i<matrizA.length;i++) {
			for (int j=i;j<matrizA[i].length;j++) {
				//Intercambiamos las posiciones
				aux=matrizA[i][j];
				matrizA[i][j]=matrizA[j][i];
				matrizA[j][i]=aux;
				
			}
		}
		 System.out.println(Arrays.deepToString(matrizA));
	}

}
