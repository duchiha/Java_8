
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

class StatusReporter {
	static Shape.Color getDescriptiveColor(final Shape.Color color) {

		// note the use of anonymous inner classes here
		// -- specifically, there is no name for the class and we construct
		// and use the class "on the fly" in the return statement!

		return new Shape.Color() {
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		};
	}

	public static void main(String[] args) {
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
