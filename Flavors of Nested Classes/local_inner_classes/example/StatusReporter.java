
abstract class Shape {
	public static class Color {
		int m_red, m_green, m_blue;

		public Color() {
			this(0, 0, 0);
		}

		public Color(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
		}

		public String toString() {
			return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
		}
		// other color members elided
	}
	// other Shape members elided
}

public class StatusReporter {
	// important to note that the argument "color" is declared final
	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class
		class DescriptiveColor extends Shape.Color {
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		}
		return new DescriptiveColor();
	}

	public static void main(String[] args) {
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
