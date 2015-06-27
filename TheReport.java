/*
  This is the hard-coded template for Dad's report. It is to be an applet with fields
  where he can enter the quantity of Demos, Worksheets, Solds (First and BB), and total
  Ups (FirstUps and BBUps).
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
    int sold;
    int delivered;
    int booked;
    double percbooksold
    // sales for the next day?? 
    


}

class TheReport {

    public static void main(String args[]) {

        // Declare the variables that will make up each field on the report
        
        String DealerName;
        int FirstUps;
        int BBUps;
        int FirstSold;
        int BBSold;
        int TotalUps;
        int TotalSold;

        // Declare variables to make up the success percantages

        float FirstClosePercent;
        float BBClosePercent;
        float TotalClosePercent;
        
        // Assign values to the floor traffic 
        
        DealerName = "Cadillac";
        FirstUps = 10;
        BBUps = 7;
        FirstSold = 2;
        BBSold = 4;
            
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





