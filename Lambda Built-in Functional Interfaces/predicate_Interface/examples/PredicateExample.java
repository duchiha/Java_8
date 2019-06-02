
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		// Note that it's possible to combine predicates

		String str = "I'm the Greatest";
		System.out.println(nullAndEmptyCheck.test(str));

		String str2 = null;
		System.out.println(nullAndEmptyCheck.test(str2));

	}

}
