package ejercicio;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Creamos el array 
		int numAleatorios[][]=new int [4][5];
		
		//Declaramos variables
		int sumaFila=0;//Se guardará la suma de las filas
		
		int sumaColumna=0;//Se guardará la suma de las columnas
		
		int totalFila=0; //Se guardará el total de las filas.
		
		int totalCol=0; //Se guardará el total de las columnas

		//Recorremos el array
		for (int i =0;i<numAleatorios.length;i++) {
			for (int j=0;j<numAleatorios[i].length;j++) {
				//Vamos generando números y almacenandolos en el array
				numAleatorios[i][j]=(int)(Math.random ()*(999-100+1)+100);
			}
		}
		
		//Recorremos el array
		for (int i = 0; i<numAleatorios.length;i++) {
			//Inicializamos la variabla 0 por cada iteración
			sumaFila=0;
			for (int j =0; j<numAleatorios[i].length;j++) {
				//Se le sumará a sumaFila el número que se encuentre en la posición i j
				sumaFila+=numAleatorios[i][j];
				//Mostramos en pantalla
				System.out.print(numAleatorios[i][j] + "\t");
			}
			
			totalFila+=sumaFila;
			System.out.println("|" + sumaFila);
		}
		
		for (int col=0;col<numAleatorios[0].length;col++) {
			sumaColumna=0;
			for (int fila=0;fila<numAleatorios.length;fila++) {
				sumaColumna+=numAleatorios[fila][col];
			}
			totalCol+=sumaColumna;
			System.out.print(sumaColumna + "\t");
		}
		System.out.println(totalFila+totalCol);
		
		
	}

}
