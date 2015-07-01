/* 
	Test program to generate spreadsheet and populate specific cells 
	with the scanner inputs from the user and the solution derived
	from scanner inputs
*/

import java.util.Scanner;

class TestRecord {
	String name;
	double a;
	double b;
	

	double calc_average() {
		double x = (a+b) / 2;
		System.out.println("The average is " + x);
		return x;
	}
}

class SheetGenerator {

	public static void main(String[] args) {
		
		TestRecord dingdong = new TestRecord();

		double calculatedAverage;

		Scanner in = new Scanner(System.in);

		dingdong.name = "Dipity";

		System.out.println("Enter the value the numbers for " + dingdong.name);
		System.out.println();
		System.out.println("Enter the value for a: ");
		dingdong.a = in.nextDouble();
		System.out.println("Enter the value for b: ");
		dingdong.b = in.nextDouble();

		calculatedAverage = dingdong.calc_average();

	}
}
