import java.util.Scanner;

public class basicProblem01 {
	public static void main(String[] args) {
		System.out.println("solve Take input of two numbers and print their sum");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number one : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number two : ");
		int num2 = sc.nextInt();
		System.out.println("The sum of "+num1+" + "+num2+" = "+(num1+num2));
		sc.close();
	}
}
