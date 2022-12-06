package functionalProramming_Java;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FP03 {

	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		courses.stream().sorted().forEach(FP03::print);

		Supplier<Integer> randomSupplier = () -> {
			// create instance of Random class
			Random rand = new Random();
			return rand.nextInt(1000);
		};

		System.out.println(randomSupplier.get());
	}
}
