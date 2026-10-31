package process;

import java.util.Scanner;

class simplecalculation{
	
	public void calc() {
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		char operators;
		double result = 0;
		
		System.out.print("Enter the First Number: ");
		num1 = sc.nextDouble();
		
		System.out.print("Enter the Operator(+, -, *, /, ^): ");
		operators = sc.next().charAt(0);
		
		System.out.print("Enter the Second Number: ");
		num2 = sc.nextDouble();
		
		switch(operators){
		case '+' -> result = num1 + num2;
		case '-' -> result = num1 - num2;
		case '*' -> result = num1 * num2;
		case '/' -> result = num1 / num2;
		case '^' -> result = Math.pow(num1, num2);
		}
		
		System.out.println("The Result is :"+result);
		
		sc.close();
		
	}
	
	
}

public class Calculator {

	public static void main(String[] args) {
		
		simplecalculation simobj = new simplecalculation();
		simobj.calc();
		

	}

}
