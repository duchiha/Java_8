

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		String quote = "Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do";
		Set<Character> aToZee = new TreeSet<Character>();
		for (Character character : quote.toCharArray()) {

			aToZee.add(character);

		}

		System.out.println("Display:");
		for (Character character : aToZee) {

			System.out.println(character);

		}

	}

}
