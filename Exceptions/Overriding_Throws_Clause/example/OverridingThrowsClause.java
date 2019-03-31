
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Scanner;

// This interface is meant for implemented by classes that would read an integer from a file 
interface IntReader {
    int readIntFromFile() throws IOException; 
}

class OverridingThrowsClause implements IntReader {
    // implement readIntFromFile with the same throws clause 
    // or a more specific throws clause  
    public int readIntFromFile() throws FileNotFoundException {
	Scanner consoleScanner = new Scanner(new File("integer.txt")); 
	return consoleScanner.nextInt(); 
    }
    // main method elided in this code since the focus here is to understand 
    // issues related to overriding when throws clause is present
}
