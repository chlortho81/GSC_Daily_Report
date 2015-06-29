/*
  This is the hard-coded template for Dad's report. It is to be an applet with fields
  where he can enter the quantity of Demos, Worksheets, Solds (First and BB), and total
  Ups (FirstUps and BBUps).

  BY: Aaron Whittle, Programmer Extraordinair
*/

/* 
  This method will contain the variables (desired outputs) of each Garlyn Shelton dealership.
  For convenience, the code is arranged in pattern with Ed Whittle's infamous, "Report."
  *NOTE* As of right now, the variables for "EOM <the previous year>", "As of current date of
  previous year", and "Percent Plus or minus <MTD previous year>" do not exist; we do not
  have the historical sales performance data for the Garlyn Shelton Companies.
*/

class Dealerec {
    String location;
    double firstsold;
    double delivered;
    double booked;
    double firstups;
    double bbups;
    double bbsold;
    double totalups;
    double totalsold;

    // RE: Field J1 - What is this, sales for the next day??

    double calc_booked_sold_percent() {  // This needs to return a percentage
        double x = ((booked / totalsold * 100) + .5);
        System.out.printf("The booked to sold ratio is %.0f %%", x);
        return x;
    }

    double calc_first_close_percent() {  // This needs to return a percentage
        double y = ((firstsold / firstups * 100) + .5);
        System.out.printf("The first time close percentage is %.0f %%", y);
        return y;
    }

    double calc_bb_close_percent() { // This needs to return a percentage
        double z = ((bbsold / bbups * 100) + .5);
        System.out.printf("The BeBack close percentage is %.0f %%", z);
        return z;
    }

    double calc_total_close_percent() { // This needs to return a percentage
        double w = ((totalsold / totalups * 100) + .5);
        System.out.printf("The total closing percentage is %.0f %%", w);
        return w;
    }
}

class TheReport {

    public static void main(String args[]) {

        Dealerec bmwvolvomazda = new Dealerec();
        Dealerec cadillac = new Dealerec();
        Dealerec nissan = new Dealerec();
        Dealerec vwtemple = new Dealerec();
        Dealerec mercedes = new Dealerec();
        Dealerec bryan = new Dealerec();

        
        // Assign values to each dealerships' variables
        
        bmwvolvomazda.location = "BMW/VOL/MAZ";
        bmwvolvomazda.totalsold = 39; 
        bmwvolvomazda.firstsold = 20; 
        bmwvolvomazda.delivered = 28; 
        bmwvolvomazda.booked = 25; 
        bmwvolvomazda.bbsold = 19; 
        bmwvolvomazda.totalups = 100; 
        bmwvolvomazda.bbups = 38;
        bmwvolvomazda.firstsold = 62;

        // Make calculations

        calc_total_close_percent.bmwvolvomazda();
        calc_bb_close_percent.bmwvolvomazda();
        calc_first_close_percent.bmwvolvomazda();
        calc_booked_sold_percent.bmwvolvomazda();
    }
}





