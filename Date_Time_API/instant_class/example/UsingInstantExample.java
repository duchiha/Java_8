import java.time.*;


public class UsingInstantExample {
	public static void main(String args[]) {
		// prints the current timestamp with UTC as time zone

		Instant currTimeStamp = Instant.now();

		System.out.println("Instant timestamp is: " + currTimeStamp);

		// prints the number of seconds as Unix timestamp from epoch time
		System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());

		// prints the Unix timestamp in milliseconds
		System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());

		// you can convert an Instant to another class, such as LocalDateTime or
		// ZonedDateTime, by binding the Instant with a time zone.
		LocalDateTime ldt = LocalDateTime.ofInstant(currTimeStamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(), ldt.getYear(), ldt.getHour(),
				ldt.getMinute());
	}
}
