import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		System.out.println("learn about inputs in java");
		Scanner sc = new Scanner(System.in);
//	byte
		System.out.print("Enter byte value : ");
		byte byteValue = sc.nextByte();
		System.out.println("The byte value is "+byteValue);
//	short
		System.out.print("Enter short value : ");
		short shortValue = sc.nextShort();
		System.out.println("the short value is "+shortValue);
//  int
		System.out.print("Enter int value : ");
		int intValue = sc.nextInt();
		System.out.println("the int value is "+intValue);
//	float
		System.out.print("Enter float value : ");
		float floatingValue = sc.nextFloat();
		System.out.println("the float value is "+floatingValue);
//	double
		System.out.print("Enter double value : ");
		double doubleValue = sc.nextDouble();
		System.out.println("the double value is "+doubleValue);
//	long
		System.out.print("Enter long value : ");
		long longestValue = sc.nextLong();
		System.out.println("the longest value is "+longestValue);
//	boolean
		System.out.print("Enter boolean value : ");
		boolean isAuthenticated = sc.nextBoolean();
		System.out.println("the boolean value is "+isAuthenticated);
//	char
		System.out.print("Enter char : ");
		char singleChar = sc.next().charAt(0);
		System.out.println("the single char is "+singleChar);
		sc.nextLine();
//	String
		System.out.print("Enter a sentence : ");
		String str = sc.nextLine();
		System.out.println(str);
//	! to avoid resource leaks
		sc.close();
	}
}