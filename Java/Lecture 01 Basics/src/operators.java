public class operators {
	public static void main(String[] args) {
		System.out.println("learn about operators in java");
//	* There are 6 types of Operators
//	* assignment operator
//	* arithmetic operator
//	* logical operator
//	* relational operator
//	* unary operator
//	* bitwise operator

//	assignment operators
		int a = 10;
    int b = 20;
    a += b; // a = a + b
    System.out.println("a + b = " + a);

    a -= b; // a = a - b
    System.out.println("a - b = " + a);

    a *= b; // a = a * b
    System.out.println("a * b = " + a);

    a /= b; // a = a / b
    System.out.println("a / b = " + a);

    a %= b; // a = a % b
    System.out.println("a % b = " + a);

//  arithmetic operator
		int sum = a + b;
    int diff = a - b;
    int product = a * b;
    int quotient = a / b;
    int remainder = a % b;
    System.out.println("sum = " + sum);
    System.out.println("diff = " + diff);
    System.out.println("product = " + product);
    System.out.println("quotient = " + quotient);
    System.out.println("remainder = " + remainder);
		System.out.println("---------------------------------");
		// logical operator
		boolean isTrue = a > b;
    boolean isFalse = a < b;
    System.out.println("a > b = " + isTrue);
    System.out.println("a < b = " + isFalse);
    System.out.println("---------------------------------");
    // relational operator
    isTrue = a == b;
    isFalse = a!= b;
    System.out.println("a == b = " + isTrue);
    System.out.println("a!= b = " + isFalse);
    System.out.println("---------------------------------");
    // unary operator
    a = 10;
    System.out.println("a = " + a);
    System.out.println("a++ = " + ++a);
    System.out.println("a = " + a);
    System.out.println("a-- = " + --a);
		System.out.println("a = " + a);
		System.out.println("---------------------------------");
		// bitwise operator
		int x = 10;
    int y = 5;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x & y = " + (x & y));
    System.out.println("x | y = " + (x | y));
    System.out.println("x ^ y = " + (x ^ y));
    System.out.println("~x = " + ~x);
    System.out.println("x << 1 = " + (x << 1));
    System.out.println("x >> 1 = " + (x >> 1));
	}
}
