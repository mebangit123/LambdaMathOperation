package com.math.lambda;

public class MathOperation {
	public static void main(String[] args) {
		System.out.println("Math Operation Using Lambda Expression");
		
		MathFunction add = Integer::sum;
		MathFunction sub = (x,y) -> x -y;
		MathFunction mul = (x, y) -> x * y;
		MathFunction div = (int x, int y) -> x / y;
		
		System.out.println("Addition is :"+ add.calculate(6, 2));
		System.out.println("Substraction is :"+ sub.calculate(6, 2));
		System.out.println("Multiplication is :"+ mul.calculate(6, 2));
		System.out.println("Division is :"+ div.calculate(6, 2));
		System.out.println("--------------------------------------------");
		MathFunction.printResult(6, 2, "Addition: ", add);
		MathFunction.printResult(6, 2, "Substraction", sub);
		MathFunction.printResult(6, 2, "Multiplication", mul);
		MathFunction.printResult(6, 2, "Division", div);
	}
}
interface MathFunction {
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, MathFunction func) {
		System.out.println("Result of "+function+ "is: " +func.calculate(a, b));
	}
}