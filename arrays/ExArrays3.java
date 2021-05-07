package br.com.victor.arrays;

import java.util.Scanner;

public class ExArrays3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		int maioresque10 = 0;
		
		for (int l = 0; l<matriz.length; l++) {
			for(int c= 0; c<matriz.length; c++) {
				System.out.println("Digite os valores da matriz");
				matriz[l][c] = leia.nextInt();
				if(matriz[l][c]>10 ) {
					maioresque10++;
				}
			}
			
		} System.out.println("Essa é a quantidade de números maiores que 10: " + maioresque10);
		
	}
	
	
}
