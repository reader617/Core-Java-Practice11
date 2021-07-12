package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class LambdaPractice {

	public static void main(String[] args) {
		
		BiFunction<Double, Double, Double> z = (Double x, Double y) -> (x * y);
		System.out.printf("%.2f\n", z.apply(3.4, 4.5));
		
		Supplier<String> s1 = () -> "This is a lambda string";
		System.out.println(s1.get());
		
		ArrayListImplement al = ArrayList::new;
		System.out.println(al.get());
		
		// To avoid implementing code that I am not going to use I am going to complete the problem
		// and leave the answer commented out
		/*slider.valueProperty().addListener((ov, oldValue, newValue) -> 
				{
					System.out.println("The sliders new value is %s%n", newValue);
				});*/
		
		// This code is testing to confirm the answers in the written exercises document
		List<Integer>exp = new ArrayList<Integer>();
		exp.add(8);
		exp.add(10);
		exp.add(3);
		exp.add(5);
		
		int sum = exp.stream()
			.filter(value -> value % 2 != 0)
			.mapToInt(x -> x)
			.sum();
		
		sum = exp.stream()
				.filter(value -> value % 2 != 0)
				.reduce(0, Integer::sum);
		
		System.out.println(sum);
	}	

}
