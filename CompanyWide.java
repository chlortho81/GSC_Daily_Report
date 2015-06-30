class CompanyWide {
	String location;
	double company_totalsold;
	double company_delivered;
	double company_booked;
	double company_totalups;
	double company_firstups;
	double company_firstsold;
	double company_bbups;
	double company_bbsold;

	double calc_company_booked_sold_percent(){
		double a = (((bmwvolvomazda.booked + cadillac.booked + nissan.booked + vwtemple.booked + mercedes.booked + bryan.booked) / (bmwvolvomazda.totalsold + cadillac.totalsold + nissan.totalsold + vwtemple.totalsold + mercedes.totalsold + bryan.totalsold) * 100) + .5);
		System.out.printf("The booked-to-sold ratio for the company is %.0f %%", a);
		System.out.println();
		return a;
	}
	double calc_company_first_close_percent(){
		double b = (((bmwvolvomazda.firstsold + cadillac.firstsold + nissan.firstsold + vwtemple.firstsold + mercedes.firstsold + bryan.firstsold) / (bmwvolvomazda.firstups + cadillac.firstups + nissan.firstups + vwtemple.firstups + mercedes.firstups + bryan.firstups) * 100) + .5);
		System.out.printf("The first time close percentage for the company is %.0f %%", b);
		System.out.println();
		return b;
	}
	double calc_company_bb_close_percent(){
		double c = (((bmwvolvomazda.bbsold + cadillac.bbsold + nissan.bbsold + vwtemple.bbsold + mercedes.bbsold + bryan.bbsold) / (bmwvolvomazda.bbups + cadillac.bbups + nissan.bbups + vwtemple.bbups + mercedes.bbups + bryan.bbups) * 100) + .5);
		System.out.printf("The beback close percentage for the company is %.0f %%", c);
		System.out.println();
		return c;
	}
	double calc_company_total_close_percent(){
		double d = (((bmwvolvomazda.totalsold + cadillac.totalsold + nissan.totalsold + vwtemple.totalsold + mercedes.totalsold + bryan.totalsold) / (bmwvolvomazda.totalups + cadillac.totalups + nissan.totalups + vwtemple.totalups + mercedes.totalups + bryan.totalups) * 100) + .5);
		System.out.printf("The total closing percentage for the company is %.0f %%", d);
		System.out.println();
		return d;
	}
}

	
