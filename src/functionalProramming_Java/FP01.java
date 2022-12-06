package functionalProramming_Java;

import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbersInList(List.of(12,3,56,4,89,7,43));
	}

	private static void printNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
