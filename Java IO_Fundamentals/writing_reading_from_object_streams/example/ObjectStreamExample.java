import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

// A simple class to illustrate object streams: fill a data structure, write it to a 
// temporary file and read it back and print the read data structure 
class ObjectStreamExample {
	public static void main(String[] args) {
		Map<String, String> olympicGamesChampions = new HashMap<>();
		olympicGamesChampions.put("Muhammad Ali","Gold medal – first place	1960 Rome --	Light heavyweight");
		olympicGamesChampions.put("Joe Frazier","Gold medal – first place	1964 Tokyo --	Heavyweight");
		olympicGamesChampions.put("George Foreman","Gold medal – first place    1968 Mexico City --	Heavyweight");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"))) {

			oos.writeObject(olympicGamesChampions);
		} catch (FileNotFoundException fnfe) {
			System.err.println("cannot create a file with the given file name ");
		} catch (IOException ioe) {
			System.err.println("an I/O error occurred while processing the file");
		} // the ObjectOutputStream will auto-close, so don't have to worry
			// about it

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {

			Object obj = ois.readObject();
			// first check if obj is of type Map
			if (obj != null && obj instanceof Map) {
				Map<?, ?>champions = (Map<?, ?>) obj;
				System.out.println("Champion name \t Description");
				for (Map.Entry<?, ?> champion :champions.entrySet()) {
					System.out.printf("%s \t %s %n", champion.getKey(), champion.getValue());
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("cannot create a file with the given file name ");
		} catch (IOException ioe) {
			System.err.println("an I/O error occurred while processing the file");
		} catch (ClassNotFoundException cnfe) {
			System.err.println("cannot recognize the class of the object - is the file corrupted?");
		}
	}
}
