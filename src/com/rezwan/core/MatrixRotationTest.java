package com.rezwan.core;


public class MatrixRotationTest {
	
	static void rotateMatrix(int a[][]) {
	    int n = a.length;
	    if (n <= 1) {
	        return; // nothing to do
	    }

	    /* layers */
	    for (int i = 0; i < n / 2; i++) {
	        /* elements */
	        for (int j = i; j < n - i - 1; j++) {
	            int saved = a[i][j];
	            
	        
	            
	            a[i][j] = a[n - j - 1][i];
	            System.out.println( i +" " + j + " = " + (n-j-1) + " " + i );
	            
	            
	            a[n - j - 1][i] = a[n - 1 - i][n - 1 - j];
	            System.out.println("== "+ (n-j-1) + " " + i + " = " + (n-1-i) + " " + (n-1-j) ); 
	             
	            
	            a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
	            System.out.println("==="+ (n - 1 - i) + " " + (n - 1 - j) + " = " + j + " " + (n-1-i) ); 
	           
	            
	            a[j][n - 1 - i] = saved;
	            System.out.println("===="+ (j) + " " + (n - 1 - i) + " = " + i + " " + j ); 
	            
	            
	            
	            
	        }
	    }
	}
	
	
	
	
	
	public static void rezwanSwap( int [] [] matrix ) {
		
		int n=matrix.length; 
		for ( int layer=0; layer<n/2; layer++ ) {
			int first=layer; 
			int last=n-1-layer; 
			
			System.out.println(first+" "+last); 
			
			for ( int i=first; i<last; i++ ) {
				int offset = i-first; 
				int top=matrix[first][i];
				
				matrix[first][i]=matrix[last-offset][first]; 
				System.out.println( first+" "+i + " = " + (last-offset) +" " +first ); 
				
				
				matrix[last-offset][first]=matrix[last][last-offset]; 
				System.out.println( (last-offset)+" "+first + " = " + (last) +" " + (last-offset)  ); 
				
				
				matrix[last][last-offset]=matrix[i][last];
				System.out.println( last+" "+ (last-offset) + " = " + i +" " +last ); 
				
				matrix[i][last]=top; 
				System.out.println( i+" "+last + " = " + first +" " +i ); 
				
				
				MatrixUtil.printMatrix(matrix); 
				
				System.out.println("--------------------");
				
			}
		}
	}
	
	public static int [][] produceMatrix(int n) {
		int [][] array = new int [n][n]; 
		
		for ( int i=0; i<n; i++ ) {
			for ( int j=0; j<n; j++ ) {
				array[i][j]=(int) ( Math.random()*50 ); 
			}
		}
		
		return array; 
		
	}
	
	
	public static void rezwanSwap2(int [][] matrix) {
		int n=matrix.length; 
		for ( int layer=0; layer<n/2; layer++ ) {
			int first=layer;
			int last=n-1-first; 
			
			
			for ( int j=first; j<last; j++ ) {
				int offset=j-first; 
				int temp=matrix[layer][j];
				
				matrix[layer][j]=matrix[last-offset][layer]; 
			 
				
				matrix[last-offset] [ layer ] = matrix [ last ] [last-offset]; 
				 
				
				matrix[last][last-offset] = matrix[j][last]; 
				 
				
 
				matrix[j][last] = temp; 
				 
	 
				
			}
			
		}
	}
	
	
	public static void main(String [] args) {
		int [][] matrix =   produceMatrix(5);
		
		MatrixUtil.printMatrix(matrix); 
		
		rezwanSwap2(matrix); 
		
		System.out.println("+++++++++++++++++++++++++"); 
		
		
		MatrixUtil.printMatrix(matrix); 
		 
	}
}
