package com.epam.linear_system_solver.utils;

import java.util.Scanner;

public class ScannerSingelton {

	private static Scanner scanner = null;
	private ScannerSingelton() {
	}

	public  static Scanner getInstance() {
		if(scanner == null){
			 scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
