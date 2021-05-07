package br.com.victor.arrays;

import java.util.Scanner;

public class ExArrays4 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int a[][] = new int [2][2];
		int b[][] = new int [2][2];
		int menu = 0;
		int constante;
		int x[][] = new int [2][2];
		int y[][] = new int [2][2];
		
		for(int l = 0; l<a.length; l++) {
			for(int c = 0; c < a[l].length; c++) {
				System.out.printf("Digite os valores da matriz a: %d %d: ",l,c);
				a[l][c] = leia.nextInt();}

	}System.out.println();

	for(int l = 0; l<b.length; l++) {
		for(int c = 0; c < b[l].length; c++) {
			System.out.printf("Digite os valores da matriz b: %d %d: ",l,c);
			b[l][c] = leia.nextInt();}

}    System.out.println(" Deseja: 1 - somar as duas matrizes; 2 - subtrair a matriz 'a' da 'b'; 3 - adicionar uma constante as duas matrizes ou 4 - visualizar as matrizes?: ");
     menu = leia.nextInt();
     if(menu == 1) {
    	 x[0][0] = a[0][0] + b[0][0];
    	 x[0][1] = a[0][1] + b[0][1];
    	 x[1][0] = a[1][0] + b[1][0];
    	 x[1][1] = a[1][1] + b[1][1];
    	 
     }else if(menu == 2) {
    	 y[0][0] = a[0][0] - b[0][0];
    	 y[0][1] = a[0][1] - b[0][1];
    	 y[1][0] = a[1][0] - b[1][0];
    	 y[1][1] = a[1][1] - b[1][1];
    	 
     }else if(menu == 3) {
    	 System.out.println("Digite o valor da constante");
    	 constante = leia.nextInt();
    	 a[0][0] = a[0][0] + constante;
    	 b[0][0] = b[0][0] + constante;
    	 a[0][1] = a[0][1] + constante;
    	 b[0][1] = b[0][1] + constante;
    	 a[1][0] = a[1][0] + constante;
    	 b[1][0] = b[1][0] + constante;
    	 a[1][1] = a[1][1] + constante;
    	 b[1][1] = b[1][1] + constante;
    	     	 
     }else if( menu == 4) {
    	 for(int l = 0; l<a.length; l++) {
 			for(int c = 0; c < a[l].length; c++) {
 				System.out.println(a[l][c]);
 			}
	}System.out.println();
	
 			for(int r = 0; r<b.length; r++) {
 			for(int t = 0; t < b.length; t++) {
 				System.out.println(b[r][t]);}
 			}
 			
     }
	}
}

     
    	 
    
	

	
