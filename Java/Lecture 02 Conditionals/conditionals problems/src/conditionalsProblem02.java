import java.util.Scanner;

public class conditionalsProblem02 {
	public static void main(String[] args) {
		System.out.println("solve Determine Positive ⚪, Negative ❄️, or Zero 🛞");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (num>0) System.out.println(num+" is positive ⚪");
		else if (num<0) System.out.println(num+" is negative ❄️");
    else System.out.println(num+" is zero 🛞");
		sc.close();
	}
}
