package ejercicio;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numAleatorios[][]=new int [4][5];
		
		int sumaFila=0;
		
		int sumaColumna=0;
		
		int total=0;

		for (int i =0;i<numAleatorios.length;i++) {
			for (int j=0;j<numAleatorios[i].length;j++) {
				numAleatorios[i][j]=(int)(Math.random ()*(999-100+1)+100);
			}
		}
		
		for (int i = 0; i<numAleatorios.length;i++) {
			sumaFila=0;
			for (int j =0; j<numAleatorios[i].length;j++) {
				sumaFila+=numAleatorios[i][j];
				System.out.print(numAleatorios[i][j] + "\t");
			}
			total+=sumaFila;
			System.out.println("|" + sumaFila);
		}
		
		for (int col=0;col<numAleatorios[0].length;col++) {
			sumaColumna=0;
			for (int fila=0;fila<numAleatorios.length;fila++) {
				sumaColumna+=numAleatorios[fila][col];
			}
			System.out.print(sumaColumna + "\t");
		}
		System.out.println(total);
		
		
	}

}
