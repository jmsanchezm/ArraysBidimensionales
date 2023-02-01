package ejercicio;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Creamos el array de dimensión 5x5.
		int tabla [][]= new int [5][5];
		
		//Recorremos tabla
		for (int i =0;i<tabla.length;i++) {
			for (int j = 0;j<tabla[i].length;j++) {
				//A cada posición, calculará un número
				tabla [i][j]= 10 * i+j;
			}
		}

		//For para recorrer filas
		for(int i =0;i<tabla.length;i++) {
			//For para recorrer columas
			for (int j =0; j<tabla[i].length;j++) {
				//Mostrará los valores del array
				System.out.print(tabla[i][j] + " ");
			}
			//Salto de línea
			System.out.println();
				}
	}

}
