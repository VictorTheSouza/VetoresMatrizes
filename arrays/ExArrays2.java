package br.com.victor.arrays;

import java.util.Scanner;

public class ExArrays2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [6];
		int somaPares = 0;
		int quantidadeImpares = 0;
				
		System.out.println("Digite 6 números inteiros: ");
		
		for(int i=0; i <=5; i++) {
			vetor[i] = leia.nextInt();
			if(vetor[i]%2 == 0) {
				System.out.println( "Esse número é par");
				somaPares = somaPares +vetor[i];
				}else {System.out.println("Esse número é impar");
				quantidadeImpares++;
			
		}
			
	}     	System.out.println("Essa é a soma dos número pares: " + somaPares);
			System.out.println("Essa é a quantidade de números ímpares: " + quantidadeImpares);

}}
