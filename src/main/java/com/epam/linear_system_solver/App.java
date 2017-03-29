package com.epam.linear_system_solver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.epam.linear_system_solver.utils.ConsoleEquationReader;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class App {
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException{
//    	int[][] matrix = {{25, 15, -5},{15, 18, 0},{-5, 0, 11}};
//    	int[][] matrix = {{4, 12, -16},{12, 37, -43},{-16, -43, 98}};
//    	int[][] matrix = {{10, 2, 1},{2, 10, 3},{1, 3, 10}};
//    	int [] vector = {12,13,14};
    	
		new ConsoleEquationReader().readEquation();
//    	Equation eq = readEquation();
			//    	System.out.println(obj);
			//    	int[][] matrix = {{81, -45, 45},{-45, 50, -15},{45, -15, 38}};
			//    	int [] vector = {531,-460,193};
			//    	Equation eq = new Equation(matrix, vector);
			//    	Solver solver = new Solver(eq, 3);
			//    	solver.useCholeskyMethod();
			//    	int[][] matrix = {{1,2,3},{4,5,6,},{7,8,9}};
			//    	for (int i = 0; i < matrix.length; i++) {
			//			for (int j = 0; j < matrix.length; j++) {
			//				System.out.println(matrix[j][i]);
			//			}
			//		}
    }


	
}
