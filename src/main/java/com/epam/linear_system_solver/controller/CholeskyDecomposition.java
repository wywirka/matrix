package com.epam.linear_system_solver.controller;

public class CholeskyDecomposition {

	private int size;
	private int[][] coefficientMatrix;
	private double[][] lowerTriangularMatrix;
	private double[][] transposeMatrix;
	
	public CholeskyDecomposition(int size, int[][] coefficientMatrix) {
		this.size = size;
		this.coefficientMatrix = coefficientMatrix;
		this.lowerTriangularMatrix = new double[size][size];
		this.transposeMatrix  = new double[size][size];
	}
	
	public double[][] getLowerTriangularMatrix() {
		return lowerTriangularMatrix;
	}

	public double[][] getTransposeMatrix() {
		return transposeMatrix;
	}

	public void decomposite(){
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(i>=j){
					lowerTriangularMatrix[i][j] = transposeMatrix[j][i] = 
							i > j ? findNoDiagonalElement(i, j) : findDiagonalElement(i, j);
				}
			}
		}
	}

	private double findNoDiagonalElement(int i, int j) {
		int sum = findSum(i, j);
		double value = this.coefficientMatrix[j][i]-sum;
		return value/lowerTriangularMatrix[j][j];
	}

	private double findDiagonalElement(int i, int j) {
		int sum = findSum(i, i);
		double value = Math.sqrt(this.coefficientMatrix[i][j]-sum);
		return value;
	}
	
	private int findSum(int i, int j) {
		int sum = 0;
		int k = 0;
		while(k <= i-1) {
			sum += lowerTriangularMatrix[j][k]*lowerTriangularMatrix[i][k];
			k++;
		}
		return sum;
	}
	
	public void print(){
		for(double[] array : lowerTriangularMatrix){
			for(double e: array){
				System.out.print(e + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(double[] array : transposeMatrix){
			for(double e: array){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}
