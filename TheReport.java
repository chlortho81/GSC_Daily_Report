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
    int firstsold;
    int delivered;
    int booked;
    int firstups;
    int bbups;
    int firstups;
    int bbsold;
    int totalups;
    int totalsold;

    // RE: Field J1 - What is this, sales for the next day?? 
    
    void calc_booked_sold_percent() {  // This needs to return a percentage
        System.out.printf("The booked to sold ratio is %% %.0f", (booked / sold * 100) + .5)subl;
    }

    void calc_first_close_percent() {  // This needs to return a percentage
        System.out.printf("The first time close percentage is " + (firstsold / firstups * 100));
    }

    void calc_bb_close_percent() { // This needs to return a percentage
        System.out.printf("The BeBack close percentage is " + (bbsold / bbups));
    }

    void calc_total_close_percent() { // This needs to return a percentage
        System.out.println("The total closing percentage is " + (totalsold / totalups));
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
        
        bmwvolvomazda.location = "BMW/VOL/MAZ"):
        bmwvolvomazda.totalsold = 39; // hard-coded number that will eventually be polled from DMS
        bmwvolvomazda.delivered = 28; // hard-coded number that will eventually be polled from DMS
        bmwvolvomazda.booked = 25; // hard-coded number that will eventually be polled from DMS
            
        // Make calculations

        TotalUps = (FirstUps + BBUps);
        TotalSold = (FirstSold + BBSold);
        FirstClosePercent = (FirstSold / FirstUps);
        BBClosePercent = (BBSold / BBUps);
        TotalClosePercent = (TotalSold / TotalUps);

        // Display Totals
        
        System.out.println("First Up = " + FirstUps);

        System.out.println("BeBacks = " + BBUps);

        System.out.println("Total Ups = " + TotalUps);

        System.out.println("First Time Sold = " + FirstSold);

        System.out.println("BeBack Sold = " + BBSold);

        System.out.println("Total Sold = " + TotalSold);

        // Display Pecentages

        System.out.println("BeBack sold percentage = " + BBClosePercent);

        System.out.println("First time sold percentage = " + FirstClosePercent);

        System.out.println("Overall closing percentage = " + TotalClosePercent);

    }
}





