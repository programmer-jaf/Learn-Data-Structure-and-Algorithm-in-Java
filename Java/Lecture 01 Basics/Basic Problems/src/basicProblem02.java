import java.util.Scanner;

public class basicProblem02 {
	public static void main(String[] args) {
		System.out.println("solve Read a string from the user and print it in reverse.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Reversed string: " + new StringBuilder(input).reverse().toString());
		scanner.close();
	}
}
