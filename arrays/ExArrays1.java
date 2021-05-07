package br.com.victor.arrays;

public class ExArrays1 {

	public static void main(String[] args) {
	 
		int a[] = new int[6];
	        a[0] = 1;
	        a[1] = 0;
	        a[2] = 5;
	        a[3] = -2;
	        a[4] = -5;
	        a[5] = 7;
	        
	    int soma;
	    
	    soma = a[0] + a[1] + a[5];
	    
	    	System.out.println("Essa é a sua soma: " + soma);	
	    	
	    	a[4] = 100;
	    
	    	for(int i=0; i<=5; i++)
	    	System.out.println( i +  " - " + a[i] );
	    		

	}

}
