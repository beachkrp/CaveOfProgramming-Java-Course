public class StringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Intialize String
		String info = "";

		// Build onto string

		info += "My Name is Bob";
		info += " ";
		info += " I am a builder";

		System.out.println(info);

		// String builder
		StringBuilder sb = new StringBuilder();
		// Append text
		sb.append("My Name is Sue.");
		sb.append(" ");
		sb.append("I am a Lion tamer.");

		// output
		System.out.println(sb.toString());

		// Second StringBuilder example

		StringBuilder s = new StringBuilder();
		// Add to String Builder s
		s.append("My name is Roger.").append(" ").append("I am a sky diver.");

		// OUtput

		System.out.println(s.toString());

		////// Formatting
		System.out.print("Here is some text  \tThat was a tab. \nThat was a new Line");
		System.out.println("Here is some text  \tThat was a tab. \nThat was a new Line");
		// Example of printf
		System.out.printf("Total cost %5d: %16.6f\n", 5, 3.45);

		for (int i = 0; i < 20; i++) {

			System.out.printf("%-2d: some text here\n", i);

		}

		for (int i = 0; i < 20; i++) {

			System.out.printf("%-2d: %s\n", i, "some text here");

		}

	}
}
