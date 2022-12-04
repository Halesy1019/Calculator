package JavaCalc;

public class JavaCalcHW {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator.");
		System.out.println("This is the addition method:");
		int add1=3, add2=15;
		int addResult;
		System.out.println("Here are the numbers I'm about to add together:");
		System.out.printf("Number 1: %d, number 2: %d%n", add1, add2);
		System.out.printf("Expected result is: %d%n", (int)(add1 + add2));
		addResult= Calculator.add(add1, add2);
		System.out.printf("Actual result: %d%n", addResult);
		System.out.printf("Actual result matches expected result: %s%n", (addResult==(add1 + add2)));
		System.out.println("This is the subtraction method:");
		System.out.println("This is the multiplication method:");
		System.out.println("This is the division method:");
		System.out.println("This is the square method:");

	}

}
