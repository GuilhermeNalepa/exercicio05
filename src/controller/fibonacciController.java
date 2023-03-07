package controller;

public class fibonacciController {
	
	public fibonacciController() {
		
		super();
		
	}
	
	public int fibonacci(int termos) {
		
		//Como os termos serão em algum momento 2 ou 1, retornamos 1, conforme a
		//fórmula de Fibonacci
		if (termos == 1 || termos == 2) {
			
			return 1;
			
		} else {
			
			return fibonacci(termos - 1) + fibonacci(termos - 2);
			//Conforme a fórmula de Fibonacci, o resultado será a soma no número
			//do termo subtraído por 1 com o número do termo subtraído por 2
				
		}
	}
}