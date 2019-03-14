

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("Java");
		str.add("C++");
		str.add("Python");

		for (String string : str) {

			System.out.println("[" + string + "]");
		}

		System.out.println("Accessing with Iterator");
		for (Iterator<String> iterator = str.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			System.out.println("[" + string + "]");

		}

	}

}
