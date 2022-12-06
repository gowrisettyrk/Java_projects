package functionalProramming_Java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
										.filter(x -> x%2==0)
										.collect(Collectors.toList());
		
		System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);
		
		
		int sum = addListFunctional(numbers);
		//
		System.out.println(sum);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList());
		System.out.println(coursesSortedByLengthOfCourseTitle);

	}
	
	private static List<Integer> squareList(List<Integer> numbers) {

		
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}


	private static int addListFunctional(List<Integer> numbers) {
		//Stream of number -> One result value
		  //Combine them into one result => One Value
		  // 0 and FP02Functional::sum
		return numbers.stream()
				.parallel()
		  //.reduce(0, FP02Functional::sum);	
		  // .reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
	}

}
