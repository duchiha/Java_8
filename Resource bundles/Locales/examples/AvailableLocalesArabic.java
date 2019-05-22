import java.util.Arrays;
import java.util.Locale;

public class AvailableLocalesArabic {

	public static void main(String[] args) {
		Arrays.stream(Locale.getAvailableLocales()).filter(locale -> locale.getLanguage().equals("ar"))
				.forEach(locale -> System.out.printf("Locale code: %s and it stands for %s %n", locale,
						locale.getDisplayName()));
	}

}
