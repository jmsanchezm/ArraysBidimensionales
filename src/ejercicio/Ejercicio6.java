package ejercicio;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creamos el array
		int minMax [][]= new int [6][10];
		
		//Declaramos las variables min y max
		int contFilaMin=0;
		int contColMin=0;
		int contFilaMax=0;
		int contColMax=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		//Recorremos la tabla para añadir valores a cada celda
		for (int i=0;i<minMax.length;i++) {
			for (int j =0;j<minMax[i].length;j++) {
				//Generamos los números
				minMax[i][j]= (int)(Math.random()*1001);
				
				//Si el valor es mayor a max
				if (max<minMax[i][j]) {
					//Se guardará en max
					max=minMax[i][j];
					//Las dos variables tomarán los valores de i y j para poder utilizarlas fuera de los for
					contFilaMax=i;
					contColMax=j;
				}
				//Si el valor es menor a min
				if (min>minMax[i][j]) {
					//Se guardará en min
					min=minMax[i][j];
					//Las dos variables tomarán los valores de i y j para poder utilizarlas fuera de los for
					contFilaMin=i;
					contColMin=j;
				}
				//Mostramos los valores
				System.out.print(minMax[i][j]+ "\t");
			}
			//Salto de línea
			System.out.println();
		}
		//Salto de línea
		System.out.println();
		//Mostramos resultado en pantalla
		System.out.println("El valor máximo " + max + " se encuentra en la posición ["+contFilaMax+"]["+contColMax + "]" );
		System.out.println("El valor máximo " + min + " se encuentra en la posición ["+contFilaMin+"]["+contColMin + "]" );
	}

}
