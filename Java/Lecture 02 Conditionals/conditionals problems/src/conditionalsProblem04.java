import java.util.Scanner;

public class conditionalsProblem04 {
	public static void main(String[] args) {
		System.out.println("solve Check Divisibility by 5 and 11");
		Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
		int number = sc.nextInt();

    // Check if the number is divisible by 5 and 11
		if (number % 5 == 0 && number % 11 == 0) {
      System.out.println(number+" Divisible by Both ✔️");
    } else {
      System.out.println(number+" is not 🚫");
    }
    sc.close();
	}
}
