import java.util.Scanner;

public class conditionalsProblem01 {
	public static void main(String[] args) {
		System.out.println("Check Even or Odd 🔢");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if (num%2==0) System.out.println(num+" is a even number");
		else System.out.println(num+" is an odd number");
		sc.close();
	}
}
