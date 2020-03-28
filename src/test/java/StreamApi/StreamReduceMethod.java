package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
public class StreamReduceMethod {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> operator = (x,y) -> {System.out.println("x = "+x+"y = "+y);return x>y?x:y;};
		Optional<Integer>number = numbers.stream().reduce(operator);
		System.out.println(number);
	}

}
