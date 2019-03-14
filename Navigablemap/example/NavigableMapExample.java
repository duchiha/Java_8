
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {

		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();

		examScores.put(10, "Michelangelo");
		examScores.put(80, "Leonardo");
		examScores.put(30, "Raphael");
		examScores.put(90, "Donatello");

		System.out.println("The data in the map is: " + examScores);
		System.out.println("The data descending order is: "
				+ examScores.descendingMap());
		System.out.println("Details of those who passed the exam: "
				+ examScores.tailMap(40));
		System.out.println("Details of those who failed the exam: "
				+ examScores.headMap(40));
		System.out.println("The lowest mark is: " + examScores.firstEntry());
		System.out.println("The Highest mark is: " + examScores.lastEntry());

	}

}
