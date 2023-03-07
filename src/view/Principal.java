package view;

import controller.fibonacciController;

public class Principal {
	
	public static void main(String[] args) {
		
		fibonacciController fc = new fibonacciController();
		
		int n = 9;
		int fibonacci = fc.fibonacci(n);
		
		System.out.println("Fibonacci = " + fibonacci);
		
	}
	
}