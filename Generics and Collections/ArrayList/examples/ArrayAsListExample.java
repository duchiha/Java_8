

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {

		Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
		System.out.println("The original Array : "
				+ Arrays.toString(temperatureArray));

		List<Double> list = Arrays.asList(temperatureArray);
		list.set(0, 40.6);

		System.out.println("This modified Array: "
				+ Arrays.asList(temperatureArray));

	}

}
