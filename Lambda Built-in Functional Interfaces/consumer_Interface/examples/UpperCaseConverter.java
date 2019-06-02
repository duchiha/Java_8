
import java.util.function.Consumer;

public class UpperCaseConverter {
	
	public static void main(String[] args) {
		
		Consumer<String> converter =  s -> System.out.println(s.toUpperCase());
		converter.accept("Hello");
		
	}
	
}
