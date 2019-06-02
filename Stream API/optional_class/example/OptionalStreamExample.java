
import java.util.Optional;

public class OptionalStreamExample {
	public static void main(String[] args) {

		// How to create non-empty Optional object
		Optional<String> string = Optional.of("  abracadabra  ");
		// How to use it
		string.map(String::trim).ifPresent(System.out::println);
	}
}
