import java.io.Console;
import java.util.Arrays;

// code to illustrate the use of readPassword method 
// Do not Run it using IDE ! System.console() will not work!
class LoginWithConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userName = null;
			char[] password = null;
			userName = console.readLine("Enter your username: ");
			// typed characters for password will not be displayed in the screen
			password = console.readPassword("Enter password: ");
			// password is a char[]: convert it to a String first
			// before comparing contents
			if (userName.equals("Muhammed") && new String(password).equals("Ali")) {
				// we're hardcoding username and password here for
				// illustration, don't do such hardcoding in pratice!
				console.printf("login successful For the Champion!");
			} else {
				console.printf("wrong user name or password");
			}
			// "empty" the password since its use is over
			Arrays.fill(password, ' ');
		}
	}
}
