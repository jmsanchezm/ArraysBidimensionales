package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos el array
		int matriz [][]= new int [10][10];
		
		
		//Creamos un for para que recorra las filas
		for (int i =0;i<matriz.length;i++) {
			System.out.println("Tabla de multiplicar del "+ (i+1));
			//Creamos otro for (anidado) para que recorra las columnas
			for (int j=0;j<matriz[i].length;j++) {
			System.out.println(matriz [i][j]);
				
			}
		}
		
	}

}
