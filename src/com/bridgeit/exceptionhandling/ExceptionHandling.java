package com.bridgeit.exceptionhandling;

/**
 * Created By:Pooja Todkar.
 *  Date :06/05/2019. 
 *  Purpose :Exception Handling.
 */
// this is the program for demonstrating the default exception handling.

public class ExceptionHandling {

	// for showing the divide by zero exception

	public static int divide(int a, int b) {
		int div;
		div = a / b;

		return div;
	}

	public static int computeDivision(int a, int b) {
		int div = 0;

		try {
			div = divide(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return div;

	}

	public static void main(String[] args) {

		int a = 1;
		int b = 0;

		try {
			computeDivision(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
