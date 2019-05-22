import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {
    public static void main(String []args) {
        String []roseQuote = "a rose is a rose is a rose".split(" ");
        Set <String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);
    }
}
