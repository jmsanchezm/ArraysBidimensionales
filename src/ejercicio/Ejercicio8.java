package ejercicio;

public class Ejercicio8 {

	public static void main(String[] args) {
		int matrizA [][]= new int [5][5];
		int matrizB[][];
		
		
		int aux;
		
		for (int i =0;i<matrizA.length;i++) {
			for (int j=0;j<matrizA[i].length;j++) {
				matrizA[i][j]=(int)(Math.random()*11);
				System.out.print(matrizA[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		matrizB=matrizA;
		
		
		for (int i=0; i<matrizB.length;i++) {
			for (int j=0;j<matrizB[i].length;j++) {
				//Intercambiamos las posiciones
				aux=matrizB[i][j];
				matrizB[i][j]=matrizB[j][i];
				matrizB[j][i]=aux;
				System.out.print(matrizB[i][j]+"\t");
			}
			System.out.println();
		}
		if (matrizA==matrizB) {
			System.out.println("Las matrices son simétricas.");
		}else {
			System.out.println("Las matrices no son simétricas.");
		}
		

	}

}
