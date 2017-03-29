package com.epam.linear_system_solver.controller;

import com.epam.linear_system_solver.model.Equation;

public class Solver {
	
	private Equation equation;
	private int size;
	private CholeskyDecomposition chDecomposition;
	private double[] y;
	private double[] x;
	
	public Solver(Equation equation, int size) {
		this.equation = equation;
		this.size = size;
		this.chDecomposition = new CholeskyDecomposition(3, equation.getCoefficientMatrix());
		this.y = new double[size];
		this.x = new double[size];
	}

	public void useCholeskyMethod() {
		chDecomposition.decomposite();
		for (int i = 0; i < size; i++) {
			findSum(i);
		}
		for (int i = size-1; i >= 0; i--) {
			findTSum(i);
		}
		chDecomposition.print();
	}
	
	private void findSum(int i) {
		int b[] = equation.getConstantVector();
		double[][] ll = chDecomposition.getLowerTriangularMatrix();
		double sum = 0.0;
		int k = 0;
		while(k <= i-1) {
			sum += this.y[k]*ll[i][k];
			k++;
		}
		this.y[i]= (b[i]  - sum) / ll[i][i];
		System.out.println("y" + y[i]);
//		return y[i];
	}
	
	private double findTSum(int i) {
		double[][] ll = chDecomposition.getLowerTriangularMatrix();
//		double[][] ll = chDecomposition.getTransposeMatrix();
		double sum = 0.0;
		int k = size-1;
		while(k >= i+1) {
			sum += x[k]*ll[k][i];
			k--;
		}
		System.out.println(this.y[i]);
		System.out.println(ll[i][i]);
		x[i]=  (y[i] - sum) /ll[i][i];
		System.out.println("x " + x[i]);
		return x[i];
	}
}
