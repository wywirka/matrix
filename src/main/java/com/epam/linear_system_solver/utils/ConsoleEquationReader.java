package com.epam.linear_system_solver.utils;

import java.util.Scanner;

import com.epam.linear_system_solver.model.Equation;
import com.epam.linear_system_solver.utils.exception.IllegalSizeException;

public class ConsoleEquationReader implements EquationReader {

	public Equation readEquation() {
		Scanner scanner = ScannerSingelton.getInstance();
    	int size = readMatrixDimension(scanner);
    	int[][] array = readCoefficientMatrix(scanner,size);
    	int[] arr = readConstantVector(scanner,size);
		scanner.close();
		return new Equation(array, arr);
	}

	private  int readMatrixDimension(Scanner scanner) {
		int input = scanner.nextInt();
		if(input<=0){
			throw new IllegalSizeException("Your input is incorrect" + input);
		}
		return  input;
	}

	private  int[][] readCoefficientMatrix(Scanner scanner, int size) {
		int[][] array = new int[size][size];
		int i=0;
		while (i < size) {
		 int j = 0;
			while (j < size) {
				array[i][j] = scanner.nextInt();
				j++;
			}
			i++;
		}
		return array;
	}

	private  int[] readConstantVector(Scanner scanner, int size) {
		int[] array = new int[size];
		int i=0;
		while (i < size) {
				array[i] = scanner.nextInt();
			i++;
		}
		return array;
	}
}
