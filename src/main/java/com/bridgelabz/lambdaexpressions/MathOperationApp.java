package com.bridgelabz.lambdaexpressions;

@FunctionalInterface
interface MathFunctionIF{
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, MathFunctionIF functionObject) {
		System.out.println("RESULT OF " +function+" is "+functionObject.calculate(a,b));
	}
}

public class MathOperationApp {
	
	public static void main(String[] args) {

		MathFunctionIF add = Integer::sum;
		MathFunctionIF subtract = (int a, int b) -> a-b;
		MathFunctionIF multiply = (int a, int b) -> a*b;
		MathFunctionIF divide = (int a, int b) -> {
			if(b==0)return 0;
			return a/b;
		};		
		
		MathFunctionIF.printResult(6, 5, "ADDITION", add);
		MathFunctionIF.printResult(6, 5, "SUBTRACT", subtract);
		MathFunctionIF.printResult(6, 5, "MULTIPLY", multiply);
		MathFunctionIF.printResult(6, 0, "DIVIDE", divide);
		
	}

}