package com.math.lambda;

import java.util.Arrays;
import java.util.List;

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
		System.out.println("--------------------------------------------");
		Integer[] arr = new Integer[] {12, 6, 7, 23, 13, 21, 22, 9,10};
		List<Integer> mylist = Arrays.asList(arr);
		mylist.forEach(n -> {
			System.out.println("Lambda expression number play list: "+ n);
		});
	}
}
interface MathFunction {
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, MathFunction func) {
		System.out.println("Result of "+function+ "is: " +func.calculate(a, b));
	}
}