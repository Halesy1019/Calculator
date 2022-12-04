package JavaCalc;

public class JavaCalcHW {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator.");
		testAddition(3, 15);

		testSubtraction(14, 7);

		testMultiplication(6, 6);

		testDivision(382, 6);

		testSquare(464);

	}

	private static void testAddition(int add1, int add2) {
		System.out.println("This is the addition method:");

		int addResult;
		System.out.println("Here are the numbers I'm about to add together:");
		System.out.printf("Number 1: %d, number 2: %d%n", add1, add2);
		System.out.printf("Expected result is: %d%n", (int) (add1 + add2));
		addResult = Calculator.add(add1, add2);
		System.out.printf("Actual result: %d%n", addResult);
		System.out.printf("Actual result matches expected result: %s%n", (addResult == (add1 + add2)));
	}

	private static void testSubtraction(int sub1, int sub2) {
		System.out.println("This is the subtraction method:");
		int subResult;
		System.out.printf("Number 1: %d, number 2: %d%n", sub1, sub2);
		System.out.printf("Expected result is: %d%n", (int) (sub1 - sub2));
		subResult = Calculator.subtract(sub1, sub2);
		System.out.printf("Actual result: %d%n", subResult);
		System.out.printf("Actual result matches expected result: %s%n", (subResult == (sub1 - sub2)));

	}

	private static void testMultiplication(int mult1, int mult2) {
		System.out.println("This is the multiplication method:");
		int multResult;
		System.out.printf("Number 1: %d, number 2: %d%n", mult1, mult2);
		System.out.printf("Expected result is: %d%n", (int) (mult1 * mult2));
		multResult = Calculator.multiply(mult1, mult2);
		System.out.printf("Actual result: %d%n", multResult);
		System.out.printf("Actual result matches expected result: %s%n", (multResult == (mult1 * mult2)));
	}

	private static void testDivision(int div1, int div2) {
		System.out.println("This is the division method:");
		double divResult;
		System.out.printf("Number 1: %d, number 2: %d%n", div1, div2);
		System.out.printf("Expected result is: %s%n", (div1 / div2));
		divResult = Calculator.divide(div1, div2);
		System.out.printf("Actual result: %s%n", divResult);
		System.out.printf("Actual result matches expected result: %s%n", (divResult == (div1 / div2)));

	}

	private static void testSquare(int square1) {
		System.out.println("This is the square method:");
		int squareResult;
		System.out.printf("Number 1: %d%n", square1);
		System.out.printf("Expected result is: %d%n", (int) (square1 ^ 2));
		squareResult = Calculator.square(square1);
		System.out.printf("Actual result: %d%n", squareResult);
		System.out.printf("Actual result matches expected result: %s%n", (squareResult == (square1 ^ 2)));

	}

}
