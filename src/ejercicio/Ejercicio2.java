package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos el array
		int matriz [][]= new int [10][10];
		
		//Abrimos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Creamos un for para que recorra las filas
		for (int i =0;i<matriz.length;i++) {
			//Solictamos dato
			System.out.println("Introduzca los valores dela tabla de multiplicar del "+ (i+1));
			//Creamos otro for (anidado) para que recorra las columnas
			for (int j=0;i<matriz[i].length;i++) {
				//Leemos dato
				matriz[i][j]=read.nextInt();
			}
		}
		
		//For para recorrer filas
		for(int i =0;i<matriz.length;i++) {
			//For para recorrer columas
			for (int j =0; j<matriz[i].length;j++) {
				//Mostrará los valores del array
				System.out.print(matriz[i][j] + " ");
			}
			//Salto de línea
			System.out.println();
		}
		
		//Finalmente, cerramos el Scanner 
		read.close();
		
	}

}
