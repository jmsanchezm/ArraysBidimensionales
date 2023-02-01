package ejercicio;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creamos el array
		int minMax [][]= new int [6][10];
		
		//Declaramos las variables min y max
		int max=0;
		int min=1001;
		
		//Recorremos la tabla para añadir valores a cada celda
		for (int i=0;i<minMax.length;i++) {
			for (int j =0;j<minMax[i].length;j++) {
				minMax[i][j]= (int)(Math.random()*1001);
			}
		}
		//Recorremos la table de nuevo
		for (int i =0;i<minMax.length;i++) {
			for (int j=0;j<minMax[i].length;j++) {
				//Si el número que se encuentra en esa posición es mayor que el max
				if(minMax[i][j]>=max) {
					//Se guardará en max
					max=minMax[i][j];
				}
				
				//Si el número que se encuentra en esa posición es menor que el min
				if (minMax[i][j]<=min) {
					//Se guardará en min
					min=minMax[i][j];
				}
			}
		}
		
		//Para mostrar en pantalla el array
		//For para recorrer filas
		for(int i =0;i<minMax.length;i++) {
			//For para recorrer columas
			for (int j =0; j<minMax[i].length;j++) {
				//Mostrará los valores del array
				System.out.print(minMax[i][j] + " ");
			}
			//Salto de línea
			System.out.println();
		}
		
		//Mostramos en pantalla los valores mínimo y máximo
		System.out.println("El valor mínimo es: " + min);
		System.out.println("El valor máximo es:" + max);
	}

}
