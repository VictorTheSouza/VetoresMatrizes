package br.com.victor.arrays;

import java.util.Scanner;

public class ExArrays2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [6];
		int somaPares = 0;
		int quantidadeImpares = 0;
				
		System.out.println("Digite 6 n�meros inteiros: ");
		
		for(int i=0; i <=5; i++) {
			vetor[i] = leia.nextInt();
			if(vetor[i]%2 == 0) {
				System.out.println( "Esse n�mero � par");
				somaPares = somaPares +vetor[i];
				}else {System.out.println("Esse n�mero � impar");
				quantidadeImpares++;
			
		}
			
	}     	System.out.println("Essa � a soma dos n�mero pares: " + somaPares);
			System.out.println("Essa � a quantidade de n�meros �mpares: " + quantidadeImpares);

}}
