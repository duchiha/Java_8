
import java.util.Arrays;
import java.util.function.Function;

public class FunctionsChaining {

	public static void main(String[] args) {
		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> absInt = Math::abs;
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);

		Arrays.stream("4, -9, 16".split(", ")).map(parseAndAbsInt).forEach(System.out::println);
	}

}
