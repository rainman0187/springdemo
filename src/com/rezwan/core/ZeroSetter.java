package com.rezwan.core;

import java.util.ArrayList;
import java.util.List;

public class ZeroSetter {
	
	public static void setZeros ( int row, int col, int [][] matrix  ) {
		for ( int i=0; i<matrix.length; i++ ) {
			 matrix[i][col] = 0; 
		}
		
		for ( int j=0; j<matrix[0].length; j++ ) {
			    matrix[row][j]=0;
		}
		
	}
	
	private static class Slot {
		private int row; 
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		public int getCol() {
			return col;
		}
		public void setCol(int col) {
			this.col = col;
		}
		private int col; 
	}
	
	 
	
	public static void newZeroMatrix( int [] [] matrix) {
		int [] rows = new int [matrix.length]; 
		int [] cols = new int [matrix[0].length]; 
		
		for ( int i=0; i< matrix.length; i++ ) {
			for ( int j=0; j<matrix[0].length; j++ ) {
				if ( matrix[i][j] == 0 ) {
					 rows[i]=1; 
					 cols[j]=1; 
				}
			}
		}
		
		for ( int i=0; i< matrix.length; i++ ) {
			for ( int j=0; j<matrix[0].length; j++ ) {
				if ( rows[i]==1 || cols[j]==1  ) {
					 matrix[i][j]=0; 
				}
			}
		}
		
	}
	
	public static void main(String [] args) {
			
		int [] [] matrix=MatrixRotationTest.produceMatrix(50);
		
		MatrixUtil.printMatrix(matrix); 
		
		newZeroMatrix(matrix); 
		
		
		MatrixUtil.printMatrix(matrix); 
		 
	 
	}
}
