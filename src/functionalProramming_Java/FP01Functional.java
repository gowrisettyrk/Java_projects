package functionalProramming_Java;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12,3,56,4,89,7,43);
		//printNumbersInList(numbers);
		//printEvenNumbersInList(numbers);
		printEvenSquareNumbersInList(numbers);
	}
	
	/*
	 * private static boolean IsEven(int num) { return num%2==0; }
	 */
	
	private static void print(int num) {
		System.out.println(num);
	}

	private static void printNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(FP01Functional::print);
	}

	private static void printEvenNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
			.filter(number -> number%2 == 0)//Lambda expression
			.forEach(FP01Functional::print);//Method Reference
			
		//.filter(FP01Functional::IsEven)
	}
	
	private static void printEvenSquareNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
			.filter(number -> number%2 == 0)//Lambda expression
			.map(num -> num * num)
			.forEach(FP01Functional::print);//Method Reference
			
		//.filter(FP01Functional::IsEven)
	}
}
