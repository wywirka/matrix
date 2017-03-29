package com.epam.linear_system_solver.model;

import java.util.Arrays;

public class Equation {

	private int[][] coefficientMatrix;
	private double[] unknowVector;
	private int[] constantVector;
	
	public Equation() {
	}

	public Equation(int[][] coefficientMatrix, int[] constantVector) {
		this.coefficientMatrix = coefficientMatrix;
		this.constantVector = constantVector;
	}

	public int[][] getCoefficientMatrix() {
		return coefficientMatrix;
	}

	public void setCoefficientMatrix(int[][] coefficientMatrix) {
		this.coefficientMatrix = coefficientMatrix;
	}

	public int[] getConstantVector() {
		return constantVector;
	}

	public void setConstantVector(int[] constantVector) {
		this.constantVector = constantVector;
	}

	@Override
	public String toString() {
		return "Equation [coefficientMatrix=" + Arrays.toString(coefficientMatrix) + ", constantVector="
				+ Arrays.toString(constantVector) + "]";
	}
	
	
	
}
