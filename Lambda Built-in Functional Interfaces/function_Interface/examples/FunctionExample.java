
import java.util.stream.Stream;

public class FunctionExample {
	
	public static void main(String[] args) {

		Stream.of("1,-40,5,0".split(",")).map(Integer::parseInt).map(i -> (i < 0) ? -i : i).forEach(System.out::println);

	}
	
}
