import java.util.Scanner;

public class conditionalsProblem03 {
	public static void main(String[] args) {
		System.out.println("solve Find the Larger of Two Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

    if (num1 > num2) {
			System.out.println("The larger number is: " + num1);
    }else {
			System.out.println("The larger number is: " + num2);
    }
		sc.close();
	}
}
