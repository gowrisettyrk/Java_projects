package functionalProramming_Java;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,3,56,4,89,7,43);
		//printNumbersInList(numbers);
		printEvenNumbersInList(numbers);
		
		List<String> courses = List.of("spring","spring-boot","API","microservices","java");
		printCoursesInList(courses);
	}

	/*
	 * private static void printCoursesInList(List<String> courses) {
	 * courses.stream() .filter(str -> str.contains("spring"))
	 * .forEach(System.out::println); }
	 */
	
	private static void printCoursesInList(List<String> courses) {
		courses.stream()
			.filter(str -> str.length() >=4 )
			.map(str -> str.length())
			.forEach(System.out::println);
	}

	private static void print(int num) {
		System.out.println(num);
	}

	private static void printNumbersInList(List<Integer> numbers) {
		numbers.stream().forEach(FP01Exercise::print);
	}

	private static void printEvenNumbersInList(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 0)//Lambda expression
			.forEach(System.out::println);//Method Reference
		
	}
}
