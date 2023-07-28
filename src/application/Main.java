package application;

import java.util.Scanner;

import model.entities.Calculator;

public class Main {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);
		String option = "S";
		System.out.println("-----CALCULATOR-----");
		System.out.print("VALUE: ");
		int n1 = teclado.nextInt();
		System.out.print("TOKEN: ");
		String s1 = teclado.next();
		System.out.print("VALUE: ");
		int n2 = teclado.nextInt();
		int result = 0;
		switch(s1) {
		case "+":
			result = Calculator.sum(n1, n2);
			break;
		case "-":
			result = Calculator.subtraction(n1, n2);
			break;
		case "/":
			result = Calculator.division(n1, n2);
			break;
		case "*":
			result = Calculator.multiplication(n1, n2);
			break;
		}
		System.out.println("RESULT: " + result);
		
		System.out.print("(C)ontinue/(E)xit: ");
		option = teclado.next();
	}

}
