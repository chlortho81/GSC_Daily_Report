class Percrec {
	String name;
	int sold;
	double booked;

	double calc_percent() {
		double d;
		d = ((booked / sold * 100) + .5);
		System.out.printf("The percent is %.0f %%", d);
		return d;
	}
}

class PercOutTest {

	public static void main(String[] args) {
		
		Percrec test1 = new Percrec();

		// Assign values to test 1

		test1.name = " BMW ";
		test1.sold = 23;
		test1.booked = 17;

		// invoke calc_percent

		test1.calc_percent();	
	}
}