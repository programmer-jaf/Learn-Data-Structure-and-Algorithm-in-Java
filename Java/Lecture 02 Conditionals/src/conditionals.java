import java.util.Scanner;

public class conditionals {
	public static void main(String[] args) {
		System.out.println("learn about conditionals");
//	* What is conditionals
//	? ans : conditionals are expression that evaluate to true or false and control the flow of a program based on those evaluations.
		/*
			* Syntax
			if(condition){
				//* code
			}else{
				//* code
			}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		if (age>18){
			System.out.println("You are an adult now 👦");
		}else {
			System.out.println("Your are not an adult");
		}
	}
}
